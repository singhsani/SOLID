/**
 * SOLID
 * O-> Open-Closed Principle (OCP)
 * Open-Closed Principle (OCP): Objects should be open for extension but closed for modification
 * I have save class contains one save method in database
 * new requirement save data in file then create interface create save method
 * and extends method on the requirement don't implement method in single class
 */
interface InvoiceDAO{
    public void save(Invoice invoice);
}
public class OpenExtentionForCloseModification {

}
class SaveDataInDatabase implements InvoiceDAO{

    @Override
    public void save(Invoice invoice) {

    }
}

class SaveDataInFile implements InvoiceDAO{

    @Override
    public void save(Invoice invoice) {

    }
}
