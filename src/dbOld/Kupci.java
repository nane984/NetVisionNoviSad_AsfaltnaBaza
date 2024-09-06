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
@Table(name = "kupci")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kupci.findAll", query = "SELECT k FROM Kupci k")
    , @NamedQuery(name = "Kupci.findBySifrapartnera", query = "SELECT k FROM Kupci k WHERE k.sifrapartnera = :sifrapartnera")
    , @NamedQuery(name = "Kupci.findBySkraceninazivpartnera", query = "SELECT k FROM Kupci k WHERE k.skraceninazivpartnera = :skraceninazivpartnera")
    , @NamedQuery(name = "Kupci.findByMaticnibrojsudskogregistra", query = "SELECT k FROM Kupci k WHERE k.maticnibrojsudskogregistra = :maticnibrojsudskogregistra")
    , @NamedQuery(name = "Kupci.findByPoreskiidentifikacionibroj", query = "SELECT k FROM Kupci k WHERE k.poreskiidentifikacionibroj = :poreskiidentifikacionibroj")
    , @NamedQuery(name = "Kupci.findByMesto", query = "SELECT k FROM Kupci k WHERE k.mesto = :mesto")
    , @NamedQuery(name = "Kupci.findByNazivmesta", query = "SELECT k FROM Kupci k WHERE k.nazivmesta = :nazivmesta")
    , @NamedQuery(name = "Kupci.findByUlicaibroj", query = "SELECT k FROM Kupci k WHERE k.ulicaibroj = :ulicaibroj")
    , @NamedQuery(name = "Kupci.findByNazivdrzave", query = "SELECT k FROM Kupci k WHERE k.nazivdrzave = :nazivdrzave")
    , @NamedQuery(name = "Kupci.findByAktivan", query = "SELECT k FROM Kupci k WHERE k.aktivan = :aktivan")})
public class Kupci implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sifrapartnera")
    private String sifrapartnera;
    @Column(name = "skraceninazivpartnera")
    private String skraceninazivpartnera;
    @Column(name = "maticnibrojsudskogregistra")
    private String maticnibrojsudskogregistra;
    @Column(name = "poreskiidentifikacionibroj")
    private String poreskiidentifikacionibroj;
    @Column(name = "mesto")
    private String mesto;
    @Column(name = "nazivmesta")
    private String nazivmesta;
    @Column(name = "ulicaibroj")
    private String ulicaibroj;
    @Column(name = "nazivdrzave")
    private String nazivdrzave;
    @Basic(optional = false)
    @Column(name = "aktivan")
    private boolean aktivan;

    public Kupci() {
    }

    public Kupci(String sifrapartnera) {
        this.sifrapartnera = sifrapartnera;
    }

    public Kupci(String sifrapartnera, boolean aktivan) {
        this.sifrapartnera = sifrapartnera;
        this.aktivan = aktivan;
    }

    public String getSifrapartnera() {
        return sifrapartnera;
    }

    public void setSifrapartnera(String sifrapartnera) {
        this.sifrapartnera = sifrapartnera;
    }

    public String getSkraceninazivpartnera() {
        return skraceninazivpartnera;
    }

    public void setSkraceninazivpartnera(String skraceninazivpartnera) {
        this.skraceninazivpartnera = skraceninazivpartnera;
    }

    public String getMaticnibrojsudskogregistra() {
        return maticnibrojsudskogregistra;
    }

    public void setMaticnibrojsudskogregistra(String maticnibrojsudskogregistra) {
        this.maticnibrojsudskogregistra = maticnibrojsudskogregistra;
    }

    public String getPoreskiidentifikacionibroj() {
        return poreskiidentifikacionibroj;
    }

    public void setPoreskiidentifikacionibroj(String poreskiidentifikacionibroj) {
        this.poreskiidentifikacionibroj = poreskiidentifikacionibroj;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getNazivmesta() {
        return nazivmesta;
    }

    public void setNazivmesta(String nazivmesta) {
        this.nazivmesta = nazivmesta;
    }

    public String getUlicaibroj() {
        return ulicaibroj;
    }

    public void setUlicaibroj(String ulicaibroj) {
        this.ulicaibroj = ulicaibroj;
    }

    public String getNazivdrzave() {
        return nazivdrzave;
    }

    public void setNazivdrzave(String nazivdrzave) {
        this.nazivdrzave = nazivdrzave;
    }

    public boolean getAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sifrapartnera != null ? sifrapartnera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kupci)) {
            return false;
        }
        Kupci other = (Kupci) object;
        if ((this.sifrapartnera == null && other.sifrapartnera != null) || (this.sifrapartnera != null && !this.sifrapartnera.equals(other.sifrapartnera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dbOld.Kupci[ sifrapartnera=" + sifrapartnera + " ]";
    }
    
}
