import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class RoverTest {

    private Rover rover;

    @BeforeEach
    void setup(){
        rover = new Rover();
    }

    @DisplayName("Rotate to right")
    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @CsvSource({"R, 0:0:E",
                "RR, 0:0:S",
                "RRR, 0:0:W",
                "RRRR, 0:0:N"})
    void rotate_right(String commands, String position) {
        assertThat(rover.move(commands, new Grid(List.of())), is(position));
    }

    @DisplayName("Rotate to left")
    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @CsvSource({"L, 0:0:W",
                "LL, 0:0:S",
                "LLL, 0:0:E",
                "LLLL, 0:0:N"})
    void rotate_left(String commands, String position) {
        Rover rover = new Rover();
        assertThat(rover.move(commands, new Grid(List.of())), is(position));
    }

    @DisplayName("Move forward")
    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @CsvSource({"M, 0:1:N",
                "MM, 0:2:N",
                "MMM, 0:3:N",
                "MMMMMMMMM, 0:9:N",
                "MMMMMMMMMM, 0:0:N"})
    void move_forward(String commands, String position) {
        Rover rover = new Rover();
        assertThat(rover.move(commands, new Grid(List.of())), is(position));
    }

    @DisplayName("Rotate and Move forward")
    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @CsvSource({"MR, 0:1:E",
                "RM, 1:0:E",
                "RMM, 2:0:E",
                "RRM, 0:9:S",
                "RRMLLM, 0:0:N",
                "RRRM, 9:0:W",
                "RRRMLLML, 0:0:N"})
    void rotate_and_move_forward(String commands, String position) {
        Rover rover = new Rover();
        assertThat(rover.move(commands,  new Grid(List.of())), is(position));
    }

    @DisplayName("Grid with obstacles")
    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @CsvSource({"MRM, O:0:1:E"})
    void report_when_find_an_obstacle(String commands, String position) {
        Rover rover = new Rover();
        List<Position> obstacles = List.of(new Position(1,1));
        assertThat(rover.move(commands, new Grid(obstacles)), is(position));
    }

    @DisplayName("Move back")
    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @CsvSource({"MB, 0:0:N",
                "MMBB, 0:0:N",
                "B, 0:9:N",
                "BB, 0:8:N",
                "BBBBBB, 0:4:N",
                "BBBBBBBBBB, 0:0:N",
                "BBBBBBBBB, 0:1:N"})
    void move_back(String commands, String position) {
        Rover rover = new Rover();
        assertThat(rover.move(commands, new Grid(List.of())), is(position));
    }

    @DisplayName("Rotate and Move forward and back")
    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @CsvSource({"MR, 0:1:E",
            "RMB, 0:0:E",
            "RMMB, 1:0:E",
            "RRMBB, 0:1:S",
            "RRBLLB, 0:0:N",
            "RRRB, 1:0:W",
            "RRRBLLBL, 0:0:N"})
    void rotate_and_move_forward_and_back(String commands, String position) {
        Rover rover = new Rover();
        assertThat(rover.move(commands,  new Grid(List.of())), is(position));
    }
}