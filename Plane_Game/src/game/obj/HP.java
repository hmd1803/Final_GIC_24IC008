package game.obj;

public class HP {
	
	public double getMAX_HP() {
		return MAX_HP;
	}
	
	public void setMAX_HP(double MAX_HP) {
		this.MAX_HP = MAX_HP;
	}
	
	public double getcurrentHP() {
		return currentHP;
	}
	
	public void setcurrentHP(double currentHP) {
		this.currentHP = currentHP;
	}
	
	public HP(double MAX_HP, double currentHP) {
		this.MAX_HP = MAX_HP;
		this.currentHP = currentHP;
	}
	
	public HP() {
		
	}
	
	double MAX_HP;
	double currentHP;

}
