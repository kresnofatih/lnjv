package com.strhandle;

public class Formatstr {
    public static void main(String[] args){
        String nama = "Fatih";
        int umur = 22;

        // output
        System.out.println("Nama saya "+nama+", umur saya "+umur);
        // printf format prnt string
        System.out.printf("Nama saya %s, umur saya %d \n", nama, umur);
        
        // conversion lib: f=floating point, d=integer, c=character, s=string, b=boolean
        // Struktur: $conv
        //strutur format = %[argumen_index$][flags][width][.precision]conevrsion

        // argumen index$
        System.out.printf("Halo %1$s nama kamu %1$s kan? umur %2$d kan?", nama, umur);
        // flags
        int g1 = 5;
        int g2 = 7;
        int g3 = g1 - g2;
        System.out.printf("%d - %d = %d", g1, g2, g3);
        String nama2 = "Fatih";
        float ipk = 3.813286f;
        System.out.printf("\nIPK %1$s berapa?, \n%1$s ipknya %2$+5.4f\n", nama2, ipk);
        String info = "nama: "+nama2+", ipk: "+ipk;
        System.out.println(info);
        String info_format = String.format("nama: %s, pk = %2$+5.2f", nama2, ipk);
        System.out.println(info_format);
    }
}
