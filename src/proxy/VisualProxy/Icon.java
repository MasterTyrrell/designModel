package proxy.VisualProxy;

import java.awt.*;

public interface Icon {

    int getIconWidth();

    int getIconHeight();

    void paintIcon(final Component c,Graphics g,int x,int y);
}
