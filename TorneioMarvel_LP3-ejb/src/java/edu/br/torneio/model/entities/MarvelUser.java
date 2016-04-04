package edu.br.torneio.model.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Bruna
 */
@Entity
public class MarvelUser implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id_user;
    
    private String username;
    private String password;
    
    //Relacionamento um para um 
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn(name="id_user", referencedColumnName="id_usuario")
    private UserInfo userinfo;

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserInfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(UserInfo userinfo) {
        this.userinfo = userinfo;
    }

    @Override
    public String toString() {
        return "MarvelUser{" + "id_user=" + id_user + ", username=" + username + ", password=" + password + ", userinfo=" + userinfo + '}';
    }
}
