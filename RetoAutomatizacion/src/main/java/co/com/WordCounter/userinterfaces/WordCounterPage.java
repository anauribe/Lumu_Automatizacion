package co.com.WordCounter.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WordCounterPage {

    public static final Target INPUT_TEXTO =
            Target.the("Input donde se ingresa el texto").located(By.id("box"));

    public static final Target NUM_PALABRAS =
            Target.the("Cantidad de palabras del texto").located(By.id("word_count"));

    public static final Target NUM_CARACTERES =
            Target.the("Cantidad de letras del texto").located(By.id("character_count"));


    public interface ObtenerPalabrasRepetidas {
        Target LIST_CONTAINER = Target.the("Keyword Density List Container").locatedBy("#kwd-accordion-data");
      Target NUM_REPETICIONES = Target.the("Keyword Density List Container").locatedBy("//div[@id='kwd-accordion-data']/a/span[1]");
      Target PALABRAS_REPETIDAS = Target.the("Keyword Density List Container").locatedBy("//div[@id='kwd-accordion-data']/a/span[2]");



    }


    private WordCounterPage() {
    }
}
