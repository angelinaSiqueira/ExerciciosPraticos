public class Pessoa {
    private int anoNascimento;
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.equals("")){
            this.nome = nome;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >=0 ) {
            this.peso = peso;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
