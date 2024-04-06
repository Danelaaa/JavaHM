import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ge.ibsu.demo.dto.City;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    @Autowired
    private City cityRepository;

    @GetMapping("/details")
    public List<City> getAllCityDetails() {
        List<City> cities = cityRepository.findAll();
        return cities.stream()
                .map(city -> new CityDTO(city.getName(), city.getCountry().getName()))
                .collect(Collectors.toList());
    }
}
