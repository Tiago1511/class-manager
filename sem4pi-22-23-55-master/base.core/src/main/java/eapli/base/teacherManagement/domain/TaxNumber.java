package eapli.base.teacherManagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class TaxNumber implements ValueObject, Comparable<TaxNumber>{
    @Column(name = "taxNumber")
    String number;

    public TaxNumber(String description){
        if (StringPredicates.isNullOrEmpty(description) || !isValid(description)){
            throw new IllegalArgumentException(
                    "tax number description should neither be null nor empty and must be valid");
        }
        this.number = description;
    }

    protected TaxNumber() {
    }

    public String taxNumber() {
        return this.number;
    }

    /**
     * Boolean isValid()
     *
     * Primeiro verificamos se a string de entrada nif é nula ou não tem exatamente 9 dígitos.
     * Se não for, devolvemos falso porque o NIF deve ter exatamente 9 dígitos.
     *
     * Em seguida, calculamos a soma dos produtos de cada dígito com um peso correspondente.
     * Os pesos são os valores {9, 8, 7, 6, 5, 4, 3, 2}, que servem para calcular a soma ponderada dos 8 primeiros dígitos do NIF.
     *
     * Em seguida, calculamos o dígito verificador como 11 menos o restante da soma dividido por 11.
     * Se o dígito verificador for maior ou igual a 10, ele será definido como 0.
     *
     * Por fim, comparamos o último dígito do NIF com o dígito verificador calculado. Se forem iguais, devolvemos true,
     * indicando que o NIF é válido. Caso contrário, retornamos falso.
    * */
    private static boolean isValid(String nif) {
        if (nif == null || nif.length() != 9) {
            return false;
        }

        int[] weights = {9, 8, 7, 6, 5, 4, 3, 2};
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            sum += (nif.charAt(i) - '0') * weights[i];
        }

        int checkDigit = 11 - (sum % 11);
        if (checkDigit >= 10) {
            checkDigit = 0;
        }

        return (nif.charAt(8) - '0') == checkDigit;
    }

    @Override
    public int compareTo(TaxNumber o) {
        return number.compareTo(o.number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxNumber taxNumber = (TaxNumber) o;
        return Objects.equals(number, taxNumber.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return number;
    }
}
