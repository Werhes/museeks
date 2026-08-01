package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٛ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1935e {
    public float Signature;
    public final RectF ad = new RectF();
    public int adcel;
    public float admob;
    public float advert;
    public boolean amazon;
    public float appmetrica;
    public float billing;
    public final Paint license;
    public Path loadAd;
    public final Paint metrica;
    public float mopub;
    public int pro;
    public float purchase;
    public int remoteconfig;
    public int signatures;
    public float smaato;
    public int[] startapp;
    public int subscription;
    public final Paint vip;
    public float yandex;

    public C1935e() {
        Paint paint = new Paint();
        this.vip = paint;
        Paint paint2 = new Paint();
        this.metrica = paint2;
        Paint paint3 = new Paint();
        this.license = paint3;
        this.appmetrica = 0.0f;
        this.purchase = 0.0f;
        this.billing = 0.0f;
        this.yandex = 5.0f;
        this.Signature = 1.0f;
        this.pro = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void ad(int i) {
        this.adcel = i;
        this.signatures = this.startapp[i];
    }
}
