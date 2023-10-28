
package lap8.bai1;


public class Lap8Bai1 {
    public static double sum(double... nums) {
        double s = 0;
        for (double item : nums) {
            s += item;

        }
        return s;
    }

    public static double min(double... nums) {
        double m = nums(0);
        for (double item : nums) {
            m = Math.min(m, item);

        }
        return m;
    }

    public static double max(double... nums) {
        double m = nums(0);
        for (double item : nums) {
            m = Math.max(m, item);

        }
        return m;
    }
    public static String toUppreFirstChar(String name){
        String[] ars = name.split("  ");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < ars.length; i++) {
            String item=ars[i];
            if(!item.equals(" ")){
                String ch=item.substring(0, 1).toUpperCase();
                item=ch + item.substring(1).toLowerCase();
                sb.append(item).append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        double resulf = sum(2);
        double max = sum(2);
        double min = sum(2);
        System.out.println("bài 2:");
        System.out.println("resulf:" + resulf);
        max = sum(5, 6, 7, 8);
        System.out.println("resulf:" + resulf);
        min = sum(5, 6, 7, 8, 9, 0, 45, 2);
        System.out.println("resulf:" + resulf);
        min = sum(5, 6, 7, 8, 1, 2);
        System.out.println("resulf:" + resulf);
        System.out.println("bài 1:");
        System.out.println("resulf:" + resulf);
        resulf = sum(5, 6, 7, 8);
        System.out.println("resulf:" + resulf);
        resulf = sum(5, 6, 7, 8, 9, 0, 45, 2);
        System.out.println("resulf:" + resulf);
        resulf = sum(5, 6, 7, 8, 1, 2);
        System.out.println("resulf:" + resulf);
        System.out.println("bài 3:");
        String name="nguyễn văn an";
        String newname=toUppreFirstChar(name);
        System.out.println("new name:"+newname);
        name="trần văn tiên";
        newname=toUppreFirstChar(name);
        System.out.println("new name:"+newname);
    }

    private static double nums(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
