package Tugas_Polymorfisme_PBO_A;

class Handphone {
    String merk;
    String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println(merk + " " + model + " menyala.");
    }

    public void matikan() {
        System.out.println(merk + " " + model + " dimatikan.");
    }

    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim pesan ke " + nomorTujuan + ": " + pesan);
    }

    public void kirimPesan(String nomorTujuan, String nomorTujuan2, String pesan) {
        System.out.println("Mengirim pesan ke " + nomorTujuan + " dan " + nomorTujuan2 + ": " + pesan);
    }

    public void kirimPesan(String[] daftarNomor, String pesan) {
        System.out.print("Mengirim Pesan: " + pesan + ", dengan Daftar Nomor: ");
        for (int i = 0; i < daftarNomor.length; i++) {
            System.out.print(daftarNomor[i]);
            if (i < daftarNomor.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(".");
    }
}