package objetos;

/**
 * Created by Gand on 01/02/17.
 */
public class Cancion {
    private String titulo;
    private Integer duracion;
    private String letra;
    private Integer idAlbum;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Integer getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Integer idAlbum) {
        this.idAlbum = idAlbum;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cancion cancion = (Cancion) o;

        if (titulo != null ? !titulo.equals(cancion.titulo) : cancion.titulo != null) return false;
        if (duracion != null ? !duracion.equals(cancion.duracion) : cancion.duracion != null) return false;
        if (letra != null ? !letra.equals(cancion.letra) : cancion.letra != null) return false;
        if (idAlbum != null ? !idAlbum.equals(cancion.idAlbum) : cancion.idAlbum != null) return false;

        return true;
    }

    public int hashCode() {
        int result = titulo != null ? titulo.hashCode() : 0;
        result = 31 * result + (duracion != null ? duracion.hashCode() : 0);
        result = 31 * result + (letra != null ? letra.hashCode() : 0);
        result = 31 * result + (idAlbum != null ? idAlbum.hashCode() : 0);
        return result;
    }
}
