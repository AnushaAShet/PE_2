package com.stackroute;
import java.util.*;

public class StudentMarkAnalyzer {
    public static void main(String args[])
    {

                Scanner s=new Scanner(System.in);
                System.out.println("Enter the number of students: ");
                int numberOfStudents=s.nextInt();
                int i;
                int[] gradesArray= new int[numberOfStudents];
                System.out.println("Enter the grades : ");
                for(i=0;i<numberOfStudents;i++)
                {
                    gradesArray[i]=s.nextInt();
                }



        StudentMarkAnalyzer student=new StudentMarkAnalyzer();
                student.getMinValue(numberOfStudents,i,gradesArray);
                student.getAvgValue(numberOfStudents,i,gradesArray);
                student.getMaxValue(numberOfStudents,i,gradesArray);

            }


            public void getAvgValue(int numberOfStudents,int i,int gradesArray[])    {
                int sum=0;
                float average;
                for(i=0;i<numberOfStudents;i++)
                {
                    sum=sum+gradesArray[i];
                }
                average=sum/numberOfStudents;
                System.out.println("The average is "+average);
            }

            public void getMaxValue(int numberOfStudents,int i,int gradesArray[])    {
                int max=gradesArray[0];
                for(i=1;i<numberOfStudents;i++)
                {
                    if(max<gradesArray[i])
                    {
                        max=gradesArray[i];
                    }
                }

                System.out.println("The maximum grade is "+max);
            }

            public int getMinValue(int numberOfStudents, int i, int[] gradesArray)    {
                int min=gradesArray[0];
                for(i=1;i<numberOfStudents;i++)
                {
                    if(min>gradesArray[i])
                    {
                        min=gradesArray[i];
                    }
                }

                System.out.println("The minimum grade is "+min);
                return min;
            }



}