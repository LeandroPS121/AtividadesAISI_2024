public class Gato extends Felino{
    private String raca;

    // Geriseri
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Construtor
    public Gato(String raca, String nome, int idade, String cor){
        super(nome,idade,cor);
        this.raca = raca;
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }

    @Override
    public void brincar() {
        System.out.println("Brincando...");
    }

    @Override
    public void comer(){
        System.out.println("Crunch crunch crunch...");
    }

    public void comer(String comida){
        System.out.printf("Comendo %s", comida);
    }

    public void comer(Gato amigo){
        System.out.printf("Comendo a comida do %s", amigo.getNome());
    }
}
