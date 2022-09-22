package device_Diamante;

import device_Diamante.interfaces.Printer;
import device_Diamante.interfaces.Scanner;

// posso herdar de uma classe e implementar duas interfaces ao mesmo tempo
public class Multifuncional extends Device implements Scanner, Printer {

    //--------------------
    //!     CONSTRUCTOR
    //--------------------
    public Multifuncional(String serialNumber) {
        super(serialNumber);
    }

    //--------------------
    //!     METHODS
    //--------------------
    @Override
    public void processDoc(String doc) {
        System.out.println("Multifuncional processing: || Multifuncional processando :  " + doc);
    }

    @Override
    public String scan() {
        return "Scanner result";
    }

    @Override
    public void print(String doc) {
        System.out.println("Printing: || Imprimindo :" + doc);
    }
}
    