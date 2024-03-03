package Observer;

import Observable.InventoryObservable;

public class EmailNotifyObserver implements NotifyObserver{
    String email;
    InventoryObservable inventoryObservable;
    public EmailNotifyObserver(String email, InventoryObservable inventoryObservable){
        this.email=email;
        this.inventoryObservable=inventoryObservable;
    }
    @Override
    public void sendNotification() {
        System.out.println("Inventory available, email sent to: "+this.email+" for "+inventoryObservable.getName()+" with quantity: "+inventoryObservable.getCount());
    }
}
