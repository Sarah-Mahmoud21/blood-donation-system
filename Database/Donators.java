/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic; 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Taymoor
 */
@Entity
@Table(name = "DONATORS")
@NamedQueries({
    @NamedQuery(name = "Donators.findAll", query = "SELECT d FROM Donators d"),
    @NamedQuery(name = "Donators.findByDid", query = "SELECT d FROM Donators d WHERE d.did = :did"),
    @NamedQuery(name = "Donators.findByDonatorname", query = "SELECT d FROM Donators d WHERE d.donatorname = :donatorname"),
    @NamedQuery(name = "Donators.findByDob", query = "SELECT d FROM Donators d WHERE d.dob = :dob"),
    @NamedQuery(name = "Donators.findByLastdonationdate", query = "SELECT d FROM Donators d WHERE d.lastdonationdate = :lastdonationdate"),
    @NamedQuery(name = "Donators.findByAddress", query = "SELECT d FROM Donators d WHERE d.address = :address"),
    @NamedQuery(name = "Donators.findByPhone", query = "SELECT d FROM Donators d WHERE d.phone = :phone"),
    @NamedQuery(name = "Donators.findByGender", query = "SELECT d FROM Donators d WHERE d.gender = :gender"),
    @NamedQuery(name = "Donators.findNewDID", query = "SELECT count(d.did) FROM Donators d"),
    @NamedQuery(name = "Donators.findLastDonationDate", query = "SELECT d.lastdonationdate FROM Donators d WHERE d.did = :did"),
    @NamedQuery(name = "Donators.findRIDbyDID", query = "SELECT d.dorid FROM Donators d WHERE d.did = :did")
        
})
public class Donators implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DID")
    private String did;
    @Column(name = "DONATORNAME")
    private String donatorname;
    @Column(name = "DOB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dob;
    @Column(name = "LASTDONATIONDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastdonationdate;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "PHONE")
    private Long phone;
    @Column(name = "GENDER")
    private Character gender;
    @JoinColumn(name = "DORID", referencedColumnName = "RID")
    @ManyToOne
    private Reception dorid;

    public Donators() {
    }

    public Donators(String did) {
        this.did = did;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDonatorname() {
        return donatorname;
    }

    public void setDonatorname(String donatorname) {
        this.donatorname = donatorname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getLastdonationdate() {
        return lastdonationdate;
    }

    public void setLastdonationdate(Date lastdonationdate) {
        this.lastdonationdate = lastdonationdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Reception getDorid() {
        return dorid;
    }

    public void setDorid(Reception dorid) {
        this.dorid = dorid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (did != null ? did.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donators)) {
            return false;
        }
        Donators other = (Donators) object;
        if ((this.did == null && other.did != null) || (this.did != null && !this.did.equals(other.did))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Donators[ did=" + did + " ]";
    }
    
}
