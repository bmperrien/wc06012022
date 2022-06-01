public class Main {
    public static void main(String[] args) {
        int[] N = {2, 8, 4, 1};
        System.out.println(CanPart.canPartition(N));

        N = new int[]{-1, -10, 1, -2, 20};
        System.out.println(CanPart.canPartition(N));

        N = new int[]{-1, -20, 5, -1, -2, 2};
        System.out.println(CanPart.canPartition(N));


    }
}
