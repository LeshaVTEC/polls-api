package org.alexey.voteform.service;

import org.alexey.voteform.dto.GenreResponsePair;
import org.alexey.voteform.dto.PollRequest;
import org.alexey.voteform.dto.SingerResponsePair;
import org.alexey.voteform.dto.TextResponsePair;
import org.alexey.voteform.repository.PollRepository;

import java.util.List;

public class PollService {

    private PollRepository pollRepository = new PollRepository();

    public void savePoll(PollRequest pollRequest) {
        if ( pollRequest.getFavoriteGenre().size() < 3 || pollRequest.getFavoriteGenre().size() > 5) {
            throw new RuntimeException("Size must be from 3 to 5 genre");
        }
        pollRepository.savePoll(pollRequest);
    }

    public List<SingerResponsePair> findSingers() {
        return pollRepository.findSingers();
    }

    public List<GenreResponsePair> findGenres() {
        return pollRepository.findGenres();
    }

    public List<TextResponsePair> findShortText() {
        return pollRepository.findShortText();

    }
}
