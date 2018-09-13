package usingtreeset;

import java.util.TreeSet;

import classinclass.EnumCarsColors;

public class UseTreeSet {
	public static void useTreeSet() {
		Cars be = new BENZ();
		Cars bm = new BMW();
		Cars to = new TOYOTA();
		TreeSet<Cars> treeset = new TreeSet<>();
		
			try {
				treeset.add(be );
				treeset.add(bm);
				treeset.add(to);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			System.out.println(treeset.size());
			System.out.println(treeset);
			
		}
		
	}
	


