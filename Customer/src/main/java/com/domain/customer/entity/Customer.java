package com.domain.customer.entity;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String lastname;

    private Integer age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "identification_type", referencedColumnName = "id")
    private IdentificationType identification_type;

    private String identification;

    public Integer getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname(){
        return lastname;
    }

    public Integer getAge(){
        return age;
    }

    public String getIdentification(){
        return identification;
    }

    public IdentificationType getIdentification_type(){
        return identification_type;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setIdentification_type(IdentificationType identification_type) {
        this.identification_type = identification_type;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }
}
