class ex_7_6_Print {
    public String delimiter = "----";
    
    public ex_7_6_Print(String _delimiter) {
        this.delimiter = delimiter;
    }

    public void A() {
        // ..
        System.out.println(this.delimiter);
        System.out.println("A");
        System.out.println("A");
    }
	
    public void B() {
        // ..
        System.out.println(this.delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}