import DiscOMatic.OmaticHandler;
import DiscOMatic.SongComponent;
import DiscOMatic.SongGroup;
import DiscOMatic.Songs;
import RateOmatic.Caretaker;
import RateOmatic.Originator;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args)
    {

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();


        //Song Lists (genre)
        SongComponent deathMetal = new SongGroup("Death Metal: ", "Guts and Bloodbaths");
        SongComponent darkWave = new SongGroup("Darkwave: ", "Darkwave the BEST!");

        //gathers list for the OmaticHandler to display
        SongComponent everySong = new SongGroup("Song List", "Every Song Available");

        everySong.add(deathMetal); //adds to the list

        deathMetal.add(new Songs("Shatter Their Bones", "Cannibal Corpse", 2009));

        //memento 1

        originator.setState("Heavy, maddening, but fun at the party");
        caretaker.add(originator.saveStateToMemento());

        deathMetal.add(new Songs("Stinkupuss", "Obituary", 1989));

        //memento 2
        originator.setState("Annoying, punch ready tunes");
        caretaker.add(originator.saveStateToMemento());

        everySong.add(darkWave); //adds contents to the list

        darkWave.add(new Songs("Nova (Shine a Light on Me)", "VNV Nation", 2011));
        darkWave.add(new Songs("Apart", "Namnambulu", 2012));

        OmaticHandler portThirty = new OmaticHandler(everySong); //ports everything to the Omatic handler (discJokey)

        portThirty.getSongList();

        System.out.println(originator.getState());
    }

}
