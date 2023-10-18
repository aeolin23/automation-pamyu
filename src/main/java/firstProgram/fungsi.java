package firstProgram;

public class fungsi {
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kuadrat(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        int hasilTambah = tambah(6,7);
        int hasilKuadrat = kuadrat(9);

        System.out.println("Hasil tambah = " + hasilTambah);
        System.out.println("Hasil kuadrat = " + hasilKuadrat);
    }
}
