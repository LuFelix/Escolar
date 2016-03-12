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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "escuelas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Escuelas.findAll", query = "SELECT e FROM Escuelas e"),
    @NamedQuery(name = "Escuelas.findByIdescuela", query = "SELECT e FROM Escuelas e WHERE e.idescuela = :idescuela"),
    @NamedQuery(name = "Escuelas.findByNombre", query = "SELECT e FROM Escuelas e WHERE e.nombre = :nombre")})
public class Escuelas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idescuela")
    private Integer idescuela;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nombre")
    private String nombre;
    @JoinTable(name = "usuario_escuela", joinColumns = {
        @JoinColumn(name = "idescuela", referencedColumnName = "idescuela")}, inverseJoinColumns = {
        @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")})
    @ManyToMany
    private List<Usuarios> usuariosList;
    @JoinColumn(name = "idturno", referencedColumnName = "idturno")
    @ManyToOne(optional = false)
    private Turnos idturno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idescuela")
    private List<Materias> materiasList;

    public Escuelas() {
    }

    public Escuelas(Integer idescuela) {
        this.idescuela = idescuela;
    }

    public Escuelas(Integer idescuela, String nombre) {
        this.idescuela = idescuela;
        this.nombre = nombre;
    }

    public Integer getIdescuela() {
        return idescuela;
    }

    public void setIdescuela(Integer idescuela) {
        this.idescuela = idescuela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    public Turnos getIdturno() {
        return idturno;
    }

    public void setIdturno(Turnos idturno) {
        this.idturno = idturno;
    }

    @XmlTransient
    public List<Materias> getMateriasList() {
        return materiasList;
    }

    public void setMateriasList(List<Materias> materiasList) {
        this.materiasList = materiasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idescuela != null ? idescuela.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Escuelas)) {
            return false;
        }
        Escuelas other = (Escuelas) object;
        if ((this.idescuela == null && other.idescuela != null) || (this.idescuela != null && !this.idescuela.equals(other.idescuela))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.escolar.entity.Escuelas[ idescuela=" + idescuela + " ]";
    }
    
}
