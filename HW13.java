import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Rectangle implements Serializable {
    private int number, tl_x, tl_y, br_x, br_y;

    Rectangle() {}

    Rectangle(int number, int tl_x, int tl_y, int br_x, int br_y) {
        this.number = number;
        this.tl_x = tl_x;
        this.tl_y = tl_y;
        this.br_x = br_x;
        this.br_y = br_y;
    }


    public int get_area() {
        int a = Math.abs(br_x - tl_x);
        int b = Math.abs(tl_y - br_y);

        return a*b;
    }


    @Override
    public String toString() {
        return String.format("Rectangle %d: (%d, %d), (%d, %d)", number, tl_x, tl_y, br_x, br_y);
    }
}


// 7
public class HW13 {
    public static void write_file(String filename, Rectangle[] data) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
        oos.writeObject(data);
        oos.close();
    }


    public static Rectangle[] read_file(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        Rectangle[] arr = (Rectangle[]) (ois.readObject());

        System.out.println("Data in " + filename + ":");
        for (Rectangle i : arr) System.out.println(i);
        System.out.println();
        ois.close();

        return arr;
    }
    

    public static void main(String[] args) {
        try {
            Rectangle[] arr = new Rectangle[] {new Rectangle(1, 4, 5, 7, 1),
                                               new Rectangle(2, 3, 4, 5, 0),
                                               new Rectangle(3, 1, 2, 2, -1),
                                               new Rectangle(4, 1, 5, 2, 4)};

            String filename = "rectangles.dat";
            write_file(filename, arr);

            Rectangle[] rects = read_file(filename);
            Rectangle rect = new Rectangle();
            int area = 0, temp_area;

            for (Rectangle i : rects) {
                temp_area = i.get_area();
                if (temp_area > area) {
                    area = temp_area;
                    rect = i;
                }
            }
            System.out.println("Rectangle with largest area:");
            System.out.println(rect);
            System.out.println("Area = " + area);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}