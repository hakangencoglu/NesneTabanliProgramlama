public class Media {
    private String title;
    private int length;
    private String format;

    Media(String title, int length, String format){
        this.title=title; this.length=length; this.format=format;
    }

    public String getTitle(){return this.title;}
    public int getLength(){return this.length;}
    String getFormat(){return format;}

}
