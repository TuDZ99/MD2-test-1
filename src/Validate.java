import java.util.List;
import java.util.Scanner;

public class Validate implements Vali {

    @Override
    public void add(List<Singer> list) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap tuoi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap id");
        int id = Integer.parseInt(scanner.nextLine());

        Singer s = new Singer(name, age, id);
        list.add(s);

    }

    @Override
    public void display(List<Singer> list) {
        for (Singer o : list){
            System.out.println(o);
        }

    }

    @Override
    public void remove(List<Singer> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if (j == i){
                list.remove(j);
                break;
            }
        }
    }

    @Override
    public void edit(List<Singer> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if (j == i){
                Scanner scanner =new Scanner(System.in);
                System.out.println("nhap ten");
                String name = scanner.nextLine();
                System.out.println("nhap tuoi");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap id");
                int id = Integer.parseInt(scanner.nextLine());

                list.get(i).setName(name);
                list.get(i).setAge(age);
                list.get(i).setId(id);
                break;
            }
        }
    }

    @Override
    public void detail(List<Singer> list, int i){
        for (int j = 0; j < list.size(); j++) {
            if (j == i){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhap ID");
                int id = Integer.parseInt(scanner.nextLine());
                list.get(i).setId(id);
                break;
            }

        }
    }
}
