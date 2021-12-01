import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main
{
    // Задание №1
    public static <T> List<T> convertToList(T[] array)
    {
        return List.of(array);
    }

    // Задание №2
    public static class AnyType<T>
    {
        private T[] array;

        public AnyType(T[] array)
        {
            this.array = array;
        }

        // Задание №3
        public T get(int index) throws Exception
        {
            if (index >= 0 && index < array.length)
                return array[index];
            else throw new Exception("error index");
        }

        public T[] getArray() {return array; }
    }

    // Задание №4
    public static <T> List<T> AnyTypeToList(AnyType<T> catalog)
    {
        return List.of(catalog.getArray());
    }

    // Задание №5
    public static class Solution<T>
    {
        public ArrayList<T> newArrayList(ArrayList<T> arrayList)
        {
            return new ArrayList<>(arrayList);
        }

        public HashSet<T> newHashSet(HashSet<T> hashSet)
        {
            return new HashSet<>();
        }
    }

    public static <K, V> HashMap<K, V> newHashMap(HashMap<K, V> hashMap)
    {
        return new HashMap<>();
    }

    public static void main(String[] args) throws Exception
    {
        // Задание №1
        Integer[] array = {1, 2, 3};
        List<Integer> list = convertToList(array);
        for (int elem : list)
            System.out.print(elem + " ");
        System.out.println();

        // Задание №2
        AnyType<String> anyType = new AnyType<>(new String[]{"a", "b", "c"});

        // Задание №3
        System.out.println(anyType.get(0));

        // Задание №4
        List<String> stringList = AnyTypeToList(anyType);
        for (String elem : stringList)
            System.out.print(elem + " ");
        System.out.println();

        // Задание №5
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Solution<Integer> solution1 = new Solution<>();
        ArrayList<Integer> otherArrayList = solution1.newArrayList(arrayList);

        HashSet<Double> hashSet = new HashSet<>();
        hashSet.add(1.1);
        hashSet.add(2.2);
        hashSet.add(3.3);

        Solution<Double> solution2 = new Solution<>();
        HashSet<Double> otherHashSet = solution2.newHashSet(hashSet);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);

        HashMap<String, Integer> otherHashMap = newHashMap(hashMap);
    }
}