package PartTwo;

public class Function {
    public static int tambah(int a, int b){
        return a + b;
    }

    public static int kuadrat(int x){
        return x * x;
    }

    public static void main(String[] args){
        int hasilTambah = tambah(7, 5);
        int hasilKuadrat = kuadrat(15);

        System.out.println("Hasil Tambah: " + hasilTambah);
        System.out.println("Hasil Kuadrat: " + hasilKuadrat);
    }
}
