package AoC2023;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class Day1Test {
    private static Path PATH_TO_RESOURCES = Path.of("src", "test", "resources", "day1");

    @Test
    public void task1Test1Digit() throws IOException {

        System.out.println(Day1.task1(Files.readAllLines(PATH_TO_RESOURCES.resolve("1digit.txt")).stream()));
    }
}