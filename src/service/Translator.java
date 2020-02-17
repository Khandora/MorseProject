package service;

public class Translator {

    public String translateToMorse(String textToTranslate, String[] morseAlphabet, char[] rusOrEngAlphabet) {
        StringBuilder translatedText = new StringBuilder();
        for(int i = 0; i < textToTranslate.length(); i++) {
            int indexOfEnglishAlphabet = textToTranslate.charAt(i);
            for(int j = 0; j < rusOrEngAlphabet.length; j++) {
                if (rusOrEngAlphabet[j] == indexOfEnglishAlphabet && i > 0) {
                    translatedText.append(",").append(morseAlphabet[j]);
                } else if (rusOrEngAlphabet[j] == indexOfEnglishAlphabet && i == 0) {
                    translatedText = new StringBuilder(morseAlphabet[j]);
                }
            }
        }
        return translatedText.toString();
    }

    public String translateToEngOrRus(String morseText, String[] morseAlphabet, char[] rusOrEngAlphabet) {
        StringBuilder translatedText = new StringBuilder();
        String[] morseTextToTranslate = morseText.split(",[ ]*");
        for (String s : morseTextToTranslate) {
            for (int j = 0; j < morseAlphabet.length; j++) {
                if (s.equals(morseAlphabet[j])) {
                    translatedText.append(rusOrEngAlphabet[j]);
                }
            }
        }
        return translatedText.toString();
    }
}