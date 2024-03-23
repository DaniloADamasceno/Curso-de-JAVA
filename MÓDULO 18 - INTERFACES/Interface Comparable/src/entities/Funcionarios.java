package entities;

public class Funcionarios implements Comparable<Funcionarios> {

    private String name;
    private Double salary;

    //!   ----------------------------------    CONSTRUCTOR     --------------------------------------------------------
    public Funcionarios(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Funcionarios() {
    }

    //!  ----------------------------------------    GETTERS AND SETTERS    --------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    //!   -------------------------------------------      METHODS      ------------------------------------------------

    @Override
    public int compareTo(Funcionarios outroFuncionarioParaComparar) {
        // para utilizar a lista em modo decrescente e so colocar um sinal de - na frente do Salary.CompareTo
        return -salary.compareTo(outroFuncionarioParaComparar.getSalary());
    }
}
