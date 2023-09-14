package org.alexey.voteform.dto;

import org.alexey.voteform.entity.Genre;

public class GenreResponsePair implements Comparable<GenreResponsePair> {
    private Genre genre;
    private Integer votesAmount;

    public GenreResponsePair(Genre genre, Integer votesAmount) {
        this.genre = genre;
        this.votesAmount = votesAmount;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Integer getVotesAmount() {
        return votesAmount;
    }

    public void setVotesAmount(Integer votesAmount) {
        this.votesAmount = votesAmount;
    }

    @Override
    public int compareTo(GenreResponsePair pair) {
        if (votesAmount.equals(pair.votesAmount)) {
            return 0;
        } else if (votesAmount < pair.votesAmount) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "GenreResponsePair{" +
                "genre=" + genre +
                ", votesAmount=" + votesAmount +
                '}';
    }
}
