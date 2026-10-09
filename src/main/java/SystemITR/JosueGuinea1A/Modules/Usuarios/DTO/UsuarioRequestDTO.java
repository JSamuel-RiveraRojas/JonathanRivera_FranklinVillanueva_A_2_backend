package SystemITR.JosueGuinea1A.Modules.Usuarios.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class UsuarioRequestDTO {

    @NotBlank
    private long id_CLiente;

    @NotBlank
    private String nombre;

    @NotBlank
    @Email(message = "el fomrato de correo debe ser valido")
    private  String correo;

    @NotBlank
    @DateTimeFormat
    private Date fecha_registro;

}
