package projeto_sem_Interface.service;

public class BrazilTaxService {

  public double tax(Double amount) {
      if (amount <= 100.0) {
          return amount * 0.2;
      } 
    else {
      return amount * 0.15;
    }
  }
}
