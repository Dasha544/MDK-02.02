package PracticumTask2;

import java.util.Objects;

public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Song song = (Song) o;

        return Objects.equals(title, song.title)
                && Objects.equals(artist, song.artist)
                && Objects.equals(songwriter, song.songwriter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, songwriter);
    }
}