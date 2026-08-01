package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11296e {
    public final int ad;
    public float adcel;
    public final GestureDetector advert;
    public float appmetrica;
    public boolean billing;
    public int mopub;
    public float purchase;
    public boolean smaato;
    public float startapp;
    public final C2007e vip;
    public float yandex;
    public final boolean metrica = true;
    public final boolean license = true;

    public C11296e(Context context, C2007e c2007e) {
        this.ad = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.vip = c2007e;
        this.advert = new GestureDetector(context, new C1770e(2, this));
    }

    public final float ad() {
        if (!vip()) {
            float f = this.purchase;
            if (f > 0.0f) {
                return this.appmetrica / f;
            }
            return 1.0f;
        }
        boolean z = this.smaato;
        boolean z2 = (z && this.appmetrica < this.purchase) || (!z && this.appmetrica > this.purchase);
        float abs = Math.abs(1 - (this.appmetrica / this.purchase)) * 0.5f;
        if (this.purchase <= this.ad) {
            return 1.0f;
        }
        return z2 ? abs + 1.0f : 1.0f - abs;
    }

    public final boolean vip() {
        return this.mopub != 0;
    }
}
