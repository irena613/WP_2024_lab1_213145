package mk.ukim.finki.wp.lab.model;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Song {
    String trackId;
    String title;
    String genre;
    int releaseYear;
    List<Artist> performers;

    public Song(String trackId, String title, String genre, int releaseYear, List<Artist> performers) {
        this.trackId = trackId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.performers = performers != null ? performers : new ArrayList<>();

    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setPerformers(List<Artist> performers) {
        this.performers = performers;
    }

    public String getTrackId() {
        return trackId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public List<Artist> getPerformers() {
        return performers;
    }
}
