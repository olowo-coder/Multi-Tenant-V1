package com.example.multitenant.molel;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student implements Serializable {

    private static final long serialVersionId = -546890282667894084L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String tenantId;


    public static long getSerialVersionId(){
        return serialVersionId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        return "Student{" +
            "Id=" + id +
            ", name='" + name + '\'' +
            ", tenantId='" + tenantId + '\'' +
            '}';
    }
}
