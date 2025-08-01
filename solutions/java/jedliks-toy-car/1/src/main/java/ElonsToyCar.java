public class ElonsToyCar {
    private int meters;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        int battery = 100 - (meters/20);
        if(battery>0)return "Battery at " + battery + "%";
        else return "Battery empty";
    }

    public void drive() {
        if(meters<2000) meters += 20;        
    }
}
