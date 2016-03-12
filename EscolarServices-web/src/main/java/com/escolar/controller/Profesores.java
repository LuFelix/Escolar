
package com.escolar.controller;

import com.escolar.entity.Usuarios;
import com.escolar.session.UsuariosSessionRemote;
import com.escolar.view.UsuariosView;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carlos Cesar Rosas<face_less@hotmail.com>
 */
@RestController
@RequestMapping("/profesores")
public class Profesores {
    UsuariosSessionRemote usuariosSession = lookupUsuariosSessionRemote();
    
    @RequestMapping(value = "/find>{id}", method = RequestMethod.GET, produces = "application/json")
    public UsuariosView buscar(@PathVariable String id){
        UsuariosView concat=new UsuariosView(usuariosSession.find(Long.valueOf(id)));
        return concat;
    }

    private UsuariosSessionRemote lookupUsuariosSessionRemote() {
        try {
            Context c = new InitialContext();
            return (UsuariosSessionRemote) c.lookup("java:global/Escolar-ejb/UsuariosSession!com.escolar.session.UsuariosSessionRemote");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    
}
