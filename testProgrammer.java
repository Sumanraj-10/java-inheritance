class person{
	String name;
	int age;
	person(){
		name = "Raj";
		age = 21;
	}
	person(String name,int age){
		this.name = name;
		this.age = age;
	}
	void printDetail(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}

class student extends person{
	String university;
	int level;
	student(String name,int age,String university,int level){
		super(name,age);
		this.university = university;
		this.level = level;
	}
	void printDetail(){
		super.printDetail();
		System.out.println("University : "+university);
		System.out.println("Level : "+level);
	}
}

class employee extends person{
	double salary;
	String employee;
	employee(String name,int age,String employee,double salary){
		super(name,age);
		this.salary = salary;
		this.employee = employee;
	}
	void printDetail(){
		super.printDetail();
		System.out.println("Salary : "+salary);
		System.out.println("Employee : "+employee);
	}
}

class programmer extends employee{
	String designation = "programmer";
	String language;
	programmer(String name,int age,String employee,double salary){
		super(name,age,employee,salary);
	}
	void setLanguage(String language){
		this.language = language;
	}
	void printDetail(){
		super.printDetail();
		System.out.println("Language : "+language);
		System.out.println("Designation : "+designation);
	}
}

class lecturer extends employee{
	String designation = "lecturer";
	int grade;
	lecturer(String name,int age, String employee,double salary){
		super(name,age,employee,salary);
	}
	void setGrade(int grade){
		this.grade = grade;
	}
	void printDetail(){
		super.printDetail();
		System.out.println("Grade : "+grade);
		System.out.println("Designation : "+designation);
		
	}
}

class testProgrammer{
	public static void main(String arg[]){
		programmer s = new programmer("David",27,"ABS Softwares Ltd.",100000);
		s.setLanguage("java");
		s.printDetail();
	}
}