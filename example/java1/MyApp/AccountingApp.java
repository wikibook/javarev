public class AccountingApp {
    public static void main(String[] args) {
        double valueOfSupply = 12345.0;
        System.out.println("Value of supply : " + valueOfSupply);
        double vatRate = 0.1;
        System.out.println("VAT : " + (valueOfSupply * vatRate));
        System.out.println("Total : " + (valueOfSupply + valueOfSupply * vatRate));
        double expenseRate = 0.3;
        System.out.println("Expense : " + (valueOfSupply * expenseRate));
        System.out.println("Income : " + (valueOfSupply - (valueOfSupply * expenseRate)));
        System.out.println("Dividend : " + (valueOfSupply - (valueOfSupply * expenseRate)) * 0.5);
        System.out.println("Dividend : " + (valueOfSupply - (valueOfSupply * expenseRate)) * 0.3);
        System.out.println("Dividend : " + (valueOfSupply - (valueOfSupply * expenseRate)) * 0.2);
    }
}
