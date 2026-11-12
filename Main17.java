class Main17 {
    public static void main(String[] args) {
        int n = 7, c = 0;

        for(int i = 1; i <= n; i++)
            if(n % i == 0) c++;

        if(c == 2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}