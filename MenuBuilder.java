
public class MenuBuilder {
    public static void demo() {
        Menu demoMenu = new Menu("Demo Menu");
        Menu subMenu = new Menu("Sub Menu");

        demoMenu.addItem(new MenuItem("OpenSubMenu", subMenu::display ));
        demoMenu.addItem(new MenuItem("Option 2", MenuBuilder::veryImportantFunc));
        demoMenu.addItem(new MenuItem("Option 3", () -> System.out.println("Option 3 was selected")));

        subMenu.addItem(new MenuItem("Sub Option 1", () -> System.out.println("Sub Option 1 was selected")));
        subMenu.addItem(new MenuItem("Sub Option 2", () -> System.out.println("Sub Option 2 was selected")));
        subMenu.addItem(new MenuItem("Sub Option 3", () -> System.out.println("Sub Option 3 was selected")));

        demoMenu.display();
    }

    public static void veryImportantFunc() {
        System.out.println("Very important function is completed");
    }

    public static void main(String[] args) {
        MenuBuilder.demo();
    }
}