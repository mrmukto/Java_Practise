package ParentModel;

public abstract class Employee {

    String name;
    double id;

    public Employee(String name, double id) {
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

   abstract public double getAllsalary();

}
