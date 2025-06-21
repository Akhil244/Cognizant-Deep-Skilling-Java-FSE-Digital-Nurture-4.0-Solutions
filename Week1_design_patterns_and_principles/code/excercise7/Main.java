public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileUser = new MobileApp("Akhil");
        Observer webUser = new WebApp("InvestorX");

        market.registerObserver(mobileUser);
        market.registerObserver(webUser);

        market.setStockPrice(1234.56);
        System.out.println();

        market.setStockPrice(1350.00);
        System.out.println();

        market.removeObserver(webUser);
        market.setStockPrice(1400.75);
    }
}