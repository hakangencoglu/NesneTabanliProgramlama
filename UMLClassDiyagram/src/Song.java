public class Song extends Media{
    private String artist, album, genre;
    Song(String title, int length, String format, String artist, String album, String genre)
    {
        super(title, length, format);
        this.album=album; this.artist=artist; this.genre=genre;
    }

    String getArtist(){return artist;}
    String getAlbum(){return album;}
    String getGenre(){return genre;}
}
