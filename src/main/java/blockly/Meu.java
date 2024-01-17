package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Meu {

public static final int TIMEOUT = 300;

/**
 *
 * @author Gilberto De Brito Amorim
 * @since 16/01/2024, 16:41:59
 *
 */
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    cronapi.database.Operations.query(Var.valueOf("teste.entity.Actor"),Var.valueOf("select \n	a, \n	a.firstName, \n	a.lastName \nfrom \n	Actor a"));
    System.out.println(item.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

