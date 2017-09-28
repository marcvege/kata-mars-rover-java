public class Math {
    static int modOf(int number, int mod) {
        int remainder = number % mod;
        return (remainder >= 0) ? remainder : remainder + mod;
    }
}
