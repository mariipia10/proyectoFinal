/*
 * 
 * 
 */

package reclamosMuni.modelo.daos;

import reclamosMuni.modelo.dtos.UsuarioDTO;

/**
 *
 * @author piahe
 */
public interface UsuarioDAO {

     public UsuarioDTO login(String usuario,String pass);
     public UsuarioDTO register(String usuario,String pass);
     public boolean idValido(int id);
     public boolean usernameValido (String usuario);
}
