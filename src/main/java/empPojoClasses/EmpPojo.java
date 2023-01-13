package empPojoClasses;

public class EmpPojo
{
	String name;
	int mobNo;
	SpoucePojo spouce;
	
	public EmpPojo(String name, int mobNo, SpoucePojo spouce) {
		super();
		this.name = name;
		this.mobNo = mobNo;
		this.spouce = spouce;
	}
	public EmpPojo() 
	{
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobNo() {
		return mobNo;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	public SpoucePojo getSpouce() {
		return spouce;
	}
	public void setSpouce(SpoucePojo spouce) {
		this.spouce = spouce;
	}	
}
