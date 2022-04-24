package learning;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.IntStream;

public  class Testtwo {
	
	
	
	public static String gpa(double grade) {
	    
        if (grade >= 3.5 && grade <= 3.7) {
            return "Cum Laude";
        
        }else if(grade >= 3.8 && grade <= 3.9) {
            return "Magna Cum Laude";
        
        }else if(grade >= 4.0) {
            return "Summa Cum Laude";
        
        }else {
            System.err.print("Please enter a valid GPA");
            return "Please enter a valid GPA";
        }
		
    }

	public static void main(String[] args) {
		final List<String>f= List.of("O","A","L","R");
		final List<String>t= List.of("J","P","I","T");
		
		final var stream = IntStream.range(0,Math.min(f.size(), t.size())).mapToObj((i->f.get(i)+" "+t.get(i)));
		stream.forEach(System.out::println);
		
	}


}
