package SystemITR.JosueGuinea1A.Modules.Usuarios.Controller;

import SystemITR.JosueGuinea1A.Modules.Usuarios.DTO.UsuarioRequestDTO;
import SystemITR.JosueGuinea1A.Modules.Usuarios.Entity.UsuariosEntity;
import SystemITR.JosueGuinea1A.Modules.Usuarios.Service.UsuariosService;
import SystemITR.JosueGuinea1A.Response.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/clientes")
public class UsuariosController {


    private final UsuariosService service;

    public UsuariosController(UsuariosService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<ApiResponse<UsuarioRequestDTO>> nuevoUsuario (@Valid @RequestBody UsuarioRequestDTO Json){


        return null;
    }




}
