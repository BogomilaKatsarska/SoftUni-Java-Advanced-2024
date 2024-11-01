package JavaAdvanced;

public class L09_Demo {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "az";
        names[1] = "ti";
        names[2] = "toi";
        print(names);

        print("az", "ti", "toi");
    }

    // 1.method can accept only 1 var arg
    // 2. var args can be used only in methods
    // 3. var args is places last in the signature of the method
    //i.e.: private static void print(String country, String... cities) {
    // 4. var args can accept 0-n values (may have none)
    private static void print(String... names) {
        for (String name: names) {
            System.out.println(name);
        }
    }
}
