import java.util.Random;

public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        StringBuilder password= new StringBuilder();
        Random random = new Random();
        for(int i =1 ; i<= length ;i++)
        {
            password.append((char) (random.nextInt(26) + 'a'));
        }
        return password.toString();
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {
        if(length<3)
        {
            throw new Exception();
        }
        StringBuilder password= new StringBuilder();
        Random random = new Random();
        password.append((char) (random.nextInt(10)+'0'));
        password.append((char) (random.nextInt(15)+'!'));
        password.append((char) (random.nextInt(26)+'a'));
        for(int i =3 ; i< length ;i++)
        {
            int type = random.nextInt(3)+2;
            char cha = switch (type) {
                case 2 -> (char) (random.nextInt(26) + 'a');
                case 3 -> (char) (random.nextInt(10) + '0');
                case 4 -> (char) (random.nextInt(15) + '!');
                default -> ' ';
            };
            password.append(cha);
        }
        return password.toString();
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {
        long n1=0,n2=1,n3=1;
        while(n3<=n)
        {
            n3=n2+n1;
            n1=n2;
            n2=n3;
            if(n3 + Long.bitCount(n3) == n)
                return true;
        }
        return false;
    }
}
