$(document).ready(function() {
    for(var i=1; i<=89; i++) {
        if(localStorage.getItem("javarev-study" + i) == "finish") {
            $('#study' + i).addClass("fin");
            $('#study' + i).text('학습 완료');
        }
    }

    $('.studyLabel').click(function() {
        var day = $(this).attr('data-study');

        console.log(day);

        if(localStorage.getItem("javarev-study" + day) == null) {
            // 학습 완료로 변경
            localStorage.setItem("javarev-study" + day, "finish");
            $(this).addClass("fin");
            $(this).text('학습 완료');
        } else {
            // 학습 중으로 변경
            localStorage.removeItem("javarev-study" + day);
            $(this).removeClass("fin");
            $(this).text('학습 중');
        }
    });
});
