package core.ch14.thread.bounceball.version1;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Ball {
	private static final int XSIZE=30;
	private static final int YSIZE=30;
	private double x=0;
	private double y=0;
	private double dx=1;
	private double dy=1;
	
	//다음 위치로 공을 이동시키고, 바운드를 만나는 경우 방향 전환
	public void move(Rectangle2D bounds) {
		x += dx;
		y += dy;
		if(x < bounds.getMinX()) {
			x = bounds.getMinX();
			dx = -dx;
		}
		if(x + XSIZE >= bounds.getMaxX()) {
			x = bounds.getMaxX() - XSIZE;
			dx = -dx;
		}
		if(y < bounds.getMinY()) {
			y = bounds.getMinY();
			dy = -dy;
		}
		if(y + YSIZE >= bounds.getMaxY()) {
			y = bounds.getMaxY() - YSIZE;
			dy = -dy;
		}
	}
	//현재 위치와 가로/세로 크기를 가지는 공 객체 생성 후 반환
	public Ellipse2D getShape() {
		return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
	}
}