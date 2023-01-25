package steam.exercicio.entitiesStream;

public class Employee {

    private String name;
    private String email;
    private Double salary;

    // -------------------------------------------------- Constructor --------------------------------------------------
    public Employee(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    // -------------------------------------------------- Getters and Setters-------------------------------------------
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Double getSalary() {
        return salary;
    }

    //-------------------------------------------------- To String -----------------------------------------------------
    @Override
    public String toString() {
        return "Employee/Funcionário >> " +
                "Name/Nome = " + name +
                "--> Email/Email = " + email +
                "--> Salary/Salário = " + String.format("%.2f", salary);
    }
}
