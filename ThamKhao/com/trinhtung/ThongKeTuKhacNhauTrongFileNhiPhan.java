package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThongKeTuKhacNhauTrongFileNhiPhan {
	public static void main(String[] args) {
		try {
			ObjectInputStream dis = new ObjectInputStream(new FileInputStream("DATA.in"));
			String s = "";
			Map<String, Integer> m = new HashMap<String, Integer>();
			ArrayList<String> al = (ArrayList<String>) dis.readObject();
			for(String i : al) {
				s += (i + " ");
			}
			s = s.trim().toLowerCase();
			String[] s1 = s.split("[^a-z0-9]");
			List<String> ss = Arrays.stream(s1).filter(st -> !st.trim().isEmpty()).collect(Collectors.toList());
			for (String sss : ss) {
				if (!m.containsKey(sss)) {
					m.put(sss, 1);
				} else {
					m.put(sss, m.get(sss) + 1);
				}
			}
			List<Word1> l = new ArrayList<Word1>();
			for(Map.Entry<String, Integer> e : m.entrySet()) {
				l.add(new Word1(e.getKey(),e.getValue()));
			}
			l.sort((w1,w2) -> {
				if(w1.n == w2.n) {
					return w1.w.compareTo(w2.w);
				} else {
					return w2.n - w1.n;
				}
			});
			l.forEach(w -> System.out.println(w));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

class Word1 {
	String w;
	int n;

	public Word1(String w, int n) {
		super();
		this.w = w;
		this.n = n;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return w + " " + n;
	}
}
