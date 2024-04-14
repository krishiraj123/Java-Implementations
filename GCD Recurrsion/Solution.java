class Solution
{
    public static int gcd(int n1,int n2)
    {
        if(n2 != 0)
        {
            return gcd(n2,n1%n2);
        }
        else {
            return n1;
        }
    }
    public static void main(String[] args) {
        System.out.println(gcd(4,0));
    }
}
