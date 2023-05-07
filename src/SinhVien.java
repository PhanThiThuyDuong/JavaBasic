public class SinhVien {
    //Khai báo biến local
    public void bienLocal(){
        String tenA = "Nguyễn Văn A";
        int tuoiA = 20;
        System.out.println("In sinh vien bien Local");
        System.out.println("Ten: "+ tenA);
        System.out.println("Tuổi: "+ tuoiA);
    }
    //Khai báo biến Public
    public SinhVien(){
    }
    public String tenB;
    private  int tuoiB;
    public SinhVien(String tenB){
        this.tenB = tenB;
    }
    public void setTuoiB(int tuoiB){
        this.tuoiB = tuoiB;
    }
    public void showStudentPublic(){
        System.out.println("In sinh vien bien public");
        System.out.println("Ten :" + tenB);
        System.out.println("Tuoi :" + tuoiB);
    }
    //Khai báo sinh viên biến static
    public static String tenC ="Nguyen Van C";
    public static int tuoiC = 23;
    public static void main(String[] args){
        // Goi bien Local
        SinhVien svLocal = new SinhVien();
        svLocal.bienLocal();
        // Goi biến public
        SinhVien sv = new SinhVien ("Nguyen Van B");
        sv.setTuoiB(22);
        sv.showStudentPublic();
        // Gọi biến static
        System.out.println("In sinh vien bien static");
        System.out.println("Ten:" + SinhVien.tenC);
        System.out.println("Tuoi: " + SinhVien.tuoiC);
    }
}
