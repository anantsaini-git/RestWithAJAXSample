This is an example of using rest service inside AJAX call
AJAX call is used to change content of UI dynamically from backend asynchronously i.e. without stopping execution of other flow 

To execute AJAX file
run RestSampleApplication.java
Check rest service call: http://localhost:8080/getResource & http://localhost:8080/getJSONResource

After this open HTML file as below URL
http://localhost:8080/AJAXSample.html
(if your port number is different, then change accordingly)

Please note if you try to run HTML file from different path, above exampe won't work as it will throw CORS error (more you can check online)