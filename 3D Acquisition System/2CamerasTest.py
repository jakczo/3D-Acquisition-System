import cv2 as cv
import numpy as np

# video_capture_0 = cv.VideoCapture(0) # build-in camera
video_capture_1 = cv.VideoCapture(1)  # camera left (1st usb port)
video_capture_2 = cv.VideoCapture(2)  # camera right (2nd usb port)

while True:
    # Capture frame by frame
    # ret0, frame0 = video_capture_0.read()
    ret1, frame1 = video_capture_1.read()
    ret2, frame2 = video_capture_2.read()

    # if (ret0):
    #     # Display the resulting frame
    #     cv.imshow('Cam 0', frame0)

    if ret1:
        # Display the resulting frame
        cv.imshow('Cam 1', frame1)

    if ret2:
        # Display the resulting frame
        cv.imshow('Cam 2', frame2)

    if cv.waitKey(1) & 0xFF == ord('q'):
        break

# When everything is done, release the capture
# video_capture_0.release()
video_capture_1.release()
video_capture_2.release()
cv.destroyAllWindows()
