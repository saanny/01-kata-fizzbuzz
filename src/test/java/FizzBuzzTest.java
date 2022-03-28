import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void should_return_1_given_1() {
//        given
        FizzBuzz fizzBuzz = new FizzBuzz();
//        when
        String result = fizzBuzz.play(1);
//        then
        assertThat(result).isEqualTo("1");

    }

    @Test
    void should_return_2_given_2() {
//        given
        FizzBuzz fizzBuzz = new FizzBuzz();
//        when
        String result = fizzBuzz.play(2);
//        then
        assertThat(result).isEqualTo("2");

    }

    @Test
    void should_return_4_given_4() {
//        given
        FizzBuzz fizzBuzz = new FizzBuzz();
//        when
        String result = fizzBuzz.play(4);
//        then
        assertThat(result).isEqualTo("4");

    }

    @Test
    void should_return_3_given_fizz() {
//        given
        FizzBuzz fizzBuzz = new FizzBuzz();
//        when
        String result = fizzBuzz.play(3);
//        then
        assertThat(result).isEqualTo("Fizz");

    }

    @Test
    void should_return_6_given_fizz() {
//        given
        FizzBuzz fizzBuzz = new FizzBuzz();
//        when
        String result = fizzBuzz.play(6);
//        then
        assertThat(result).isEqualTo("Fizz");

    }

    @Test
    void should_return_9_given_fizz() {
//        given
        FizzBuzz fizzBuzz = new FizzBuzz();
//        when
        String result = fizzBuzz.play(9);
//        then
        assertThat(result).isEqualTo("Fizz");

    }

    @Test
    void should_return_5_given_buzz() {
//        given
        FizzBuzz fizzBuzz = new FizzBuzz();
//        when
        String result = fizzBuzz.play(5);
//        then
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void should_return_10_given_buzz() {
//        given
        FizzBuzz fizzBuzz = new FizzBuzz();
//        when
        String result = fizzBuzz.play(10);
//        then
        assertThat(result).isEqualTo("Buzz");

    }

    @Test
    void should_return_15_given_buzz() {
//        given
        FizzBuzz fizzBuzz = new FizzBuzz();
//        when
        String result = fizzBuzz.play(15);
//        then
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void should_return_30_given_buzz() {
//        given
        FizzBuzz fizzBuzz = new FizzBuzz();
//        when
        String result = fizzBuzz.play(30);
//        then
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void should_return_45_given_buzz() {
//        given
        FizzBuzz fizzBuzz = new FizzBuzz();
//        when
        String result = fizzBuzz.play(45);
//        then
        assertThat(result).isEqualTo("FizzBuzz");
    }
}
