public class ex_6_1_AccountingApp {
    public static void main(String[] args) {
        // 공급가액
        double valueOfSupply = 10000.0;
        
        // 부가가치세율
        double vatRate = 0.1;
        
        // 부가세
        double vat = valueOfSupply * vatRate;
        
        // 합계
        double total = valueOfSupply + vat;
        
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
    }
}
