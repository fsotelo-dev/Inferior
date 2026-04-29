/**
 * @author Inferior
 * created: 4/20/26
 * @since Assignment: Default (Template) Project
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
    private DatabaseManager db;

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage){
        db = new DatabaseManager(); //opens creates app.db
        stage.setTitle("Inferior app");
        stage.setScene(SceneFactory.create(SceneType.LOGIN, stage, db));
//        stage.setFullScreen(true);
        stage.show();
    }
    @Override
    public void stop(){
        if(db != null) db.close(); //called when closing window.
    }
}