/*
 * 
 * 
 */

package reclamosMuni.modelo.dtos;

/**
 *
 * @author piahe
 */
public class ContribuyenteDTO extends PersonaDTO {
    private static final String SQL_SELECT_BY_PERSONA_ID = "SELECT reclamo.id, descripcion, persona_id, categoria, direccion, fecha_inicio, fecha_fin FROM reclamo where persona_id=";

    public ContribuyenteDTO(int id, String nombre, String apellido, String mail, String telefono, int id_usuario, String dni) {
        super(id, nombre, apellido, mail, telefono, id_usuario, dni);
    }
    public ContribuyenteDTO(int id, String nombre, String apellido, String mail, String telefono, int id_usuario, String dni,boolean esta_completa) {
        super(id, nombre, apellido, mail, telefono, id_usuario, dni,esta_completa);
    }

    public ContribuyenteDTO() {
    }

    @Override
    public String getReclamosSQL(){
        return SQL_SELECT_BY_PERSONA_ID + this.getId();
    }
    
    public boolean esAdmin(){
        return false;
    }
}
