package co.com.WordCounter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.WordCounter.userinterfaces.WordCounterPage.NUM_CARACTERES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ContarCaracteres implements Task {

    private final int num_caracteres;

    public ContarCaracteres(int num_caracteres) {
        this.num_caracteres = num_caracteres;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Ensure.that(NUM_CARACTERES).text().isEqualTo(String.valueOf(num_caracteres))
        );




    }

    public static Performable enSwagLabs(int num_caracteres) {

        return instrumented(ContarCaracteres.class, num_caracteres);
    }
}
