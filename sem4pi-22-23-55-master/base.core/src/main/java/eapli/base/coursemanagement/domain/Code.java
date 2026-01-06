package eapli.base.coursemanagement.domain;


import eapli.framework.domain.model.ValueObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Code  implements ValueObject, Comparable<Code>{

    @Column(name = "code")
    private String code;

    protected Code(){}
    public Code(String code) {
        this.code = code;
    }

    @Override
    public int compareTo(Code o) {
        return code.compareTo(o.code);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Code code1 = (Code) o;
        return Objects.equals(code, code1.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
