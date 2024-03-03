package Observable;

import Observer.NotifyObserver;

public interface InventoryObservable {
    public void add(NotifyObserver notifyObserver);
    public void remove(NotifyObserver notifyObserver);
    public int getCount();
    public String getName();
    public void sendNotification();
    public void setInventory(int newInventory);
}
