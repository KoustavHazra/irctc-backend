package ticket.booking;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
}


/*
How to use Filter in Java ---
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
//        either we can give a call-back function or a lambda function within a filter
        List<Integer> l_out1 = l.stream().filter(integer -> integer%2 == 0).collect(Collectors.toList());

//        or we can pass a particular function within filter, this function is called Predicate.
        List<Integer> l_out2 = l.stream().filter(isOdd()).toList();

//        predicate function
        public static Predicate<Integer> isOdd() {
            return i -> i % 2 == 0;
        }

* */