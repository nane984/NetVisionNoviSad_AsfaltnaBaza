/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbOld;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Branko
 */
@Entity
@Table(name = "vozilo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vozilo.findAll", query = "SELECT v FROM Vozilo v")
    , @NamedQuery(name = "Vozilo.findById", query = "SELECT v FROM Vozilo v WHERE v.id = :id")
    , @NamedQuery(name = "Vozilo.findByTablica", query = "SELECT v FROM Vozilo v WHERE v.tablica = :tablica")
    , @NamedQuery(name = "Vozilo.findByGaraznibroj", query = "SELECT v FROM Vozilo v WHERE v.garaznibroj = :garaznibroj")
    , @NamedQuery(name = "Vozilo.findByAkivan", query = "SELECT v FROM Vozilo v WHERE v.akivan = :akivan")
    , @NamedQuery(name = "Vozilo.findByIdvozac", query = "SELECT v FROM Vozilo v WHERE v.idvozac = :idvozac")})
public class Vozilo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "tablica")
    private String tablica;
    @Column(name = "garaznibroj")
    private String garaznibroj;
    @Basic(optional = false)
    @Column(name = "akivan")
    private boolean akivan;
    @Basic(optional = false)
    @Column(name = "idvozac")
    private long idvozac;

    public Vozilo() {
    }

    public Vozilo(Long id) {
        this.id = id;
    }

    public Vozilo(Long id, String tablica, boolean akivan, long idvozac) {
        this.id = id;
        this.tablica = tablica;
        this.akivan = akivan;
        this.idvozac = idvozac;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTablica() {
        return tablica;
    }

    public void setTablica(String tablica) {
        this.tablica = tablica;
    }

    public String getGaraznibroj() {
        return garaznibroj;
    }

    public void setGaraznibroj(String garaznibroj) {
        this.garaznibroj = garaznibroj;
    }

    public boolean getAkivan() {
        return akivan;
    }

    public void setAkivan(boolean akivan) {
        this.akivan = akivan;
    }

    public long getIdvozac() {
        return idvozac;
    }

    public void setIdvozac(long idvozac) {
        this.idvozac = idvozac;
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
        if (!(object instanceof Vozilo)) {
            return false;
        }
        Vozilo other = (Vozilo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dbOld.Vozilo[ id=" + id + " ]";
    }
    
}
