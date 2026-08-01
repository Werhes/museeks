package defpackage;

import org.xml.sax.Attributes;
import org.xml.sax.ext.DefaultHandler2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1165e extends DefaultHandler2 {
    public final /* synthetic */ C10913e ad;

    public C1165e(C10913e c10913e) {
        this.ad = c10913e;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.ad.m2945interface(new String(cArr, i, i2));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
        this.ad.getClass();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.ad.metrica(str, str2, str3);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) {
        C10913e.isPro(new C9831e(str2));
        str.equals("xml-stylesheet");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.ad.firebase();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        this.ad.m2943class(str, str2, str3, attributes);
    }
}
