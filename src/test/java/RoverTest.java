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

    @DisplayName("Move forward")
    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @CsvSource({"M, 0:1:N",
                "MM, 0:2:N",
                "MMM, 0:3:N"})
    void move_forward(String commands, String position) {
        Rover rover = new Rover();
        assertThat(rover.move(commands), is(position));
    }

    @DisplayName("Rotate and Move forward")
    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @CsvSource({"MR, 0:1:E",
                "RM, 1:0:E",
                "RMM, 2:0:E",
                "RRM, 0:9:S",
                "RRRM, 9:0:W"})
    void rotate_and_move_forward(String commands, String position) {
        Rover rover = new Rover();
        assertThat(rover.move(commands), is(position));
    }
}