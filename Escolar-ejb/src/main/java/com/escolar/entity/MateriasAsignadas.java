/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escolar.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carlos Cesar Rosas<face_less@hotmail.com>
 */
@Entity
@Table(name = "materias_asignadas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MateriasAsignadas.findAll", query = "SELECT m FROM MateriasAsignadas m"),
    @NamedQuery(name = "MateriasAsignadas.findByIdmateria", query = "SELECT m FROM MateriasAsignadas m WHERE m.materiasAsignadasPK.idmateria = :idmateria"),
    @NamedQuery(name = "MateriasAsignadas.findByIdprofesor", query = "SELECT m FROM MateriasAsignadas m WHERE m.materiasAsignadasPK.idprofesor = :idprofesor"),
    @NamedQuery(name = "MateriasAsignadas.findByIdciclo", query = "SELECT m FROM MateriasAsignadas m WHERE m.materiasAsignadasPK.idciclo = :idciclo"),
    @NamedQuery(name = "MateriasAsignadas.findByIdalumno", query = "SELECT m FROM MateriasAsignadas m WHERE m.materiasAsignadasPK.idalumno = :idalumno")})
public class MateriasAsignadas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MateriasAsignadasPK materiasAsignadasPK;
    @JoinColumn(name = "idprofesor", referencedColumnName = "idusuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuarios usuarios;
    @JoinColumn(name = "idmateria", referencedColumnName = "idmateria", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Materias materias;
    @JoinColumn(name = "idciclo", referencedColumnName = "idciclo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ciclo ciclo;
    @JoinColumn(name = "idalumno", referencedColumnName = "idalumno", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Alumnos alumnos;

    public MateriasAsignadas() {
    }

    public MateriasAsignadas(MateriasAsignadasPK materiasAsignadasPK) {
        this.materiasAsignadasPK = materiasAsignadasPK;
    }

    public MateriasAsignadas(int idmateria, long idprofesor, int idciclo, long idalumno) {
        this.materiasAsignadasPK = new MateriasAsignadasPK(idmateria, idprofesor, idciclo, idalumno);
    }

    public MateriasAsignadasPK getMateriasAsignadasPK() {
        return materiasAsignadasPK;
    }

    public void setMateriasAsignadasPK(MateriasAsignadasPK materiasAsignadasPK) {
        this.materiasAsignadasPK = materiasAsignadasPK;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
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
        hash += (materiasAsignadasPK != null ? materiasAsignadasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriasAsignadas)) {
            return false;
        }
        MateriasAsignadas other = (MateriasAsignadas) object;
        if ((this.materiasAsignadasPK == null && other.materiasAsignadasPK != null) || (this.materiasAsignadasPK != null && !this.materiasAsignadasPK.equals(other.materiasAsignadasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.escolar.entity.MateriasAsignadas[ materiasAsignadasPK=" + materiasAsignadasPK + " ]";
    }
    
}
