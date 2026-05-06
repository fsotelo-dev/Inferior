import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class SettingControllerTest {
    private SettingController settingController;
    private UserManager userManagerTester;
//    private MockStatic<UserManager> mockedStatic;
    @BeforeAll
    static void initToolkit(){
        try{
            Platform.startup(()->{});
        }catch (IllegalStateException e){
        }
    }
    @BeforeEach
    void setup(){
        settingController = new SettingController();

    }
    @Test
    void testHandleUpdate_emptyUsername(){
        TextField inputUsername = new TextField("");

        Label msg = new Label();
        Label current = new Label();

        settingController.handleUpdate(inputUsername, msg, current);
        assertEquals("Username cannot be Empty!", msg.getText());
    }
    @Test
    void testHandleUpdate_emptyPassword(){
        TextField inputPassword = new TextField("");

        Label msg = new Label();
        Label current = new Label();

        settingController.handlePasswordUpdate(inputPassword, msg, current);
        assertEquals("Password cannot be Empty!", msg.getText());
    }





















}




