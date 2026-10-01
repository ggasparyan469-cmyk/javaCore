package chapter7;

 class Outer {
//    int outer_x = 100;;
//
//        void test() {
//            Inner inner = new Inner();
//            inner.display();
//        }
//
//        class Inner {
//
//            void display() {
//                System.out.println("вывод: outer_x = " + outer_x);
//            }
//        }
//     int outer_x = 100;
//
//     void test(){
//         Inner inner = new Inner();
//         inner.display();
//     }
//     class  Inner{
//         int y = 10;
//
//         void display() {
//                System.out.println("вывод: outer_x = " + outer_x);
//            }
//
//            void showy(){
//                System.out.println(y);
//            }
//        }
     int outer_x = 100;

     void test(){
         for (int i = 0; i < 10; i++) {
             class Inner{
                 void display(){
                     System.out.println("вывод: outer_x = " + outer_x);
                 }
             }
             Inner inner = new Inner();
             inner.display();
         }
     }
     }

