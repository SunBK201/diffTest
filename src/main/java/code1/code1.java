package code1;

import code2.codes;

//这是注释1的 Honor 修改版本1
public class code1 {
    //new comment
    public static void main(String[] args) {
        System.out.println("This is a test code.");
    }

    /**
     * Innercode1
     */
    public class Innercode1 {
        public int sub(int a, int b) {
            return new codes().sub(2, 2);
        }
    }
}
