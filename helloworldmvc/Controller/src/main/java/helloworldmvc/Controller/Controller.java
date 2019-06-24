package helloworldmvc.Controller;

import helloworldmvc.model.IModel;
import helloworldmvc.model.Model;
import helloworldmvc.view.IView;
import helloworldmvc.view.View;

public class Controller {

    private IModel Model;
    private IView View;

    public Controller(IModel model, IView view) {
        Model = model;
        View = view;
    }

    public void run () {
        Controller controller = new Controller(new Model(), new View());
        controller.View.display(controller.Model.getMessage());
    }
}
