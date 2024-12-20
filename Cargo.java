// CSE-111 LAB - 6 TASK - 6     []
// T-6 Circle class

public class Cargo{
    private static double capacity = 10.0;
    private static int cargo_c = 0;
    private int cargo_ID = 0;
    private String contents;
    private double weight = 0.00;
    private boolean loaded = false;
    
    public Cargo(String stuff_0, double weight_0){
        contents = stuff_0;
        weight = weight_0;
        cargo_c ++;
        cargo_ID = cargo_c;
    }
    
    public void details(){
        System.out.println("Cargo ID: " + cargo_ID + ", Contents: " + contents + ", Weight: " + weight + ", Loaded: " + loaded + ".");
    }
    
    public void load(){
        if(!loaded && weight <= capacity){
            loaded = true;
            capacity -= weight;
            System.out.println("Cargo " + cargo_ID + " loaded for transport.");
        }else if(loaded){
            System.out.println("Cargo " + cargo_ID + " already loaded.");
        }else{
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    
    }
    
    public void unload(){
        if(loaded){
            loaded = false;
            capacity += weight;
            System.out.println("Cargo " + cargo_ID + " unloaded.");
        }else{
            System.out.println("Cargo " + cargo_ID + " already unloaded.");
        }
    }
    
    public static double capacity(){
        return capacity;
    }
}
  