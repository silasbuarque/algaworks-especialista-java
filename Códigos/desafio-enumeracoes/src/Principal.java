public class Principal {

    public static void main(String[] args) {

        NotaFiscal nf = new NotaFiscal(123, "Macbook pro", 18_000);
        System.out.println(nf.getDescricaoCompleta());
//
//        nf.emitir();
//        System.out.println(nf.getDescricaoCompleta());

        nf.cancelar();
        System.out.println(nf.getDescricaoCompleta());

    }
}