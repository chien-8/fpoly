/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author HI
 */


    class Test {

        void method(int[] x) {
            x[0] = 5;
            x[1] = 5;
        }

        public static void main(String[] args) {
            Test o = new Test();
            int[] x = {1, 1};
            o.method(x);
            System.out.printf("x=%d, y=%d", x[0], x[1]);
        }
    }

