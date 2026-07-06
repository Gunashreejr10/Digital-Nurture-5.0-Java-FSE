

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(int price);
}

class StockMarket {
    private List<Observer> observers = new ArrayList<>();

    void addObserver(Observer o) { observers.add(o); }

    void setPrice(int price) {
        for (Observer o : observers) {
            o.update(price);
        }
    }
}

class MobileApp implements Observer {
    public void update(int price) {
        System.out.println("MobileApp: price is now " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        market.addObserver(new MobileApp());
        market.setPrice(150);
    }
}
