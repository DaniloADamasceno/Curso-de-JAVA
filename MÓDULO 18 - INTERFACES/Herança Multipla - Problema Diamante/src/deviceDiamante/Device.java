package deviceDiamante;

public class Device {

    public String serialNumber;

    //!   ----------------------------------    CONSTRUCTOR     --------------------------------------------------------
    public Device(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Device() {
    }

    //!  ----------------------------------------    GETTERS AND SETTERS    --------------------------------------------
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    //!   -------------------------------------------      METHODS      ------------------------------------------------
    //%% Processa o documento
    public void processDoc(String doc) {
        System.out.println("Device processing: " + doc);
    }
}

