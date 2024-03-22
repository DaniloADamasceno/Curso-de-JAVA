package steam.exercicio.entitiesStream;

public class Employee {

    private final String nameEmployeeStream;
    private final String emailEmployeeStream;
    private final Double salaryEmployeeStream;

    //^^ -------------------------------------------------- Constructor ------------------------------------------------
    public Employee(String name, String email, Double salary) {
        this.nameEmployeeStream = name;
        this.emailEmployeeStream = email;
        this.salaryEmployeeStream = salary;
    }

    //^^ ----------------------------------------------  Getters and Setters  ------------------------------------------
    public String getNameEmployeeStream() {
        return nameEmployeeStream;
    }

    public String getEmailEmployeeStream() {
        return emailEmployeeStream;
    }

    public Double getSalaryEmployeeStream() {
        return salaryEmployeeStream;
    }

    //^^-------------------------------------------------- To String ---------------------------------------------------
    @Override
    public String toString() {
        return "Employee|Funcionário >> " +
               "Name|Nome = " + nameEmployeeStream +
               "--> Email|Email = " + emailEmployeeStream +
               "--> Salary|Salário = " + String.format("%.2f", salaryEmployeeStream);
    }
}
