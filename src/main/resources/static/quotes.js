(function($) {
    var request = $.ajax({'url': '/quotes.json'});
    request.done(function (quotes) {
        var html = '';
        quotes.forEach(function(quote) {
            html += '<div>';
            html += '<h1>' + quote.title + '</h1>';
            html += '<p>' + quote.description + '</p>';
            html += '<p>Published by ' + quote.owner.username + '</p>';
            html += '</div>';
        });
        $('#quotes').html(html);
    });
})(jQuery);