package ch.itninja.labs;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<String> songs = new ArrayList<>();

    public void addSong(String title) {
        songs.add(title);
    }

    public void removeSong(int position) {
        songs.remove(position);
    }

    public String getSong(int position) {
        return songs.get(position);
    }

    public int count() {
        return songs.size();
    }
}