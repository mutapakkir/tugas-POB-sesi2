//Program Mobil
class Mobil{// Mendefinisikan kelas Mobil
        String merk;//Atribut untuk menampung merk mobil
        //konstruktor untuk menginisialisasi objek Mobil dengan merk tertentu
        Mobil(String merk){
            this.merk = merk;//menyimpan nilai merk ke dalam variabel instance merk
        }
        //Method untuk menampilkan merk mobil
        void tampilkanMeerk(){
            System.out.println("Merk Mobil: " + this.merk);//menampilkan merk mobil ke konsol
        }
    }
    ///Kelas utama untuk menjalankan program
    public class Main{
        public static void main(String[] args){
            //Membuat objek Mobil dengan merk "Toyota"
            Mobil m = new Mobil("Toyota");
            //Memanggil method tampilkanMeerk() pada objek m
            m.tampilkanMeerk();//Output: Merk Mobil: Toyota
        }
    }
