/**
 * SOLID
 * S->Single Responsibility Principle (SRP)
 *      A class should have a single reason to change
 */
public class Marker{
    int prise=0;
    String color;
    int quentity;
    public Marker(int prise,String color,int quentity){
        this.prise=prise;
        this.color=color;
        this.quentity=quentity;
    }
}

class Invoice{
    int quentity;
    Marker marker;
    public Invoice(int quentity,Marker marker){
        this.quentity=quentity;
        this.marker=marker;
    }
    public int getPrise(int quentity,Marker marker){
        return (quentity*marker.prise);
    }
}

class InvoicePrinter{
    public Invoice invoice;
    public InvoicePrinter(Invoice invoice){
        this.invoice=invoice;
    }
    public void print(){
        System.out.println(invoice.getPrise(2,new Marker(50,"blue",2)));
    }
}

class InvoiceDao{
    Invoice invoice;
    public InvoiceDao(Invoice invoice){
        this.invoice=invoice;
    }
    public void saveToDB(){

    }
}