package service;

public class ServicePaypal implements ServiceOnlinePayment { // implementando a interface

  private static final double tax
   = 0.02;
  private static final double MonthlyJuros = 0.01;

  //%%  Taxa de Pagamento
  public double taxaJurosService(double amount) {
    return amount * tax;
  }

  //%% Juros Mensais
  public double juros(double amount, int months) {
    return amount * MonthlyJuros * months;
  }
}
  