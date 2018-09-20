import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Lambdas {
  public static void main(String[] args) {
    Map<String, String> planets = new HashMap<>();
    planets.put("Mercury", "87.969");
    planets.put("Venus", "224.7");
    planets.put("Earth", "365.2564");
    planets.put("Mars", "687");
    planets.put("Jupiter", "4,332.59");
    planets.put("Saturn", "10,759");
    planets.put("Uranus", "30,688.5");
    planets.put("Neptune", "60,182");
    System.out.println(planets);

    Supplier<String> numPlanets = () -> Integer.toString(planets.size());
    System.out.println("numplanets " + numPlanets.get());

    planets.keySet().forEach(p -> System.out.format("%s\n", p));

    String orbits = "%s orbits the Sun in %s Earth days.\n";
    planets.forEach((K, V) -> System.out.format(orbits, K, V));
  }
}
