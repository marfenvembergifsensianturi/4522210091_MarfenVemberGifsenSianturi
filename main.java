public class main {
    public static void main(String[] args) {
        Pecahan pecahan1 = new Pecahan(1, 2);
        Pecahan pecahan2 = new Pecahan(1, 3);
        System.out.println("Pecahan 1: " + pecahan1);
        System.out.println("Pecahan 2: " + pecahan2);

        Pecahan hasilTambah = pecahan1.tambah(pecahan2);
        System.out.println("Hasil Penjumlahan: " + hasilTambah);

        Pecahan hasilKurang = pecahan1.kurang(pecahan2);
        System.out.println("Hasil Pengurangan: " + hasilKurang);

        Pecahan hasilKali = pecahan1.kali(pecahan2);
        System.out.println("Hasil Perkalian: " + hasilKali);

        Pecahan hasilBagi = pecahan1.bagi(pecahan2);
        System.out.println("Hasil Pembagian: " + hasilBagi);

        Pecahan[][] data1 = {{new Pecahan(1, 2), new Pecahan(1, 3)},
                {new Pecahan(2, 5), new Pecahan(3, 4)}};
        matrik matrik1 = new matrik(data1);

        Pecahan[][] data2 = {{new Pecahan(2, 3), new Pecahan(1, 4)},
                {new Pecahan(1, 2), new Pecahan(3, 5)}};
        matrik matrik2 = new matrik(data2);

        System.out.println("matrik 1:");
        System.out.println(matrik1);

        System.out.println("matrik 2:");
        System.out.println(matrik2);

        matrik hasilTambahmatrik = matrik1.tambah(matrik2);
        System.out.println("Hasil Penjumlahan matrik:");
        System.out.println(hasilTambahmatrik);

        matrik hasilKurangmatrik = matrik1.kurang(matrik2);
        System.out.println("Hasil Pengurangan matrik:");
        System.out.println(hasilKurangmatrik);

        matrik hasilDotMatrik = matrik1.dot(matrik2);
        System.out.println("Hasil Dot Product Matrik:");
        System.out.println(hasilDotMatrik);

        matrik hasilTransposeMatrik = matrik1.transpose();
        System.out.println("Hasil Transpose Matrik:");
        System.out.println(hasilTransposeMatrik);
    }
}
