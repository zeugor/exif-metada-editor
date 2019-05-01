package com.zeugor.exifmetadataeditor.exif_metadata_editor;

import java.io.File;
import java.io.IOException;
import java.time.Instant;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.junit.Test;

public class ExifMetadataEditorTest {

	@Test
	public void test() throws ImageReadException, ImageWriteException, IOException {
    	File jpegImageFile = new File("./resources/test/source/photo-sample.jpg");
    	File dst = new File("./resources/test/dest/photo-sample-"+ Instant.now().toEpochMilli() +".jpg");
    	
    	ExifMetadataEditor.removeExifMetadata(jpegImageFile, dst);
	}

}
