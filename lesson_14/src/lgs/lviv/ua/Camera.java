package lgs.lviv.ua;

import java.util.Objects;

public class Camera implements Comparable<Camera> {

	private String trade_mark;
	private double Mpx;

	public String getTrade_mark() {
		return trade_mark;
	}

	public void setTrade_mark(String trade_mark) {
		this.trade_mark = trade_mark;
	}

	public double getMpx() {
		return Mpx;
	}

	public void setMpx(double mpx) {
		Mpx = mpx;
	}

	public Camera(String trade_mark, double mpx) {
		super();
		this.trade_mark = trade_mark;
		Mpx = mpx;
	}

	@Override
	public String toString() {
		return "Camera [trade_mark=" + trade_mark + ", Mpx=" + Mpx + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Mpx, trade_mark);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camera other = (Camera) obj;
		return Double.doubleToLongBits(Mpx) == Double.doubleToLongBits(other.Mpx)
				&& Objects.equals(trade_mark, other.trade_mark);
	}

	@Override
	public int compareTo(Camera o) {
		return this.trade_mark.compareTo(o.getTrade_mark());
	}

}
