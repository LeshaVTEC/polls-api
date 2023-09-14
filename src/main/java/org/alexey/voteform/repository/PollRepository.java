package org.alexey.voteform.repository;

import org.alexey.voteform.dto.GenreResponsePair;
import org.alexey.voteform.dto.PollRequest;
import org.alexey.voteform.dto.SingerResponsePair;
import org.alexey.voteform.dto.TextResponsePair;
import org.alexey.voteform.entity.Genre;
import org.alexey.voteform.entity.Singer;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PollRepository {

    Map<Singer, Integer> singersRatingMap = new HashMap<>(
            Map.of(
                    Singer.TRUBECKOY, 0,
                    Singer.SHEVCHUK, 0,
                    Singer.MAKAREVICH, 0,
                    Singer.KIPELOV, 0
            )
    );

    Map<Genre, Integer> genreRatingMap = new HashMap<>(
            Map.of(
                    Genre.CLASSIC, 0,
                    Genre.MIX, 0,
                    Genre.LOUNGE, 0,
                    Genre.HEAVY_METAL, 0,
                    Genre.PUNK, 0,
                    Genre.ROCK, 0,
                    Genre.HIP_HOP, 0,
                    Genre.POP, 0,
                    Genre.RAP, 0,
                    Genre.SKA, 0
            )
    );

    Map<String, LocalDateTime> textDateMap = new HashMap<>();

    public void savePoll(PollRequest pollRequest) {
        singersRatingMap.put(pollRequest.getBestSinger(), singersRatingMap.get(pollRequest.getBestSinger()) + 1);
        for (Genre genre : pollRequest.getFavoriteGenre()) {
            genreRatingMap.put(genre, genreRatingMap.get(genre) + 1);
        }
        textDateMap.put(pollRequest.getShortText(), LocalDateTime.now());
    }

    public List<SingerResponsePair> findSingers() {
        return singersRatingMap
                .entrySet()
                .stream()
                .map(it -> new SingerResponsePair(it.getKey(), it.getValue()))
                .sorted()
                .toList();
    }

    public List<GenreResponsePair> findGenres() {
        return genreRatingMap
                .entrySet()
                .stream()
                .map(it -> new GenreResponsePair(it.getKey(), it.getValue()))
                .sorted()
                .toList();
    }

    public List<TextResponsePair> findShortText() {
        return textDateMap
                .entrySet()
                .stream()
                .map(it -> new TextResponsePair(it.getKey(), it.getValue()))
                .sorted()
                .toList();
    }
}
