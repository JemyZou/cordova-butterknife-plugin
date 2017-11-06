/**
 * Copyright (c) Tony Mo
 * Copyright (c) 2015, PHOENIX
 *
 * 
 * 
 */
 var exec = require('cordova/exec'),
    cordova = require('cordova');

 var POWERPlugin = function () {
 };

POWERPlugin.prototype.goBKModlule = function (successCallback, errorCallback,options) {
    if (errorCallback == null) {
        errorCallback = function () {
        }
    }

    if (typeof errorCallback != "function") {
        console.log("POWERPlugin.goBKModlule: failure: failure parameter not a function");
        return
    }

    if (typeof successCallback != "function") {
        console.log("POWERPlugin.goBKModlule: success callback parameter must be a function");
        return
    }

    cordova.exec(successCallback, errorCallback, 'BKPlugin', 'goBKModlule', [options]);
};


var powerplugin = new POWERPlugin();
module.exports = powerplugin;