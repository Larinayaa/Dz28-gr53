public class Word {
    String value;
    String translation;
    public Word(String value, String translation) {
        this.value = value;
        this.translation = translation;
    }
    public  String toString(){
        return String.format("Слово: %s Перевод: %s",value, translation);
    }
}