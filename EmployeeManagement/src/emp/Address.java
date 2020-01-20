package emp;

public class Address {
	int houseNo;
	String landMark;
	int pinCode;

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", landMark=" + landMark + ", pinCode=" + pinCode + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public Address(int houseNo, String landMark, int pinCode) {
		super();
		this.houseNo = houseNo;
		this.landMark = landMark;
		this.pinCode = pinCode;
	}
	
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
}
