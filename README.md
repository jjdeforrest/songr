# songr

creating things with spring

Fullfilled tasks:

Created a hello world and a route to capitalize a word to uppercase then a css page for colering and displayed a list of information with gifs. Also created test for the constructor etc.

#Go to http://localhost:8080/ in your browser port 8080 on localhost for home page

#go to http://localhost:8080/hellothe /hello route to receive a nice greeting

#capitalized words go to the /capitalize/YOUR-WORDS-HERE

#to see some albums, http://localhost:8080/albums you can also add albums click on the link then you can add songs to the albums

#error handler from spring website 

@ControllerAdvice
public class RestResponseEntityExceptionHandler 
  extends ResponseEntityExceptionHandler {
 
    @ExceptionHandler(value 
      = { IllegalArgumentException.class, IllegalStateException.class })
    protected ResponseEntity<Object> handleConflict(
      RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "This should be application specific";
        return handleExceptionInternal(ex, bodyOfResponse, 
          new HttpHeaders(), HttpStatus.CONFLICT, request);
    }
}
