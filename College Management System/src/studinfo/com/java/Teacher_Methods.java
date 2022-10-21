package studinfo.com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher_Methods {
	int teach_id,teach_choice;
	String teach_name,subject,department;
	double salary;
	Scanner sc=new Scanner(System.in);
	ArrayList<TeacherInfo> tech=new ArrayList<>();
	public void insertTeacher() {
		System.out.println("Enter Teacher Id");
		teach_id=sc.nextInt();
		System.out.println("Enter teacher Name");
		teach_name=sc.next();
		System.out.println("Enter Salary of Teacher");
		salary=sc.nextDouble();
		System.out.println("Enter Subject of teacher of teaching");
		subject=sc.next();
		System.out.println("Enter Department Name");
		department=sc.next();
		TeacherInfo tinfo=new TeacherInfo();
		tinfo.setTech_id(teach_id);
		tinfo.setTeachName(teach_name);
		tinfo.setSalary(salary);
		tinfo.setSubject(subject);
		tinfo.setDepartment(department);
		tech.add(tinfo);
		System.out.println("---Record Inserted Successfully---");
	}
	
	public void displayTeacher(){
		for(int j=0;j<tech.size();j++) {
			System.out.println("---Teacher Details---");
			System.out.println("Teacher Record : "+(j+1));
			System.out.println("Teacher Id : "+tech.get(j).getTech_id());
			System.out.println("Teacher Name : "+tech.get(j).getTeachName());
			System.out.println("Teacher Salary : "+tech.get(j).getSalary());
			System.out.println("Teaching Subject : "+tech.get(j).getSubject());
			System.out.println("Teachers Department : "+tech.get(j).getDepartment());
			System.out.println("-------------------------------------------------------------");
			}
	}
	public void updateTeacher() {
		int ch1;
		
		System.out.println("Press 1 for search Teacher details by its name");
		System.out.println("Press 2 for search Teacher details by its subject");
		
		ch1=sc.nextInt();
		switch(ch1) {
		case 1:
			System.out.println("Enter Teacher Name to find Details");
			teach_name=sc.next();
			int srch1=0;
			for(int j=0;j<tech.size();j++) {
				if(tech.get(j).getTeachName().contains(teach_name)) {
			System.out.println("Teacher Id : "+tech.get(j).getTech_id());
			System.out.println("Teacher Name : "+tech.get(j).getTeachName());
			System.out.println("Teacher Salary : "+tech.get(j).getSalary());
			System.out.println("Teaching Subject : "+tech.get(j).getSubject());
			System.out.println("Teachers Department : "+tech.get(j).getDepartment());
					srch1++;
				}
			}
			if(srch1==0)
				System.out.println("Teacher "+teach_name+" not exist");
			break;
			
		case 2:
			System.out.println("Enter Subject of teacher to find Details");
			subject=sc.next();
			int srch2=0;
			for(int j=0;j<tech.size();j++) {
				if(tech.get(j).getSubject().contains(subject)) {
			System.out.println("Teacher Id : "+tech.get(j).getTech_id());
			System.out.println("Teacher Name : "+tech.get(j).getTeachName());
			System.out.println("Teacher Salary : "+tech.get(j).getSalary());
			System.out.println("Teaching Subject : "+tech.get(j).getSubject());
			System.out.println("Teachers Department : "+tech.get(j).getDepartment());
					srch2++;
				}
			}
			if(srch2==0)
				System.out.println("Teacher not exist");
			break;
			}
		 
	
		
}
}
