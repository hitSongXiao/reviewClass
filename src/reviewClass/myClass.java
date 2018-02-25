package reviewClass;
import java.util.Scanner;
public class myClass {
	float screen;
	float cpu;
	float mem;
	static int system=3;
	void call(){
		System.out.println("the phone can call,screen:"+screen+" ,cpu:"+cpu+"mem:"+mem);
		System.out.println("system:"+system);
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
	static{//静态变量初始块，为构造器的补充，不能接受任何参数，定义一些所有对象共有的属性、方法等内容时可用。可提高初始块的复用，提高程序的可维护性
		system=10;
	}
	public static void print(){
		System.out.println("system"+system);
		//System.out.println(mem); wrong:mem is not static
	}
}
