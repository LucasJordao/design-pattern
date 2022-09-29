package br.com.lucas;

import br.com.lucas.entities.User;
import br.com.lucas.pattern.comportamentais.observer.PaymentEmployee;
import br.com.lucas.pattern.comportamentais.observer.PaymentSystem;
import br.com.lucas.pattern.comportamentais.strategy.ConcreteStrategyMultiply;
import br.com.lucas.pattern.comportamentais.strategy.Context;
import br.com.lucas.pattern.criacionais.factory.CarAutomatic;
import br.com.lucas.pattern.criacionais.factory.CarAutomaticBuilder;
import br.com.lucas.pattern.criacionais.factory.fabstract.MotoBigTrailFactory;
import br.com.lucas.pattern.criacionais.factory.fabstract.MotoFactory;
import br.com.lucas.pattern.criacionais.factory.method.Product;
import br.com.lucas.pattern.criacionais.factory.method.ProductDigitalFactory;
import br.com.lucas.pattern.criacionais.prototype.Rectangle;
import br.com.lucas.pattern.criacionais.prototype.Shape;
import br.com.lucas.pattern.criacionais.singleton.SingletonDatabase;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
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

    @GET()
    @Path("/prototype")
    public String testePrototypePattern(){
        List<Shape> shapes = new ArrayList();
        Rectangle rectangle = new Rectangle(1, 2, "yellow", 1, 2);

        shapes.add(rectangle);
        shapes.add(rectangle.clone());

        shapes.forEach(System.out::println);

        shapes.clear();
        shapes.add(rectangle);
        shapes.add(rectangle);
        shapes.forEach(System.out::println);

        return "ok";
    }

    @GET
    @Path("/factoryMethod")
    public String testeFactoryMethodPattern(){
        Product product = new ProductDigitalFactory().createProduct(10.0);
        System.out.println(product.getValor());
        return "okay";
    }


    @GET
    @Path("/factoryAbstract")
    public String testeFactoryAbstractPattern(){
        MotoFactory motoFactory = new MotoBigTrailFactory();
        System.out.println(motoFactory.createAmortecedor().getNome());
        System.out.println(motoFactory.createRoda().getAro());
        return "okay";
    }

    @GET
    @Path("/singleton")
    public String testeSingletonPattern(){
        SingletonDatabase singleton = SingletonDatabase.getInstance();
        System.out.println(singleton.connect());

        System.out.println(SingletonDatabase.getInstance().connect());
        return "okay";
    }

//    Padrões Comportamentais

    @GET
    @Path("/observer")
    public String testeObserverPattern(){
        PaymentSystem payment = new PaymentSystem();

        PaymentEmployee paymentEmployee = new PaymentEmployee();
        PaymentEmployee paymentEmployee2 = new PaymentEmployee();

        payment.getEvent().subscribe("NOVEMBER", paymentEmployee);
        payment.getEvent().subscribe("DECEMBER", paymentEmployee2);


        payment.pay("NOVEMBER", 1200.0);
        return "Observer Pattern";
    }

    @GET
    @Path("/strategy")
    public String testeStrategyPattern(){
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyMultiply());
        System.out.println(context.executeStrategy(10.0, 10.0));

        return "Strategy Pattern";
    }

}