public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        long ret =1;
        for(int i = 1 ; i <= n ; i++)
            ret*=i;
        return ret;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        long n1=1,n2=1,n3=2;
        for(int i = 3 ; i <= n ; i++)
        {
            n3=n2+n1;
            n1=n2;
            n2=n3;
        }
        if(n==1 || n==2 )
            return 1L;
        return n3;
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        StringBuilder ret = new StringBuilder();
        for(int i = word.length()-1; i>=0;i--)
        {
            ret.append(word.charAt(i));
        }
        return ret.toString();
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line1) {
        String line ="";
        for(int i =0; i< line1.length();i++)
        {
            if(line1.charAt(i)!=' ')
                line+=line1.charAt(i);
        }
        for(int i = 0 ; i <= line.length()/2; i++)
        {
            if(Character.toUpperCase(line.charAt(i))!=Character.toUpperCase(line.charAt(line.length()-i-1)))
                return false;
        }
        return true;
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        char [][] ret = new char[str1.length()][str2.length()];
        for(int i = 0 ;i <str1.length();i++) {
            for(int j = 0 ; j <str2.length();j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                    ret[i][j]='*';
                else
                    ret[i][j]=' ';
            }
        }
        return ret;
    }
}
