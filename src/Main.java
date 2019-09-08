import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do{
            System.out.println("Enter the size :");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Size cannot exceed 20");
            }
        } while (size > 20);

        int[] assetOfBillionaire = new int[size];

        for (int i = 0; i < assetOfBillionaire.length; i++){
            System.out.println("Enter the asset :");
            assetOfBillionaire[i] = scanner.nextInt();
        }

        int maxInAssetOfBillionaire = MaxInArray.maxInArrayInt(assetOfBillionaire);
        System.out.println("Biggest Asset Billionaire :");
        System.out.println(maxInAssetOfBillionaire);
    }
}
