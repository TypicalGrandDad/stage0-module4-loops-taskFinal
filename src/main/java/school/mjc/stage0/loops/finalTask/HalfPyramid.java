package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for(int x =1; x<=cathetusLength;x++){
            for (int y = 1; y<=cathetusLength-x;y++){
                System.out.print(" ");
            }
            for (int z = 2; z <=x+1; z++){
                System.out.print((z>=10) ?+ z : "*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
