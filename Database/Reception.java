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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Taymoor
 */
@Entity
@Table(name = "RECEPTION")
@NamedQueries({
    @NamedQuery(name = "Reception.findAll", query = "SELECT r FROM Reception r"),
    @NamedQuery(name = "Reception.findByRid", query = "SELECT r FROM Reception r WHERE r.rid = :rid"),
    @NamedQuery(name = "Reception.findNewRID", query = "SELECT count(r.rid) FROM Reception r")
})
public class Reception implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RID")
    private String rid;
    @OneToMany(mappedBy = "parid")
    private Collection<Patients> patientsCollection;
    @OneToMany(mappedBy = "nurid")
    private Collection<Nurses> nursesCollection;
    @OneToMany(mappedBy = "dorid")
    private Collection<Donators> donatorsCollection;
    @OneToMany(mappedBy = "labrid", cascade = CascadeType.ALL)
    private Collection<Lab> labCollection;

    public Reception() {
    }

    public Reception(String rid) {
        this.rid = rid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public Collection<Patients> getPatientsCollection() {
        return patientsCollection;
    }

    public void setPatientsCollection(Collection<Patients> patientsCollection) {
        this.patientsCollection = patientsCollection;
    }

    public Collection<Nurses> getNursesCollection() {
        return nursesCollection;
    }

    public void setNursesCollection(Collection<Nurses> nursesCollection) {
        this.nursesCollection = nursesCollection;
    }

    public Collection<Donators> getDonatorsCollection() {
        return donatorsCollection;
    }

    public void setDonatorsCollection(Collection<Donators> donatorsCollection) {
        this.donatorsCollection = donatorsCollection;
    }

    public Collection<Lab> getLabCollection() {
        return labCollection;
    }

    public void setLabCollection(Collection<Lab> labCollection) {
        this.labCollection = labCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rid != null ? rid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reception)) {
            return false;
        }
        Reception other = (Reception) object;
        if ((this.rid == null && other.rid != null) || (this.rid != null && !this.rid.equals(other.rid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Reception[ rid=" + rid + " ]";
    }
    
}
