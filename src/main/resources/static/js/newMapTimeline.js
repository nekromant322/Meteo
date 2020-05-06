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
    windyAPI.store.set('particlesAnim', 'on');
    windyAPI.store.set('isolines', 'temp');
    windyAPI.store.set('graticule', 'true');
    windyAPI.store.set('latlon', 'true');
    windyAPI.store.set('hourFormat', '24h');

    let arrLayers = ['temp','rain','wind','clouds','pressure'];
    windyAPI.store.set('favOverlays', arrLayers);
    windyAPI.store.set('availLevels',['surface'])
    const { picker, utils, broadcast, map } = windyAPI;
    picker.on('pickerOpened', latLon => {
            // picker has been opened at latLon coords
            console.log(latLon);

            const { lat, lon, values, overlay } = picker.getParams();
            // -> 48.4, 14.3, [ U,V, ], 'wind'
            console.log(lat, lon, values, overlay);

            const windObject = utils.wind2obj(values);
            console.log(windObject);
        });

        picker.on('pickerMoved', latLon => {
            // picker was dragged by user to latLon coords
            console.log(latLon);
        });

        picker.on('pickerClosed', () => {
            // picker was closed
        });

        // Wait since wather is rendered
        broadcast.once('redrawFinished', () => {
            picker.open({ lat: 48.4, lon: 14.3 });
            // Opening of a picker (async)
        });
});

setInterval(hide,50);
setInterval(hideProgress,50);
setInterval(hideLayers,50);
//setInterval(hideBox,50);
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
    //var progress = document.querySelector('#progress-bar');
    //if(progress.style.display === '') {
    //    progress.style.display = 'none';
    //}
}
function hideLayers() {
    let layers = document.querySelector('#layers-levels');
    if(layers.style.display === '') {
            layers.style.display = 'none';
    }
}
function hideBox() {
    let box = document.querySelector('.timecode main-timecode');
    if(box.style.display === '') {
            box.style.display = 'none';
    }
}