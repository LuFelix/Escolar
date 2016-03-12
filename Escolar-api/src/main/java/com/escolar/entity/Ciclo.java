/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escolar.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Carlos Cesar Rosas<face_less@hotmail.com>
 */
@Entity
@Table(name = "ciclo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ciclo.findAll", query = "SELECT c FROM Ciclo c"),
    @NamedQuery(name = "Ciclo.findByIdciclo", query = "SELECT c FROM Ciclo c WHERE c.idciclo = :idciclo"),
    @NamedQuery(name = "Ciclo.findByInicio", query = "SELECT c FROM Ciclo c WHERE c.inicio = :inicio"),
    @NamedQuery(name = "Ciclo.findByFin", query = "SELECT c FROM Ciclo c WHERE c.fin = :fin")})
public class Ciclo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idciclo")
    private Integer idciclo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "inicio")
    @Temporal(TemporalType.DATE)
    private Date inicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fin")
    @Temporal(TemporalType.DATE)
    private Date fin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciclo")
    private List<MateriasAsignadas> materiasAsignadasList;

    public Ciclo() {
    }

    public Ciclo(Integer idciclo) {
        this.idciclo = idciclo;
    }

    public Ciclo(Integer idciclo, Date inicio, Date fin) {
        this.idciclo = idciclo;
        this.inicio = inicio;
        this.fin = fin;
    }

    public Integer getIdciclo() {
        return idciclo;
    }

    public void setIdciclo(Integer idciclo) {
        this.idciclo = idciclo;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    @XmlTransient
    public List<MateriasAsignadas> getMateriasAsignadasList() {
        return materiasAsignadasList;
    }

    public void setMateriasAsignadasList(List<MateriasAsignadas> materiasAsignadasList) {
        this.materiasAsignadasList = materiasAsignadasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idciclo != null ? idciclo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciclo)) {
            return false;
        }
        Ciclo other = (Ciclo) object;
        if ((this.idciclo == null && other.idciclo != null) || (this.idciclo != null && !this.idciclo.equals(other.idciclo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.escolar.entity.Ciclo[ idciclo=" + idciclo + " ]";
    }
    
}
