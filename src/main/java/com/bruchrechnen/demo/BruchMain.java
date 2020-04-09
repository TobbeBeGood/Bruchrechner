package com.bruchrechnen.demo;

import com.bruchrechnen.demo.pojo.Bruch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BruchMain {

	public static void main(String[] args) {
		SpringApplication.run(BruchMain.class, args);

		Bruch b1=new Bruch(-3,4);
		Bruch b2= new Bruch (-5,8);

		System.out.println("Das Ergebnis der Multiplikation von "+ b1+" und "+b2+" ist: "+b1.mul(b2));
		System.out.println("Das Ergebnis der Division von "+ b1+" und "+b2+" ist: "+b1.div(b2));
		System.out.println("Das Ergebnis der Addition von "+ b1+" und "+b2+" ist: "+b1.add(b2));
		System.out.println("Das Ergebnis der Subtraction von "+ b2+" von "+b1+" ist: "+b1.substract(b2));
	}

}
