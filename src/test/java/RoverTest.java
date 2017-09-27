import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class RoverTest {

    @DisplayName("Rotate to right")
    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @CsvSource({"R, 0:0:E",
                "RR, 0:0:S",
                "RRR, 0:0:W",
                "RRRR, 0:0:N"})
    void rotate_right(String commands, String position) {
        Rover rover = new Rover();
        assertThat(rover.move(commands), is(position));
    }

    @DisplayName("Rotate to left")
    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @CsvSource({"L, 0:0:W",
                "LL, 0:0:S",
                "LLL, 0:0:E",
                "LLLL, 0:0:N"})
    void rotate_left(String commands, String position) {
        Rover rover = new Rover();
        assertThat(rover.move(commands), is(position));
    }
}