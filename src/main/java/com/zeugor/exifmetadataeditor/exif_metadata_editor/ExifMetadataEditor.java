package com.zeugor.exifmetadataeditor.exif_metadata_editor;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Instant;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter;

/**
 * Hello world!
 *
 */
public class ExifMetadataEditor  {
    final static void removeExifMetadata(final File jpegImageFile, final File dst)
                  throws IOException, ImageReadException, ImageWriteException {
              try (FileOutputStream fos = new FileOutputStream(dst);
                      OutputStream os = new BufferedOutputStream(fos)) {
                  new ExifRewriter().removeExifMetadata(jpegImageFile, os);
              }
          }
}
