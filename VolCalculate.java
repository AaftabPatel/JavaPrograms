import Volume.*;
class VolCalculate {
    public static void main(String arg[]){
        System.out.println("PROGRAM TO IMPLEMENT CLASSE OF VOLUME PACKAGE-");
        // Creating an object of CubeVol class
        CuboidVol cuboid = new CuboidVol();
        cuboid.vol(2,4,5);

        //Creating an object of CubeVol class
        CubeVol cube = new CubeVol();
        cube.vol(25);
    }
}