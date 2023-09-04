package org.alexey.lesson4;

import java.util.List;

public class PollService {
    public void savePoll(PollRequest pollRequest) {
        System.out.println("save to DB " + pollRequest);
    }

    public PollResponse findPolls() {
        System.out.println("read from DB ");
        return new PollResponse(
                List.of(Singer.TRUBECKOY, Singer.SHEVCHUK, Singer.KIPELOV, Singer.MAKAREVICH),
                List.of(Genre.CLASSIC, Genre.LOUNGE, Genre.SKA, Genre.ROCK, Genre.RAP, Genre.PUNK, Genre.MIX, Genre.POP,
                        Genre.HIP_HOP, Genre.HURD_METAL),
                List.of("Ivanov", "Petrov", "Sidirov", "Akulov", "Zverev")
        );
    }
}
