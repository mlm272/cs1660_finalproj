# Data Science Toolbox

1. Please have Docker  and XQuartz installed before running.
2. Download this github repository & navigate to it in XQuartz.

(I had some issues w/ the X11 DISPLAY value and the next 3 steps are what worked on my computer (Mac OS))

3. enter "xhost + 127.0.0.1"
4. type "docker run -e DISPLAY=host.docker.internal:0 mlm272/cs1660_finalproj"
5. close the window that pops up (the microservices aren't up yet)

6. type "docker-compose up"
7. Click the buttons to navigate to a microservice.
8. "docker-compose down" when you are done.

my docker repository w/ my given image:
https://hub.docker.com/repository/docker/mlm272/cs1660_finalproj

Video:
TO BE ADDED
