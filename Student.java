import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1,Student s2) {
		return s1.age-s2.age;
	}
	
}
public class Student {
	String Name;
	int age;
	public Student(String N,int a) {
		Name=N;
		age=a;
	}
	@Override
	public String toString() {
		return "Student{"+"Name="+Name+", Age="+age+"}";
	}
	public static void main(String[] args) {
		List<Student> al=new ArrayList<>();
		
		Student obj1 = new Student("Ajay", 27); 
        Student obj2 = new Student("Sneha", 23); 
        Student obj3 = new Student("Simran", 37); 
        Student obj4 = new Student("Ajay", 22); 
        Student obj5 = new Student("Ajay", 29); 
        Student obj6 = new Student("Sneha", 22); 
        
        al.add(obj1); 
        al.add(obj2); 
        al.add(obj3); 
        al.add(obj4); 
        al.add(obj5); 
        al.add(obj6);
        
        Iterator<Student> itr=al.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        Collections.sort(al,new StudentComparator());
        System.out.println("Sorted:");
        for(Student s:al) {
        	System.out.println(s);
        }
        
	}
	
}
