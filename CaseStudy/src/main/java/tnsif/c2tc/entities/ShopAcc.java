package tnsif.c2tc.entities;

public class ShopAcc {
	private int accno;
	private String accname;
	private float charges;
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return "ShopAcc [accno=" + accno + ", accname=" + accname + ", charges=" + charges + "]";
	}
	
	
	

}
