package Tugas_Polymorfisme_PBO_A;

public class Smartphone extends Handphone {

    // Constructor
    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    // Override method nyalakan
    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang booting.");
    }

    // Override method matikan
    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang shutdown.");
    }

    // Method kirimPesan untuk mengirim pesan teks
    @Override
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim pesan ke nomor " + pesan + ": " + nomorTujuan);
    }

    // Overloading method kirimPesan untuk mengirim email
    public void kirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Mengirim email ke: " + emailTujuan + "\nSubjek: " + subjek + "\nPesan: " + pesan);
    }

    // Method aksesInternet
    public void aksesInternet() {
        System.out.println("Mengakses internet melalui Smartphone.");
    }
}