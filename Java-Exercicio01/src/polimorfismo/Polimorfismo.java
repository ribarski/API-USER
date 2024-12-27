package polimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
        Financeiro f[] = new Financeiro[2];
        f[0] = new Financeiro (1);
        f[1] = new Financeiro (2);

        Vendedor v[] = new Vendedor[2];
        v[0] = new Vendedor("Eduardo", 25, 1111111111);
        v[1] = new Vendedor("Scalco", 22, 1111111111);

        Gerente g[] = new Gerente[1];
        g[0] = new Gerente("Edu", 30, 1111111111, 1221212121);

        PessoaJuridica pj = new PessoaJuridica("Eduardo", 10, 111111,111111);

        System.out.println(pj.getCnpj());

        System.out.println(f[0].toString());
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}
