package observablePattern.lld.observer;

import observablePattern.lld.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public MobileAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "product is in stock hurry up");
    }
    public void sendMail(String emailId, String msg){
        System.out.println("mail sent to " + emailId );
    }
}
