import java.util.List;

public class Casa {
    private String endereco;
    private List<Gato> gatos;

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void adotargato(Gato gato){
        gatos.add(gato);
    }

    public void chamarMorador(){
        for(Gato gato : gatos){
            System.err.printf("%s",gato.getNome());
        }
    }
}