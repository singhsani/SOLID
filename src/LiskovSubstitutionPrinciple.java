/**
 * SOLID
 * L-> Liskov Substitution Principle (LSP):
 * Liskov Substitution Principle (LSP):
 *         A subclass should be able to replace its base class without breaking anything
 *  It should not break existing functionality or assumptions made about the parent class when it’s substituted.
 * The subclass can override or extend the functionality of the superclass, but it shouldn't contradict the behavior defined in the superclass.
 *
 * I have Bike interface contain two method startEngine() and accelerate()
 * car implement both method
 * but bicycle breaking startEngine
 */
interface Bike{
    boolean startEngine();
    void accelerate();
}
public class LiskovSubstitutionPrinciple {
}
class Car implements Bike{

    @Override
    public boolean startEngine() {
        return true;
    }

    @Override
    public void accelerate() {

    }
}
class bicycle implements Bike{

    @Override
    public boolean startEngine() {
        return false;
    }

    @Override
    public void accelerate() {

    }
}
