
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek={0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    public int getToday() {
       int last =  birdsPerDay[birdsPerDay.length-1];
           return last;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] +=1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i: birdsPerDay ){
            if (i == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int accumulator =0;
        if(numberOfDays<birdsPerDay.length){
            for(int i=0; i<numberOfDays; i++){
                accumulator += birdsPerDay[i];
            }
            }
        else{
            for(int i: birdsPerDay){
                accumulator += i;
            }
        }
        return accumulator;
    }

    public int getBusyDays() {
       int counter =0;
        for(int i: birdsPerDay){
            if(i>=5){
                counter+=1;
            }
        }
        return counter;
    }
}
