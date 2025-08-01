class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled;
    private int numberOfVictories;

    public ProductionRemoteControlCar() {
        this.distanceTravelled = 0;
        this.numberOfVictories = 0;
    }

    public void drive() {
        distanceTravelled += 10;        
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return o.getNumberOfVictories() - this.getNumberOfVictories();
    }
}
