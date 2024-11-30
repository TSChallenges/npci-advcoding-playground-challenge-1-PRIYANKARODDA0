class StockPortfolio {
    // TODO: Add necessary fields for stock details
    private String symbol;
    private int quantity;
    private double buyingPrice;
    private double currentPrice;
    private double highestPrice;

    // TODO: Initialize stock details
    public StockPortfolio(String symbol, int quantity, double buyingPrice) {
        this.symbol=symbol;
        this.quantity=quantity;
        this.buyingPrice= buyingPrice;
        this.currentPrice=buyingPrice;
        this.highestPrice=buyingPrice;
    }

    // TODO: Update current market price
    public void updatePrice(double newPrice) {
      
        this.currentPrice=newPrice; 
        if(newPrice>this.highestPrice && newPrice>=0){
            this.highestPrice=newPrice;
        }

    }

    // TODO: Calculate total profit or loss
    public double calculateProfit() {
        // TODO
        double profit= (currentPrice-buyingPrice)*quantity;
        return profit;
    }

    // TODO: Calculate current total value of holdings
    public double getCurrentValue() {
        // TODO
        return currentPrice*quantity;
    }
}
