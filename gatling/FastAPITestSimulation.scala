import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class FastAPITestSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("http://fastapi:8000")
    .acceptHeader("application/json")

  val scn = scenario("FastAPI Load Test")
    .exec(http("Get Users").get("/users/"))
    .pause(1)
    .exec(http("Create User")
    .post("/users/")
    .body(StringBody("""{"name": "testuser"}""")).asJson)


  setUp(
    scn.inject(atOnceUsers(10))
  ).protocols(httpProtocol)
}
