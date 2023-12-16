/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "BLOODBANK")
@NamedQueries({
    @NamedQuery(name = "Bloodbank.findAll", query = "SELECT b FROM Bloodbank b"),
    @NamedQuery(name = "Bloodbank.findByBid", query = "SELECT b FROM Bloodbank b WHERE b.bid = :bid"),
    @NamedQuery(name = "Bloodbank.findByBloodtype", query = "SELECT b FROM Bloodbank b WHERE b.bloodtype = :bloodtype"),
    @NamedQuery(name = "Bloodbank.findByQuantity", query = "SELECT b FROM Bloodbank b WHERE b.quantity = :quantity"),
    @NamedQuery(name = "Bloodbank.findByEntrydate", query = "SELECT b FROM Bloodbank b WHERE b.entrydate = :entrydate"),
    @NamedQuery(name = "Bloodbank.findByExpirydate", query = "SELECT b FROM Bloodbank b WHERE b.expirydate = :expirydate"),
    @NamedQuery(name = "Bloodbank.findLastBID", query = "SELECT COUNT(b.bid) FROM Bloodbank b"),
    @NamedQuery(name = "Bloodbank.findCountForUnit", query = "SELECT Sum(b.quantity) FROM Bloodbank b where b.bloodtype = :bt")})
public class Bloodbank implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BID")
    private String bid;
    @Column(name = "BLOODTYPE")
    private String bloodtype;
    @Column(name = "QUANTITY")
    private BigInteger quantity;
    @Column(name = "ENTRYDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entrydate;
    @Column(name = "EXPIRYDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirydate;
    @JoinColumn(name = "BLID", referencedColumnName = "LID")
    @ManyToOne
    private Lab blid;

    public Bloodbank() {
    }

    public Bloodbank(String bid) {
        this.bid = bid;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    public Lab getBlid() {
        return blid;
    }

    public void setBlid(Lab blid) {
        this.blid = blid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bid != null ? bid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bloodbank)) {
            return false;
        }
        Bloodbank other = (Bloodbank) object;
        if ((this.bid == null && other.bid != null) || (this.bid != null && !this.bid.equals(other.bid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Bloodbank[ bid=" + bid + " ]";
    }
    
}
