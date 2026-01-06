package eapli.base.coursemanagement.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Edition {

    private String edition;

    protected Edition() {}

    public Edition(String edition) {
        if (!validCapacity(edition)) {
            throw new IllegalArgumentException("Invalid Edition");
        }
        this.edition = edition;
    }

    public boolean validCapacity(String str) {
        // Divide a string em partes usando o hífen ("-")
        String[] partes = str.split("-");

        // Verifica se a string possui exatamente 3 partes após a divisão
        if (partes.length != 3) {
            return false;
        }

        // Verifica se a primeira parte contém apenas letras
        if (!partes[0].matches("[a-zA-Z]+")) {
            return false;
        }

        // Verifica se a segunda parte contém apenas letras
        if (!partes[1].matches("[a-zA-Z]+")) {
            return false;
        }

        // Verifica se a terceira parte contém apenas letras e números
        if (!partes[2].matches("[a-zA-Z0-9]+")) {
            return false;
        }

        // Todas as verificações passaram, a string possui a estrutura correta
        return true;
    }

    public String edition() {
        return this.edition;
    }
}
