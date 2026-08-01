package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12270e {
    public final XmlPullParser ad;
    public final C9444e metrica;
    public int vip = 0;

    public C12270e(XmlResourceParser xmlResourceParser) {
        this.ad = xmlResourceParser;
        C9444e c9444e = new C9444e();
        c9444e.vip = new float[64];
        this.metrica = c9444e;
    }

    public final float ad(TypedArray typedArray, String str, int i, float f) {
        if (AbstractC13406e.smaato(this.ad, str)) {
            f = typedArray.getFloat(i, f);
        }
        vip(typedArray.getChangingConfigurations());
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12270e)) {
            return false;
        }
        C12270e c12270e = (C12270e) obj;
        return AbstractC7890e.billing(this.ad, c12270e.ad) && this.vip == c12270e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.ad);
        sb.append(", config=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }

    public final void vip(int i) {
        this.vip = i | this.vip;
    }
}
