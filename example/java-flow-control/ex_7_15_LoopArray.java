public class LoopArray {
    public static void main(String[] args) {
    	/*
         * <li>egoing</li>
         * <li>jinhuck</li>
         * <li>youbin</li>
         */
    	
        String[] users = new String[2];
        users[0] = "egoing";
        users[1] = "jinhuck";
        
        for (int i = 0; i < 3; i++) {
            System.out.println(users[i] + ",");
        }
    }
}
