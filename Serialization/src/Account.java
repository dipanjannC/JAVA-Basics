import java.io.Serializable;
public class Account implements Serializable{
	private int accNo;
	private String name;
	transient private int atmPin;
	
	Account(int accNo,String name,int atmPin)
	{
		this.accNo=accNo;
		this.name=name;
		this.atmPin=atmPin;
		
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}
	

}
