package coffee.bean;
/*
 * id == eNum 사원번호
 * pw == ePhone 핸드폰 010 제외한 숫자
 */

public class Employee {
	private String eNum;
	private String ePhone;
	private String eName;
	private int ePay;
	private String ePart;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String geteNum() {
		return eNum;
	}

	public void seteNum(String eNum) {
		this.eNum = eNum;
	}

	public String getePhone() {
		return ePhone;
	}

	public void setePhone(String ePhone) {
		this.ePhone = ePhone;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getePay() {
		return ePay;
	}

	public void setePay(int ePay) {
		this.ePay = ePay;
	}

	public String getePart() {
		return ePart;
	}

	public void setePart(String ePart) {
		this.ePart = ePart;
	}

}
