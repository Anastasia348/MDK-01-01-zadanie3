
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            try { while (true) {
                System.out.println("������� ������ ���������:");
                long x = in.nextLong();
                long a = x;
                System.out.println("������� ������ ���������:");
                long y = in.nextLong();
                System.out.println("����� �������� ������: 1, ��� 2?");
                int b = in.nextInt();
                if (b == 1) {
                    long c = 1;
                    while (c <= y - 1) {
                        x = x + a;
                        c++;
                    }
                    System.out.println("������������(������ 1): \n" + x + "\n");
                } else if (b == 2) {
                    for (int i = 1; i <= y - 1; i++) {
                        x = x + a;
                    }
                    System.out.println("������������(������ 2): \n" + x + "\n");
                } else { System.out.println("� ������ ������� ������� ���������� 1 ��� 2 \n");}
            }
            } catch (Exception e){
                System.out.println("��������� �������� ���� �����");
            }
        }
    }
