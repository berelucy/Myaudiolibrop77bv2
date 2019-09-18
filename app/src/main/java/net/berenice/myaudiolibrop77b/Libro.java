package net.berenice.myaudiolibrop77b;

import java.util.Vector;

public class Libro {

    public String titulo;
    public String autor;
    public int recursoImagen;
    public String urlAudio;
    public String genero; //genero literario
    public Boolean novedad; //es una novedad
    public Boolean leido; //leido por el usuario
    public final static String G_TODOS = "Todos los géneros";
    public final static String G_EPICO = "Poema épico";
    public final static String G_S_XIX = "Literatura siglo XIX";
    public final static String G_SUSPENSE = "Suspense";
    public final static String[] G_ARRAY = new String[]{G_TODOS, G_EPICO, G_S_XIX, G_SUSPENSE};

    public Libro(String titulo, String autor, int recursoImagen, String urlAudio, String genero, Boolean novedad, Boolean leido) {
        this.titulo = titulo;
        this.autor = autor;
        this.recursoImagen = recursoImagen;
        this.urlAudio = urlAudio;
        this.genero = genero;
        this.novedad = novedad;
        this.leido = leido;
    }

    public static Vector<Libro> ejemploLibros() {
        final String SERVIDOR = "http://www.dcomg.upv.es/~jtomas/android/audiolibrps/";
        Vector<Libro> libros = new Vector<Libro>();
        libros.add(new Libro("Kappa", "Akutagawa", R.drawable.kappa, SERVIDOR + "Kappa.mp3",
                Libro.G_S_XIX, false, false));
        libros.add(new Libro("Avecilla", "alas Clarin, Leopoldo", R.drawable.avecilla, SERVIDOR + "avecilla.mp3",
                Libro.G_S_XIX, true, false));
        libros.add(new Libro("Divina Comedia", "Dante", R.drawable.divina_comedia, SERVIDOR + "divina_comedia.mp3",
                Libro.G_EPICO, true, false));
        libros.add(new Libro("Viejo Pancho, El", "Alomso y Trelles, José", R.drawable.viejo_pancho, SERVIDOR + "viejo:pancho.mp3",
                Libro.G_S_XIX, true, true));
        libros.add(new Libro("Cancion de Rolando", "Anónimo", R.drawable.cancion_rolando, SERVIDOR + "cancion_rolando.mp3",
                Libro.G_EPICO, false, true));
        libros.add(new Libro("Matrimonio de sabuesos", "Agata  Christie", R.drawable.matrim_sabuesos, SERVIDOR + "matrimonio_sabuesos.mp3",
                Libro.G_SUSPENSE, false, true));
        libros.add(new Libro("La iliada", "Homero", R.drawable.la_iliada, SERVIDOR + "la_ilidia.mp3",
                Libro.G_EPICO, true, false));
        return libros;
    }
}
