public class Main {
    public static void main(String[] args) {
        int[] N = {2, 8, 4, 1};
        System.out.println(CanPart.canPartition(N));

        N = new int[]{-1, -10, 1, -2, 20};
        System.out.println(CanPart.canPartition(N));

        N = new int[]{-1, -20, 5, -1, -2, 2};
        System.out.println(CanPart.canPartition(N));

        int[] rD1 = ReorderDigits.reorderDigits(new int[]{515, 341, 98, 44, 211}, "asc");
        for(int i = 0; i < rD1.length; i++){
            System.out.print(rD1[i] + " ");
        }

        System.out.println("");

        int[] rD2 = ReorderDigits.reorderDigits(new int[]{515, 341, 98, 44, 211}, "desc");
        for(int i = 0; i < rD2.length; i++){
            System.out.print(rD2[i] + " ");
        }
    }
}
