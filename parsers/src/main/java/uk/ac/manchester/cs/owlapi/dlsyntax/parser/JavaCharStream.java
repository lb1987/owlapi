/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
/*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2014, The University of Manchester
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2014, The University of Manchester
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/* Generated By:JavaCC: Do not edit this line. JavaCharStream.java Version 5.0 */
package uk.ac.manchester.cs.owlapi.dlsyntax.parser;

import java.io.UnsupportedEncodingException;

/** Wrapper for the common JavaCharStream for all parsers. This is needed because
 * we have a request to support UTF-8 files that have an initial BOM. UTF-8 does
 * not need BOMs but some tools insist adding them. Java on the other hand won't
 * support it, and JavaCC does not have an override for this. The result is that
 * the support must be added by hand, and it's easier to have it in one place.
 * This stops JavaCC from rebuilding the wrong files and minimizes duplicated
 * code. */
public class JavaCharStream extends uk.ac.manchester.cs.BOMSafeJavaCharStream {
    /** Constructor.
     * 
     * @param dstream
     *            stream
     * @param startline
     *            start line
     * @param startcolumn
     *            start column */
    public JavaCharStream(java.io.Reader dstream, int startline, int startcolumn) {
        super(dstream, startline, startcolumn, 4096);
    }

    /** Constructor.
     * 
     * @param dstream
     *            stream
     * @param encoding
     *            encoding
     * @param startline
     *            start line
     * @param startcolumn
     *            start column
     * @throws UnsupportedEncodingException
     *             for unsupported encoding */
    public JavaCharStream(java.io.InputStream dstream, String encoding,
            int startline, int startcolumn) throws UnsupportedEncodingException {
        super(dstream, encoding, startline, startcolumn, 4096);
    }
}
/*
 * JavaCC - OriginalChecksum=c048efc46c9aaa22abb59a0409f26b1f (do not edit this
 * line)
 */
