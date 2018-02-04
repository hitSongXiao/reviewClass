package reviewClass;
import java.util.Scanner;
public class myClass {
	float screen;
	float cpu;
	float mem;
	void call(){
		System.out.println("the phone can call,screen:"+screen+" ,cpu:"+cpu+"mem:"+mem);
	}
	myClass(){
		Scanner input=new Scanner(System.in);
		System.out.println("Please input the screen");
		screen=input.nextFloat();
		System.out.println("Please input the cpu");
		cpu=input.nextFloat();
		System.out.println("Please input the mem");
		mem=input.nextFloat();
	}
}
