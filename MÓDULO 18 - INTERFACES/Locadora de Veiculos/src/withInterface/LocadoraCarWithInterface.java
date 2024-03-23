package withInterface;

import noInterface.entities.CarRental;
import noInterface.entities.Vehicle;
import noInterface.service.BrazilTaxService;
import noInterface.service.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class LocadoraCarWithInterface {

    public static void main(String[] args) throws ParseException {
    /*
    Uma locadora brasileira de carros cobra um valor por hora para locações de até 12 horas. 
    Porém, se a duração da locação ultrapassar 12 horas, a locação será cobrada com base em um valor diário.
    Além do valor da locação, é acrescido no preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20% 
    para valores até R$100.00, ou 15% para valores acima de R$100.00.
    Fazer um programa que lê os dados da locação (modelo do carro, instante inicial e final da locação), 
    bem como o valor por hora e o valor diário de locação.
    O programa deve então gerar a nota de pagamento (contendo valor da locação, valor do imposto e valor total do pagamento)
    e informar os dados na tela. Veja os exemplos.
    
    ----------------------------------------------------- | ----------------------------------------------------------------
                    Exemplo 1:                            |                               Exemplo 2:
    Car model:  Honda Civic                               |                 Car model:  Honda Civic II
    Pickup (dd/MM/yyyy HH:mm): 25/06/2022 10:32           |                 Pickup (dd/MM/yyyy HH:mm): 20/08/2022 10:31
    Return (dd/MM/yyyy HH:mm): 25/06/2022 14:42           |                 Return (dd/MM/yyyy HH:mm): 22/08/2022 11:47
    Price per hour: 10.00                                 |                 Price per hour: 10.00
    Price per day: 130.00                                 |                 Price per day: 130.00
                                                          |
    INVOICE:                                              |                  INVOICE:
    Basic payment: 50.00                                  |                  Basic payment: 390.00
    Tax: 10.00                                            |                  Tax: 58.50
    Total payment: 60.00                                  |                  Total payment: 448.50
    ----------------------------------------------------- | ----------------------------------------------------------------
    */

        Scanner scan = new Scanner(in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm"); // receber a data e hora no formato dd/MM/yyyy HH:mm

        System.out.println("<<<<<----------     Locadora de Veículos  LOCA WEB CAR - LWCar     ---------->>>>>");
        System.out.println(); // quebra de linha
        System.out.println(); // quebra de linha
        System.out.println("Entre com os Dados do veiculo e as Datas | Enter rental data:");
        System.out.println(); //Quebra uma linha
        System.out.print("Modelo do Veiculo: | Car model: ");
        String carModel = scan.nextLine();

        System.out.print("Data de Retirada | Pickup (dd/MM/yyyy HH:mm): ");
        Date dateStart = sdf.parse(scan.nextLine());

        System.out.print("Data de Devolução | Return (dd/MM/yyyy HH:mm): ");
        Date dateFinish = sdf.parse(scan.nextLine());

        //%% instanciando o objeto carRental
        CarRental carRental = new CarRental(dateStart, dateFinish, new Vehicle(carModel));

        System.out.print("Valor por Hora: | Price per hour: ");
        double pricePerHour = scan.nextDouble();

        System.out.print("Valor por Dia: | Price per day: ");
        double pricePerDay = scan.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println(); // quebra de linha
        System.out.println("INVOICE: ");
        System.out.println("Basic payment:  " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax:  " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Total payment:  " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));
        System.out.println(); //Quebra uma linha
        scan.close();
    }
}
