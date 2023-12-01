
class MenuItem {

    String label;
    Runnable func_to_run;
    Menu subMenu;

    public MenuItem(String label, Runnable func_to_run) {
        this.label = label;
        this.func_to_run = func_to_run;
    }

    public MenuItem(String label, Menu subMenu) {
        this.label = label;
        this.subMenu = subMenu;
    }
}
