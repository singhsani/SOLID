/**
 * SOLID
 * I -> Interface Segregation Principle
 *      Interfaces should be segregated.
 *
 * Small interfaces: Instead of having a large interface with many methods,
 *       create smaller, focused interfaces that a class can implement only the ones it needs.
 * Focus on specific behavior: If a class doesn’t need a particular method,
 *       it shouldn’t be forced to implement it.
 * Increases flexibility: It allows a class to only be concerned with the methods it will actually use,
 *       making it easier to modify and extend without affecting unrelated parts of the system.
 */
public class InterfaceSegregationPrinciple {
}

interface WaiterInterface{
    void serveItem();
    void takeOrder();
}
interface chefInterface{
    void cookFood();
    void decideMenue();
}
class Waiter implements WaiterInterface{

    @Override
    public void serveItem() {

    }

    @Override
    public void takeOrder() {

    }
}
class Cook implements chefInterface{

    @Override
    public void cookFood() {

    }

    @Override
    public void decideMenue() {

    }
}