public class Usuario {
    String nome;
    String senha;
    String email;

    //Construtor da classe - ALT+INSERT
    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    void autenticador(){
        System.out.printf("Usuario %s esta autenticado\n", this.nome);
    }

    void concederAcessos(){
        System.out.printf("Usuario %s esta com os acessos regulares\n", this.nome);
    }



}
