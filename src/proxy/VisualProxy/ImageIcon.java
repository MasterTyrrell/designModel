package proxy.VisualProxy;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.URL;

public class ImageIcon implements Icon{

    private int width;
    private int height;
    private URL url;
    private String msg;

    public ImageIcon(URL url,String msg){
        this.url = url;
        this.msg = msg;
        getUrlWidthAndHeight(url);
    }

    private void getUrlWidthAndHeight(URL url) {
        try{
            InputStream is = url.openStream();
            BufferedImage image= ImageIO.read(is);
            this.width = image.getWidth();
            this.height = image.getHeight();
        }catch (Exception e){
            this.width = 800;
            this.height = 600;
        }
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        //.........
    }
}
