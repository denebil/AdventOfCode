package AoC2023;

import java.util.stream.Stream;

public class Day1 {
     public static Integer task1(Stream<String> input) {
        return input.map(line -> getCalibrationValue(line)).reduce(0, Integer::sum);
    }

    private static Integer getCalibrationValue(String line) {
        int firstDigit = getFirstDigit(line);
        int lastDigit = getFirstDigit(new StringBuilder(line).reverse().toString());
        return lastDigit + 10 * firstDigit;
    }

    private static int getFirstDigit(String line) {
        return line.chars().filter(Character::isDigit).findFirst().getAsInt() - '0';
    }
}
