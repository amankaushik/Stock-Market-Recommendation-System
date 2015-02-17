/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(function (tick) {
    var t = tick;
    //alert(t.toString());
    //alert(t.toLocaleString());
    //alert(t.toString());
    //alert(valueOf(t));
    $.getJSON('http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.historicaldata%20where%20symbol%20%3D%20%22MSFT%22%20and%20startDate%20%3D%20%222013-01-26%22%20and%20endDate%20%3D%20%222014-03-27%22%0A%09%09&format=json&env=http%3A%2F%2Fdatatables.org%2Falltables.env&callback=', function (data) {

        var ohlc = [],
            volume = [],
            dataLength = data.query.count;
        for (i = 0; i < dataLength; i++) {
            var milliTime = new Date(data.query.results.quote[i].Date);
            milliTime = milliTime.getTime();
            ohlc.push([
            milliTime, // the date
            parseFloat(data.query.results.quote[i].Open), // open
            parseFloat(data.query.results.quote[i].High), // high
            parseFloat(data.query.results.quote[i].Low), // low
            parseFloat(data.query.results.quote[i].Close) // close
            ]);
           

            volume.push([
            milliTime, // the date
            parseFloat(data.query.results.quote[i].Volume) // the volume
            ]);
            
        }
         ohlc = ohlc.reverse();
         volume = volume.reverse();
        var groupingUnits = [
            [
                'week', // unit name
            [1] // allowed multiples
            ],
            [
                'month', [1, 2, 3, 4, 6]]
        ];
        $('#container').highcharts('StockChart', {
            
            rangeSelector: {
                inputEnabled: $('#container').width() > 480,
                selected: 1
            },

            title: {
                text: ' '+t.valueOf()+' Historical'
            },

            yAxis: [{
                title: {
                    text: t.toString()
                },
                height: 160,
                lineWidth: 2
            }, {
                title: {
                    text: 'Volume'
                },
                top: 248,
                height: 60,
                offset: 0,
                lineWidth: 2
            }],

            series: [{
                type: 'candlestick',
                name: t,
                data: ohlc,
                dataGrouping: {
                    units: groupingUnits
                }
            }, {
                type: 'column',
                name: 'Volume',
                data: volume,
                yAxis: 1,
                dataGrouping: {
                    units: groupingUnits
                }
            }]
        });
    });
});