package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake1() {
        // BEGIN
        List<Integer> expected = List.of(1,2);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        List<Integer> actual = App.take(numbers, 2);
        assertThat(actual).isEqualTo(expected);
        // END
    }

    @Test
    void testTake2() {
        // BEGIN
        List<Integer> expected = List.of(7, 3, 10);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(7, 3, 10));

        List<Integer> actual = App.take(numbers, 8);
        assertThat(actual).isEqualTo(expected);
        // END
    }

    @Test
    void testTake3() {
        // BEGIN
        List<Integer> expected = List.of();
        List<Integer> numbers = new ArrayList<>(Arrays.asList());

        List<Integer> actual = App.take(numbers, 1);
        assertThat(actual).isEqualTo(expected);
        // END
    }
}
