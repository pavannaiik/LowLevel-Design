package observablePattern.lld;

import observablePattern.lld.observable.IphoneObservableImpl;
import observablePattern.lld.observer.EmailAlertObserverImpl;
import observablePattern.lld.observer.MobileAlertObserverImpl;
import observablePattern.lld.observer.NotificationAlertObserver;
import observablePattern.lld.observable.StockObservable;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz3@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStocks(10);
        iphoneStockObservable.setStocks(0);
        System.out.println(iphoneStockObservable.getStocks());


    }
}
