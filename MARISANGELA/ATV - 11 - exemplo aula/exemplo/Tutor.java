import java.util.List;

public class Tutor {
    private String nome;
    private List<Gato> gatos;
    
    public Tutor(String nome, Gato gato){
        this.nome = nome;
        this.gatos.add(gato);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void chamarGato(){
        for(Gato gato : this.gatos){
            System.out.printf("%s",gato.getNome());
        }
    }
}