package DiscOMatic;

public class OmaticHandler {
    /*
     * displays the items acts as a discjocky
     * */
    private SongComponent songList;

    public OmaticHandler(SongComponent newSongList )
    {
        songList = newSongList;
    } //creates lists (genre based) used in the composite pattern

    public void getSongList ()
    {
        songList.displaySongInfo();
    } //displays list
}
