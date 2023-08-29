package exam02;

public class Outer {
    public Calculator cal = new Calculator() {
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };

    public void method(){
        class Inner {
            void method() {
                System.out.println("지역 내부 클래스");
            }
        }
        Inner in = new Inner();
        in.method();
    }
    /*
    public void method2() {
        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        int result = cal.add(10,20);
        System.out.println(result);
    }*/



    public Calculator method2() {
        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        return cal;
    }
    /*
    public Calculator method2() {
        return new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        }
    }
    */

    public Calculator method3(int num3) {
        return new Calculator() {
            public int add (int num1, int num2) {
                return num1 + num2 + num3;
            }
        };
    }
}
