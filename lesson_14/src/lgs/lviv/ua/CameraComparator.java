package lgs.lviv.ua;

import java.util.Comparator;

public class CameraComparator implements Comparator<Camera> {

	@Override
	public int compare(Camera o1, Camera o2) {
		if (o1.getTrade_mark().compareTo(o2.getTrade_mark()) > 0) {
			return 1;
		} else if (o1.getTrade_mark().compareTo(o2.getTrade_mark()) < 0) {
			return -1;
		} else {
			if (o1.getMpx() > o2.getMpx()) {
				return 1;
			}
			if (o1.getMpx() > o2.getMpx()) {
				return -1;
			}
			return 0;
		}
	}
}