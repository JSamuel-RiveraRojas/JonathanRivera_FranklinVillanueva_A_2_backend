package SystemITR.JosueGuinea1A.Modules.Usuarios.Repository;

import SystemITR.JosueGuinea1A.Modules.Usuarios.DTO.UsuarioRequestDTO;
import SystemITR.JosueGuinea1A.Modules.Usuarios.Entity.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuariosEntity, Integer> {

}
