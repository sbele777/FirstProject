package m1;

public class Marks {

	public float show(String name, int physics, int chemistry,int maths)
	{
		System.out.println("Marks of: "+name);
		System.out.println("Physics: "+physics);
		System.out.println("Chemistry: "+chemistry);
		System.out.println("Maths: "+maths);
		
		float avg = (physics+chemistry+maths)/3;
		return avg;
		
	}
	
	public static void main(String args[])
	{
		Marks obj = new Marks();
		
		System.out.println("Average: "+obj.show("Raju", 90, 92, 95));
		System.out.println(" ");
		System.out.println("Average: "+obj.show("Sham", 91, 92, 96));
		System.out.println(" ");
		System.out.println("Average: "+obj.show("Babubhaiyya", 93, 97, 94));
		System.out.println(" ");
		System.out.println("Average: "+obj.show("Kachara seth", 92, 93, 92));
		
	}
}
