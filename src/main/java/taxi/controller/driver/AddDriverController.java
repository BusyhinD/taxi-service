package taxi.controller.driver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taxi.lib.Injector;
import taxi.model.Driver;
import taxi.service.DriverService;

public class AddDriverController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxi");
    private final DriverService driverService = (DriverService) injector
            .getInstance(DriverService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/drivers/add.jsp").forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        String password = req.getParameter("password");
        String repeatPassword = req.getParameter("repeat_password");
        if (!password.equals(repeatPassword)) {
            req.setAttribute("errorMsg", "Passwords do not match!");
            req.getRequestDispatcher("/WEB-INF/views/drivers/add.jsp").forward(req, resp);
        }
        String name = req.getParameter("name");
        String licenseNumber = req.getParameter("license_number");
        String login = req.getParameter("login");
        Driver driver = new Driver(name, licenseNumber, login, password);
        driverService.create(driver);
        resp.sendRedirect(req.getContextPath() + "/drivers/add");
    }
}
