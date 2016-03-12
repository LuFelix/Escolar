/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escolar.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Carlos Cesar Rosas<face_less@hotmail.com>
 */
@Embeddable
public class MateriasAsignadasPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmateria")
    private int idmateria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idprofesor")
    private long idprofesor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idciclo")
    private int idciclo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idalumno")
    private long idalumno;

    public MateriasAsignadasPK() {
    }

    public MateriasAsignadasPK(int idmateria, long idprofesor, int idciclo, long idalumno) {
        this.idmateria = idmateria;
        this.idprofesor = idprofesor;
        this.idciclo = idciclo;
        this.idalumno = idalumno;
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }

    public long getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(long idprofesor) {
        this.idprofesor = idprofesor;
    }

    public int getIdciclo() {
        return idciclo;
    }

    public void setIdciclo(int idciclo) {
        this.idciclo = idciclo;
    }

    public long getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(long idalumno) {
        this.idalumno = idalumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idmateria;
        hash += (int) idprofesor;
        hash += (int) idciclo;
        hash += (int) idalumno;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriasAsignadasPK)) {
            return false;
        }
        MateriasAsignadasPK other = (MateriasAsignadasPK) object;
        if (this.idmateria != other.idmateria) {
            return false;
        }
        if (this.idprofesor != other.idprofesor) {
            return false;
        }
        if (this.idciclo != other.idciclo) {
            return false;
        }
        if (this.idalumno != other.idalumno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.escolar.entity.MateriasAsignadasPK[ idmateria=" + idmateria + ", idprofesor=" + idprofesor + ", idciclo=" + idciclo + ", idalumno=" + idalumno + " ]";
    }
    
}
