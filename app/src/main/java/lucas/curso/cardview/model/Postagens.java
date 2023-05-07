package lucas.curso.cardview.model;

public class Postagens {

    private String tituloPostagem;
    private String tempoPostagem;
    private String descricaoPostagem;
    private int imagemPostagem;

    public Postagens(){

    }

    public Postagens(String tituloPostagem, String tempoPostagem, String descricaoPostagem,
                     int imagemPostagem) {
        this.tituloPostagem = tituloPostagem;
        this.tempoPostagem = tempoPostagem;
        this.descricaoPostagem = descricaoPostagem;
        this.imagemPostagem = imagemPostagem;
    }

    public String getTituloPostagem() {
        return tituloPostagem;
    }

    public void setTituloPostagem(String tituloPostagem) {
        this.tituloPostagem = tituloPostagem;
    }

    public String getTempoPostagem() {
        return tempoPostagem;
    }

    public void setTempoPostagem(String tempoPostagem) {
        this.tempoPostagem = tempoPostagem;
    }

    public String getDescricaoPostagem() {
        return descricaoPostagem;
    }

    public void setDescricaoPostagem(String descricaoPostagem) {
        this.descricaoPostagem = descricaoPostagem;
    }

    public int getImagemPostagem() {
        return imagemPostagem;
    }

    public void setImagemPostagem(int imagemPostagem) {
        this.imagemPostagem = imagemPostagem;
    }
}
