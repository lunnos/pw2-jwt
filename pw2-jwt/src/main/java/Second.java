public class Second {
    private static final Logger LOGGER = Logger.getLogger(Second.class.getName());
    @Inject
    @Claim(standard = Claims.email)
    String email;

    @GET
    @Path("/getSum/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed({"Admin"})
    public int getSum(@PathParam("a") int a, @PathParam("b") int b){
        LOGGER.log(Level.INFO, "Second: {0}", email);
        return a + b;
    }
}
