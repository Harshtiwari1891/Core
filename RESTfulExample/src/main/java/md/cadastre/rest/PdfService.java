package md.cadastre.rest;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/pdf")
public class PdfService {

	@GET
	@Path("/{entity}/{fileName}")
	@Produces("application/pdf")
	public Response getFile(@PathParam("entity") String entity, @PathParam("fileName") String fileName) {
		String filePath = "C:\\rest\\";
		
		filePath += entity + File.separator + "pdf" + File.separator + fileName + ".pdf";
		File file = new File(filePath);

		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
				"attachment; filename=" + fileName + ".pdf");
		return response.build();

	}

}