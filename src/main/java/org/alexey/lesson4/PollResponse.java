package org.alexey.lesson4;

import java.util.List;

public class PollResponse {
    private List<Singer> bestSingers;
    private List<Genre> favoriteGenre;
    private List<String> shortText;

    public PollResponse(List<Singer> bestSingers, List<Genre> favoriteGenre, List<String> shortText) {
        this.bestSingers = bestSingers;
        this.favoriteGenre = favoriteGenre;
        this.shortText = shortText;
    }

    public List<Singer> getBestSingers() {
        return bestSingers;
    }

    public void setBestSingers(List<Singer> bestSingers) {
        this.bestSingers = bestSingers;
    }

    public List<Genre> getFavoriteGenre() {
        return favoriteGenre;
    }

    public void setFavoriteGenre(List<Genre> favoriteGenre) {
        this.favoriteGenre = favoriteGenre;
    }

    public List<String> getShortText() {
        return shortText;
    }

    public void setShortText(List<String> shortText) {
        this.shortText = shortText;
    }
}
