package observablePattern.lld.observable;

import observablePattern.lld.observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver notificationAlertObserver);

    void remove(NotificationAlertObserver notificationAlertObserver);

    public void notifySubscribers();
    public void setStocks(int count);
    public int getStocks();

}
