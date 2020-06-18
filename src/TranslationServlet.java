import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Translation", urlPatterns = "/translate")
public class TranslationServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String search = req.getParameter("search");
		String find   = Translate.getInstance().find(search);

		PrintWriter writer = resp.getWriter();
		writer.println("<html>");

		if (find == null) {
			writer.println("Not Found");
		}else{
			writer.println("Word: " + search + "<br />");
			writer.println("Result: " + find);
		}

		writer.println("</html>");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
