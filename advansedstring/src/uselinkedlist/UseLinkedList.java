package uselinkedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;


public class UseLinkedList {
	public static void useTreeSet() {
		LinkedList<Cars> linked = new LinkedList<>();
		linked.add(new BENZ());
		linked.add(new BMW());
		linked.add(new TOYOTA());
		linked.add(1 , new HUNDA());
		linked.addFirst(new JEEP());
		display(linked);
		Cars car = linked.peek();
		System.out.println("it peek first index color" + " " +car.carColor.toString());
		display(linked);
		Cars carss = linked.poll();
		System.out.println("it poll first index color" + " " +carss.carColor.toString());
		display(linked);
		
		}
	static private void display(Collection<Cars> coll) {
		System.out.println("List order:");
		Iterator<Cars> iterator = coll.iterator();
		while (iterator.hasNext()) {
			Cars cars = (Cars) iterator.next();
			System.out.println(cars.carName.toString());
			
		} 
	}
		
	}
	


