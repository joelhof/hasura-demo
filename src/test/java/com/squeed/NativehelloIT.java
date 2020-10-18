package com.squeed;

import io.quarkus.test.junit.NativeImageTest;
import org.junit.jupiter.api.Disabled;

@Disabled
@NativeImageTest
public class NativehelloIT extends HelloThorTest {

    // Execute the same tests but in native mode.
}