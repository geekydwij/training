public class Assignment1 {
    public static class MediaItem{
        String title, media_type;
        int duration;

        public MediaItem(String title, String media_type, int duration)
        {
            this.title=title;
            this.media_type=media_type;
            this.duration=duration;
        }
        public void display_info(){
            System.out.println("Title is "+title);
            System.out.println("Duration in minutes "+duration);
            System.out.println("Media type is "+media_type);
        }
    }

    public static class Book extends MediaItem {
        String Author;

        public Book(String title, String media_type, String Author, int duration)
        {
            super(title, media_type, duration);
            this.Author=Author;
        }
        public void display_info()
        {
            super.display_info();
            System.out.println("Author is "+Author);
        }
    }
    public static class Movie extends MediaItem {
        String director;

        public Movie(String title, String media_type, String dir, int duration)
        {
            super(title,media_type,duration);
            this.director=dir;
        }
        public void display_info()
        {
            super.display_info();
            System.out.println("Director is "+director);
        }
    }
    public static class MusicAlbum extends MediaItem {
        String Artist;

        public MusicAlbum(String title, String media_type, String Artist, int duration)
        {
            super(title,media_type,duration);
            this.Artist=Artist;
        }
        public void display_info()
        {
            super.display_info();
            System.out.println("Artist is "+Artist);
        }
    }


    public static void main(String[] args)
    {
        MediaItem item=new MediaItem("Titanic", "Movie", 130);
        System.out.println("\n");
        item.display_info();
        
        Book book=new Book("It Ends With Us", "Book", "A.Livingston", 200);
        Movie movie=new Movie("Wolf Of The Wall Street", "Movie", "Martin Scorsese", 180);
        System.out.println("\n");
        movie.display_info();
        
        MusicAlbum alubm=new MusicAlbum("Utopia", "Music", "Travis Scott", 210);
        System.out.println("\n");
        alubm.display_info();
        
    }
}