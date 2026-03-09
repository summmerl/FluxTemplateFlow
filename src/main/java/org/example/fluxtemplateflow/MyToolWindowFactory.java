package org.example.fluxtemplateflow;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBPanel;
import com.intellij.ui.content.ContentFactory;

import javax.swing.JButton;
import java.util.Random;

public class MyToolWindowFactory implements ToolWindowFactory {

    @Override
    public boolean shouldBeAvailable(Project project) {
        return true;
    }

    @Override
    public void createToolWindowContent(Project project, ToolWindow toolWindow) {
        MyToolWindow myToolWindow = new MyToolWindow();
        var content = ContentFactory.getInstance().createContent(myToolWindow.getContent(), null, false);
        toolWindow.getContentManager().addContent(content);
    }

    public static class MyToolWindow {
        private final JBPanel<?> content;

        public MyToolWindow() {
            content = new JBPanel<>();
            JBLabel label = new JBLabel("The random number is: ?");
            content.add(label);
            JButton button = new JButton("Shuffle");
            button.addActionListener(e ->
                    label.setText("The random number is: " + new Random(System.currentTimeMillis()).nextInt(1000))
            );
            content.add(button);
        }

        public JBPanel<?> getContent() {
            return content;
        }
    }
}
