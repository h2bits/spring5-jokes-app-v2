package guru.springframework.spring5jokesapp.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JokeServiceImplTest {

    private JokeService jokeService;

    @BeforeEach
    void setUp() {
        QuoteService quoteService = new QuoteServiceImpl();
        jokeService = new JokeServiceImpl(quoteService);
    }

    @Test
    void getJoke() {
        System.out.println(jokeService.getJoke());
    }
}