package studinfo.com.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class SortByNames implements Comparator<StudentInfo>{

	@Override
	public int compare(StudentInfo s1, StudentInfo s2) {
		
		return s1.getName().compareTo(s2.getName());
	}
	
}

public class CollegeManagementProject {

	public static void main(String[] args) {
		int stud_id,choice;
		String name,address,course_name;
		long mobile;
		int teach_id,teach_choice;
		String teach_name,subject,department;
		double salary;
		Scanner sc=new Scanner(System.in);
		ArrayList<StudentInfo> st=new ArrayList<>();
		ArrayList<TeacherInfo> tech=new ArrayList<>();
		Teacher_Methods t=new Teacher_Methods();
		while(true) {
			System.out.println("press 1 for Teacher Details");
			System.out.println("Press 2 for Student Details");
			int choices=sc.nextInt();
			switch(choices) {
			case 1:
				while(true) {
					System.out.println("Press 1 for Add the Details of Teacher");
					System.out.println("Press 2 for Display the Details of Teacher");
					System.out.println("Press 3 for Search the Details of Teacher");
					System.out.println("Press 4 for Update the Details of Teacher");
					System.out.println("Press 5 for Delete the Record of Teacher");
					System.out.println("Press 6 for Sort the Record of Teacher");
					System.out.println("Press 7 for Exit the Teacher System");
					
					
					teach_choice=sc.nextInt();
					switch(teach_choice) {
					case 1:
						t.insertTeacher();
						break;
					case 2:
						t.displayTeacher();
						break;
					case 3:
						t.updateTeacher();
						break;
						
						
						
						
						case 4:
							System.out.println("Enter the name of student whose details you have to update");
						    teach_name=sc.next();
						    int cnt1=0;
						    for(int j=0;j<tech.size();j++) {
							if(tech.get(j).getTeachName().contains(teach_name)) {
								System.out.println("Enter New salary");
								double new_salary=sc.nextDouble();
								System.out.println("Enter New subject");
								String new_subject=sc.next();
								System.out.println("Enter New Department");
								String new_department=sc.next();
								tech.get(j).setSalary(new_salary);
								tech.get(j).setSubject(new_subject);
								tech.get(j).setDepartment(new_department);
								cnt1++;
							}
						}
						if(cnt1==1)
							System.out.println("No such a student exist for update the details");
						else
							System.out.println("Record Updated Successfully");
						break;
						
						case 5:
							System.out.println("Enter Student name to delete the record of that student");
							teach_name=sc.next();
							int count1=0;
							for(int j=0;j<tech.size();j++) {
								if(tech.get(j).getTeachName().contains(teach_name))
									tech.remove(j);
								count1++;
							}
							if(count1==0)
								System.out.println("Record not found");
							else
								System.out.println("Record deleted successfully");
							break;
						case 6:
							System.out.println("Sort student ");
							for(StudentInfo student : st ) {
								System.out.println("Student : "+student+"");
							}
							Collections.sort(st, new SortByNames());
							System.out.println("----------------------------");
						
					}
				}
			
			case 2:
				while(true) {
					System.out.println("Press 1 for Add the Details of student");
					System.out.println("Press 2 for Display the Details of Student");
					System.out.println("Press 3 for Search the Details of Student by its Name");
					System.out.println("Press 4 for Update the Details of Student");
					System.out.println("Press 5 for Delete the Record of Student");
					System.out.println("Press 6 for Sort the Record of Student");
					System.out.println("Press 7 for Exit the Student System");
					
					choice=sc.nextInt();
					switch(choice) {
					case 1:
						
						System.out.println("Enter the Student Id");
						stud_id=sc.nextInt();
						System.out.println("Enter Name of Student");
						name=sc.next();
						System.out.println("Enter Address of Student");
						address=sc.next();
						System.out.println("Enter Course Name");
						course_name=sc.next();
						System.out.println("Enter Mobile Number");
						mobile=sc.nextLong();
						StudentInfo std=new StudentInfo();
						std.setStud_id(stud_id);
						std.setName(name);
						std.setAddress(address);
						std.setCourse_name(course_name);
						std.setMobile(mobile);
						st.add(std);
						System.out.println("*****Record of Student Inserted Sucessfully*****");
						System.out.println("---------------------------------------------------");
						break;
					case 2:
						for(int i=0;i<st.size();i++) {
						System.out.println("-----------------------------------------------");
						System.out.println("---Student Details---");
						System.out.println("Student Record : "+(i+1));
						System.out.println("Student Id : "+st.get(i).getStud_id());
						System.out.println("Student Name : "+st.get(i).getName());
						System.out.println("Student Address : "+st.get(i).getAddress());
						System.out.println("Student Course : "+st.get(i).getCourse_name());
						System.out.println("Student Mobile Number : "+st.get(i).getMobile());
						System.out.println("-----------------------------------------------");
						
						}
						break;
					case 3:
						
							int ch;
							
							System.out.println("Press 1 for search Student details by its name");
							System.out.println("Press 2 for search Student details by its address");
							
							ch=sc.nextInt();
							switch(ch) {
							case 1:
								System.out.println("Enter Student Name to find Details");
								name=sc.next();
								int srch=0;
								for(int i=0;i<st.size();i++) {
									if(st.get(i).getName().contains(name)) {
										System.out.println("Student Id : "+st.get(i).getStud_id());
										System.out.println("Student Name : "+st.get(i).getName());
										System.out.println("Student Address : "+st.get(i).getAddress());
										System.out.println("Student Course : "+st.get(i).getCourse_name());
										System.out.println("Student Mobile Number : "+st.get(i).getMobile());
										srch++;
									}
								}
								if(srch==0)
									System.out.println("Student "+name+" not exist");
								break;
								
							case 2:
								System.out.println("Enter Student Address to find Details");
								address=sc.next();
								int srch1=0;
								for(int i=0;i<st.size();i++) {
									if(st.get(i).getAddress().contains(address)) {
										System.out.println("Student Id : "+st.get(i).getStud_id());
										System.out.println("Student Name : "+st.get(i).getName());
										System.out.println("Student Address : "+st.get(i).getAddress());
										System.out.println("Student Course : "+st.get(i).getCourse_name());
										System.out.println("Student Mobile Number : "+st.get(i).getMobile());
										srch1++;
									}
								}
								if(srch1==0)
									System.out.println("Student "+address+" not exist");
								break;
							 default:
								System.exit(0);
								
							
							}
							break;
							
						
					case 4:
						System.out.println("Enter the name of student whose details you have to update");
						name=sc.next();
						int cnt=0;
						for(int i=0;i<st.size();i++) {
							if(st.get(i).getName().contains(name)) {
								System.out.println("Enter New Course Name");
								String new_course=sc.next();
								System.out.println("Enter New Mobile Number");
								long new_mobile=sc.nextLong();
								st.get(i).setCourse_name(new_course);
								st.get(i).setMobile(new_mobile);
								cnt++;
							}
						}
						if(cnt==0)
							System.out.println("No such a student exist for update the details");
						else
							System.out.println("Record Updated Successfully");
						break;
						
					case 5:
						System.out.println("Enter Student name to delete the record of that student");
						name=sc.next();
						int count=0;
						for(int i=0;i<st.size();i++) {
							if(st.get(i).getName().contains(name))
								st.remove(i);
							count++;
						}
						if(count==0)
							System.out.println("Record not found");
						else
							System.out.println("Record deleted successfully");
						break;
					case 6:
						for(StudentInfo student : st ) {
							System.out.println("Student : "+student+"");
						}
						Collections.sort(st, new SortByNames());
						System.out.println("----------------------------");
						
				}
					
				}
				
				
			}
			
		}
		
		
		
	
		

	}
	
	

}
