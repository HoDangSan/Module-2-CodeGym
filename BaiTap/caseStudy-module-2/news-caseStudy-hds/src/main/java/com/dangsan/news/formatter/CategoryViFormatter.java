package com.dangsan.news.formatter;

import com.dangsan.news.model.CategoryVi;
import com.dangsan.news.service.CategoryViService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CategoryViFormatter implements Formatter<CategoryVi> {
    private CategoryViService categoryViService;

    @Autowired
    public CategoryViFormatter(CategoryViService categoryViService) {
        this.categoryViService = categoryViService;
    }

    @Override
    public CategoryVi parse(String text, Locale locale) throws ParseException {
        return categoryViService.findById(Long.parseLong(text));
    }

    @Override
    public String print(CategoryVi object, Locale locale) {
        return "[" + object.getId() + "," + object.getName() + "]";
    }
}
