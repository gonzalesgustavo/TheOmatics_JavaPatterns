package RateOmatic;

public class Originator {
    /*
     * Memento Pattern
     * */
    private String rating;

    public void setState(String rating){
        this.rating = rating;
    }

    public String getState(){
        return rating;
    }

    public Memento saveStateToMemento(){
        return new Memento(rating);
    }
}
