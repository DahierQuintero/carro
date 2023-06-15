package profundizacionJava.ejercicioPooInterface.reproductorMusica;

public class Main {
    public static void main(String[] args) {

        OttoMusic ottoMusic = new OttoMusic();
        PlayMusic playMusic = new PlayMusic();

        System.out.println("Nombre del reproductor: " + ottoMusic.getNombreReproductor());
        ottoMusic.reproducirMusica();
        ottoMusic.pausarMusica();
        ottoMusic.detenerReproduccion();
        System.out.println();

        System.out.println("Nombre del reproductor: " + playMusic.getNombreReproductor());
        playMusic.reproducirMusica();
        playMusic.pausarMusica();
        playMusic.detenerReproduccion();
    }
}
