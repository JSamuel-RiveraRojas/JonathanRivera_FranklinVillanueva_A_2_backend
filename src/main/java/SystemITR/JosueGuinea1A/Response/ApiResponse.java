package SystemITR.JosueGuinea1A.Response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse <T>{
    private final boolean succes;
    private final String  message;
    private  final T  data;

    public ApiResponse(boolean succes, String message){
        this.succes= succes;
        this.message= message;
        this.data= null;
    }

    public  ApiResponse(boolean succes, String message,T data){
        this.succes=succes;
        this.message= message;
        this.data= data;

    }
}

