package device_Diamante;

import device_Diamante.interfaces.Scanner;

// Esta herdando de duas interfaces, mas nao pode herdar de duas classes
public class ConcreteScanner extends Device implements Scanner { // herda de Device e implementa Scanner


    //--------------------
    //!     CONSTRUCTOR
    //--------------------
    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    //--------------------
    //!     METHODS
    //--------------------
    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    @Override
    public String scan() {
        return "Scanned content || Conteudo escaneado";
    }
}
    
