package org.btik.platformioplus;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

/**
 * @author lustre
 * @since 2022/10/7 21:44
 */
public class PioPlusToolWindowFactory implements ToolWindowFactory {

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        PioPlusToolWindow pioPlusToolWindow = new PioPlusToolWindow(toolWindow);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(pioPlusToolWindow.getContent(), "Tasks", false);
        toolWindow.getContentManager().addContent(content);
    }
}
