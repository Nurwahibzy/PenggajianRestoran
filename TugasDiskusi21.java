import java.util.Scanner;

public class TugasDiskusi21 {

    public static void main(String[] args) {

        String[] username = { "admin1", "pegawai2", "manajer3" };
        String[] password = { "adminpassword1", "pegawaipassword2", "manajerpassword3" };

        String nama_pegawai, jabatan, bulan_gaji;
        int jumlah_jam_kerja, jumlah_jam_lembur, total_jam_kerja, usia, bonus = 0, lamaBekerja;
        int upah = 15700, total_jam_lembur, total_gaji, gaji_pokok = 2000000;

        Scanner input16 = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String usernameInput = input16.nextLine();

        System.out.print("Masukkan password: ");
        String passwordInput = input16.nextLine();

        boolean isAuthenticated = false;

        // Memeriksa apakah username dan password sesuai
        for (int i = 0; i < username.length; i++) {
            if (usernameInput.equals(username[i]) && passwordInput.equals(password[i])) {
                isAuthenticated = true;
                break;
            }
        }

        if (isAuthenticated) {
            System.out.println("Selamat datang, " + usernameInput + "!");
            System.out.println("=== MOHON MENGISI DATA DI BAWAH INI ====");
            System.out.print("Masukkan Nama Lengkap Anda : ");
            nama_pegawai = input16.nextLine();
            System.out.print("Masukkan Jabatan Anda (A/B/C): ");
            jabatan = input16.nextLine();
            System.out.print("Masukkan Usia Anda : ");
            usia = input16.nextInt();
            System.out.print("Masukkan Lama Anda Bekerja : ");
            lamaBekerja = input16.nextInt();
            input16.nextLine();
            System.out.print("Masukkan Gaji Bulan Yang Akan Diambil : ");
            bulan_gaji = input16.nextLine();
            System.out.print("Masukkan Jumlah Jam Kerja Anda : ");
            jumlah_jam_kerja = input16.nextInt();
            System.out.print("Masukkan Jumlah Jam Lembur Anda Jika Ada : ");
            jumlah_jam_lembur = input16.nextInt();

            // Memilih jabatan
            switch (jabatan) {

                case "A":
                    gaji_pokok = 2800000;
                    if (usia >= 50 && lamaBekerja >= 5) {
                        bonus = 1000000;
                        System.out.println("Jabatan anda " + jabatan + ", Bonus anda " + bonus);
                    } else {
                        System.out.print("Maaf, usia dan masa kerja anda belum memenuhi syarat untuk mendapatkan bonus");
                    }
                    break;
                case "B":
                    gaji_pokok = 2500000;
                    if (usia >= 50 && lamaBekerja >= 5) {
                        bonus = 1000000;
                        System.out.println("Jabatan anda " + jabatan + ", Bonus anda " + bonus);
                    } else {
                        System.out.print("Maaf, usia dan masa kerja anda belum memenuhi syarat untuk mendapatkan bonus");
                    }
                    break;
                case "C":
                    gaji_pokok = 2300000;
                    if (usia >= 50 && lamaBekerja >= 5) {
                        bonus = 1000000;
                        System.out.println("Jabatan anda " + jabatan + ", Bonus anda " + bonus);
                    } else {
                        System.out.print("Maaf, usia dan masa kerja anda belum memenuhi syarat untuk mendapatkan bonus");
                    } 
                    break;
                default:
                    System.out.print("Golongan Jabatan Tidak Ditemukan");
                    break;
            }
    
            total_jam_kerja = jumlah_jam_kerja * 26;// rata - rata jumlah dengan 6 hari kerja seminggu
            total_jam_lembur = jumlah_jam_lembur * upah;
            total_gaji = gaji_pokok + total_jam_lembur  + bonus;
            System.out.println("\nTotal Jam Kerja Anda adalah " + total_jam_kerja+ " jam");
            System.out.println("Total Gaji Yang Anda Terima Adalah : " + "Rp." + total_gaji);

        } else {
            System.out.println("Username dan password salah. Silakan coba lagi.");
        }

        input16.close();
    }

}
