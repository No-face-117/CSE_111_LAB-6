// CSE-111 LAB - 6 TASK - 2     []
// Passenger class

public class Passenger {
    public static int no_of_passenger;
    public static double total_fare = 0.00;

    public String name = "Somebody.";
    public double distence = 0.00;
    public double weight = 0.00;
    public double price = 0.00;

    public int count = 0;

    public Passenger(String nk_0, double dk_0) {
        name = nk_0;
        distence = dk_0;

        count ++;
    }

    public void storeBaggageWeight(double wk_0){
        weight = wk_0;
    }

    public void passengerDetails() {
        double ak = 20 * distence;
        double kk = 10 * weight;

        price = ak + kk;

        System.out.println("Name : " + name);
        System.out.println("Fare : " + price);

        total_fare += price;
    }


    
}


