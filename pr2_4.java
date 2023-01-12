class pr{
    public static void main(String[] args) 
    {
        Employee z= new Employee(12,"sujal","manager",50000);  

    }
}

class Employee
{
    Employee(int emp_id , String emp_name , String emp_designationa,int salary)
    {
        System.out.println("id ="+emp_id);
        System.out.println("Name ="+emp_name);
        System.out.println("designationa ="+emp_designationa);
        System.out.println("salary ="+salary);
    }

}