public class Class17Part2 {
    public static Class17Part1 someMethod(Class17Part1 obj) {
        //ans is just a reference data type, so it just points
        //to obj. It doesn't have its own memory slot.
        Class17Part1 ans = obj;
        ans.increment();
        return ans;
    }

    public static void main(String[] args) {
        Class17Part1 x = new Class17Part1(2);
        Class17Part1 y = new Class17Part1(7);
        Class17Part1 a = y;
        x = someMethod(y);
        a = someMethod(x);
    }
}
