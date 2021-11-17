package lgs.lviv.ua;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class main_camera {
	public static void main(String[] args) {
		Set<Camera> camera = new HashSet<Camera>();
		camera.add(new Camera("Dahua", 3.0));
		camera.add(new Camera("Imou", 2.0));
		camera.add(new Camera("Hikvision", 4.0));
		camera.add(new Camera("IRW", 0.5));
		camera.add(new Camera("Sricam", 2.0));
		camera.add(new Camera("Dahua", 1.0));
		camera.add(new Camera("Dahua", 3.0));
		camera.add(new Camera("Dahua", 3.0));
		camera.add(new Camera("Hikvision", 4.0));
		camera.add(new Camera("Hikvision", 6.0));
		camera.add(new Camera("Hikvision", 3.0));
		System.out.println("Невідсортований список іх введеними даними");
		for (Camera cam : camera) {
			System.out.println(cam);
		}
		System.out.println();

		Set<Camera> camera1 = new TreeSet<Camera>();
		camera1.add(new Camera("Dahua", 3.0));
		camera1.add(new Camera("Imou", 2.0));
		camera1.add(new Camera("Hikvision", 4.0));
		camera1.add(new Camera("IRW", 0.5));
		camera1.add(new Camera("Sricam", 2.0));
		camera1.add(new Camera("Dahua", 1.0));
		camera1.add(new Camera("Dahua", 3.0));
		camera1.add(new Camera("Dahua", 3.0));
		camera1.add(new Camera("Hikvision", 4.0));
		camera1.add(new Camera("Hikvision", 6.0));
		camera1.add(new Camera("Hikvision", 3.0));
		System.out.println("Сортування за допомогою Comparable за полем String");
		for (Camera cam1 : camera1) {
			System.out.println(cam1);
		}
		System.out.println();

		Set<Camera> camera2 = new TreeSet<Camera>(new CameraComparator());
		camera2.add(new Camera("Dahua", 3.0));
		camera2.add(new Camera("Imou", 2.0));
		camera2.add(new Camera("Hikvision", 4.0));
		camera2.add(new Camera("IRW", 0.5));
		camera2.add(new Camera("Sricam", 2.0));
		camera2.add(new Camera("Dahua", 1.0));
		camera2.add(new Camera("Dahua", 3.0));
		camera2.add(new Camera("Dahua", 3.0));
		camera2.add(new Camera("Hikvision", 4.0));
		camera2.add(new Camera("Hikvision", 6.0));
		camera2.add(new Camera("Hikvision", 3.0));
		System.out.println("Сортування за допомогою Comparator із сортування по Sting та Int");
		for (Camera cam2 : camera2) {
			System.out.println(cam2);
		}
		System.out.println();

	}
}
