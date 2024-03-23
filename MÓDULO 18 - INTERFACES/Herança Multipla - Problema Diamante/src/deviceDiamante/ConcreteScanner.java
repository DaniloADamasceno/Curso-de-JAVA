package deviceDiamante;

import deviceDiamante.interfaces.Scanner;

// Esta herdando de duas interfaces, mas nao pode herdar de duas classes
public class ConcreteScanner extends Device implements Scanner { // herda de Device e implementa Scanner

    //!   ----------------------------------    CONSTRUCTOR     --------------------------------------------------------

    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    //!   -------------------------------------------      METHODS      ------------------------------------------------
    //%% Processa documento
    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    //%% Scanner
    @Override
    public String scan() {
        return "Scanned content || Conteúdo escaneado";
    }
}
    
