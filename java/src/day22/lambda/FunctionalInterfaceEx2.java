package day22.lambda;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceEx2 {

	public static void main(String[] args) {
		//Supplier 인터페이스: 매개변수X, 리턴타입O
		Supplier<String> supplier = () -> "Hi";
		System.out.println(supplier.get());
		
		//Function 인터페이스: 매개변수O, 리턴타입O / 서로다름
		Function<Student, String> function = std-> std.getName();
		System.out.println(function.apply(new Student(1,1,1,"Hong")));
		
		//Operator 인터페이스: 매개변수O, 리턴타입O / 서로같음
		UnaryOperator<Student> operator = std->{
			std.setGrade(2);
			return std;
		};
		System.out.println(operator.apply(new Student(1,1,1,"Hong")));
		
		//Predicate 인터페이스: 매개변수O, 리턴타입O /리턴값 true,false
		Predicate<Student> predicate = s->s.getName().indexOf("Hong") == 0;
		System.out.println(predicate.test(new Student(1,1,1,"Hong")));
		
	}

}
