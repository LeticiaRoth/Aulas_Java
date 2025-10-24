public class Main {
    public static void main(String[] args) {
        //Heranca, Sobrecarga e Sobrescrita
        //DEFINIÇÃO: O pai passar suas caracteristicas para classes filha, podendo ela ter algumas adicionais
        //QUANDO USAR: Para reutilização de codigo, preciso conseguir falar "É UM", o pediatra é um medico, medico (PAI) - pediatra (FILHO)

        // Espera os atributos
        Colaborador afonso = new Colaborador("Afonso","Gerente",9999092);
        System.out.println(afonso.nome);

        //Posso contruir o mensalista
        Mensalista mensalista = new Mensalista(9999999, "Joao", "Tecninca", 999);
        System.out.println(mensalista.nome);

        //Retorna o valor de double
        System.out.println(mensalista.receberSalario());

        //Uma maneira de concatenar
        System.out.println(mensalista.toString());

        //Agora como metodo ele recebe o toString
        System.out.println(mensalista);


    }
}