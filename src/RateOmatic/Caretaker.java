package RateOmatic;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> mementoList = new ArrayList<Memento>(); //memento list

    public void add(Memento rating){
        mementoList.add(rating);
    } //stores rating

    public Memento get(int index){
        return mementoList.get(index);
    }// index's the list
}
