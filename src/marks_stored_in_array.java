public class marks_stored_in_array {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]= 97; //phy
        marks[1]= 98;// che
        marks[2]= 95;// maths
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
        // or by loop
        for (int i = 0;i<3;i++){ // 3 is the size of array/list
            System.out.println(marks[i]);
        }
    }

}