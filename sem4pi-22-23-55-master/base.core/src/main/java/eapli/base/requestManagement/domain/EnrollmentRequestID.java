package eapli.base.requestManagement.domain;


import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EnrollmentRequestID implements ValueObject, Comparable<EnrollmentRequestID>  {

    private static final long serialVersionUID = 1L;
    @Column(name = "EnrollmentRequestID")
    private String number;

    public EnrollmentRequestID(final String EnrollmentRequestID) {
        if (StringPredicates.isNullOrEmpty(EnrollmentRequestID)) {
            throw new IllegalArgumentException(
                    "Mecanographic Number should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.number = EnrollmentRequestID;
    }

    protected EnrollmentRequestID() {
        // for ORM
    }

    public static EnrollmentRequestID valueOf(final String EnrollmentRequestID) {
        return new EnrollmentRequestID(EnrollmentRequestID);
    }

    @Override
    public String toString() {
        return number;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnrollmentRequestID)) {
            return false;
        }

        final EnrollmentRequestID that = (EnrollmentRequestID) o;
        return this.number.equals(that.number);
    }

    @Override
    public int hashCode() {
        return this.number.hashCode();
    }

    @Override
    public int compareTo(final EnrollmentRequestID arg0) {
        return number.compareTo(arg0.number);
    }
}



