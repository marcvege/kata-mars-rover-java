import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class RoverTest {

    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @CsvSource({ "R, 0:0:E"})
    void rotate_right(String commands, String position) {
        Rover rover = new Rover();
        assertThat(rover.move(commands), is(position));
    }
}