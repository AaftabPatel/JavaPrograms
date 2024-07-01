class ThreeDArray {
    public static void main(String[] args)
    {
        int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
        System.out.println("PROGRAM FOR 3D-ARRAY -");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int z = 0; z < 2; z++)
                    System.out.println("arr[" + i+ "]["+ j + "]["+ z + "] = "+ arr[i][j][z]);
    }
    
}