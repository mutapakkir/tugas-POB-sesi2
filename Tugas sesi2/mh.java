// Mendefinisikan kelas Mahasiswa
class Mahasiswa {
    String nama; // Atribut untuk menyimpan nama mahasiswa

    // Konstruktor untuk menginisialisasi objek Mahasiswa dengan nama tertentu
    Mahasiswa(String nama) {
        this.nama = nama; // Menyimpan nilai nama ke dalam variabel instance
    }

    // Metode untuk menampilkan perkenalan mahasiswa
    void perkenalkanDiri() {
        System.out.println("Halo, nama saya " + this.nama); // Mencetak nama mahasiswa ke konsol
    }
}

// Kelas utama untuk menjalankan program
public class mh {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa dengan nama "Budi"
        Mahasiswa mhs = new Mahasiswa("Budi");
        
        // Memanggil metode perkenalkanDiri() untuk menampilkan nama mahasiswa
        mhs.perkenalkanDiri(); // Output: Halo, nama saya Budi
    }
}
