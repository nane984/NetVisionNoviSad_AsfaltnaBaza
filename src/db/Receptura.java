/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

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
@Table(name = "receptura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Receptura.findAll", query = "SELECT r FROM Receptura r")
    , @NamedQuery(name = "Receptura.findById", query = "SELECT r FROM Receptura r WHERE r.id = :id")
    , @NamedQuery(name = "Receptura.findByReceptura", query = "SELECT r FROM Receptura r WHERE r.receptura = :receptura")
    , @NamedQuery(name = "Receptura.findByKupfiler", query = "SELECT r FROM Receptura r WHERE r.kupfiler = :kupfiler")
    , @NamedQuery(name = "Receptura.findBySopfiler", query = "SELECT r FROM Receptura r WHERE r.sopfiler = :sopfiler")
    , @NamedQuery(name = "Receptura.findByFrakcija1", query = "SELECT r FROM Receptura r WHERE r.frakcija1 = :frakcija1")
    , @NamedQuery(name = "Receptura.findByFrakcija2", query = "SELECT r FROM Receptura r WHERE r.frakcija2 = :frakcija2")
    , @NamedQuery(name = "Receptura.findByFrakcija3", query = "SELECT r FROM Receptura r WHERE r.frakcija3 = :frakcija3")
    , @NamedQuery(name = "Receptura.findByFrakcija4", query = "SELECT r FROM Receptura r WHERE r.frakcija4 = :frakcija4")
    , @NamedQuery(name = "Receptura.findByFrakcija5", query = "SELECT r FROM Receptura r WHERE r.frakcija5 = :frakcija5")
    , @NamedQuery(name = "Receptura.findByFrakcija6", query = "SELECT r FROM Receptura r WHERE r.frakcija6 = :frakcija6")
    , @NamedQuery(name = "Receptura.findByFrakcija7", query = "SELECT r FROM Receptura r WHERE r.frakcija7 = :frakcija7")
    , @NamedQuery(name = "Receptura.findByBitumen", query = "SELECT r FROM Receptura r WHERE r.bitumen = :bitumen")
    , @NamedQuery(name = "Receptura.findByDozator1", query = "SELECT r FROM Receptura r WHERE r.dozator1 = :dozator1")
    , @NamedQuery(name = "Receptura.findByDozator2", query = "SELECT r FROM Receptura r WHERE r.dozator2 = :dozator2")
    , @NamedQuery(name = "Receptura.findByDozator3", query = "SELECT r FROM Receptura r WHERE r.dozator3 = :dozator3")
    , @NamedQuery(name = "Receptura.findByDozator4", query = "SELECT r FROM Receptura r WHERE r.dozator4 = :dozator4")
    , @NamedQuery(name = "Receptura.findByDozator5", query = "SELECT r FROM Receptura r WHERE r.dozator5 = :dozator5")
    , @NamedQuery(name = "Receptura.findByDozator6", query = "SELECT r FROM Receptura r WHERE r.dozator6 = :dozator6")
    , @NamedQuery(name = "Receptura.findByDozator7", query = "SELECT r FROM Receptura r WHERE r.dozator7 = :dozator7")
    , @NamedQuery(name = "Receptura.findByDozator8", query = "SELECT r FROM Receptura r WHERE r.dozator8 = :dozator8")
    , @NamedQuery(name = "Receptura.findByDozator9", query = "SELECT r FROM Receptura r WHERE r.dozator9 = :dozator9")
    , @NamedQuery(name = "Receptura.findByDozator10", query = "SELECT r FROM Receptura r WHERE r.dozator10 = :dozator10")
    , @NamedQuery(name = "Receptura.findByDozator11", query = "SELECT r FROM Receptura r WHERE r.dozator11 = :dozator11")})
public class Receptura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "receptura")
    private String receptura;
    @Column(name = "kupfiler")
    private Integer kupfiler;
    @Column(name = "sopfiler")
    private Integer sopfiler;
    @Column(name = "frakcija1")
    private Integer frakcija1;
    @Column(name = "frakcija2")
    private Integer frakcija2;
    @Column(name = "frakcija3")
    private Integer frakcija3;
    @Column(name = "frakcija4")
    private Integer frakcija4;
    @Column(name = "frakcija5")
    private Integer frakcija5;
    @Column(name = "frakcija6")
    private Integer frakcija6;
    @Column(name = "frakcija7")
    private Integer frakcija7;
    @Column(name = "bitumen")
    private Integer bitumen;
    @Column(name = "dozator1")
    private Integer dozator1;
    @Column(name = "dozator2")
    private Integer dozator2;
    @Column(name = "dozator3")
    private Integer dozator3;
    @Column(name = "dozator4")
    private Integer dozator4;
    @Column(name = "dozator5")
    private Integer dozator5;
    @Column(name = "dozator6")
    private Integer dozator6;
    @Column(name = "dozator7")
    private Integer dozator7;
    @Column(name = "dozator8")
    private Integer dozator8;
    @Column(name = "dozator9")
    private Integer dozator9;
    @Column(name = "dozator10")
    private Integer dozator10;
    @Column(name = "dozator11")
    private Integer dozator11;

    public Receptura() {
    }

    public Receptura(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReceptura() {
        return receptura;
    }

    public void setReceptura(String receptura) {
        this.receptura = receptura;
    }

    public Integer getKupfiler() {
        return kupfiler;
    }

    public void setKupfiler(Integer kupfiler) {
        this.kupfiler = kupfiler;
    }

    public Integer getSopfiler() {
        return sopfiler;
    }

    public void setSopfiler(Integer sopfiler) {
        this.sopfiler = sopfiler;
    }

    public Integer getFrakcija1() {
        return frakcija1;
    }

    public void setFrakcija1(Integer frakcija1) {
        this.frakcija1 = frakcija1;
    }

    public Integer getFrakcija2() {
        return frakcija2;
    }

    public void setFrakcija2(Integer frakcija2) {
        this.frakcija2 = frakcija2;
    }

    public Integer getFrakcija3() {
        return frakcija3;
    }

    public void setFrakcija3(Integer frakcija3) {
        this.frakcija3 = frakcija3;
    }

    public Integer getFrakcija4() {
        return frakcija4;
    }

    public void setFrakcija4(Integer frakcija4) {
        this.frakcija4 = frakcija4;
    }

    public Integer getFrakcija5() {
        return frakcija5;
    }

    public void setFrakcija5(Integer frakcija5) {
        this.frakcija5 = frakcija5;
    }

    public Integer getFrakcija6() {
        return frakcija6;
    }

    public void setFrakcija6(Integer frakcija6) {
        this.frakcija6 = frakcija6;
    }

    public Integer getFrakcija7() {
        return frakcija7;
    }

    public void setFrakcija7(Integer frakcija7) {
        this.frakcija7 = frakcija7;
    }

    public Integer getBitumen() {
        return bitumen;
    }

    public void setBitumen(Integer bitumen) {
        this.bitumen = bitumen;
    }

    public Integer getDozator1() {
        return dozator1;
    }

    public void setDozator1(Integer dozator1) {
        this.dozator1 = dozator1;
    }

    public Integer getDozator2() {
        return dozator2;
    }

    public void setDozator2(Integer dozator2) {
        this.dozator2 = dozator2;
    }

    public Integer getDozator3() {
        return dozator3;
    }

    public void setDozator3(Integer dozator3) {
        this.dozator3 = dozator3;
    }

    public Integer getDozator4() {
        return dozator4;
    }

    public void setDozator4(Integer dozator4) {
        this.dozator4 = dozator4;
    }

    public Integer getDozator5() {
        return dozator5;
    }

    public void setDozator5(Integer dozator5) {
        this.dozator5 = dozator5;
    }

    public Integer getDozator6() {
        return dozator6;
    }

    public void setDozator6(Integer dozator6) {
        this.dozator6 = dozator6;
    }

    public Integer getDozator7() {
        return dozator7;
    }

    public void setDozator7(Integer dozator7) {
        this.dozator7 = dozator7;
    }

    public Integer getDozator8() {
        return dozator8;
    }

    public void setDozator8(Integer dozator8) {
        this.dozator8 = dozator8;
    }

    public Integer getDozator9() {
        return dozator9;
    }

    public void setDozator9(Integer dozator9) {
        this.dozator9 = dozator9;
    }

    public Integer getDozator10() {
        return dozator10;
    }

    public void setDozator10(Integer dozator10) {
        this.dozator10 = dozator10;
    }

    public Integer getDozator11() {
        return dozator11;
    }

    public void setDozator11(Integer dozator11) {
        this.dozator11 = dozator11;
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
        if (!(object instanceof Receptura)) {
            return false;
        }
        Receptura other = (Receptura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.Receptura[ id=" + id + " ]";
    }
    
}
