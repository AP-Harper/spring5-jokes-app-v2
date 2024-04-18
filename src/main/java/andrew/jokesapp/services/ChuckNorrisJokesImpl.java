package andrew.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesImpl implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisJokes;

    public ChuckNorrisJokesImpl() {
        this.chuckNorrisJokes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisJokes.getRandomQuote();
    }



}
