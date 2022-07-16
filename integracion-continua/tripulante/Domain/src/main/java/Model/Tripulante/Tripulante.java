package Model.Tripulante;

// import java.util.ArrayList;
// import java.util.Date;
import java.util.UUID;

// import com.google.gson.Gson;
import Event.PersonalRegistrado;
// import Model.Tripulante.ValueObjects.EmailAddress;
import core.AggregateRoot;
import core.DomainEvent;

public class Tripulante extends AggregateRoot<UUID> {
    private String Nombre;
    private String Apellido;
    //private EmailAddress EmailAddress;
    private String EmailAddress;

    Cargo Cargo;
    private Tierra cargo_tierra;
    private Aire cargo_aire;

    // public Tripulante() {

    // }

    public Tripulante() {


    };


    public Tripulante(String nombre, String apellido, String emailAddress, Cargo cargo) {
        key = UUID.randomUUID();
        this.Nombre = nombre;
        this.Apellido = apellido;
        //this.EmailAddress = new EmailAddress(emailAddress);
        this.EmailAddress = emailAddress;
        this.Cargo = cargo;
        // try {
        // this.Nombre = nombre;
        // this.Apellido = apellido;
        // this.EmailAddress = new EmailAddress(emailAddress);
        // this.Cargo = cargo;
        // } catch (BussinessRuleValidateExeption e) {
        // e.printStackTrace();
        // return;
        // }

    };

    public void eventCreado() {
        addDomainEvent(new PersonalRegistrado(key, Nombre));
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }
    public String getEmailAddress() {
    return EmailAddress;
    }
    public void setEmailAddress(String emailAddress) {
    this.EmailAddress = emailAddress;
    }

    public Cargo getCargo() {
        return Cargo;
    }

    public void setCargo(Cargo cargo) {
        this.Cargo = cargo;
    }



   // public void ConsolidarPersonal() {
   //     DomainEvent evento = new PersonalRegistrado(key, Nombre);
  //      addDomainEvent(evento);
 //   }

    // @Override
    // public String toString() {
    //     return new Gson().toJson(this, Tripulante.class);
    // }

}
