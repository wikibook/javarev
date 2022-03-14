class Accounting {
    public static double valueOfSupply;
    public static double vatRate = 0.1;
    
    public static double getVAT() {
        return valueOfSupply * vatRate;
    }     
    
    public static double getTotal() {
        return valueOfSupply + getVAT();
    }
}

public class ex_8_5_AccountingApp {
    public static void main(String[] args) {
        Accounting.valueOfSupply = 10000.0;
        System.out.println("Value of supply : " + Accounting.valueOfSupply);
        Accounting.valueOfSupply = 20000.0;
        System.out.println("Value of supply : " + Accounting.valueOfSupply);
        
        Accounting.valueOfSupply = 10000.0;
        System.out.println("VAT : " + Accounting.getVAT());
        Accounting.valueOfSupply = 20000.0;
        System.out.println("VAT : " + Accounting.getVAT());
        
        Accounting.valueOfSupply = 10000.0;
        System.out.println("Total : " + Accounting.getTotal());
        Accounting.valueOfSupply = 20000.0;
        System.out.println("Total : " + Accounting.getTotal());
    }
}
