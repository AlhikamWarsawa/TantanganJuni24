// Cek Apakah Hari Itu Adalah Hari Kerja / Libur
public class Day7 {
    public static void main(String[] args) {
        var Hari = "Senin";
        boolean HariKerja;

        // Switch Statement
        switch (Hari) {
            case "Senin":
            case "Selasa":
            case "Rabu":
            case "Kamis":
            case "Jumat":
                // Boolean
                HariKerja = true;
                break;
            case "Sabtu":
            case "Minggu":
                HariKerja = false;
                break;
            default:
                System.out.println("Hari Tidak Valid");
        }

        // If Statement,  String
        if (HariKerja = true) {
            System.out.println(Hari + " " + "Adalah Hari Kerja");
        } else {
            System.out.println(Hari + " " + "Adalah Hari Libur");
        }
    }
}
