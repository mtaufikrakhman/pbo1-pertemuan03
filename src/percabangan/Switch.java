package percabangan;

public class Switch {
    public static void main(String[] args) {
       char nilai='D';
       switch (nilai){
           case 'A':
               System.out.println("Mhs   : \"Terima Kasih pak\"");
               System.out.println("Dosen : \"Selamat ya !!\"");
               break;
           case 'B':
               System.out.println("Mhs   : \"kenapa ulun kada dapat A, pak ?\"");
               System.out.println("Dosen : \"Menurut nyawa ja nah\"");
               break;
           case 'C':
               System.out.println("Mhs   : \"ulun turun aja pa padahal, tugas gas tarus\"");
               System.out.println("Dosen : \"ujian am ?\"");
               System.out.println("Mhs   : \"hihihi\"");
               break;
           default:
               System.out.println("Mhs   : \"ulun turun aja pa padahal, tugas gas tarus\"");
               System.out.println("Dosen : \"iyalah nang ?\"");
               System.out.println("Dosen : \"memeriksa berkas\"");
               System.out.println("Dosen : \"dusta wara nyawa ni nang ai\"");
               System.out.println("Mhs   : \"hehe kaboorrrr\"");

               break;
       }
    }
}
