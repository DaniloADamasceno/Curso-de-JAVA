package device_Diamante;

import device_Diamante.interfaces.Printer;

public class ConcretePrinter extends Device implements Printer { // Herda de Device e implementa Printer

    //--------------------
    //!     CONSTRUCTOR
    //--------------------
    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    //--------------------
    //!     METHODS
    //--------------------
    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Printing: || Imprimindo :" + doc);
    }
}
    

