package withInterface.entities;

import java.sql.Date;

public class CarRental {

  private Date dateStart;
  private Date dateEnd;
  private Vehicle vehicle;
  private Invoice invoice;

  //!   -----------------------------------------    CONSTRUCTOR    ----------------------------------------------------
  public CarRental(Date dateStart, Date dateFinish, Vehicle vehicle) {
    this.dateStart = dateStart;
    this.dateEnd = dateFinish;
    this.vehicle = vehicle;
  }

  public CarRental() {}

  public CarRental(java.util.Date dateStart2, java.util.Date dateFinish, Vehicle vehicle2) {}

  //!  -------------------------------------  GETTERS AND SETTERS     --------------------------------------------------
  public Date getDateStart() {
    return dateStart;
  }

  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }

  public Date getDateEnd() {
    return dateEnd;
  }

  public void setDateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }
}
