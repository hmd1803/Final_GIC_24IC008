package game.obj;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class HpRender {
	
	private final HP hp;
	public HpRender(HP hp) {
		this.hp = hp;
	}
	protected void hpRender(Graphics2D g2, Shape shape, double y){
		if (hp.getcurrentHP() != hp.getMAX_HP()) {
		double hpY = shape.getBounds().getY() - y - 10;
		g2.setColor(new Color(70, 70, 70));
		g2.fill(new Rectangle2D.Double(0, hpY, Player.PLAYER_SIZE, 2));
		g2.setColor(new Color(253, 91, 91));
		double hpSize = hp.getcurrentHP() / hp.getMAX_HP() * Player.PLAYER_SIZE;
		g2.fill(new Rectangle2D.Double(0, hpY, hpSize, 2));
		}
	}
	
	public boolean updateHP(double cutHP) {
		hp.setcurrentHP(hp.getcurrentHP() - cutHP);
		return hp.getcurrentHP() > 0;
	}
	
	public double getHP() {
		return hp.getcurrentHP();
	}
	
	public void resetHP() {
		hp.setcurrentHP(hp.getMAX_HP());

	}
}