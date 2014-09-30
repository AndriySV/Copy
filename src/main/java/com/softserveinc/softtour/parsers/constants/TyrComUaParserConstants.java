package com.softserveinc.softtour.parsers.constants;

public interface TyrComUaParserConstants {
    static final String DEFAULT_COUNTRY = "Єгипет";
    static final String DROP_DOWN_COUNTRY_ID = "itt_country";
    static final String SELECT_REGION_ID = "region_list";
    static final String SELECT_HOTEL_ID = "hotel_list";
    static final String MULTIPLY_STARS_2_XPATH = "//input[@value='7' and @name='hotel_rating_list']";
    static final String MULTIPLY_STARS_3_XPATH = "//input[@value='3' and @name='hotel_rating_list']";
    static final String MULTIPLY_STARS_4_XPATH = "//input[@value='4' and @name='hotel_rating_list']";
    static final String MULTIPLY_STARS_5_XPATH = "//input[@value='78' and @name='hotel_rating_list']";
    static final String FOOD_HB_XPATH = "HB";
    static final String FOOD_BB_XPATH = "BB";
    static final String FOOD_FB_XPATH = "FB";
    static final String FOOD_AI_XPATH = "AI";
    static final String FOOD_UAI_XPATH = "UAI";
    static final String FOOD_RO_XPATH = "RO";
    static final String MULTIPLY_FOOD_HB_XPATH = "//input[@value='496' and @name='food_list']";
    static final String MULTIPLY_FOOD_BB_XPATH = "//input[@value='388' and @name='food_list']";
    static final String MULTIPLY_FOOD_FB_XPATH = "//input[@value='498' and @name='food_list']";
    static final String MULTIPLY_FOOD_AI_XPATH = "//input[@value='512' and @name='food_list']";
    static final String MULTIPLY_FOOD_UAI_XPATH = "//input[@value='560' and @name='food_list']";
    static final String MULTIPLY_FOOD_RO_XPATH = "//input[@value='1956' and @name='food_list']";
    static final String DROP_DOWN_ADULTS_ID = "adult";
    static final String DROP_DOWN_CHILDREN_ID = "children";
    static final String SEND_CHILD_1_AGE_ID = "child1_age";
    static final String SEND_CHILD_2_AGE_ID = "child2_age";
    static final String SEND_CHILD_3_AGE_ID = "child3_age";
    static final String SEND_DATE_FLY_FROM_ID = "itt_date_from";
    static final String SEND_DATE_FLY_TO_ID = "date_till";
    static final String DROP_DOWN_NIGHTS_FROM_ID = "night_from";
    static final String DROP_DOWN_NIGHTS_TO_ID = "night_till";
    static final String SEND_PRICE_FROM_ID = "price_from";
    static final String SEND_PRICE_TO_ID = "price_till";
    static final String DROP_DOWN_CURRENCY_ID = "switch_price";
    static final String DROP_DOWN_DEPARTURE_CITY_NAME = "departure_city";
    static final String RADIO_BUTTON_COUNT_PAGES_100_ID = "items_per_page100";
    static final String BUTTON_SUBMIT_XPATH = "//input[@value='Найти' and @type='button']";
    static final String PARSE_RESULTS_BY_CLASS_NAME_ODD = "itt_odd";
    static final String PARSE_RESULTS_BY_CLASS_NAME_EVEN = "itt_even";
    static final int COUNT_RESULT_PAGES = 50;
    static final String RESULT_LIST_LEFT_CLASS_NAME = "itt_text-left";
    static final String RESULT_LIST_CENTER_CLASS_NAME = "text-center";
    static final String RESULT_LIST_RIGHT_CLASS_NAME = "text-right";
    static final String DEPARTURE_CITY_DEFAULT = "без перелета";
    static final String SIMPLE_DATE_FORMAT_DATE = "dd.mm.yy";
}