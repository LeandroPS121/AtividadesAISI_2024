public abstract class Felino implements Animal{
    private String nome;
    private int idade;
    private String cor;

    // Construtor
    public Felino(String nome, int idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    // Get Set
    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            this.idade = 0;
        }else{
            this.idade = idade;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    // Metodos
    @Override
    public void comer(){
        System.out.println("O felino está comendo");
    }

    @Override
    public void dormir(){
        System.out.println("Dormindo");
    }

    public abstract void fazerSom();

    public abstract void brincar();

    public void correr(){
        System.out.println("O felino está correndo");
    }

}
