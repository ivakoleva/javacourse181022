package bg.clearcode.javacoude181022.example5;

import java.time.Year;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 24.10.2018,
 * a significant bit of leva.bg project.
 */
public enum Country {
    BULGARIA("bg", Year.of(681)),
    ENGLAND("en", Year.of(1066)),
    WALES("cy", Year.of(1282));

    private String languageCode;
    private Year year;

    public String getLanguageCode() {
        return languageCode;
    }

    public Year getYear() {
        return year;
    }

    Country(final String languageCode, final Year year) {
        this.languageCode = languageCode;
        this.year = year;
    }
}
