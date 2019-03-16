package RateOmatic;

public class Memento {
    private String rating;

    public Memento(String rating){
        this.rating = rating;
    }

    public String getState(){
        return rating;
    }
}
