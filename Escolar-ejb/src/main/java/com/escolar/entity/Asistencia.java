/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escolar.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carlos Cesar Rosas<face_less@hotmail.com>
 */
@Entity
@Table(name = "asistencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asistencia.findAll", query = "SELECT a FROM Asistencia a"),
    @NamedQuery(name = "Asistencia.findByIdalumno", query = "SELECT a FROM Asistencia a WHERE a.asistenciaPK.idalumno = :idalumno"),
    @NamedQuery(name = "Asistencia.findByFecha", query = "SELECT a FROM Asistencia a WHERE a.asistenciaPK.fecha = :fecha"),
    @NamedQuery(name = "Asistencia.findByAsistio", query = "SELECT a FROM Asistencia a WHERE a.asistio = :asistio")})
public class Asistencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AsistenciaPK asistenciaPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "asistio")
    private boolean asistio;
    @JoinColumn(name = "idmateria", referencedColumnName = "idmateria")
    @ManyToOne(optional = false)
    private Materias idmateria;
    @JoinColumn(name = "idalumno", referencedColumnName = "idalumno", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Alumnos alumnos;

    public Asistencia() {
    }

    public Asistencia(AsistenciaPK asistenciaPK) {
        this.asistenciaPK = asistenciaPK;
    }

    public Asistencia(AsistenciaPK asistenciaPK, boolean asistio) {
        this.asistenciaPK = asistenciaPK;
        this.asistio = asistio;
    }

    public Asistencia(int idalumno, Date fecha) {
        this.asistenciaPK = new AsistenciaPK(idalumno, fecha);
    }

    public AsistenciaPK getAsistenciaPK() {
        return asistenciaPK;
    }

    public void setAsistenciaPK(AsistenciaPK asistenciaPK) {
        this.asistenciaPK = asistenciaPK;
    }

    public boolean getAsistio() {
        return asistio;
    }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }

    public Materias getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(Materias idmateria) {
        this.idmateria = idmateria;
    }

    public Alumnos getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumnos alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (asistenciaPK != null ? asistenciaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asistencia)) {
            return false;
        }
        Asistencia other = (Asistencia) object;
        if ((this.asistenciaPK == null && other.asistenciaPK != null) || (this.asistenciaPK != null && !this.asistenciaPK.equals(other.asistenciaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.escolar.entity.Asistencia[ asistenciaPK=" + asistenciaPK + " ]";
    }
    
}
