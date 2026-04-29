import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignupController {
    private DatabaseFunction dbF;
    private SceneFactory sF;

    private TextField usernameField;
    private PasswordField passwordField;

    public void LoginController(DatabaseFunction dbf, SceneFactory sF){
        this.dbF = dbf;
        this.sF = sF;
    }

//    public Parent createView(){
//        Vbox root = new Vbox(10);
//        root.setpadding(new Insets(20));
//        return root;
//
//    }






}
