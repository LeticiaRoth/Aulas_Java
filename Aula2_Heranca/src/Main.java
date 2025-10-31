public class Main {
    public static void main(String[] args) {
        //Heranca, Sobrecarga e Sobrescrita
        //DEFINIÇÃO: O pai passar suas caracteristicas para classes filha, podendo ela ter algumas adicionais
        //QUANDO USAR: Para reutilização de codigo, preciso conseguir falar "É UM", o pediatra é um medico, medico (PAI) - pediatra (FILHO)

        // Espera os atributos
        //Colaborador afonso = new Colaborador("Afonso","Gerente",9999092);
        //System.out.println(afonso.nome);

        //Posso contruir o mensalista
        //Mensalista mensalista = new Mensalista(9999999, "Joao", "Tecninca", 999);
        //System.out.println(mensalista.nome);

        //Retorna o valor de double
        //System.out.println(mensalista.receberSalario());

        //Uma maneira de concatenar
        //System.out.println(mensalista.toString());

        //Agora como metodo ele recebe o toString
        //System.out.println(mensalista);

        //Horista gabriel = new Horista(988989, "Gabriel", "Operador de Manufatura", 240, 8.50);
        //System.out.printf("O salario de Gabriel é: R$%.2f", gabriel.receberSalario() );

        //Usuario usuario = new Usuario("Isabela", "12345678", "isabela@gmail.com");
        //usuario.autenticador();
        //usuario.concederAcessos();

        //UsuarioAdmin usuarioAdmin = new UsuarioAdmin("Letica", "28082008", "leticia@gmail.com");
        //usuarioAdmin.concederAcessos();
        //usuarioAdmin.autenticador();

        //Constante da prioridade alta
        Prioridade prioridade =  Prioridade.ALTA;

        switch (prioridade){
            case BAIXA -> System.out.printf("Chamado com prioridade baixa, resolver quando houver disponibilidade");
            case MEDIA -> System.out.printf("Chamado com prioridade média, resolver assim que possivel");
            case ALTA -> System.out.printf("Chamado com prioridade alta, resolver o quanto antes");
            case URGENTE -> System.out.printf("Chamado URGENTE, resolver agora!");
        }


    }
}