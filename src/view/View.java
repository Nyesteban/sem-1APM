package view;

import controller.Controller;
import model.Apple;
import model.Book;
import model.Cake;
import model.Entity;

import java.util.List;

public class View {

    Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void execute() {
        Entity apple = new Apple("red", 500);
        controller.add(apple);

        Entity book = new Book(50, 30);
        controller.add(book);

        Entity cake = new Cake("mango", 1000);
        controller.add(cake);

        Entity book2 = new Book(100, -1);
        controller.add(book2);

        Entity cake2 = new Cake("tiramisu", 200);
        controller.add(cake2);

        List<Entity> entities = controller.getAllWithWeightGreaterThan200();

        for (Entity entity: entities) {
            System.out.println(entity);
        }
    }
}
