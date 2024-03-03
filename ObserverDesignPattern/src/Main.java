import Observable.InventoryObservable;
import Observable.PenInventoryObservable;
import Observer.EmailNotifyObserver;
import Observer.NotifyObserver;
import Observer.TextNotifyObserver;

public class Main {
    public static void main(String[] args) {
        InventoryObservable inventoryObservable=new PenInventoryObservable();
        NotifyObserver emailNotify=new EmailNotifyObserver("xyz@gmail.com", inventoryObservable);
        NotifyObserver textNotify = new TextNotifyObserver("sudi23", inventoryObservable);
        inventoryObservable.add(emailNotify);
        inventoryObservable.add(textNotify);
        inventoryObservable.setInventory(10);

        inventoryObservable.setInventory(0);
        inventoryObservable.setInventory(100);

    }
}