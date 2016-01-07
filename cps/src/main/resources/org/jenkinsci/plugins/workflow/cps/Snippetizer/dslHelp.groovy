package org.jenkinsci.plugins.workflow.cps.Snippetizer

import org.jenkinsci.plugins.workflow.cps.Snippetizer


def st = namespace("jelly:stapler")

p {
    a(href: "${rootURL}/${Snippetizer.DSL_REF_URL}", target: "_blank") {
       raw(_("Click here for this doc in a new window."))
    }

}

p {
    a(href: "${rootURL}/${Snippetizer.GDSL_URL}", target: "_blank") {
        raw(_("Click here for IntelliJ GDSL."))
    }

}

p {
    a(href: "${rootURL}/${Snippetizer.DSLD_URL}", target: "_blank") {
        raw(_("Click here for Eclipse DSLD."))
    }

}

st.include(page: "dslReferenceContent")
