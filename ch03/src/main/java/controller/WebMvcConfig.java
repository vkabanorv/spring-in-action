package controller;

import domain.IngredientByIdConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import repository.IngredientRepository;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private IngredientRepository ingredientRepo;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new IngredientByIdConverter(ingredientRepo));
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }
}