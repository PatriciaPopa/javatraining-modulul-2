package composition_demo;

public class Company {
	private String name;
	private Department dept1 = new Department("Hr01");
	private Department dept2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept1() {
		return dept1;
	}

	public void setDept1(Department dept1) {
		this.dept1 = dept1;
	}

	public Department getDept2() {
		return dept2;
	}

	public void setDept2(Department dept2) {
		this.dept2 = dept2;
	}

	public Company(String name) {
		super();
		this.name = name;
		dept2 = new Department("fi43");
	}

	public Company(String name, Department dept2) {
		super();
		this.name = name;
		this.dept2 = dept2;
	}

	public Company(String name, Department dept1, Department dept2) {
		super();
		this.name = name;
		this.dept1 = dept1;
		this.dept2 = dept2;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", dept1=" + dept1 + ", dept2=" + dept2 + "]";
	}

}
