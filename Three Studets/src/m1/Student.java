package m1;

public class Student {
	
	int physics;
	int chemistry;
	int maths;
	
	public void show()
	{
		System.out.println("Physics: "+physics);
		System.out.println("Chemistry: "+chemistry);
		System.out.println("Maths: "+maths);
		
	}
	
	public static void main(String args[])
	{
		Student Ram = new Student();
		Ram.physics=90;
		Ram.chemistry=95;
		Ram.maths=98;
		System.out.println("Marks of Ram"); 
		
		Ram.show();
		
		System.out.println("Marks of Ram");
		System.out.println("--------------");
		System.out.println("Physics: "+Ram.physics);
		System.out.println("Chemistry: "+Ram.chemistry);
		System.out.println("Maths: "+Ram.maths); 
		
		System.out.println("=================");
		System.out.println("");
		
		Student Sham = new Student();
		Sham.physics=91;
		Sham.chemistry=92;
		Sham.maths=95;
		System.out.println("Marks of Sham");
		System.out.println("--------------");
		System.out.println("Physics: "+Sham.physics);
		System.out.println("Chemistry: "+Sham.chemistry);
		System.out.println("Maths: "+Sham.maths);
		
		System.out.println("=================");
		System.out.println("");
		
		Student babubhai = new Student();
		babubhai.physics=93;
		babubhai.chemistry=94;
		babubhai.maths=96;
		System.out.println("Marks of babubhai");
		System.out.println("--------------");
		System.out.println("Physics: "+babubhai.physics);
		System.out.println("Chemistry: "+babubhai.chemistry);
		System.out.println("Maths: "+babubhai.maths);
		
	}
	

}

