package reviewClass;
public class InitClass {
	public static void main(String args[]){
		myClass newClass= new myClass();
		newClass.call();
		newClass.cpu=2.0f;
		newClass.mem=3.0f;
		myClass.system=4;
		newClass.call();
		int a[]=new int[]{1,2,3};
		for(int i :a)
		{
			System.out.println(i);
		}
	}
}
