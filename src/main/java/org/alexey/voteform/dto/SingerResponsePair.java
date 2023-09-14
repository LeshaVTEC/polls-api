package org.alexey.voteform.dto;

import org.alexey.voteform.entity.Singer;

public class SingerResponsePair implements Comparable<SingerResponsePair> {
    private Singer singer;
    private Integer votesAmount;

    public SingerResponsePair(Singer singer, Integer votesAmount) {
        this.singer = singer;
        this.votesAmount = votesAmount;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Integer getVotesAmount() {
        return votesAmount;
    }

    public void setVotesAmount(Integer votesAmount) {
        this.votesAmount = votesAmount;
    }

    @Override
    public int compareTo(SingerResponsePair pair) {
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
        return "SingerResponsePair{" +
                "singer=" + singer +
                ", votesAmount=" + votesAmount +
                '}';
    }
}
