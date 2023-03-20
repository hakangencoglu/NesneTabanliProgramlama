public class Main {
    public static void main(String[] args) {
        Song s = new Song("Sarı Çizmeli Mehmet Ağa",5,"mp3","Barış Manço",
                "Sarı Çizmeli Mehmet Ağa","Anadolu Rock");

        System.out.println(s.getTitle()+" "+s.getLength()+" "+s.getFormat()+" "+s.getArtist()+" "
        +s.getAlbum()+" "+s.getGenre()+"");
    }
}

