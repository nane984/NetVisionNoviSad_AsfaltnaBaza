/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbOld;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "kupac")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kupac.findAll", query = "SELECT k FROM Kupac k")
    , @NamedQuery(name = "Kupac.findById", query = "SELECT k FROM Kupac k WHERE k.id = :id")
    , @NamedQuery(name = "Kupac.findByKupac", query = "SELECT k FROM Kupac k WHERE k.kupac = :kupac")
    , @NamedQuery(name = "Kupac.findByAktivan", query = "SELECT k FROM Kupac k WHERE k.aktivan = :aktivan")
    , @NamedQuery(name = "Kupac.findByMb", query = "SELECT k FROM Kupac k WHERE k.mb = :mb")
    , @NamedQuery(name = "Kupac.findByPib", query = "SELECT k FROM Kupac k WHERE k.pib = :pib")
    , @NamedQuery(name = "Kupac.findByAdresa", query = "SELECT k FROM Kupac k WHERE k.adresa = :adresa")})
public class Kupac implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "kupac")
    private String kupac;
    @Basic(optional = false)
    @Column(name = "aktivan")
    private boolean aktivan;
    @Column(name = "mb")
    private BigInteger mb;
    @Column(name = "pib")
    private BigInteger pib;
    @Column(name = "adresa")
    private String adresa;

    public Kupac() {
    }

    public Kupac(Long id) {
        this.id = id;
    }

    public Kupac(Long id, String kupac, boolean aktivan) {
        this.id = id;
        this.kupac = kupac;
        this.aktivan = aktivan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKupac() {
        return kupac;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
    }

    public boolean getAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }

    public BigInteger getMb() {
        return mb;
    }

    public void setMb(BigInteger mb) {
        this.mb = mb;
    }

    public BigInteger getPib() {
        return pib;
    }

    public void setPib(BigInteger pib) {
        this.pib = pib;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
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
        if (!(object instanceof Kupac)) {
            return false;
        }
        Kupac other = (Kupac) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dbOld.Kupac[ id=" + id + " ]";
    }
    
}
