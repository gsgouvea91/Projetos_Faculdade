
import com.aspose.pdf.Document;
import com.aspose.pdf.ExcelSaveOptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Load PDF document
        Document document = new Document("Teste.pdf");
        // Instantiate ExcelSave Option object
        ExcelSaveOptions excelsave = new ExcelSaveOptions();
        // Save the output to XLS format
        document.save("ConvertedFile.csv", excelsave);
    }
    
}
