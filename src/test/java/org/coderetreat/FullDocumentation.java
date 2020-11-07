package org.coderetreat;

import org.sfvl.doctesting.MainDocumentation;

import java.io.IOException;

public class FullDocumentation extends MainDocumentation {
    public static void main (String... args) throws IOException {
        new FullDocumentation().generate();
    }
}
