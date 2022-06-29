package assignment_evln;

import java.util.Arrays;
import java.util.List;
 class q8 {
	
	
	public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 8, 99, 1, 22, 4, 3, 77, 66};
        Arrays.stream(numbers).filter(o -> o % 2 == 0).
                                    forEach(System.out::println);
        
//        List<Integer> list = Arrays.asList(1, 4, 6, 7, 9, 11);
//        long count = list.stream().filter(x -> x%2!=0).count();
//        System.out.println(count);
    }
}


