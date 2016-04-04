package edu.br.torneio.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Bruna
 */
//Anotação inicando que a classe é uma entidade Persistente
@Entity
public class UserInfo implements Serializable{
    
    //Anotação identificando PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_userinfo;
    private String fullname;
    private String email;
    
    //Anotação para data 
    @Temporal(TemporalType.DATE)    
    private Date birthday;
    
    //Getters e Setters

    public long getId_userinfo() {
        return id_userinfo;
    }

    public void setId_userinfo(long id_userinfo) {
        this.id_userinfo = id_userinfo;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "UserInfo{" + "id_userinfo=" + id_userinfo + ", fullname=" + fullname + ", email=" + email + ", birthday=" + birthday + '}';
    }
}
