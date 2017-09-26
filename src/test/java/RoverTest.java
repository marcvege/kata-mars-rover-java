import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class RoverTest {
    @Test
    void rotate_right() {
        Rover rover = new Rover();
        assertThat(rover.move("R"), is("0:0:E"));
    }
}