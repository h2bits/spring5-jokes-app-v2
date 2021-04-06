package guru.springframework.spring5jokesapp.services;

import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final QuoteService quoteService;

    public JokeServiceImpl(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @Override
    public String getJoke() {
        return this.quoteService.getQuote();
    }
}
