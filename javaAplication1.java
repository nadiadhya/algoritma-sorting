import java.util.*;
public class javaAplication1 {
    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.print("Imputkan Panjang Array : ");
        int panjang = scan.nextInt();
        for (int i = 0; i < panjang; i++) {
            System.out.println("Index ke"+i+" : ");
            int angka = scan.nextInt();
            nilai.add(angka);
        }
        System.out.println("Sebelum di sorting "+nilai);
        for (int i = 0; i < nilai.size()-1; i++) {
            for (int j = 0; j < nilai.size()-1; j++) {
                if (nilai.get(j) > nilai.get(j+1)) {
                int temp = nilai.get(j);
                nilai.set(j, nilai.get(j+1));
                nilai.set(j+1, temp);
            
                 }
        
            }
        }
        System.out.println("setelah di sorting "+nilai);
        
    }

}
