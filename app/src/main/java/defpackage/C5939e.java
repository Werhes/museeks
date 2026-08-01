package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.google.android.renderscript.Toolkit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ۟ٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5939e extends AbstractC8981e {
    public final C7943e ad;
    public final String vip;

    public C5939e(C7943e c7943e) {
        this.ad = c7943e;
        this.vip = "vibrantBlur-" + c7943e.hashCode();
    }

    @Override // defpackage.AbstractC8981e
    public final String ad() {
        return this.vip;
    }

    @Override // defpackage.AbstractC8981e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5939e) {
            return AbstractC7890e.billing(this.ad, ((C5939e) obj).ad);
        }
        return false;
    }

    @Override // defpackage.AbstractC8981e
    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.AbstractC8981e
    public final String toString() {
        return "BlurTransformation(material=" + this.ad + ')';
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eٖؑۡ, eُۙۨ] */
    @Override // defpackage.AbstractC8981e
    public final Bitmap vip(Bitmap bitmap, C16320e c16320e) {
        Toolkit toolkit = Toolkit.ad;
        C7943e c7943e = this.ad;
        Bitmap ad = Toolkit.ad(bitmap, AbstractC3062e.license(c7943e.ad, new C11241e(0, 25, 1)));
        if (c7943e.metrica != 1.0f) {
            Bitmap vip = Toolkit.vip(ad, (float[]) c7943e.license.getValue());
            ad.recycle();
            ad = vip;
        }
        Canvas canvas = new Canvas(ad);
        for (C13459e c13459e : c7943e.vip) {
            C11447e vip2 = AbstractC17331e.vip();
            vip2.appmetrica(AbstractC6532e.vip(c13459e.ad));
            vip2.license(c13459e.vip);
            canvas.drawPaint(vip2.ad);
        }
        return ad;
    }
}
