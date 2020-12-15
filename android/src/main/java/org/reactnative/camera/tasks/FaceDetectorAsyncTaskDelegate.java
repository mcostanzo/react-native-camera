package org.reactnative.camera.tasks;

import org.reactnative.facedetector.RNFaceDetector;

import com.facebook.react.bridge.WritableArray;

public interface FaceDetectorAsyncTaskDelegate {
  void onFacesDetected(WritableArray faces, byte[] imageData, int width, int height, int orientation);
  void onFaceDetectionError(RNFaceDetector faceDetector);
  void onFaceDetectingTaskCompleted();
}
