package eapli.base.coursemanagement.domain;

import eapli.framework.domain.model.ValueObject;
import jdk.jfr.Enabled;
import lombok.Value;

import javax.persistence.Embeddable;

@Embeddable
public class Capacity {

    private Integer maxCapacity;

    private Integer ninCapacity;

    protected Capacity() {}

    /**
     *
     * @param minCapacity
     * @param maxCapacity
     */
    public Capacity (Integer minCapacity, Integer maxCapacity) {
        this.ninCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
        minCapacity();
        maxCapacity();
    }

    public Integer maxCapacity() {
        if (this.maxCapacity <= this.ninCapacity) {
            throw new IllegalArgumentException("Max capacity must be greater than min capacity");
        }
        return this.maxCapacity;
    }


    public Integer minCapacity() {
        if (this.ninCapacity <= 0) {
            throw new IllegalArgumentException("Min capacity must be greater than 0");
        }
        return this.ninCapacity;
    }
}
