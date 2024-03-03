package Observer;

import Observable.InventoryObservable;

public class TextNotifyObserver implements NotifyObserver{
    String username;
    InventoryObservable inventoryObservable;
    public TextNotifyObserver(String username, InventoryObservable inventoryObservable){
        this.username=username;
        this.inventoryObservable=inventoryObservable;
    }
    @Override
    public void sendNotification() {
        System.out.println("Inventory available text sent to "+this.username+"for "+inventoryObservable.getName()+" with quantity: "+inventoryObservable.getCount());
    }
}
