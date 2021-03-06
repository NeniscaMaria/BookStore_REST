package model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Client extends model.BaseEntity<Long> {
    @Column(nullable=false)
    private String serialNumber;
    @Column(nullable=false)
    private String name;

    public Client() {
    }

    public Client(String serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        model.Client student = (model.Client) o;
        return name.equals(student.name) && serialNumber.equals(student.serialNumber);
    }

    @Override
    public int hashCode() {
        int result = serialNumber.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
