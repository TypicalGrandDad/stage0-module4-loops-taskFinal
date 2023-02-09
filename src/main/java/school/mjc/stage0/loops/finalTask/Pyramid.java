package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for(int x =0; x<=cathetusLength;x++){
            for (int y = 1; y<=cathetusLength-x;y++){
                System.out.print(" ");
            }
            for (int z = x; z >=1; z--){
                System.out.print((z >= 10) ?+ z : "" +z);
            }
            for (int z = 2; z <=x; z++){
                System.out.print((z>=10) ?+ z : "" +z);
            }
                System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
