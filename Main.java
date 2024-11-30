public class Main {
    public static void main(String[] args) {
        // Test Case 1: Stock Analysis
        StockPortfolio stock = new StockPortfolio("AAPL", 10, 150.0);
        stock.updatePrice(140.0);
        System.out.println(stock.calculateProfit());
        System.out.println(stock.getCurrentValue());
    }
}
