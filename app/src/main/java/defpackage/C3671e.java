package defpackage;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3671e implements Attributes {
    public XmlPullParser ad;

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str, String str2) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final int getLength() {
        return this.ad.getAttributeCount();
    }

    @Override // org.xml.sax.Attributes
    public final String getLocalName(int i) {
        return this.ad.getAttributeName(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getQName(int i) {
        XmlPullParser xmlPullParser = this.ad;
        String attributeName = xmlPullParser.getAttributeName(i);
        if (xmlPullParser.getAttributePrefix(i) == null) {
            return attributeName;
        }
        return xmlPullParser.getAttributePrefix(i) + ':' + attributeName;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(int i) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getURI(int i) {
        return this.ad.getAttributeNamespace(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(int i) {
        return this.ad.getAttributeValue(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str, String str2) {
        return null;
    }
}
