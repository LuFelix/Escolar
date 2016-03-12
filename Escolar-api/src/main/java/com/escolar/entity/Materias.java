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
@Table(name = "materias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materias.findAll", query = "SELECT m FROM Materias m"),
    @NamedQuery(name = "Materias.findByIdmateria", query = "SELECT m FROM Materias m WHERE m.idmateria = :idmateria"),
    @NamedQuery(name = "Materias.findByNombre", query = "SELECT m FROM Materias m WHERE m.nombre = :nombre")})
public class Materias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmateria")
    private Integer idmateria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "idmateria")
    private List<AvisosActividades> avisosActividadesList;
    @JoinColumn(name = "idgrupo", referencedColumnName = "idgrupo")
    @ManyToOne
    private Grupos idgrupo;
    @JoinColumn(name = "idgrado", referencedColumnName = "idgrado")
    @ManyToOne(optional = false)
    private Grados idgrado;
    @JoinColumn(name = "idescuela", referencedColumnName = "idescuela")
    @ManyToOne(optional = false)
    private Escuelas idescuela;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmateria")
    private List<Asistencia> asistenciaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materias")
    private List<MateriasAsignadas> materiasAsignadasList;

    public Materias() {
    }

    public Materias(Integer idmateria) {
        this.idmateria = idmateria;
    }

    public Materias(Integer idmateria, String nombre) {
        this.idmateria = idmateria;
        this.nombre = nombre;
    }

    public Integer getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(Integer idmateria) {
        this.idmateria = idmateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<AvisosActividades> getAvisosActividadesList() {
        return avisosActividadesList;
    }

    public void setAvisosActividadesList(List<AvisosActividades> avisosActividadesList) {
        this.avisosActividadesList = avisosActividadesList;
    }

    public Grupos getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(Grupos idgrupo) {
        this.idgrupo = idgrupo;
    }

    public Grados getIdgrado() {
        return idgrado;
    }

    public void setIdgrado(Grados idgrado) {
        this.idgrado = idgrado;
    }

    public Escuelas getIdescuela() {
        return idescuela;
    }

    public void setIdescuela(Escuelas idescuela) {
        this.idescuela = idescuela;
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
        hash += (idmateria != null ? idmateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materias)) {
            return false;
        }
        Materias other = (Materias) object;
        if ((this.idmateria == null && other.idmateria != null) || (this.idmateria != null && !this.idmateria.equals(other.idmateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.escolar.entity.Materias[ idmateria=" + idmateria + " ]";
    }
    
}
