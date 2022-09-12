package br.com.lucas;

import br.com.lucas.entities.User;
import br.com.lucas.pattern.builder.CarAutomatic;
import br.com.lucas.pattern.builder.CarAutomaticBuilder;
import br.com.lucas.pattern.builder.CarBuilder;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/hello")
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @GET
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @POST
    @Path("/users")
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public String teste(User user){
//        user.persist();
        return "Ok";
    }

    @GET()
    @Path("/builder")
    public String testeBuilderPattern(){
        CarAutomatic carAutomatic = CarAutomaticBuilder.builder()
                .setAssentos(2)
                .setComputadorDeBordo()
                .setMotor("V4").build();

        System.out.println(carAutomatic);

        return "ok";
    }

    @GET
    @Path("/users")
    public List<User> findAll(){
        return User.listAll();
    }


}