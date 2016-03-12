/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escolar.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carlos Cesar Rosas<face_less@hotmail.com>
 */
@Entity
@Table(name = "datos_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatosUsuario.findAll", query = "SELECT d FROM DatosUsuario d"),
    @NamedQuery(name = "DatosUsuario.findByIddatos", query = "SELECT d FROM DatosUsuario d WHERE d.iddatos = :iddatos"),
    @NamedQuery(name = "DatosUsuario.findByNombre", query = "SELECT d FROM DatosUsuario d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "DatosUsuario.findByApellidop", query = "SELECT d FROM DatosUsuario d WHERE d.apellidop = :apellidop"),
    @NamedQuery(name = "DatosUsuario.findByApellidom", query = "SELECT d FROM DatosUsuario d WHERE d.apellidom = :apellidom"),
    @NamedQuery(name = "DatosUsuario.findByDireccion", query = "SELECT d FROM DatosUsuario d WHERE d.direccion = :direccion"),
    @NamedQuery(name = "DatosUsuario.findByParentesco", query = "SELECT d FROM DatosUsuario d WHERE d.parentesco = :parentesco"),
    @NamedQuery(name = "DatosUsuario.findByTelefono", query = "SELECT d FROM DatosUsuario d WHERE d.telefono = :telefono")})
public class DatosUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddatos")
    private Long iddatos;
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
    @Size(max = 70)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 30)
    @Column(name = "parentesco")
    private String parentesco;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "telefono")
    private String telefono;
    @JoinColumn(name = "iddatos", referencedColumnName = "idusuario", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuarios usuarios;

    public DatosUsuario() {
    }

    public DatosUsuario(Long iddatos) {
        this.iddatos = iddatos;
    }

    public DatosUsuario(Long iddatos, String nombre, String apellidop, String telefono) {
        this.iddatos = iddatos;
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.telefono = telefono;
    }

    public Long getIddatos() {
        return iddatos;
    }

    public void setIddatos(Long iddatos) {
        this.iddatos = iddatos;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddatos != null ? iddatos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosUsuario)) {
            return false;
        }
        DatosUsuario other = (DatosUsuario) object;
        if ((this.iddatos == null && other.iddatos != null) || (this.iddatos != null && !this.iddatos.equals(other.iddatos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.escolar.entity.DatosUsuario[ iddatos=" + iddatos + " ]";
    }
    
}
