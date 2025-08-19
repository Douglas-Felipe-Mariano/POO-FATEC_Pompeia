package app;

public class PrimeiraClasse{
    public static void main(String[] args){
        Aluno a1 = new Aluno();

        a1.nome = "Douglas";
        a1.idade = 21;

        Aluno a2 = a1;
        a2.nome = "Robso";

        System.out.println("[A1]");
        System.out.println("nome = "+ a1.nome);  
        System.out.println("nome = "+ a1.idade);

        System.out.println("----------------//---------------");

        System.out.println("[A2]");
        System.out.println("nome = "+ a2.nome);  
        System.out.println("nome = "+ a2.idade);

        System.out.println("[ CHAMADA DE METODO ]");
        System.out.println("A1 = "+ a1.getDados());
        System.out.println("A2 = "+ a2.getDados());

        Aluno a3 = new Aluno("Britny", 25);
        System.out.println("[ CHAMADA DE METODO ]");
        System.out.println("A3 = "+ a3.getDados());

        Cliente c1 = new Cliente();
        c1.setNome("Maiko");

        System.out.println("[ CHAMADA DE GET ]");
        System.out.println("nome = "+ c1.getNome());

    }
}