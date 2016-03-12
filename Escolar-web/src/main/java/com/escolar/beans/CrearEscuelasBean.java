
package com.escolar.beans;

import com.escolar.entity.Escuelas;
import com.escolar.entity.Turnos;
import com.escolar.session.EscuelasSessionRemote;
import com.escolar.session.TurnosSessionRemote;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ceasar
 */
@Named(value = "crearEscuelasBean")
@RequestScoped
public class CrearEscuelasBean {
    @EJB
    private TurnosSessionRemote turnosSession;
    @EJB
    private EscuelasSessionRemote escuelasSession;    
    
    @Getter @Setter private Escuelas escuela;
    
    public CrearEscuelasBean() {
        escuela=new Escuelas();
    }
    
    public List<Escuelas> viewList(){
        return escuelasSession.findAll();
    }
    
    public List<Turnos> getTurnosList(){
        return turnosSession.findAll();
    }
    
    public void create(){
        System.out.println(escuela.getNombre());
        escuelasSession.create(escuela);
    }
    
}
