package org.alexey.voteform.dto;

import java.time.LocalDateTime;

public class TextResponsePair implements Comparable<TextResponsePair>{
    private String shortText;
    private LocalDateTime dataTime;

    public TextResponsePair(String shortText, LocalDateTime dataTime) {
        this.shortText = shortText;
        this.dataTime = dataTime;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }

    @Override
    public int compareTo(TextResponsePair pair) {
        if (dataTime == pair.dataTime) {
            return 0;
        } else if (dataTime.isBefore(pair.dataTime)) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "TextResponsePair{" +
                "shortText='" + shortText + '\'' +
                ", dataTime=" + dataTime +
                '}';
    }
}
