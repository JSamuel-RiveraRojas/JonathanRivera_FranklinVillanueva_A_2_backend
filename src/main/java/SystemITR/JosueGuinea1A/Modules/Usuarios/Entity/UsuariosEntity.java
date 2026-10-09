package SystemITR.JosueGuinea1A.Modules.Usuarios.Entity;


import SystemITR.JosueGuinea1A.Modules.Usuarios.DTO.UsuarioRequestDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@Table(name= "USUARIOS")
public class UsuariosEntity extends UsuarioRequestDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private long id_Usuario;

    @Column(name ="nombre")
    private String nombre;

    @Column(name = "correo")
    private  String correo;

    @Column(name = "fecha_registro")
    private Date fecha_registro;
}
