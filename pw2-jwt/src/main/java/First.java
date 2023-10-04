import org.eclipse.microprofile.jwt.Claim;

import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;

public class First {
    private static final Logger LOGGER = Logger.getLogger(First.class.getName());
    @Inject
    @Claim
    private String full_name;

    @GET
    @Path("/sum/{a}/{b}")
    @RolesAllowed({"User"})
    @Produces(MediaType.TEXT_PLAIN)

public long sum(@PathParam("a") long a, @PathParam("b") long b) {
    return a + b;
}

}
