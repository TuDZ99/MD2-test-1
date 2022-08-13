import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vali v = new Validate();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Create Singer");
        System.out.println("2.Show List Singer");
        System.out.println("3.Delete Singer");
        System.out.println("4.Update Singer");
        System.out.println("5.Detail Singer");
        List<Singer> list = new ArrayList<>();
        list.add(new Singer("Soái Mạnh Hùng",19,1));
        list.add(new Singer("Đạt Gờ",20,2));
        list.add(new Singer("Văn Bằng Ảo",18,3));
        list.add(new Singer("Đức Mõm",24,4));
        list.add(new Singer("Cù Lao Dũng",17,5));
        while (true){
            int index = 0;
            int choice = 0;

            System.out.println("Lựa chọn đầu vào: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    v.add(list);
                    break;
                case 2:
                    v.display(list);
                    break;
                case 3:
                    System.out.println("Nhập để loại bỏ ca sĩ hết thời: ");
                    index = Integer.parseInt(scanner.nextLine());
                    v.remove(list,index);
                    break;
                case 4:
                    System.out.println("Nhập để chỉnh sửa: ");
                    index = Integer.parseInt(scanner.nextLine());
                    v.edit(list,index);
                    break;
                case 5:
                    System.out.println("Nhập id của ca sĩ để hiển thị: ");
                    index = Integer.parseInt(scanner.nextLine());
                    v.detail(list,index);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
