package co.com.WordCounter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.WordCounter.userinterfaces.WordCounterPage.INPUT_TEXTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarTexto implements Task {

    private final String texto;

    public IngresarTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(texto).into(INPUT_TEXTO)
        );
    }

    public static Performable enSwagLabs(String texto) {
        return instrumented(IngresarTexto.class, texto);
    }
}
