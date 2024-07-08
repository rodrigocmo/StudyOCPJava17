package theory.services;

import java.util.List;
import java.util.ServiceLoader;

public class ServiceLocator {
    public static void main(String[] args) {
        ServiceLoader<ServiceProviderInterface> load = ServiceLoader.load(ServiceProviderInterface.class);
        load.stream().map(ServiceLoader.Provider::get).forEach(System.out::println);

        for (ServiceProviderInterface lo : load){
            System.out.println(lo);
        }
    }
}
