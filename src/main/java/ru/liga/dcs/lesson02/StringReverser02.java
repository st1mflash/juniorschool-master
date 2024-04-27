package ru.liga.dcs.lesson02;
//DONE

public class StringReverser02 {
    
    /**
     * Переворачивает порядок слов в предложении.
     *
     * @param sentence строка, в которой нужно перевернуть слова.
     * @return строка с перевернутыми словами.
     */
    public String reverseWords(String sentence) {
        if(sentence == null) {
            throw new NullPointerException();
        }
        String[] arrSentence = (sentence + " .").split(" ");
        StringBuilder strResult = new StringBuilder();

        for(int i = arrSentence.length - 1; i >= 0; i--) {
            strResult.append(" ").append(arrSentence[i]);
        }
        strResult = new StringBuilder(strResult.substring(3));
        return strResult.toString();
    }
}
