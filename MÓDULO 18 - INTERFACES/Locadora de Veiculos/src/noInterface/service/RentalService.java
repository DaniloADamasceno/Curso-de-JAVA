package noInterface.service;

import noInterface.entities.CarRental;
import noInterface.entities.Invoice;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;
    private BrazilTaxService brazilTaxService;

    //!   ----------------------------------    CONSTRUCTOR     --------------------------------------------------------
    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brazilTaxService = brazilTaxService;
    }

    public RentalService() {
    }

    //!  ----------------------------------------    GETTERS AND SETTERS    --------------------------------------------

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public BrazilTaxService getBrazilTaxService() {
        return brazilTaxService;
    }

    //!   -------------------------------------------      METHODS      ------------------------------------------------
    //%%  Processa a fatura
    public void processInvoice(CarRental carRental) {

        long time1 = carRental.getDateStart().getTime(); //getTime() retorna o tempo em milisegundos
        long time2 = carRental.getDateEnd().getTime(); //getTime() retorna o tempo em milisegundos
        double hours = (double) (time2 - time1) / 1000 / 60 / 60; //converte o tempo em horas
        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = Math.ceil(hours) * pricePerHour; //Math.ceil() arredonda para cima

        } else {
            basicPayment = Math.ceil(hours / 24) * pricePerDay; //converte o tempo em dias

        }

        double tax = brazilTaxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}