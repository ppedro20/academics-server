package pt.ipleiria.estg.dei.ei.dae.academics.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

import java.io.Serializable;

@Entity
@NamedQueries({@NamedQuery(name = "getAllStudents", query = "SELECT s FROM Student s ORDER BY s.name" // JPQL
)})
public class Student implements Serializable {
    // here go properties, default constructor, getters and setters...
    public String username;

    public String name;
    public String email;
    private String password;

    public Student(String username, String name, String email, String password) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Student() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
