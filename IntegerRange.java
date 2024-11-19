class Main {
    public static void main(String[] args) {
        int maxRange = Integer.MAX_VALUE;
        int minRange = Integer.MIN_VALUE;
        System.out.println(maxRange);//Max range of Integer (2**31)-1
        System.out.println(minRange);////Min range of Integer-2**31
        
        //Case of Overflow
        System.out.println(maxRange+1);
        //Case of underflow
        System.out.println(minRange-1);
        
    }
}