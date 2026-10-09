package SystemITR.JosueGuinea1A.Modules.Usuarios.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@Table(name= "USUARIOS")
public class usuariosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private long id_CLiente;

    @Column(name ="nombre")
    private String nombre;

    @Column(name = "correo")
    private  String correo;

    @Column(name = "fecha_registro")
    private Date fecha_registro;
}
