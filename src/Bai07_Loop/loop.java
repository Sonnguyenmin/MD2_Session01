package Bai07_Loop;

public class loop {
    public static void main(String[] args) {
        //cho mảng [1, 2, 3, 4, 5]
        //target = 7
        //tìm ra vị trí có tổng bằng target
        int[] arr = {1, 2, 3, 4};
        int target = 7;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
