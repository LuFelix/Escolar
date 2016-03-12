
package com.escolar.view;

import com.escolar.entity.Usuarios;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carlos Cesar Rosas<face_less@hotmail.com>
 */
public class UsuariosView {
    
    public UsuariosView(Usuarios user){
        this.idusuario=user.getIdusuario();
        this.contrasena=user.getContrasena();
        this.usuario=user.getUsuario();
    }
    
    @Getter @Setter private Long idusuario;
    @Getter @Setter private String usuario;
    @Getter @Setter private String contrasena;
    /*private List<Roles> rolesList;
    private List<Escuelas> escuelasList;
    private List<Alumnos> alumnosList;
    private DatosUsuario datosUsuario;
    private List<MateriasAsignadas> materiasAsignadasList;*/
    
    
}
