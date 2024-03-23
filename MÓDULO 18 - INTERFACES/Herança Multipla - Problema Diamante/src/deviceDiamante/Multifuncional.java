package deviceDiamante;

import deviceDiamante.interfaces.Printer;
import deviceDiamante.interfaces.Scanner;

// posso herdar de uma classe e implementar duas interfaces ao mesmo tempo
public class Multifuncional extends Device implements Scanner, Printer {

    //!   ----------------------------------    CONSTRUCTOR     --------------------------------------------------------
    public Multifuncional(String serialNumber) {
        super(serialNumber);
    }

    //!  ----------------------------------------    GETTERS AND SETTERS    --------------------------------------------
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
    