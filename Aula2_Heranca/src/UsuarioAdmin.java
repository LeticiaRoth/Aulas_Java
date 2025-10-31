public class UsuarioAdmin extends Usuario{
    public UsuarioAdmin (String nome, String senha, String email){
        super(nome, senha, email);
    }

    //Sobrecarga de metodo
    //Sobrecarga é sempre quando temos uma relacão  de herança
    @Override
    void concederAcessos(){
        super.concederAcessos();
        System.out.printf("Usuario %s esta com acessos administrativos\n", this.nome);
    }

    void autenticador(){
        System.out.printf("Usuario %s esta autenticado\n", this.nome);
    }

    //Sobreescrito por metodo
    //Quando tenho na mesma classe metodos com assinaturas difernetes

    //Assinatura: quantidade e o tipo dos parametros de um metodo
    void autenticador(String sobrenome){
        System.out.printf("Usuario %s %s esta autenticado\n", this.nome+sobrenome);
    }

}
