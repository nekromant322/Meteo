
function test() {
    alert(123);
}
function renderCircles() {
    const maxCircles = 50;
    let coordArr = myMap.geoObjects.get(0).geometry.getCoordinates()[0];
    let topLeftLat = coordArr[0][0];
    let topLeftLon = coordArr[0][1];
    let botRightLat = coordArr[1][0];
    let botRightLon = coordArr[1][1];
    let latAbs = Math.abs(topLeftLat - botRightLat);
    let lonAbs = Math.abs(topLeftLon - botRightLon);

       alert("asd");
}
function renderCircle(lat,lon,radius,color) {
        var newCircle = new ymaps.Circle([
            [lat, lon],
            // Радиус круга в метрах.
            radius
        ], {
            balloonContent: "some info",
        }, {
            draggable: false,
            // Последний байт (77) определяет прозрачность.
            //fillColor: "#0000ff77",
            fillColor: color,
            // Цвет обводки.
            strokeColor: "#990066",
            // Прозрачность обводки.
            strokeOpacity: 0.8,
            // Ширина обводки в пикселях.
            strokeWidth: 2
        });
        myMap.geoObjects.add(newCircle);

}
function getAndRender() {
    var lat = $("#lat").val();
    var lon = $("#lon").val();
    var weatherSituation = ajaxWeatherAtPoint(lat,lon);

    var newCircle = new ymaps.Circle([
            [lat, lon],
            // Радиус круга в метрах.
            10000
        ], {
            balloonContent: "Радиус круга - 10 км",
            hintContent: "Подвинь меня"
        }, {
            draggable: false,
            // Последний байт (77) определяет прозрачность.
            fillColor: "#0000ff77",
            // Цвет обводки.
            strokeColor: "#990066",
            // Прозрачность обводки.
            strokeOpacity: 0.8,
            // Ширина обводки в пикселях.
            strokeWidth: 2
        });
        myMap.geoObjects.add(newCircle);
}

function ajaxWeatherAtPoint(lat, lon) {


    var coord = 'lat='+lat+'&lon='+ lon;
    $.ajax({
        method: 'GET',
        url: '/api/weather?' + coord,
        success: function(weatherSituation) {
            console.log(weatherSituation);
            return weatherSituation;
        },
        error: function(error) {
            console.log(error);
        }
    });
}

function newPolygon() {
    let centerLat = myMap.getCenter()[0];
    let centerLon = myMap.getCenter()[1];
    let zoom = 0.1;
    myMap.geoObjects.removeAll();
    myMap.setZoom(10);


    polygon = new ymaps.Polygon([
            [
                [centerLat - zoom, centerLon - zoom],
                [centerLat + zoom, centerLon + zoom]
            ]
        ]);
    myMap.geoObjects.add(polygon);

    // Включаем режим масштабирования.
    polygon.editor.startFraming();
}


ymaps.ready(init);
var polygon;
var myMap;
function init() {
    // Создаем карту.
    myMap = new ymaps.Map("map", {
        center: [55.76, 37.64],
        zoom: 10
    }, {
        searchControlProvider: 'yandex#search'
    });

    // Создаем круг.
    var myCircle = new ymaps.Circle([
        // Координаты центра круга.
        [55.76, 37.60],
        // Радиус круга в метрах.
        1000
    ], {
        // Описываем свойства круга.
        // Содержимое балуна.
        balloonContent: "Радиус круга - 10 км",
        // Содержимое хинта.
        hintContent: "Подвинь меня"
    }, {
        // Задаем опции круга.
        // Включаем возможность перетаскивания круга.
        draggable: false,
        // Цвет заливки.
        // Последний байт (77) определяет прозрачность.
        // Прозрачность заливки также можно задать используя опцию "fillOpacity".
        fillColor: "#ff000077",
        // Цвет обводки.
        strokeColor: "#990066",
        // Прозрачность обводки.
        strokeOpacity: 0.8,
        // Ширина обводки в пикселях.
        strokeWidth: 2
    });
    var myCircle1 = new ymaps.Circle([
        // Координаты центра круга.
        [55.77, 37.60],
        // Радиус круга в метрах.
        1000
    ], {
        // Описываем свойства круга.
        // Содержимое балуна.
        balloonContent: "Радиус круга - 10 км",
        // Содержимое хинта.
        hintContent: "Подвинь меня"
    }, {
        // Задаем опции круга.
        // Включаем возможность перетаскивания круга.
        draggable: false,
        // Цвет заливки.
        // Последний байт (77) определяет прозрачность.
        // Прозрачность заливки также можно задать используя опцию "fillOpacity".
        fillColor: "#00ff0077",
        // Цвет обводки.
        strokeColor: "#990066",
        // Прозрачность обводки.
        strokeOpacity: 0.8,
        // Ширина обводки в пикселях.
        strokeWidth: 2
    });
    var myCircle2 = new ymaps.Circle([
        // Координаты центра круга.
        [55.76, 37.61],
        // Радиус круга в метрах.
        1000
    ], {
        // Описываем свойства круга.
        // Содержимое балуна.
        balloonContent: "Радиус круга - 10 км",
        // Содержимое хинта.
        hintContent: "Подвинь меня"
    }, {
        // Задаем опции круга.
        // Включаем возможность перетаскивания круга.
        draggable: false,
        // Цвет заливки.
        // Последний байт (77) определяет прозрачность.
        // Прозрачность заливки также можно задать используя опцию "fillOpacity".
        fillColor: "#0000ff77",
        // Цвет обводки.
        strokeColor: "#990066",
        // Прозрачность обводки.
        strokeOpacity: 0.8,
        // Ширина обводки в пикселях.
        strokeWidth: 2
    });

    // Добавляем круг на карту.
    myMap.geoObjects.add(myCircle);
    myMap.geoObjects.add(myCircle1);
    myMap.geoObjects.add(myCircle2);
}



