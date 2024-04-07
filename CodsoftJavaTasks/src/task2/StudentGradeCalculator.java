package task2;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name =  scan.nextLine();
		
		System.out.println("\nWelcome to Student Grade Calculator " + name);
		
		int subnum = 0;
		
		System.out.println("Please Enter the Total number of your Subjects:");
		
		
		
		subnum = scan.nextInt();
		
		int[] mark = new int[subnum];
		
		
		
		for(int m = 0; m < mark.length; m++)
		{
			System.out.println("\nEnter Mark for Subject " + (m + 1) + ":");
			mark[m] = scan.nextInt();
			
			while(mark[m] < 0 || mark[m] > 100)
			{
				System.out.println("\nPlease Enter the correct Mark for Subject " + (m + 1) + ":");
				mark[m] = scan.nextInt();
			}
		}
		
		int totMark = 0;
		double avgMark = 0.0;
		String grade = "";
		
		for(int m = 0; m < mark.length; m++)
		{
			totMark += mark[m];
		}
		
		avgMark = totMark/subnum;
		
		if(avgMark >= 80)
		{
			grade = "A";
		}else if(avgMark >= 70 && avgMark < 80)
		{
			grade = "B";
		}else if(avgMark >= 60 && avgMark < 70)
		{
			grade = "C";
		}else if(avgMark >= 50 && avgMark < 60)
		{
			grade = "D";
		}else if(avgMark >= 40 && avgMark < 50)
		{
			grade = "E";
		}else if(avgMark >= 30 && avgMark < 40)
		{
			grade = "F";
		}else
		{
			grade = "FF";
		}
		
		
		System.out.println("\n\nStudent Name: "+name+"\n\nTotal Subjects: "+subnum+"\nTotal Marks: "+totMark+"\nAverage Marks: "+avgMark+"\nGrade: "+grade);
		
	}
}
