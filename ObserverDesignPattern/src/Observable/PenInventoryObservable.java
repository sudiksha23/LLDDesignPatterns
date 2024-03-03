package Observable;

import Observer.NotifyObserver;

import java.util.ArrayList;
import java.util.List;

public class PenInventoryObservable implements InventoryObservable{
    List<NotifyObserver> observerList=new ArrayList<>();
    int inventory=0;
    String name="Pen";
    @Override
    public void add(NotifyObserver notifyObserver) {
        observerList.add(notifyObserver);
    }

    @Override
    public void remove(NotifyObserver notifyObserver) {
        observerList.remove(notifyObserver);
    }

    @Override
    public int getCount() {
        return this.inventory;
    }
    public String  getName(){
        return this.name;
    }

    @Override
    public void sendNotification() {
        for(NotifyObserver observer: observerList){
            observer.sendNotification();
        }
    }

    @Override
    public void setInventory(int newInventory) {
        if(this.inventory==0){
            this.inventory=newInventory;
            sendNotification();
        }
        this.inventory=newInventory;
    }
}
