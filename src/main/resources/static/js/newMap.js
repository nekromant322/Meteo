const options = {
    // Required: API key
    key: 'PsLAtXpsPTZexBwUkO7Mx5I', // REPLACE WITH YOUR KEY !!!

    // Put additional console output
    verbose: true,

    // Optional: Initial state of the map
    lat: 50.4,
    lon: 14.3,
    zoom: 5,
};

// Initialize Windy API
windyInit(options, windyAPI => {
    // windyAPI is ready, and contain 'map', 'store',
    // 'picker' and other usefull stuff
    windyAPI.store.set('particlesAnim', 'off');
    windyAPI.store.set(' isolines', 'off');
    windyAPI.store.set(' graticule', 'false');
    windyAPI.store.set('latlon', 'false');
    windyAPI.store.set('hourFormat', '24h');

    let arrLayers = ['wind','rain','temp','clouds','pressure'];
    windyAPI.store.set('favOverlays', arrLayers);
    windyAPI.store.set('availLevels',['surface'])
    const { map } = windyAPI;
    // .map is instance of Leaflet map

//    L.popup()
//        .setLatLng([50.4, 14.3])
//        .setContent('Hello World')
//        .openOn(map);
});

setInterval(hide,50);
setInterval(hideProgress,50);
setInterval(hideLayers,50);
function hide() {
    var logo = document.querySelector('#logo');
    if(logo.style.display === '') {
        logo.style.display = 'none';
    }

    var build = document.querySelector('.build-info');
    if(build.style.display === '') {
        build.style.display = 'none';
    }


}
function hideProgress() {
var play = document.querySelector('#playpause');
    if(play.style.display === '') {
        play.style.display = 'none';
    }
    var progress = document.querySelector('#progress-bar');
    if(progress.style.display === '') {
        progress.style.display = 'none';
    }
}
function hideLayers() {
    let layers = document.querySelector('#layers-levels');
    if(layers.style.display === '') {
            layers.style.display = 'none';
    }
}