/**
 * SOLID
 * D-: Dependency Inversion Principle
 *      It focuses on decoupling high-level modules from low-level modules,
 *      allowing for greater flexibility and easier maintenance of the system.
 *
 *
 */

public class DependencyInversionPrinciple {
}
interface Mouse{
    void warridMouse();
    void bloothMouse();
}
interface Keyboard{
    void warridKeyboard();
    void bloothKeyboard();
}
class MacBook{
    public final Keyboard keyboard;
    public final Mouse mouse;
    public MacBook(Keyboard keyboard,Mouse mouse){
        this.keyboard=keyboard;
        this.mouse=mouse;
    }
}