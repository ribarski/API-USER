package builder.test;

import builder.dominio.Pessoa;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
//        new Pessoa("Eduardo","Scalco", "eduardo", "eduardo@email.com");

        Pessoa build = new Pessoa.PersonBuilder()
                .firstName("Eduardo")
                .lastName("Scalco")
                .email("eduardo@scalco.com")
                .username("eduardo")
                .build();
        System.out.println(build);
    }
}
