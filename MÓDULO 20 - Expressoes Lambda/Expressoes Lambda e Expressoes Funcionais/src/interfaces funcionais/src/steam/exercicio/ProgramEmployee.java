package steam.exercicio;

import steam.exercicio.entitiesStream.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {

    public static void main(String[] args) {
        /*
     Fazer um programa para ler os dados (nome, email e salário) de funcionários a partir de um arquivo em formato.csv.
     Em seguida mostrar, em ordem alfabética, o email dos funcionários cujo salário seja superior a um dado valor fornecido pelo usuário.
     Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'.
         */
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full file path:/ Entre com o caminho completo do arquivo: ");
        String path = scanner.nextLine();

        try (BufferedReader buffReader = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();

            String line = buffReader.readLine();
            while (line != null) {
                String[] fields = line.split(", ");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = buffReader.readLine();
            }

            System.out.println("Enter reportedSalary:/ Entre com o salário: ");
            double reportedSalary = scanner.nextDouble();

            System.out.println(
                    "Email of people whose reportedSalary is more than / E-mail das pessoas cujo salário informado é superior a:  "
                    + String.format("%.2f", reportedSalary) + ":");
            list.stream()
                    .filter(employee -> employee.getSalaryEmployeeStream() > reportedSalary)
                    .map(Employee::getEmailEmployeeStream)
                    .sorted()
                    .forEach(System.out::println);

            System.out.println();                       // Quebra de linha
            System.out.println("Sum of salary of people whose name starts with / Soma dos salários das pessoas cujo nome começa com a letra:  'M':");

            double sum = list.stream()
                    .filter(employee -> employee.getNameEmployeeStream().charAt(0) == 'S')
                    .map(Employee::getSalaryEmployeeStream)
                    .reduce(0.0, Double::sum);
            System.out.printf("%.2f%n", sum);


        } catch (IOException e) {
            System.out.println("⚠️ ⚠️Error:  " + e.getMessage());
        }

        scanner.close();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
