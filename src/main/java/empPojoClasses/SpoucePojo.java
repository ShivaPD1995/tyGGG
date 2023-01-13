package empPojoClasses;

public class SpoucePojo 
{
	String name;
	int[] mob;
	public SpoucePojo(String name, int[] mob) {
		super();
		this.name = name;
		this.mob = mob;
	}
	public SpoucePojo()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMob() {
		return mob;
	}
	public void setMob(int[] mob) {
		this.mob = mob;
	}
	
}
