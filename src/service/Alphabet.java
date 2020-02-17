package service;

public class Alphabet {
    private final char[] englishAlphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1',
            '2', '3', '4', '5', '6', '7', '8', '9', '0', ',', '.', '?'};

    private final String[] morseEnglishAlphabet = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
            "..", ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--",
            " -..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};

    private final char[] russianAlphabet = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л',
            'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ь', 'ы', 'э', 'ю', 'я', '1',
            '2', '3', '4', '5', '6', '7', '8', '9', '0', ',', '.', '?'};

    private final String[] morseRussianAlphabet = new String[]{".-", "-...", ".--", "--.", "-..", ".", ".-.--",
            "...-", "--..", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", ".-.",
            "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", "-..-", "-..-",
            "-.--", "..-..", "..--", ".-.-", ".----", "..---", "...--", "....-", ".....", "-....",
            "--...", "---..", "----.", "-----", "--..--", ".-.-.-", "..--.."};

    public final char[] getRussianAlphabet() {
        return this.russianAlphabet;
    }

    public final String[] getMorseRussianAlphabet() {
        return this.morseRussianAlphabet;
    }

    public final String[] getMorseEnglishAlphabet() {
        return this.morseEnglishAlphabet;
    }

    public final char[] getEnglishAlphabet() {
        return this.englishAlphabet;
    }
}