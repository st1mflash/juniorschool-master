package ru.liga.dcs.lesson06;
//DONE
public class TextUtility01 {
    /**
     * Ищет и возвращает самое длинное слово в предложении.
     * <p>
     * В этом контексте слово определяется как последовательность символов, разделенных пробелами.
     * Если предложение содержит несколько слов одинаковой максимальной длины, возвращается первое из них.
     * Знаки препинания рассматриваются как часть слова.
     * <p>
     *
     * @param sentence предложение, в котором нужно найти самое длинное слово.
     * @return самое длинное слово в предложении. Если предложение пустое или равно null, возвращает пустую строку.
     */
    public static String findLongestWord(String sentence) {
        if(sentence == null) {
            return "";
        }

        String[] arrSentence = sentence.split(" ");
        String resultWord = "";

        for (String elSentence: arrSentence) {
            if(resultWord.length() < elSentence.length()) {
                resultWord = elSentence;
            }
        }

        return resultWord;
    }
}
