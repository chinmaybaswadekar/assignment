package assignment_evln;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class q11 {

	public static void main(String[] args) {
		
			OptionalInt parallelSum = 
				    IntStream.range(1, 10)
				             .parallel()
				             .findFirst();
			System.out.println(parallelSum);

		}


	}


