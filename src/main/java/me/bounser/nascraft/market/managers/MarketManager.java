package me.bounser.nascraft.market.managers;

import me.bounser.nascraft.database.Data;
import me.bounser.nascraft.market.resources.Category;
import me.bounser.nascraft.market.unit.Item;
import me.bounser.nascraft.config.Config;

import java.util.ArrayList;
import java.util.List;

public class MarketManager {

    private final List<Item> items = new ArrayList<>();
    private final List<Category> categories = new ArrayList<>();

    private boolean active = true;

    private static MarketManager instance = null;

    public static MarketManager getInstance() { return instance == null ? new MarketManager() : instance; }

    private MarketManager() {
        instance = this;
        setupItems();
    }

    public void setupItems() {

        for (String categoryRef : Config.getInstance().getCategories()) {

            Category category = new Category(categoryRef);
            categories.add(category);
        }
        for (Category category : categories) {

            for (String mat : Config.getInstance().getAllMaterials(category.getName())) {

                Item item = new Item(mat, Config.getInstance().getAlias(mat, category.getName()), category);
                items.add(item);
                category.addItem(item);
            }
        }

        Data.getInstance().setupDatabase(categories);

        TasksManager.getInstance();
        GraphManager.getInstance();
    }

    public Item getItem(String material) {
        for (Item item : items) { if (item.getMaterial().equalsIgnoreCase(material)) { return item; } }
        return null;
    }

    public List<Category> getCategories() { return categories; }

    public List<Item> getAllItems() { return items; }

    public void stop() { active = false; }
    public void resume() { active = true; }

    public boolean getState() { return active; }

}
