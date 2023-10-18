import java.util.Arrays;
class matrik {
    private Pecahan[][] data;

    public matrik(Pecahan[][] data) {
        this.data = data;
    }

    public matrik tambah(matrik other) {
        if (this.data.length != other.data.length || this.data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Ukuran matriks harus sama");
        }

        Pecahan[][] result = new Pecahan[this.data.length][this.data[0].length];
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[0].length; j++) {
                result[i][j] = this.data[i][j].tambah(other.data[i][j]);
            }
        }

        return new matrik(result);
    }

    public matrik kurang(matrik other) {
        if (this.data.length != other.data.length || this.data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Ukuran matriks harus sama");
        }

        Pecahan[][] result = new Pecahan[this.data.length][this.data[0].length];
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[0].length; j++) {
                result[i][j] = this.data[i][j].kurang(other.data[i][j]);
            }
        }

        return new matrik(result);
    }

    public matrik dot(matrik other) {
        if (this.data[0].length != other.data.length) {
            throw new IllegalArgumentException("Jumlah kolom matriks pertama harus sama dengan jumlah baris matriks kedua");
        }

        Pecahan[][] result = new Pecahan[this.data.length][other.data[0].length];
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < other.data[0].length; j++) {
                Pecahan sum = new Pecahan(0, 1);
                for (int k = 0; k < this.data[0].length; k++) {
                    sum = sum.tambah(this.data[i][k].kali(other.data[k][j]));
                }
                result[i][j] = sum;
            }
        }

        return new matrik(result);
    }

    public matrik transpose() {
        int rows = this.data.length;
        int cols = this.data[0].length;
        Pecahan[][] result = new Pecahan[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = this.data[i][j];
            }
        }

        return new matrik(result);
    }

    // Implementasi invers matriks dapat ditambahkan sesuai kebutuhan.
    // Ini merupakan operasi yang lebih kompleks dan memerlukan perhitungan matriks yang lebih lanjut.

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Pecahan[] row : data) {
            sb.append(Arrays.toString(row)).append("\n");
        }
        return sb.toString();
    }
}
