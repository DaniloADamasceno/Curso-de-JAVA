package service;

public interface ServiceOnlinePayment {
  double taxaJurosService(double amount);

  double juros(double amount, int months);
}
