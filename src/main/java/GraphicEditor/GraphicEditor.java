package GraphicEditor;

import java.util.Scanner;
import java.util.Vector;

class GraphicEditor {
    Scanner scanner = new Scanner(System.in);
    public void run() {
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        int n, m;
        Vector<String> graphic = new Vector<String>();
        Shape l = new Line();
        Shape r = new Rect();
        Shape c = new Circle();
        boolean a = true;

        while(a) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            n = scanner.nextInt();

            switch(n) {
                case 1 : {
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    m = scanner.nextInt();

                    switch(m) {
                        case 1:
                            graphic.add(l.draw());
                            break;

                        case 2:
                            graphic.add(r.draw());
                            break;

                        case 3:
                            graphic.add(c.draw());
                            break;
                    }
                    break;
                }

                case 2 : {
                    System.out.print("삭제할 도형의 위치 >> ");
                    try {
                        m = scanner.nextInt();
                        graphic.remove(m-1);
                    }
                    catch(java.lang.ArrayIndexOutOfBoundsException e) {
                        System.out.println("삭제할 수 없습니다.");
                    }
                    break;
                }

                case 3 : {
                    for(int i=0; i<graphic.size(); i++) {
                        System.out.println(graphic.get(i));
                    }
                    break;
                }

                case 4 : {
                    System.out.println("beauty을 종료합니다.");
                    a = false;
                    break;
                }
            }
        }
    }
}
