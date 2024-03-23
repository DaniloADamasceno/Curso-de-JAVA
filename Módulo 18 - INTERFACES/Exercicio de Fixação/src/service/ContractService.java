package service;

import entities.Contract;
import entities.Parcelas;

import java.util.Calendar;
import java.util.Date;

//import application.Payment_PayPal;

public class ContractService {

    private final ServiceOnlinePayment onlinePaymentService;
    private Date date;

    //!   ----------------------------------    CONSTRUCTOR     --------------------------------------------------------
    public ContractService(ServiceOnlinePayment online_Payment_Service) {
        this.onlinePaymentService = online_Payment_Service;
    }

    public void processContract(Contract contract, int months) {
        double basicAlicota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            double updateQuota = basicAlicota + onlinePaymentService.juros(basicAlicota, i);
            double Cota_Maxima = updateQuota + onlinePaymentService.taxaJurosService(updateQuota);
            contract.addParcelas(new Parcelas(date, Cota_Maxima));
        }
    }

    //!   -------------------------------------------      METHODS      ------------------------------------------------
    //%%    Adicionar meses a uma data
    private Date addMonths(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }

}

   

