package service;

import fileService.TextReader;
import fileService.TextWriter;

public class Collector {
    private TextReader textReader = new TextReader();
    private TextWriter textWriter = new TextWriter();
    private Translator translator = new Translator();
    private Alphabet alphabet = new Alphabet();

    public void translateEngOrRusToMorse(String fileNameToReadEngRus, String fileNameToWriteEngRus, String language) {
        String engOrRusTextToTranslate = textReader.readText(fileNameToReadEngRus);
        switch (language) {
            case "eng":
                engOrRusTextToTranslate = translator.translateToMorse(engOrRusTextToTranslate.toLowerCase(),
                        alphabet.getMorseEnglishAlphabet(), alphabet.getEnglishAlphabet());
                break;
            case "rus":
                engOrRusTextToTranslate = translator.translateToMorse(engOrRusTextToTranslate.toLowerCase(),
                        alphabet.getMorseRussianAlphabet(), alphabet.getRussianAlphabet());
                break;
            default:
                break;
        }
        textWriter.writeText(engOrRusTextToTranslate, fileNameToWriteEngRus);
    }

    public void translateMorseToRusOrEng(String fileNameToReadRusOrEng, String fileNameToWriteRusOrEng, String language) {
        String morseTextToTranslate = textReader.readText(fileNameToWriteRusOrEng);
        switch (language) {
            case "morseToRus":
                morseTextToTranslate = translator.translateToEngOrRus(morseTextToTranslate.toLowerCase(),
                        alphabet.getMorseRussianAlphabet(), alphabet.getRussianAlphabet());
                break;
            case "morseToEng":
                morseTextToTranslate = translator.translateToEngOrRus(morseTextToTranslate.toLowerCase(),
                        alphabet.getMorseEnglishAlphabet(), alphabet.getEnglishAlphabet());
                break;
        }
        textWriter.writeText(morseTextToTranslate, fileNameToReadRusOrEng);
    }
}