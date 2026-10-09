package SystemITR.JosueGuinea1A.Modules.Usuarios.Repository;

import SystemITR.JosueGuinea1A.Modules.Usuarios.DTO.UsuarioRequestDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioRepository> {
    UsuarioRepository<UsuarioRepository<UsuarioRequestDTO<>>>


}
