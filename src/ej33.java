public class ej33 {
    public static int suma (int n){
        if(n==1){
            return 1;
        }else {
            return n + suma(n-1);
        }
    }

    public static int suma2 (int n){
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}
