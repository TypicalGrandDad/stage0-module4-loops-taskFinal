package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int oneMoreNumber=numberToPrint;
        for(int x = 1; x<power; x++){
            oneMoreNumber = oneMoreNumber * numberToPrint;
        }
        numberToPrint = oneMoreNumber;

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
