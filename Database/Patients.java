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
@Table(name = "PATIENTS")
@NamedQueries({
    @NamedQuery(name = "Patients.findAll", query = "SELECT p FROM Patients p"),
    @NamedQuery(name = "Patients.findByPid", query = "SELECT p FROM Patients p WHERE p.pid = :pid"),
    @NamedQuery(name = "Patients.findByPatientname", query = "SELECT p FROM Patients p WHERE p.patientname = :patientname"),
    @NamedQuery(name = "Patients.findByDob", query = "SELECT p FROM Patients p WHERE p.dob = :dob"),
    @NamedQuery(name = "Patients.findByAddress", query = "SELECT p FROM Patients p WHERE p.address = :address"),
    @NamedQuery(name = "Patients.findByPhone", query = "SELECT p FROM Patients p WHERE p.phone = :phone"),
    @NamedQuery(name = "Patients.findByGender", query = "SELECT p FROM Patients p WHERE p.gender = :gender"),
    @NamedQuery(name = "Patients.findNewPID", query = "SELECT COUNT(p.pid) FROM Patients p"),
    @NamedQuery(name = "Patients.findRIDbyPID", query = "SELECT p.parid FROM Patients p WHERE p.pid = :PID")})
public class Patients implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PID")
    private String pid;
    @Column(name = "PATIENTNAME")
    private String patientname;
    @Column(name = "DOB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dob;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "PHONE")
    private Long phone;
    @Column(name = "GENDER")
    private Character gender;
    @JoinColumn(name = "PARID", referencedColumnName = "RID")
    @ManyToOne
    private Reception parid;

    public Patients() {
    }

    public Patients(String pid) {
        this.pid = pid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public Reception getParid() {
        return parid;
    }

    public void setParid(Reception parid) {
        this.parid = parid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patients)) {
            return false;
        }
        Patients other = (Patients) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Patients[ pid=" + pid + " ]";
    }
    
}
