/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbOld;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "silosi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Silosi.findAll", query = "SELECT s FROM Silosi s")
    , @NamedQuery(name = "Silosi.findById", query = "SELECT s FROM Silosi s WHERE s.id = :id")
    , @NamedQuery(name = "Silosi.findByBrsilosa", query = "SELECT s FROM Silosi s WHERE s.brsilosa = :brsilosa")
    , @NamedQuery(name = "Silosi.findByStanje", query = "SELECT s FROM Silosi s WHERE s.stanje = :stanje")
    , @NamedQuery(name = "Silosi.findByUnos", query = "SELECT s FROM Silosi s WHERE s.unos = :unos")
    , @NamedQuery(name = "Silosi.findByDatum", query = "SELECT s FROM Silosi s WHERE s.datum = :datum")
    , @NamedQuery(name = "Silosi.findByOpissilosa", query = "SELECT s FROM Silosi s WHERE s.opissilosa = :opissilosa")
    , @NamedQuery(name = "Silosi.findByNulirano", query = "SELECT s FROM Silosi s WHERE s.nulirano = :nulirano")})
public class Silosi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "brsilosa")
    private int brsilosa;
    @Basic(optional = false)
    @Column(name = "stanje")
    private long stanje;
    @Basic(optional = false)
    @Column(name = "unos")
    private long unos;
    @Basic(optional = false)
    @Column(name = "datum")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datum;
    @Basic(optional = false)
    @Column(name = "opissilosa")
    private String opissilosa;
    @Column(name = "nulirano")
    private Boolean nulirano;

    public Silosi() {
    }

    public Silosi(Long id) {
        this.id = id;
    }

    public Silosi(Long id, int brsilosa, long stanje, long unos, Date datum, String opissilosa) {
        this.id = id;
        this.brsilosa = brsilosa;
        this.stanje = stanje;
        this.unos = unos;
        this.datum = datum;
        this.opissilosa = opissilosa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBrsilosa() {
        return brsilosa;
    }

    public void setBrsilosa(int brsilosa) {
        this.brsilosa = brsilosa;
    }

    public long getStanje() {
        return stanje;
    }

    public void setStanje(long stanje) {
        this.stanje = stanje;
    }

    public long getUnos() {
        return unos;
    }

    public void setUnos(long unos) {
        this.unos = unos;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getOpissilosa() {
        return opissilosa;
    }

    public void setOpissilosa(String opissilosa) {
        this.opissilosa = opissilosa;
    }

    public Boolean getNulirano() {
        return nulirano;
    }

    public void setNulirano(Boolean nulirano) {
        this.nulirano = nulirano;
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
        if (!(object instanceof Silosi)) {
            return false;
        }
        Silosi other = (Silosi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dbOld.Silosi[ id=" + id + " ]";
    }
    
}
