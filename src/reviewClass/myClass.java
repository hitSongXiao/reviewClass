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
	static{//��̬������ʼ�飬Ϊ�������Ĳ��䣬���ܽ����κβ���������һЩ���ж����е����ԡ�����������ʱ���á�����߳�ʼ��ĸ��ã���߳���Ŀ�ά����
		system=10;
	}
	public static void print(){
		System.out.println("system"+system);
		//System.out.println(mem); wrong:mem is not static
	}
}
