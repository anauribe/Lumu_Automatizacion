package co.com.WordCounter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.WordCounter.userinterfaces.WordCounterPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ContarPalabras implements Task {

    private final int num_palabras;

    public ContarPalabras(int num_palabras) {
        this.num_palabras = num_palabras;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Ensure.that(NUM_PALABRAS).text().isEqualTo(String.valueOf(num_palabras))
        );
    }

    public static Performable enSwagLabs(int num_palabras) {

        return instrumented(ContarPalabras.class, num_palabras);
    }
}
