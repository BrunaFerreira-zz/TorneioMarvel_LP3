
package edu.br.torneio.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Bruna
 */
@Entity
public class MarvelMatch implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id_match;
    
    //Muitos usuários para uma partida
    @ManyToOne
    //chave estrangeira que será utilizada
    @JoinColumn(name ="id_user")
    private MarvelUser user;
    
    //Data e hora da partida
    @Temporal(TemporalType.TIMESTAMP)
    private Date date_time;
    
    private long id_marvel_hero;
    private long id_marvel_enemy;
    private boolean status;

    public long getId_match() {
        return id_match;
    }

    public void setId_match(long id_match) {
        this.id_match = id_match;
    }

    public MarvelUser getUser() {
        return user;
    }

    public void setUser(MarvelUser user) {
        this.user = user;
    }

    public Date getDate_time() {
        return date_time;
    }

    public void setDate_time(Date date_time) {
        this.date_time = date_time;
    }

    public long getId_marvel_hero() {
        return id_marvel_hero;
    }

    public void setId_marvel_hero(long id_marvel_hero) {
        this.id_marvel_hero = id_marvel_hero;
    }

    public long getId_marvel_enemy() {
        return id_marvel_enemy;
    }

    public void setId_marvel_enemy(long id_marvel_enemy) {
        this.id_marvel_enemy = id_marvel_enemy;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MarvelMatch{" + "id_match=" + id_match + ", user=" + user + ", date_time=" + date_time + ", id_marvel_hero=" + id_marvel_hero + ", id_marvel_enemy=" + id_marvel_enemy + ", status=" + status + '}';
    }
}
