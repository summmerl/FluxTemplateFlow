/**
 *
 *
 * <p>
 * 创建时间：2026年03月06日
 * <p>
 *
 * <p>
 * 修改时间：2026年03月06日
 * <p>
 *
 * @author liuguangda
 * @version v1.0.0
 */
package flux;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 *
 *
 * <p>
 * 创建时间：2026年03月06日
 * <p>
 *
 * <p>
 * 修改时间：2026年03月06日
 * <p>
 *
 * @author liuguangda
 * @version v1.0.0
 */
public class MyAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
        Messages.showInfoMessage("Hello from plugin!", "My Plugin");
    }
}

