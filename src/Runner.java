import service.Collector;

public class Runner {
    private final static String engLang = "eng";
    private final static String rusLang = "rus";
    private final static String morseToRus = "morseToRus";
    private final static String morseToEng = "morseToEng";

    public static void main(String[] args) {
        String filePathToReadEnglish = "englishText.txt";
        String filePathToWriteEnglish = "englishFileToWrite.txt";
        String filePathToReadRussian = "russianText.txt";
        String filePathToWriteRussian = "russianFileToWrite.txt";
        Collector collector = new Collector();
        collector.translateEngOrRusToMorse(filePathToReadEnglish, filePathToWriteEnglish, engLang);
        collector.translateMorseToRusOrEng(filePathToReadEnglish, filePathToWriteEnglish, morseToEng);
        collector.translateEngOrRusToMorse(filePathToReadRussian, filePathToWriteRussian, rusLang);
        collector.translateMorseToRusOrEng(filePathToReadRussian, filePathToWriteRussian, morseToRus);
    }
}