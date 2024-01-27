package me.bounser.nascraft.discord.images;

import me.bounser.nascraft.Nascraft;
import me.bounser.nascraft.config.Config;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class ImagesManager {

    private static ImagesManager instance;

    public static ImagesManager getInstance() { return instance == null ? instance = new ImagesManager() : instance; }


    public BufferedImage getImage(String identifier) {

        FileConfiguration items = Config.getInstance().getItemsFileConfiguration();

        if (items.contains("items." + identifier + ".icon")) {

            BufferedImage image = null;
            String imageName = items.getString("items." + identifier + ".icon") + ".png";
            String imagePath = Nascraft.getInstance().getDataFolder().getPath() + "/images/" + imageName;

            try (InputStream input = Files.newInputStream(new File(imagePath).toPath())) {

                image = ImageIO.read(input);

            } catch (IOException e) {
                Nascraft.getInstance().getLogger().info("Unable to read image: " + imageName);
            } catch (IllegalArgumentException e) {
                Nascraft.getInstance().getLogger().info("Invalid argument for image: " + imageName);
            }

            return image;
        }

        if (items.contains("items." + identifier + ".item-stack.type")) {

            BufferedImage image = null;
            String imageName = items.getString("items." + identifier + ".item-stack.type").toLowerCase() + ".png";
            String imagePath = "1-20-1-materials/" + imageName;

            try (InputStream input = Nascraft.getInstance().getResource(imagePath)) {
                if (input != null) {
                    image = ImageIO.read(input);
                } else {
                    Nascraft.getInstance().getLogger().info("Unable to find image: " + imageName);
                }
            } catch (IOException e) {
                Nascraft.getInstance().getLogger().info("Unable to read image: " + imageName);
            } catch (IllegalArgumentException e) {
                Nascraft.getInstance().getLogger().info("Invalid argument for image: " + imageName);
            }

            return image;

        }

        BufferedImage image = null;
        String imageName = identifier.replaceAll("\\d", "").toLowerCase() + ".png";
        String imagePath = "1-20-1-materials/" + imageName;

        try (InputStream input = Nascraft.getInstance().getResource(imagePath)) {
            if (input != null) {
                image = ImageIO.read(input);
            } else {
                Nascraft.getInstance().getLogger().info("Unable to find image: " + imageName);
            }
        } catch (IOException e) {
            Nascraft.getInstance().getLogger().info("Unable to read image: " + imageName);
        } catch (IllegalArgumentException e) {
            Nascraft.getInstance().getLogger().info("Invalid argument for image: " + imageName);
        }

        return image;

    }

}
