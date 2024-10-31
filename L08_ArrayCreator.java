package JavaAdvanced;

import java.lang.reflect.Array;

public class L08_ArrayCreator {
    // access modifier + staic + <generic param> + return type + name () {}

    public static <T> T[] create(int length, T item){
        T[] array =(T[]) Array.newInstance(item.getClass(), length);
        return null;
    }

    public static <T> T[] create(Class<T> clazz, int length, T item){
        T[] array = (T[]) Array.newInstance(clazz, length);
        for (int i=0; i< length; i++){
            array[i] = item;
        }
        return array;
    }
}
