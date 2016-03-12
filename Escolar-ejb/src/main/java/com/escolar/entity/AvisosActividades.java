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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carlos Cesar Rosas<face_less@hotmail.com>
 */
@Entity
@Table(name = "avisos_actividades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvisosActividades.findAll", query = "SELECT a FROM AvisosActividades a"),
    @NamedQuery(name = "AvisosActividades.findByIdaviso", query = "SELECT a FROM AvisosActividades a WHERE a.idaviso = :idaviso"),
    @NamedQuery(name = "AvisosActividades.findByActivo", query = "SELECT a FROM AvisosActividades a WHERE a.activo = :activo"),
    @NamedQuery(name = "AvisosActividades.findByFechacreacion", query = "SELECT a FROM AvisosActividades a WHERE a.fechacreacion = :fechacreacion"),
    @NamedQuery(name = "AvisosActividades.findByFecha", query = "SELECT a FROM AvisosActividades a WHERE a.fecha = :fecha"),
    @NamedQuery(name = "AvisosActividades.findByDescripcion", query = "SELECT a FROM AvisosActividades a WHERE a.descripcion = :descripcion")})
public class AvisosActividades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idaviso")
    private Long idaviso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activo")
    private boolean activo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.DATE)
    private Date fechacreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "idmateria", referencedColumnName = "idmateria")
    @ManyToOne
    private Materias idmateria;

    public AvisosActividades() {
    }

    public AvisosActividades(Long idaviso) {
        this.idaviso = idaviso;
    }

    public AvisosActividades(Long idaviso, boolean activo, Date fechacreacion, Date fecha, String descripcion) {
        this.idaviso = idaviso;
        this.activo = activo;
        this.fechacreacion = fechacreacion;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public Long getIdaviso() {
        return idaviso;
    }

    public void setIdaviso(Long idaviso) {
        this.idaviso = idaviso;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Materias getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(Materias idmateria) {
        this.idmateria = idmateria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idaviso != null ? idaviso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvisosActividades)) {
            return false;
        }
        AvisosActividades other = (AvisosActividades) object;
        if ((this.idaviso == null && other.idaviso != null) || (this.idaviso != null && !this.idaviso.equals(other.idaviso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.escolar.entity.AvisosActividades[ idaviso=" + idaviso + " ]";
    }
    
}
