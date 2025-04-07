public class Main {
    public static void main(String[] args) {
        // Instanciar os objetos
        Pessoa maria = new Pessoa(1990);
        maria.setNome("Maria");
        maria.setPeso(60.5);
        maria.setAltura(1.75);

        Pessoa jose = new Pessoa(1985);
        jose.setNome("José");
        jose.setPeso(80.0);
        jose.setAltura(1.85);

        // verificar o estado dos atributos por meio dos metodos acessores
        System.out.println(maria.getNome());
        System.out.println(maria.getPeso());
        System.out.println(maria.getAltura());

        System.out.println(jose.getNome());
        System.out.println(jose.getPeso());
        System.out.println(jose.getAltura());

    }
}
