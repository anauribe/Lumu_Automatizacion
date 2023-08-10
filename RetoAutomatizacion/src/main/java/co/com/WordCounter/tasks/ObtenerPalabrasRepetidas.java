package co.com.WordCounter.tasks;

import co.com.WordCounter.userinterfaces.WordCounterPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ObtenerPalabrasRepetidas implements Task {
    String linkText2 = null;
    String linkText = null;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(WordCounterPage.ObtenerPalabrasRepetidas.LIST_CONTAINER)

        );

        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ListOfWebElementFacades repeticiones = WordCounterPage.ObtenerPalabrasRepetidas.NUM_REPETICIONES.resolveAllFor(actor);
        ListOfWebElementFacades palabras = WordCounterPage.ObtenerPalabrasRepetidas.PALABRAS_REPETIDAS.resolveAllFor(actor);


        for (int i = 0; i < palabras.size(); i++) {

            Serenity.recordReportData().withTitle("Palabra Ingresada").andContents("palabra: " + palabras.get(i).getText() + " :" + repeticiones.get(i).getText());

        }

        }

    public static ObtenerPalabrasRepetidas fromList() {
        return instrumented(ObtenerPalabrasRepetidas.class);
    }
}