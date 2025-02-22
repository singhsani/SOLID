import java.util.ArrayList;
import java.util.List;

class Vehicle{
    public int getWheeler(){
        return 2;
    }
}
class Bicycle extends Vehicle{

}

class EngineVehicle extends Vehicle{
    public boolean hasEngine(){
        return true;
    }
}
class Cars extends EngineVehicle{
  @Override
    public int getWheeler(){
      return 4;
  }
}
class Bikes extends EngineVehicle{

}
public class LiskovSubstitutionPrincipleTwo {
    public static void main(String[] args) {
        List<Vehicle> list=new ArrayList<>();
        list.add(new Bikes());
        list.add(new Cars());
        list.add(new Bicycle());
        for(Vehicle vehicle:list){
            System.out.println(vehicle.getWheeler());
        }
    }
}
