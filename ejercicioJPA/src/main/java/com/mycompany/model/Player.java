package com.mycompany.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "player", catalog = "testjpa", schema = "")
@NamedQueries({
    @NamedQuery(name = "Player.findAll", query = "SELECT p FROM Player p")})
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "identification", length = 255)
    private String identification;
    @Basic(optional = false)
    @Column(name = "age", nullable = false)
    private int age;
    @Basic(optional = false)
    @Column(name = "height", nullable = false)
    private double height;
    @Column(name = "name", length = 255)
    private String name;
    @Column(name = "gender", length = 255)
    private String gender;

    public Player() {
    }

    public Player(Integer id) {
        this.id = id;
    }

    public Player(String identification, int age, double height, String name, String gender) {
        this.identification = identification;
        this.age = age;
        this.height = height;
        this.name = name;
        this.gender = gender;
    }

    public Player(Integer id, String identification, int age, double height, String name, String gender) {
        this.id = id;
        this.identification = identification;
        this.age = age;
        this.height = height;
        this.name = name;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", cedula='" + identification + '\'' +
                ", edad=" + age +
                ", estatura=" + height +
                ", nombre='" + name + '\'' +
                ", sexo='" + gender + '\'' +
                '}';
    }
}
