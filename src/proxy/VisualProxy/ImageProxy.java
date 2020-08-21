package proxy.VisualProxy;

import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {

    private ImageIcon imageIcon;
    private URL url;
    private Thread retrievalThread;
    private boolean retrievalFlag = false;

    public ImageProxy(URL url){
        this.url = url;
    }

    @Override
    public int getIconWidth() {
        if(imageIcon!=null){
            return imageIcon.getIconWidth();
        }
        return 600;
    }

    @Override
    public int getIconHeight() {
        if(this.imageIcon!=null){
            return this.imageIcon.getIconHeight();
        }
        return 800;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if(this.imageIcon!=null){
             this.imageIcon.paintIcon(c,g,x,y);
        }else{
            g.drawString("Loading CD over,Please wait...",x+300,y+190);
            if(!retrievalFlag){
                retrievalFlag=true;
                retrievalThread = new Thread(()->{
                        try {
                            imageIcon = new ImageIcon(url, "CD over");
                            c.repaint();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                });
                retrievalThread.start();
            }
        }
    }


}
