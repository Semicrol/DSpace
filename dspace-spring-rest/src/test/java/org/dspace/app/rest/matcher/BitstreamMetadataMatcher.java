/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.app.rest.matcher;

import static com.jayway.jsonpath.matchers.JsonPathMatchers.hasJsonPath;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Matcher;

public class BitstreamMetadataMatcher {

    private BitstreamMetadataMatcher() { }

    public static Matcher<? super Object> matchTitle(String title) {
        return allOf(
            hasJsonPath("$.key", is("dc.title")),
            hasJsonPath("$.value", is(title))
        );
    }

    public static Matcher<? super Object> matchDescription(String description) {
        return allOf(
            hasJsonPath("$.key", is("dc.description")),
            hasJsonPath("$.value", is(description))
        );
    }
}
