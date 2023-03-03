public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        int a, b;
        a = 12 ;
        b = 12;

        String resultado = a == b ? "true" : "false";

        System.out.println(resultado);

        int n1 = 4;
        int n2 = 8;

        boolean resulta = n1 == n2;
        System.out.println("n1 é igual a n2? " + resulta);

        resulta = n1 != n2;
        System.out.println("n1 é dirente de n2 ? " + resulta);

        String nome = "Jonathan";
        String apelido = new String("Baji");

        //Comparando conteúdo
        System.out.println(nome.equals(apelido));


    }
}
