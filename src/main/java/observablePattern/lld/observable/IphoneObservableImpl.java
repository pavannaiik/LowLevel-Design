package observablePattern.lld.observable;

import observablePattern.lld.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{


    List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount =0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }
    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);

    }
    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }
    @Override
    public void setStocks(int count) {
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount += count;

    }
    @Override
    public int getStocks() {
        return stockCount;
    }
}
