
package com.escolar.beans;

import com.escolar.entity.Ciclo;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import com.escolar.session.CicloSessionRemote;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ceasar
 */
@Named(value = "crearCicloBean")
@RequestScoped
public class CrearCicloBean {
    @EJB
    private CicloSessionRemote cicloSession;
    
    @Getter @Setter private Ciclo cicloescolar;
    
    public CrearCicloBean() {
        cicloescolar=new Ciclo();
    }
      
    public void crear(){
        cicloSession.create(cicloescolar);
    }
    public List<Ciclo> viewList(){
        return cicloSession.findAll();
    }
}
