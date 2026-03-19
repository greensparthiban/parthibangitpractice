package week2;

public class Student {
	
	//Encapsulation
	
	private String name;
	
	private int tamil;
	
	private int englis;
	
	private int maths;
	
	private int total;
	
	private int markst;
	
	
	public int getMarkst() {
		return markst;
	}

	public void setMarkst(int markst) {
		this.markst = markst;
	}


	private String coursename;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTamil() {
		return tamil;
	}

	public void setTamil(int tamil) {
		this.tamil = tamil;
	}

	public int getEnglis() {
		return englis;
	}

	public void setEnglis(int englis) {
		this.englis = englis;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setName("Parthiban");
		s.setCoursename("BCA");
		s.setEnglis(98);
		s.setMaths(100);
		s.setTamil(100);
		s.setMarkst(98+100+100);
		
		System.out.println(s.getName());
		System.out.println(s.getCoursename());
		System.out.println(s.getEnglis());
		System.out.println(s.getMaths());
		System.out.println(s.getTamil());
		System.out.println("Total Marks:"+s.getMarkst());
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
