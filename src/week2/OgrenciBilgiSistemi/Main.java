package week2.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("mahmut hoca","5555","TRH");

        Teacher teacher2 = new Teacher("Graham Bell","786343","FZK");

        Teacher teacher3 = new Teacher("Külyutmaz","123213","BIO");



        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(teacher);

        Course fizik = new Course("fizik","102","FZK");
        fizik.addTeacher(teacher2);

        Course biyo = new Course("biyoloji","103","BIO");
        biyo.addTeacher(teacher3);

        Student s1 = new Student(tarih,fizik,biyo,"İnek Şaban","124","4");
        s1.addBulkExamNote(100,100,100,100,100,100);
        s1.isPass();

        Student s2 = new Student(tarih,fizik,biyo,"Güdük necmi","123","2");
        s2.addBulkExamNote(50,50,50,50,50,50);
        s2.isPass();
    }
}
