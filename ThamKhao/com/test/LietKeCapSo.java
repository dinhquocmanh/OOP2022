package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LietKeCapSo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<Pair> list = (ArrayList<Pair>) ois.readObject();
		Set<String> set = new HashSet<>();
		List<Pair> l = new ArrayList<Pair>();
		for (Pair p : list) {
			if (p.getFirst() < p.getSecond() && !set.contains(p.toString()) && check(p)) {
				l.add(p);
				set.add(p.toString());
			}
		}
		Collections.sort(l);
		l.forEach(p -> System.out.println(p));
	}

	static boolean check(Pair p) {
		int n1 = p.getFirst();
		int n2 = p.getSecond();
		while (n1 * n2 != 0) {
			if (n1 > n2) {
				n1 %= n2;
			} else {
				n2 %= n1;
			}
		}
		if (n1 + n2 == 1) {
			return true;
		}
		return false;
	}

}