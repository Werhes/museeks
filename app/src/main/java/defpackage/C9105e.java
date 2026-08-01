package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۥؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9105e {
    public final BitmapDrawable ad;
    public boolean adcel;
    public C5891e advert;
    public long appmetrica;
    public int billing;
    public Interpolator license;
    public final Rect metrica;
    public boolean mopub;
    public final Rect purchase;
    public long startapp;
    public float vip = 1.0f;
    public float yandex = 1.0f;

    public C9105e(BitmapDrawable bitmapDrawable, Rect rect) {
        this.ad = bitmapDrawable;
        this.purchase = rect;
        Rect rect2 = new Rect(rect);
        this.metrica = rect2;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.vip * 255.0f));
            bitmapDrawable.setBounds(rect2);
        }
    }
}
