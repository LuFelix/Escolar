package com.escolar.beans;

import com.escolar.entity.DatosUsuario;
import com.escolar.entity.Usuarios;
import com.escolar.session.DatosUsuarioSessionRemote;
import com.escolar.session.EscuelasSessionRemote;
import com.escolar.session.UsuariosSessionRemote;
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
@Named(value = "crearProfesores")
@RequestScoped
public class CrearProfesores {
    @EJB
    private DatosUsuarioSessionRemote datosUsuarioSession;
    @EJB
    private EscuelasSessionRemote escuelasSession;
    @EJB
    private UsuariosSessionRemote usuariosSession;

    @Getter
    @Setter
    private String email;
    
    @Getter
    @Setter
    private String contrasena;
    
    @Getter
    @Setter
    private Long id;
    
    @Getter
    @Setter
    private DatosUsuario datosProfe;

    public CrearProfesores() {
        datosProfe = new DatosUsuario();
    }

    public void crearProfesor() {
        usuariosSession.create(null);
    }

    public List<Usuarios> getListProfesoresEscuela() {
        return usuariosSession.findAll();
    }

    public void actionLoad(Long id) {
        datosProfe = datosUsuarioSession.find(id);
        email=usuariosSession.find(id).getUsuario();
        this.id=id;
    }

    public void actionEditar() {
        if (id != null) {
            Usuarios user = usuariosSession.find(id);
            datosProfe.setIddatos(id);
            user.setUsuario(email);
            user.setContrasena(contrasena);
            user.setDatosUsuario(datosProfe);
            usuariosSession.edit(user);
        }else{
            Usuarios user=new Usuarios();
            user.setUsuario(email);
            user.setContrasena(contrasena);
            usuariosSession.create(user);
            user.setIdusuario(usuariosSession.agregaRol(user.getUsuario(), 1,1));
            datosProfe.setIddatos(user.getIdusuario());
            datosUsuarioSession.create(datosProfe);
        }
    }

}
