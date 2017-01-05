package md.cadastre.rest;

import java.io.File;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
 
@Path("/img")
public class ImgService {

	@GET
	@Path("/{entity}/{fileName}")
	@Produces("image/jpg")
	public Response getImage(@PathParam("entity") String entity, @PathParam("fileName") String fileName) {
		String filePath = "C:\\rest\\";
		
		filePath += entity + File.separator + "img" + File.separator + fileName + ".jpg";
		File file = new File(filePath);
		
		ResponseBuilder response = Response.ok(file);  
        response.header("Content-Disposition","attachment; filename=" + fileName + ".jpg");  
        return response.build();  
     
      } 

}