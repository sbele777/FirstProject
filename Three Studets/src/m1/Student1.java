package m1;

public class Student1 {
	
	int physics;
	int chemistry;
	int maths;
	
	
	
	public Student1(int physics, int chemistry, int maths) {
		super();
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
	}



	public void show()
	{
		System.out.println("Physics: "+physics);
		System.out.println("Chemistry: "+chemistry);
		System.out.println("Maths: "+maths);
		
	}
	
	public static void main(String args[])
	{
		Student1 Ram = new Student1(90,45,78);
		Ram.show();
	}

}
