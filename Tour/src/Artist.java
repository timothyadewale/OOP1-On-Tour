public class Artist {
    private String name;
    private String genre;

    //Constructor
    public Artist(String name, String genre) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Artist name must not be null or empty");
        }
        if (genre == null || genre.isEmpty()){
            throw new IllegalArgumentException("Genre must not be null or empty");
        }
        this.name = name;
        this.genre = genre;
    }

    //Getter

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }


}


