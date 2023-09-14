package org.alexey.voteform.dto;

import org.alexey.voteform.entity.Genre;
import org.alexey.voteform.entity.Singer;

import java.util.List;

public class PollRequest {
    private Singer bestSinger;
    private List<Genre> favoriteGenre;
    private String shortText;


    public PollRequest(Singer bestSinger, List<Genre> favoriteGenre, String shortText) {
        this.bestSinger = bestSinger;
        this.favoriteGenre = favoriteGenre;
        this.shortText = shortText;
    }

    public Singer getBestSinger() {
        return bestSinger;
    }

    public void setBestSinger(Singer bestSinger) {
        this.bestSinger = bestSinger;
    }

    public List<Genre> getFavoriteGenre() {
        return favoriteGenre;
    }

    public void setFavoriteGenre(List<Genre> favoriteGenre) {
        this.favoriteGenre = favoriteGenre;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    @Override
    public String toString() {
        return "PollRequest{" +
                "bestSinger=" + bestSinger +
                ", favoriteGenre=" + favoriteGenre +
                ", shortText='" + shortText + '\'' +
                '}';
    }
}
