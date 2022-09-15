package device_Diamante;

public class Device {

    public String serialNumber;

    //--------------------
    //!     CONSTRUCTOR
    //--------------------
    public Device(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Device() {
    }

    //--------------------
    //! GETTERS & SETTERS
    //--------------------
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    //--------------------
    //!     METHODS
    //--------------------
    public void processDoc(String doc) {
        System.out.println("Device processing: " + doc);
    }
}

