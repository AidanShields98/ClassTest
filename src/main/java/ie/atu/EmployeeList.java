package ie.atu;
import java.util.ArrayList;

public class EmployeeList {

    ArrayList<Object> Employees = new ArrayList<>();

     public ArrayList<Object> addNewEmployee (Employee newEmployee) {
        Employees.add(newEmployee) ;
        return Employees;
    }

     public ArrayList<Object> deleteEmployee(int id) {
       Employees.remove(id);
       return Employees;
    }

    public void getListSize() {
        System.out.println("the size of the arrayList is: " + Employees.size());
    }

    public static void main(String[] args) {

    }
}
