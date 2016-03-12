/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escolar.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Carlos Cesar Rosas<face_less@hotmail.com>
 */
@Entity
@Table(name = "alumnos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumnos.findAll", query = "SELECT a FROM Alumnos a"),
    @NamedQuery(name = "Alumnos.findByIdalumno", query = "SELECT a FROM Alumnos a WHERE a.idalumno = :idalumno"),
    @NamedQuery(name = "Alumnos.findByNombre", query = "SELECT a FROM Alumnos a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Alumnos.findByApellidop", query = "SELECT a FROM Alumnos a WHERE a.apellidop = :apellidop"),
    @NamedQuery(name = "Alumnos.findByApellidom", query = "SELECT a FROM Alumnos a WHERE a.apellidom = :apellidom")})
public class Alumnos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idalumno")
    private Long idalumno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "apellidop")
    private String apellidop;
    @Size(max = 30)
    @Column(name = "apellidom")
    private String apellidom;
    @JoinColumn(name = "idtutor", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuarios idtutor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumnos")
    private List<Asistencia> asistenciaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumnos")
    private List<MateriasAsignadas> materiasAsignadasList;

    public Alumnos() {
    }

    public Alumnos(Long idalumno) {
        this.idalumno = idalumno;
    }

    public Alumnos(Long idalumno, String nombre, String apellidop) {
        this.idalumno = idalumno;
        this.nombre = nombre;
        this.apellidop = apellidop;
    }

    public Long getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(Long idalumno) {
        this.idalumno = idalumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public Usuarios getIdtutor() {
        return idtutor;
    }

    public void setIdtutor(Usuarios idtutor) {
        this.idtutor = idtutor;
    }

    @XmlTransient
    public List<Asistencia> getAsistenciaList() {
        return asistenciaList;
    }

    public void setAsistenciaList(List<Asistencia> asistenciaList) {
        this.asistenciaList = asistenciaList;
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
        hash += (idalumno != null ? idalumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumnos)) {
            return false;
        }
        Alumnos other = (Alumnos) object;
        if ((this.idalumno == null && other.idalumno != null) || (this.idalumno != null && !this.idalumno.equals(other.idalumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.escolar.entity.Alumnos[ idalumno=" + idalumno + " ]";
    }
    
}
