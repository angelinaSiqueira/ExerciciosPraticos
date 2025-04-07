
public class Pessoa {
    private int anoNascimento;
    private String nome;
    private double peso;
    private double altura;
    private Pessoa conjuge;

    public Pessoa(int anoNascimento) {
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
        if(peso >= 0 ) {
            this.peso = peso;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void casar(Pessoa outraPessoa){
        /*
        com erro se nao passar as validacoes abaixo
        apenas setar o conjuge com o objeto recebido por parametro
        this.conjuge = outraPessoa;
         */
        if(!outraPessoa.ehCasado()) {
            this.conjuge = outraPessoa;
            outraPessoa.conjuge = this;
        }
    }

    public boolean ehCasado() {
        return this.conjuge != null;

    }

    public String getNomeConjuge()
    {
        return this.conjuge.getNome();

    }
}
