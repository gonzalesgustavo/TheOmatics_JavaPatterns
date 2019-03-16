package DiscOMatic;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
    /*
     * Composite Pattern
     * */

    ArrayList<SongComponent> songComponents = new ArrayList<>(); //components are saved in a list

    private String groupName;
    private String groupDescription;
    /*
     * gets the name and description to display (for the genre list)
     * */
    public SongGroup ( String newGroupName, String newGroupDdescription )
    {
        groupName = newGroupName;
        groupDescription = newGroupDdescription;
    }

    public String getGroupName ()
    {
        return groupName;
    }

    public String getGroupDescription ()
    {
        return groupDescription;
    }

    /*
     * Adds the components to the list
     * */

    public void add ( SongComponent newSongComponent )
    {
        songComponents.add(newSongComponent);
    } //adds components to list

    public void remove ( SongComponent newSongComponent )
    {
        songComponents.remove ( newSongComponent );
    } //removes component from list

    public SongComponent getComponent ( int index )
    {
        return songComponents.get(index);
    } //indexes components

    public void displaySongInfo ()
    {
        System.out.println(getGroupName() + " " + getGroupDescription() + "/n");

        Iterator<SongComponent> songIterator = songComponents.iterator();

        while ( songIterator.hasNext() )
        {
            SongComponent SongInfo = songIterator.next();

            SongInfo.displaySongInfo();
        }
    } // the display to user function
}
