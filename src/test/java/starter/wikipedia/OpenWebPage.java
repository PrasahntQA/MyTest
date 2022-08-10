package starter.wikipedia;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class OpenWebPage {
    @CastMember(name = "Wendy")
    Actor wendy;

    @Test
    void openWebPage() {
        wendy.attemptsTo(
                Navigate.toTheHomePage()

        );

    }
    @Test
    void verifyReadWord() {
        wendy.attemptsTo(
                Navigate.toTheHomePage(),
                  Search.byKeyword("Everest"),

                 Ensure.that(DisplayedArticle.read()).isEqualTo("Read")
        );

    }
}
