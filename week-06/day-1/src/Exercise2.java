import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {

    public static void main(String[] args) {

//Write a Stream Expression to get the squared value of the positive numbers from the following list:

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Double> squaredPositiveNumbers = numbers.stream()
                .filter(s -> s >= 0)
                .map(x -> ((Math.pow(x, 2))))
                .collect(Collectors.toList());
        System.out.println(squaredPositiveNumbers.toString());

        List<Integer> squaredPositiveNumbers2 = numbers.stream()
                .filter(s -> s >= 0)
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(squaredPositiveNumbers2.toString());
    }
}