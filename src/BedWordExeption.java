public class BedWordExeption extends Exception{
    public BedWordExeption (String description){
        /*Создаем конструктор*/
        /*передаем description в родительский класс Exception*/
        super(description);
    }
}
