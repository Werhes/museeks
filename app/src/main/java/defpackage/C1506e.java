package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1506e {
    public final C17619e ad;
    public final Paint appmetrica;
    public C2359e billing;
    public final Paint license;
    public boolean metrica;
    public C2359e purchase;
    public boolean vip;
    public boolean yandex;

    public C1506e() {
        Paint paint = new Paint();
        this.license = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.appmetrica = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.ad = C17619e.ad();
    }

    public C1506e(C1506e c1506e) {
        this.vip = c1506e.vip;
        this.metrica = c1506e.metrica;
        this.license = new Paint(c1506e.license);
        this.appmetrica = new Paint(c1506e.appmetrica);
        C2359e c2359e = c1506e.purchase;
        if (c2359e != null) {
            this.purchase = new C2359e(c2359e);
        }
        C2359e c2359e2 = c1506e.billing;
        if (c2359e2 != null) {
            this.billing = new C2359e(c2359e2);
        }
        this.yandex = c1506e.yandex;
        try {
            this.ad = (C17619e) c1506e.ad.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.ad = C17619e.ad();
        }
    }
}
