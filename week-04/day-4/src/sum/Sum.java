package sum;

import java.util.List;

public class Sum {

   /* List<Integer> numbers = new ArrayList<>();          EZ A TESZTHEZ NEM KELL, NEM KELL KONSTRUKTOR

    public Sum(List<Integer> numbers) {
        this.numbers = numbers;
    }*/

    public Integer sum (List<Integer> numbers){
        if (numbers == null){
            return null;
        }
        Integer sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}