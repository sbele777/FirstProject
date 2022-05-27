package m1;

public class MethodModificatio {

	int physics;
	int chemistry;
	int maths;
	String name;
	
	

	public void show(int physics, int chemistry, int maths, String name) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
		this.name = name;
		
		System.out.println("Marks of: "+name);
		System.out.println("Physics: "+physics);
		System.out.println("Chemistry: "+chemistry);
		System.out.println("Maths: "+maths);
		System.out.println(" ");
	}
	
	public static void main(String args[])
	{
		MethodModificatio obj = new MethodModificatio();
		obj.show(87, 90, 67, "Raju");
		obj.show(85, 72, 82, "Sham");
		obj.show(100, 60, 77, "Babubhaiyya");
		
	}
	
	
}
