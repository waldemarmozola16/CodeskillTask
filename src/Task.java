public class Task {
    public static void main(String args[]) {

        String result = DisplayFormatDate("2019-02-03 16:00", "2019-02-03 16:30");
        System.out.println(result);
    }

    public static String DisplayFormatDate(String date1, String date2){
        int[] crop = new int[]{4,7, 10,13, 16};
        String temp = "";
        for(int i = 0; i < crop.length; i++){
            if(!GetPart(date1,crop[i]).equals(GetPart(date2, crop[i]))){
                temp += " 00, 30";
                break;
            }
            temp = GetPart(date1,crop[i]);
        }

        return temp;
    }


    public static String GetPart(String date, int crop){
        return  date.substring(0, crop);
    }
}
