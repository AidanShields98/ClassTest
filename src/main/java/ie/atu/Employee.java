package ie.atu;

public class Employee {
    private String name;
    private String  id;

    public Employee() {
        name = " ";
        id = "";
    }

    public Employee(String n, String i) {
        name = n;
        id = i;
    }

    public String getName(String n) {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 5)
        {
            throw new IllegalArgumentException("invalid name length");
        }
        else
        {
            this.name = name;
        }

    }

    public String getId(String s) {
        return id;
    }


    public void setId(String id) {
        if(id.length() != 12 )
        {
            throw new IllegalArgumentException("employee number should be 12 digits");
        }
        else
        {
            this.id = id;
        }
    }


    public static void main(String[] args) {
        Employee a = new Employee("aidan", "1234567891223");

    }
}
