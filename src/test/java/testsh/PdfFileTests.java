package testsh;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.hamcrest.MatcherAssert.assertThat;

import static utilsh.Files.getPdf;


public class PdfFileTests {

    @Test
    void pdfTest() throws IOException {
        String pdfFilePath = "./src/test/resources/Data.pdf";
        String expectedData = "IV DATA CLOUD";

        PDF pdf = getPdf(pdfFilePath);
        assertThat(pdf, PDF.containsText(expectedData));
    }
}
