public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance()
    {
      return (int) (Math.random() * 40) - 8;
    }

    public boolean simulate(){
        int distance = 0;
        while (maxHops > 0) {
            distance += hopDistance();
            System.out.println(distance);
            if (distance >= goalDistance)
                return true;
            if (distance < 0) return false;
            maxHops--;
        }
        return false;

    }

    public double runSimulations(int num){
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (simulate()){
                count += 1;

            }
        }

        return (double)count/num;
    }
}
