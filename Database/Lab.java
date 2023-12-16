/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Taymoor
 */
@Entity
@Table(name = "LAB")
@NamedQueries({
    @NamedQuery(name = "Lab.findAll", query = "SELECT l FROM Lab l"),
    @NamedQuery(name = "Lab.findByLid", query = "SELECT l FROM Lab l WHERE l.lid = :lid"),
    @NamedQuery(name = "Lab.findByBloodtype", query = "SELECT l FROM Lab l WHERE l.bloodtype = :bloodtype"),
    @NamedQuery(name = "Lab.findByHealthcond", query = "SELECT l FROM Lab l WHERE l.healthcond = :healthcond"),
    @NamedQuery(name = "Lab.findNewLID", query = "SELECT COUNT(l.lid) FROM Lab l")})
public class Lab implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LID")
    private String lid;
    @Column(name = "BLOODTYPE")
    private String bloodtype;
    @Column(name = "HEALTHCOND")
    private String healthcond;
    @OneToMany(mappedBy = "blid")
    private Collection<Bloodbank> bloodbankCollection;
    @JoinColumn(name = "LABRID", referencedColumnName = "RID")
    @ManyToOne(cascade = CascadeType.ALL)
    private Reception labrid;

    public Lab() {
    }

    public Lab(String lid) {
        this.lid = lid;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getHealthcond() {
        return healthcond;
    }

    public void setHealthcond(String healthcond) {
        this.healthcond = healthcond;
    }

    public Collection<Bloodbank> getBloodbankCollection() {
        return bloodbankCollection;
    }

    public void setBloodbankCollection(Collection<Bloodbank> bloodbankCollection) {
        this.bloodbankCollection = bloodbankCollection;
    }

    public Reception getLabrid() {
        return labrid;
    }

    public void setLabrid(Reception labrid) {
        this.labrid = labrid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lid != null ? lid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lab)) {
            return false;
        }
        Lab other = (Lab) object;
        if ((this.lid == null && other.lid != null) || (this.lid != null && !this.lid.equals(other.lid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Lab[ lid=" + lid + " ]";
    }
    
}
