package course;

import java.util.HashSet;

import usehashset.Cars;

public class UsingCourseCollection {
	private Course course;
	public Course getCoufrse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public static void courseCollection() {
		Course c1 = new Course();
		c1.setCourseid(689);
		c1.setCoursename("math");
		c1.setMark1(25.5);
		c1.setMark2(50.5);
		Course c2 = new Course();
		c2.setCourseid(700);
		c2.setCoursename("chimi");
		c2.setMark1(20.8);
		c2.setMark2(40.2);
		HashSet<Course> cs = new HashSet<>();
		cs.add(c1);
		cs.add(c2);
		System.out.println("size of Hashset : " + cs.size());
		System.out.println("the value in Hashset : "+ cs);
		for (Course course : cs) {
			System.out.println(course.getCourseid() +" " + course.getCoursename()+" "+course.getMark1()+" "+course.getMark2());
		}
	}
}