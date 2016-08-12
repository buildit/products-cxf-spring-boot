package digital.buildit.products.resources;

import digital.buildit.products.domain.Product;
import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/products")
@Api("/products")
public interface ProductsResource {

    @GET
    @Path(value = "/")
    @Produces(MediaType.APPLICATION_JSON)
    Collection<Product> getProducts();

    @GET
    @Path(value = "/{productId}")
    @Produces(MediaType.APPLICATION_JSON)
    Product getProduct(String productId);

    @POST
    @Path(value = "/")
    @Produces(MediaType.APPLICATION_JSON)
    Product saveProduct(Product product);
}
