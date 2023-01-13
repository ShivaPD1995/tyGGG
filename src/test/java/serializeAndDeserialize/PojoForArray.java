package serializeAndDeserialize;

public class PojoForArray 
{
	private String empName;
	private String empId;
	private Object[] mob;
	private int age;
	public PojoForArray(String empName, String empId, Object[] mob, int age) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.mob = mob;
		this.age = age;
		
	}
	public PojoForArray()
	{
		
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public Object[] getMob() {
		return mob;
	}
	public void setMob(Object[] mob) {
		this.mob = mob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
