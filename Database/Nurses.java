/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Taymoor
 */
@Entity
@Table(name = "NURSES")
@NamedQueries({
    @NamedQuery(name = "Nurses.findAll", query = "SELECT n FROM Nurses n"),
    @NamedQuery(name = "Nurses.findByNid", query = "SELECT n FROM Nurses n WHERE n.nid = :nid"),
    @NamedQuery(name = "Nurses.findByNursename", query = "SELECT n FROM Nurses n WHERE n.nursename = :nursename"),
    @NamedQuery(name = "Nurses.findNewNID", query = "SELECT COUNT(n.nid) FROM Nurses n")})
public class Nurses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NID")
    private String nid;
    @Column(name = "NURSENAME")
    private String nursename;
    @JoinColumn(name = "NURID", referencedColumnName = "RID")
    @ManyToOne
    private Reception nurid;

    public Nurses() {
    }

    public Nurses(String nid) {
        this.nid = nid;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getNursename() {
        return nursename;
    }

    public void setNursename(String nursename) {
        this.nursename = nursename;
    }

    public Reception getNurid() {
        return nurid;
    }

    public void setNurid(Reception nurid) {
        this.nurid = nurid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nid != null ? nid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nurses)) {
            return false;
        }
        Nurses other = (Nurses) object;
        if ((this.nid == null && other.nid != null) || (this.nid != null && !this.nid.equals(other.nid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Nurses[ nid=" + nid + " ]";
    }
    
}
