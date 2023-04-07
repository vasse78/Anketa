
public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        FormDate formDate = new FormDate ();
        formDate.day = 13;
        formDate.month = 6;
        formDate.year = 1999;
        post.birthday = formDate;


    }
}