package Tugas_Polymorfisme_PBO_A;

public class Main {
    public static void main(String[] args) {
        // Membuat array atau list dari Handphone
        Handphone[] daftarHandphone = new Handphone[2];

        // Mengisi array dengan objek Smartphone dan FeaturePhone
        daftarHandphone[0] = new Smartphone("Iphone", "13");
        daftarHandphone[1] = new FeaturePhone("Realme", "6");

        // Menggunakan loop untuk memanggil metode secara polimorfik
        for (Handphone hp : daftarHandphone) {
            hp.nyalakan();
            hp.kirimPesan("089604059840", "Hallo");
            hp.kirimPesan("089604059840", "085716667720", "Hallo Word");
            // Kirim pesan menggunakan array nomor
            String daftarNomor[] = {"089988776655", "085533776611"};
            hp.kirimPesan(daftarNomor, "Hello Dunia Tipu-Tipu");
            hp.matikan();
            System.out.println();
        }

        // Mengakses metode khusus dengan casting, termasuk kirimPesan ke email
        for (Handphone hp : daftarHandphone) {
            if (hp instanceof Smartphone) {
                Smartphone smartphone = (Smartphone) hp;
                smartphone.nyalakan();
                smartphone.aksesInternet();
                smartphone.kirimPesan("Adi@gmail.com", "Tugas PBO", "Izin mengirimkan tugas");
                smartphone.matikan();
            } else if (hp instanceof FeaturePhone) {
                System.out.println();
                ((FeaturePhone) hp).nyalakan();
                ((FeaturePhone) hp).mainGameSnake();
                ((FeaturePhone) hp).matikan();

            }
        }
    }
}