package services;

public interface InterestService_INTER {

    double getInterestRate();
    
    // Para chamar a operação em todas as classes que utilizam ela sem que eu precise ficar repetindo o código
        default double payment(double amount, int months) {
            if (months < 1) {
                throw new IllegalArgumentException("Months must be greater than zero ||  A quantidade meses tem que ser e maior que 1");
            }
            return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
        }
    
}