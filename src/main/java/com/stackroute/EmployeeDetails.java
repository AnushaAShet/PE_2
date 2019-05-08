package com.stackroute;

public class EmployeeDetails {

        private float salary;
        private String empName;
        private int empAge;

        //Getter and Setter methods
        public float getEmpSalary(){
            return salary;
        }

        public String getEmpName(){
            return empName;
        }

        public int getEmpAge(){
            return empAge;
        }

        public void setEmpAge(int newValue){
            empAge = newValue;
        }

        public void setEmpName(String newValue){
            empName = newValue;
        }

        public void setEmpSalary(float newValue){
            salary = newValue;
        }

        public static void main(String args[]){
            EmployeeDetails obj = new EmployeeDetails();
            obj.setEmpName("Harry");//display member name
            obj.setEmpAge(30);
            obj.setEmpSalary(2500);//display member salary
            System.out.println("Member Name: " + obj.getEmpName());
            System.out.println("Member Salary: " + obj.getEmpSalary());
            System.out.println("Memeber Age: " + obj.getEmpAge());
        }
    }