
package helper;


public class Helper {
    public static int getRandomInteger() {
        return (int) (Math.random() * 10000);
    }
    public static String getRandomText(){
        return "category-DraganaV-" + getRandomInteger();
    }
    public static String getRandomEmail() {
        return getRandomText() + "@gmail.com";
    }
    
}
