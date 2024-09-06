/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Branko
 */
@Entity
@Table(name = "otprema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Otprema.findAll", query = "SELECT o FROM Otprema o")
    , @NamedQuery(name = "Otprema.findById", query = "SELECT o FROM Otprema o WHERE o.id = :id")
    , @NamedQuery(name = "Otprema.findByDatum", query = "SELECT o FROM Otprema o WHERE o.datum = :datum")
    , @NamedQuery(name = "Otprema.findByZadatokg", query = "SELECT o FROM Otprema o WHERE o.zadatokg = :zadatokg")
    , @NamedQuery(name = "Otprema.findByIzdatokg", query = "SELECT o FROM Otprema o WHERE o.izdatokg = :izdatokg")
    , @NamedQuery(name = "Otprema.findByVozac", query = "SELECT o FROM Otprema o WHERE o.vozac = :vozac")
    , @NamedQuery(name = "Otprema.findByVozilo", query = "SELECT o FROM Otprema o WHERE o.vozilo = :vozilo")
    , @NamedQuery(name = "Otprema.findByReceptura", query = "SELECT o FROM Otprema o WHERE o.receptura = :receptura")
    , @NamedQuery(name = "Otprema.findByPovrat", query = "SELECT o FROM Otprema o WHERE o.povrat = :povrat")
    , @NamedQuery(name = "Otprema.findByGradiliste", query = "SELECT o FROM Otprema o WHERE o.gradiliste = :gradiliste")
    , @NamedQuery(name = "Otprema.findByKupac", query = "SELECT o FROM Otprema o WHERE o.kupac = :kupac")})
public class Otprema implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "otprema")
    private Collection<Sarza> sarzaCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "datum")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datum;
    @Basic(optional = false)
    @Column(name = "zadatokg")
    private int zadatokg;
    @Basic(optional = false)
    @Column(name = "izdatokg")
    private int izdatokg;
    @Column(name = "vozac")
    private String vozac;
    @Column(name = "vozilo")
    private String vozilo;
    @Column(name = "receptura")
    private String receptura;
    @Column(name = "povrat")
    private Integer povrat;
    @Column(name = "gradiliste")
    private String gradiliste;
    @Column(name = "kupac")
    private String kupac;

    public Otprema() {
    }

    public Otprema(Long id) {
        this.id = id;
    }

    public Otprema(Long id, Date datum, int zadatokg, int izdatokg) {
        this.id = id;
        this.datum = datum;
        this.zadatokg = zadatokg;
        this.izdatokg = izdatokg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public int getZadatokg() {
        return zadatokg;
    }

    public void setZadatokg(int zadatokg) {
        this.zadatokg = zadatokg;
    }

    public int getIzdatokg() {
        return izdatokg;
    }

    public void setIzdatokg(int izdatokg) {
        this.izdatokg = izdatokg;
    }

    public String getVozac() {
        return vozac;
    }

    public void setVozac(String vozac) {
        this.vozac = vozac;
    }

    public String getVozilo() {
        return vozilo;
    }

    public void setVozilo(String vozilo) {
        this.vozilo = vozilo;
    }

    public String getReceptura() {
        return receptura;
    }

    public void setReceptura(String receptura) {
        this.receptura = receptura;
    }

    public Integer getPovrat() {
        return povrat;
    }

    public void setPovrat(Integer povrat) {
        this.povrat = povrat;
    }

    public String getGradiliste() {
        return gradiliste;
    }

    public void setGradiliste(String gradiliste) {
        this.gradiliste = gradiliste;
    }

    public String getKupac() {
        return kupac;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
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
        if (!(object instanceof Otprema)) {
            return false;
        }
        Otprema other = (Otprema) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.Otprema[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<Sarza> getSarzaCollection() {
        return sarzaCollection;
    }

    public void setSarzaCollection(Collection<Sarza> sarzaCollection) {
        this.sarzaCollection = sarzaCollection;
    }
    
}
