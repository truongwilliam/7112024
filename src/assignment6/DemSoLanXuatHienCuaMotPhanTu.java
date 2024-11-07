package assignment6;
import java.util.Scanner;
import java.util.Arrays;

public class DemSoLanXuatHienCuaMotPhanTu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap kich thuoc cua mang: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            System.out.println("Nhap cac phan tu cua mang:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.print("Nhap so can dem: ");
            int target = scanner.nextInt();
            int count = 0;
            for (int num : array) {
                if (num == target) {
                    count++;
                }
            }
            System.out.println("So " + target + " xuat hien " + count + " lan trong mang.");
        }
    }
}
 