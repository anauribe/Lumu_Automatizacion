package co.com.WordCounter.stepDefinitions;

import co.com.WordCounter.interactions.AbrirPlataforma;
import co.com.WordCounter.tasks.ContarCaracteres;
import co.com.WordCounter.tasks.ContarPalabras;
import co.com.WordCounter.tasks.ObtenerPalabrasRepetidas;
import co.com.WordCounter.tasks.IngresarTexto;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioDeSesionStepDefinition {


    @Dado("{string} ingresa a la pagina WordCounter")
    public void ingresaALaPaginaWordCounter(String actor) {
        theActorCalled(actor).attemptsTo(
                AbrirPlataforma.deWordCounter()
        );

    }
    @Cuando("ella escribe el {string} para validarlo")
    public void ellaEscribeElParaValidarlo(String texto) throws InterruptedException {
       theActorInTheSpotlight().attemptsTo(
                    IngresarTexto.enSwagLabs(texto)
            );
    }

    @Entonces("valida que el numero de palabras correspondan a {int}")
    public void validaQueElNumeroDePalabrasCorrespondanA(Integer num_palabras) throws InterruptedException {
        Thread.sleep(1 * 1000);
        theActorInTheSpotlight().attemptsTo(
                ContarPalabras.enSwagLabs(num_palabras)

        );

    }
    @Entonces("valida que el numero de caracteres correspondan a {int}")
    public void validaQueElNumeroDeCaracteresCorrespondanA(Integer num_caracteres) throws InterruptedException {
        Thread.sleep(1 * 1000);
        theActorInTheSpotlight().attemptsTo(
                ContarCaracteres.enSwagLabs(num_caracteres)

        );


    }

    @Entonces("obtiene las palabras mas repetidas y el numero de repeticiones")
    public void obtieneLasPalabrasMasRepetidasYElNumeroDeRepeticiones() throws InterruptedException {
        Thread.sleep(10 * 2000);
        theActorInTheSpotlight().attemptsTo(

                ObtenerPalabrasRepetidas.fromList(

                ));
    }
    }
