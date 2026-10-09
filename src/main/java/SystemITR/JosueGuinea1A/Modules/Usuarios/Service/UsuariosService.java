package SystemITR.JosueGuinea1A.Modules.Usuarios.Service;

import SystemITR.JosueGuinea1A.Modules.Usuarios.DTO.UsuarioRequestDTO;
import SystemITR.JosueGuinea1A.Modules.Usuarios.Entity.UsuariosEntity;
import SystemITR.JosueGuinea1A.Modules.Usuarios.Repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuariosService {

    @Autowired
    private final  UsuarioRepository repository;

    public List<UsuariosEntity> obtenerTodos(){
        return repository.findAll();
    }


    public UsuariosEntity  obtenerPorId(Integer id){
        return repository.findById(id).orElseThrow(()-> new RuntimeException("Usuario no encontrado"));
    }

    public UsuarioRequestDTO guardarUsuario(UsuarioRequestDTO dto){

        UsuariosEntity entity = convertiraDTO(dto);
        UsuariosEntity entitySave = repository.save(entity);

        return convertiraDTO(entitySave);
    }

    public void eliminarUsuario(Integer id){
        UsuariosEntity usuario = obtenerPorId(id);
        repository. delete(usuario);
    }



    private UsuarioRequestDTO convertiraDTO(UsuariosEntity entitySave){
        UsuarioRequestDTO dto = new UsuarioRequestDTO();
        dto.setId_usuario(entitySave.getId_Usuario());
        dto.setNombre(entitySave.getNombre());
        dto.setCorreo(entitySave.getCorreo());
        dto.setFecha_registro(entitySave.getFecha_registro());

        return dto;
    }



}
