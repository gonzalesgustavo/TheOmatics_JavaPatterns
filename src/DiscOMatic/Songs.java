package DiscOMatic;

public class Songs extends SongComponent {
    private String songName;
    private String bandName;
    private int releaseYear;

    public Songs ( String newSongName, String newBandName, int newReleaseYear )
    {
        songName = newSongName;
        bandName = newBandName;
        releaseYear = newReleaseYear;
    }

    public String getSongName () { return songName; }
    public String getBandName () { return bandName; }
    public int getReleaseYear () { return releaseYear; }

    public void displaySongInfo ()
    {
        System.out.println( "Song: " + getSongName () + "by: " +
                getBandName () + "Released in: " + getReleaseYear () );
    }

    //gets song names, band names, and release year to display in the
}
