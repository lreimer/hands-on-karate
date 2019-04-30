function fn() {
    karate.configure('connectTimeout', 10000);
    karate.configure('readTimeout', 10000);

    var config = {
        icndbBaseUrl: 'http://api.icndb.com/jokes/',
        weatherBaseUrl: 'http://api.openweathermap.org/'
    };
    return config;
}