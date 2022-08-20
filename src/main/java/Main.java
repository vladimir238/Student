public class Main {
    public static void main(String[] args) {
        StudyProfile st =StudyProfile.MEDICINE;
        System.out.println(st);
        University un1= new University("MGU12","Московский государственный унивеситет","МГУ",1755, StudyProfile.MANYPROFILE);
        University un2= new University("MGTU34","Московский государственный технологический унивеситет им Баумана ","МГТУ им Баумана ",1830, StudyProfile.TECHNOLOGIE);
        Student st1=new Student("Иванов Степан Сергеевич","MGU12",123,4.2F);
        Student st2=new Student("Сидоров Анатолий Владимирович","MGTU34",56,3.5F);
        System.out.println(un1);
        System.out.println(st1);
    }
}
