package emp;
class Engine
{
	int EngNo;
	String FuelType;
	public Engine(int engNo, String fuelType) {
		super();
		EngNo = engNo;
		FuelType = fuelType;
	}
	
	@Override
	public String toString() {
		return "Engine [EngNo=" + EngNo + ", FuelType=" + FuelType + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public int getEngNo() {
		return EngNo;
	}
	public void setEngNo(int engNo) {
		EngNo = engNo;
	}
	public String getFuelType() {
		return FuelType;
	}
	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}
	
}
class MotorCar
{
	Engine e;
	public MotorCar(Engine e, int motorno, String motormodel) {
		super();
		this.e = e;
		this.motorno = motorno;
		this.motormodel = motormodel;
	}
	int motorno;
	String motormodel;
	@Override
	public String toString() {
		return "MotorCar [e=" + e + ", motorno=" + motorno + ", motormodel=" + motormodel + "]";
	}
	
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public int getMotorno() {
		return motorno;
	}
	public void setMotorno(int motorno) {
		this.motorno = motorno;
	}
	public String getMotormodel() {
		return motormodel;
	}
	public void setMotormodel(String motormodel) {
		this.motormodel = motormodel;
	}
	
}
public class HasExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MotorCar mc=new MotorCar(new Engine(5,"fds"),5, "agfsg");
System.out.println(mc);
}

}
