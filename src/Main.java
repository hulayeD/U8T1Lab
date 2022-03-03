import java.util.Arrays;
public class Main
{
    public static void main(String [] args)
    {
//        String[][] seatingChart= {{"Abby","Don","George","Kim"},{"Brian","Elenor","Harry","Lenny"},{"Cathy","Fred","Jill","Matt"}};
//        seatingChart[1][2]="Paul";
//        for(String[] h:seatingChart)
//        {
//            System.out.println(Arrays.toString(h));
//        }
//        String name= seatingChart[2][3];
//        seatingChart[2][3]=seatingChart[0][0];
//        seatingChart[0][0]=name;
//
//
//        for(String[] h:seatingChart)
//        {
//            System.out.println(Arrays.toString(h));
//        }
//        String[] values= seatingChart[0];
//        seatingChart[0]=seatingChart[1];
//        seatingChart[1]=values;
//        for(String[] h:seatingChart)
//        {
//            System.out.println(Arrays.toString(h));
//        }System.out.println(seatingChart[0][2] + seatingChart[2][0]);

        //PART 2
        int[][] arr1=new int[2][3];
        int [][] arr2=new int[3][2];
        for(int[] brit:arr1)
        {
            System.out.println(Arrays.toString(brit));
        }
        for(int[] brit:arr2)
        {
            System.out.println(Arrays.toString(brit));
        }
        arr1[0][0]=1;
        arr1[0][1]=2;
        arr1[0][2]=3;
        arr1[1][0]=4;
        arr1[1][1]=5;
        arr1[1][2]=6;
        for(int[] brit:arr1)
        {
            System.out.println(Arrays.toString(brit));
        }
        arr2[0][0]=1;
        arr2[0][1]=4;
        arr2[1][0]=2;
        arr2[1][1]=5;
        arr2[2][0]=3;
        arr2[2][1]=6;
        for(int[] brit:arr2)
        {
            System.out.println(Arrays.toString(brit));
        }
        System.out.println(arr1[0][2] + arr2[2][0]);
    }

}
