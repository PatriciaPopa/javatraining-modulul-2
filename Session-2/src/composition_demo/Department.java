package composition_demo;

public class Department {
	private String deptCode;

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public Department(String deptCode) {
		super();
		this.deptCode = deptCode;
	}

	@Override
	public String toString() {
		return "Department [deptCode=" + deptCode + "]";
	}

}
