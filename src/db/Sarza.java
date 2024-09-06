/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Branko
 */
@Entity
@Table(name = "sarza")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sarza.findAll", query = "SELECT s FROM Sarza s")
    , @NamedQuery(name = "Sarza.findById", query = "SELECT s FROM Sarza s WHERE s.id = :id")
    , @NamedQuery(name = "Sarza.findByAgregatzadato032", query = "SELECT s FROM Sarza s WHERE s.agregatzadato032 = :agregatzadato032")
    , @NamedQuery(name = "Sarza.findByAgregatizdato032", query = "SELECT s FROM Sarza s WHERE s.agregatizdato032 = :agregatizdato032")
    , @NamedQuery(name = "Sarza.findByAgregatzadato04", query = "SELECT s FROM Sarza s WHERE s.agregatzadato04 = :agregatzadato04")
    , @NamedQuery(name = "Sarza.findByAgregaizdato04", query = "SELECT s FROM Sarza s WHERE s.agregaizdato04 = :agregaizdato04")
    , @NamedQuery(name = "Sarza.findByAgregatzadato48", query = "SELECT s FROM Sarza s WHERE s.agregatzadato48 = :agregatzadato48")
    , @NamedQuery(name = "Sarza.findByAgregatizdato48", query = "SELECT s FROM Sarza s WHERE s.agregatizdato48 = :agregatizdato48")
    , @NamedQuery(name = "Sarza.findByAgregatzadato811", query = "SELECT s FROM Sarza s WHERE s.agregatzadato811 = :agregatzadato811")
    , @NamedQuery(name = "Sarza.findByAgregatizdato811", query = "SELECT s FROM Sarza s WHERE s.agregatizdato811 = :agregatizdato811")
    , @NamedQuery(name = "Sarza.findByAgregatzadato1116", query = "SELECT s FROM Sarza s WHERE s.agregatzadato1116 = :agregatzadato1116")
    , @NamedQuery(name = "Sarza.findByAgregatizdato1116", query = "SELECT s FROM Sarza s WHERE s.agregatizdato1116 = :agregatizdato1116")
    , @NamedQuery(name = "Sarza.findByAgregatzadato1622", query = "SELECT s FROM Sarza s WHERE s.agregatzadato1622 = :agregatzadato1622")
    , @NamedQuery(name = "Sarza.findByAgregatizdato1622", query = "SELECT s FROM Sarza s WHERE s.agregatizdato1622 = :agregatizdato1622")
    , @NamedQuery(name = "Sarza.findByAgregatzadato1632", query = "SELECT s FROM Sarza s WHERE s.agregatzadato1632 = :agregatzadato1632")
    , @NamedQuery(name = "Sarza.findByAgregatizdato1632", query = "SELECT s FROM Sarza s WHERE s.agregatizdato1632 = :agregatizdato1632")
    , @NamedQuery(name = "Sarza.findByFilerkupovnizadato", query = "SELECT s FROM Sarza s WHERE s.filerkupovnizadato = :filerkupovnizadato")
    , @NamedQuery(name = "Sarza.findByFilerkupovniizdato", query = "SELECT s FROM Sarza s WHERE s.filerkupovniizdato = :filerkupovniizdato")
    , @NamedQuery(name = "Sarza.findByFilersopstvenizadato", query = "SELECT s FROM Sarza s WHERE s.filersopstvenizadato = :filersopstvenizadato")
    , @NamedQuery(name = "Sarza.findByFilersopstveniizdato", query = "SELECT s FROM Sarza s WHERE s.filersopstveniizdato = :filersopstveniizdato")
    , @NamedQuery(name = "Sarza.findByDate", query = "SELECT s FROM Sarza s WHERE s.date = :date")
    , @NamedQuery(name = "Sarza.findByBitumenzadato", query = "SELECT s FROM Sarza s WHERE s.bitumenzadato = :bitumenzadato")
    , @NamedQuery(name = "Sarza.findByBitumenizdato", query = "SELECT s FROM Sarza s WHERE s.bitumenizdato = :bitumenizdato")
    , @NamedQuery(name = "Sarza.findByRasfaltzadato", query = "SELECT s FROM Sarza s WHERE s.rasfaltzadato = :rasfaltzadato")
    , @NamedQuery(name = "Sarza.findByRasfaltizdato", query = "SELECT s FROM Sarza s WHERE s.rasfaltizdato = :rasfaltizdato")})
public class Sarza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "agregatzadato0_32")
    private int agregatzadato032;
    @Basic(optional = false)
    @Column(name = "agregatizdato0_32")
    private int agregatizdato032;
    @Basic(optional = false)
    @Column(name = "agregatzadato0_4")
    private int agregatzadato04;
    @Basic(optional = false)
    @Column(name = "agregaizdato0_4")
    private int agregaizdato04;
    @Basic(optional = false)
    @Column(name = "agregatzadato4_8")
    private int agregatzadato48;
    @Basic(optional = false)
    @Column(name = "agregatizdato4_8")
    private int agregatizdato48;
    @Basic(optional = false)
    @Column(name = "agregatzadato8_11")
    private int agregatzadato811;
    @Basic(optional = false)
    @Column(name = "agregatizdato8_11")
    private int agregatizdato811;
    @Basic(optional = false)
    @Column(name = "agregatzadato11_16")
    private int agregatzadato1116;
    @Basic(optional = false)
    @Column(name = "agregatizdato11_16")
    private int agregatizdato1116;
    @Basic(optional = false)
    @Column(name = "agregatzadato16_22")
    private int agregatzadato1622;
    @Basic(optional = false)
    @Column(name = "agregatizdato16_22")
    private int agregatizdato1622;
    @Basic(optional = false)
    @Column(name = "agregatzadato16_32")
    private int agregatzadato1632;
    @Basic(optional = false)
    @Column(name = "agregatizdato16_32")
    private int agregatizdato1632;
    @Basic(optional = false)
    @Column(name = "filerkupovnizadato")
    private int filerkupovnizadato;
    @Basic(optional = false)
    @Column(name = "filerkupovniizdato")
    private int filerkupovniizdato;
    @Basic(optional = false)
    @Column(name = "filersopstvenizadato")
    private int filersopstvenizadato;
    @Basic(optional = false)
    @Column(name = "filersopstveniizdato")
    private int filersopstveniizdato;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @Column(name = "bitumenzadato")
    private int bitumenzadato;
    @Basic(optional = false)
    @Column(name = "bitumenizdato")
    private int bitumenizdato;
    @Basic(optional = false)
    @Column(name = "rasfaltzadato")
    private int rasfaltzadato;
    @Basic(optional = false)
    @Column(name = "rasfaltizdato")
    private int rasfaltizdato;
    @JoinColumn(name = "otprema", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Otprema otprema;

    public Sarza() {
    }

    public Sarza(Long id) {
        this.id = id;
    }

    public Sarza(Long id, int agregatzadato032, int agregatizdato032, int agregatzadato04, int agregaizdato04, int agregatzadato48, int agregatizdato48, int agregatzadato811, int agregatizdato811, int agregatzadato1116, int agregatizdato1116, int agregatzadato1622, int agregatizdato1622, int agregatzadato1632, int agregatizdato1632, int filerkupovnizadato, int filerkupovniizdato, int filersopstvenizadato, int filersopstveniizdato, Date date, int bitumenzadato, int bitumenizdato, int rasfaltzadato, int rasfaltizdato) {
        this.id = id;
        this.agregatzadato032 = agregatzadato032;
        this.agregatizdato032 = agregatizdato032;
        this.agregatzadato04 = agregatzadato04;
        this.agregaizdato04 = agregaizdato04;
        this.agregatzadato48 = agregatzadato48;
        this.agregatizdato48 = agregatizdato48;
        this.agregatzadato811 = agregatzadato811;
        this.agregatizdato811 = agregatizdato811;
        this.agregatzadato1116 = agregatzadato1116;
        this.agregatizdato1116 = agregatizdato1116;
        this.agregatzadato1622 = agregatzadato1622;
        this.agregatizdato1622 = agregatizdato1622;
        this.agregatzadato1632 = agregatzadato1632;
        this.agregatizdato1632 = agregatizdato1632;
        this.filerkupovnizadato = filerkupovnizadato;
        this.filerkupovniizdato = filerkupovniizdato;
        this.filersopstvenizadato = filersopstvenizadato;
        this.filersopstveniizdato = filersopstveniizdato;
        this.date = date;
        this.bitumenzadato = bitumenzadato;
        this.bitumenizdato = bitumenizdato;
        this.rasfaltzadato = rasfaltzadato;
        this.rasfaltizdato = rasfaltizdato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAgregatzadato032() {
        return agregatzadato032;
    }

    public void setAgregatzadato032(int agregatzadato032) {
        this.agregatzadato032 = agregatzadato032;
    }

    public int getAgregatizdato032() {
        return agregatizdato032;
    }

    public void setAgregatizdato032(int agregatizdato032) {
        this.agregatizdato032 = agregatizdato032;
    }

    public int getAgregatzadato04() {
        return agregatzadato04;
    }

    public void setAgregatzadato04(int agregatzadato04) {
        this.agregatzadato04 = agregatzadato04;
    }

    public int getAgregaizdato04() {
        return agregaizdato04;
    }

    public void setAgregaizdato04(int agregaizdato04) {
        this.agregaizdato04 = agregaizdato04;
    }

    public int getAgregatzadato48() {
        return agregatzadato48;
    }

    public void setAgregatzadato48(int agregatzadato48) {
        this.agregatzadato48 = agregatzadato48;
    }

    public int getAgregatizdato48() {
        return agregatizdato48;
    }

    public void setAgregatizdato48(int agregatizdato48) {
        this.agregatizdato48 = agregatizdato48;
    }

    public int getAgregatzadato811() {
        return agregatzadato811;
    }

    public void setAgregatzadato811(int agregatzadato811) {
        this.agregatzadato811 = agregatzadato811;
    }

    public int getAgregatizdato811() {
        return agregatizdato811;
    }

    public void setAgregatizdato811(int agregatizdato811) {
        this.agregatizdato811 = agregatizdato811;
    }

    public int getAgregatzadato1116() {
        return agregatzadato1116;
    }

    public void setAgregatzadato1116(int agregatzadato1116) {
        this.agregatzadato1116 = agregatzadato1116;
    }

    public int getAgregatizdato1116() {
        return agregatizdato1116;
    }

    public void setAgregatizdato1116(int agregatizdato1116) {
        this.agregatizdato1116 = agregatizdato1116;
    }

    public int getAgregatzadato1622() {
        return agregatzadato1622;
    }

    public void setAgregatzadato1622(int agregatzadato1622) {
        this.agregatzadato1622 = agregatzadato1622;
    }

    public int getAgregatizdato1622() {
        return agregatizdato1622;
    }

    public void setAgregatizdato1622(int agregatizdato1622) {
        this.agregatizdato1622 = agregatizdato1622;
    }

    public int getAgregatzadato1632() {
        return agregatzadato1632;
    }

    public void setAgregatzadato1632(int agregatzadato1632) {
        this.agregatzadato1632 = agregatzadato1632;
    }

    public int getAgregatizdato1632() {
        return agregatizdato1632;
    }

    public void setAgregatizdato1632(int agregatizdato1632) {
        this.agregatizdato1632 = agregatizdato1632;
    }

    public int getFilerkupovnizadato() {
        return filerkupovnizadato;
    }

    public void setFilerkupovnizadato(int filerkupovnizadato) {
        this.filerkupovnizadato = filerkupovnizadato;
    }

    public int getFilerkupovniizdato() {
        return filerkupovniizdato;
    }

    public void setFilerkupovniizdato(int filerkupovniizdato) {
        this.filerkupovniizdato = filerkupovniizdato;
    }

    public int getFilersopstvenizadato() {
        return filersopstvenizadato;
    }

    public void setFilersopstvenizadato(int filersopstvenizadato) {
        this.filersopstvenizadato = filersopstvenizadato;
    }

    public int getFilersopstveniizdato() {
        return filersopstveniizdato;
    }

    public void setFilersopstveniizdato(int filersopstveniizdato) {
        this.filersopstveniizdato = filersopstveniizdato;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getBitumenzadato() {
        return bitumenzadato;
    }

    public void setBitumenzadato(int bitumenzadato) {
        this.bitumenzadato = bitumenzadato;
    }

    public int getBitumenizdato() {
        return bitumenizdato;
    }

    public void setBitumenizdato(int bitumenizdato) {
        this.bitumenizdato = bitumenizdato;
    }

    public int getRasfaltzadato() {
        return rasfaltzadato;
    }

    public void setRasfaltzadato(int rasfaltzadato) {
        this.rasfaltzadato = rasfaltzadato;
    }

    public int getRasfaltizdato() {
        return rasfaltizdato;
    }

    public void setRasfaltizdato(int rasfaltizdato) {
        this.rasfaltizdato = rasfaltizdato;
    }

    public Otprema getOtprema() {
        return otprema;
    }

    public void setOtprema(Otprema otprema) {
        this.otprema = otprema;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sarza)) {
            return false;
        }
        Sarza other = (Sarza) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.Sarza[ id=" + id + " ]";
    }
    
}
