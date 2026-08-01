package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3774e extends Drawable.ConstantState {
    public final Paint.Style Signature;
    public C15339e ad;
    public float adcel;
    public float advert;
    public int amazon;
    public ColorStateList appmetrica;
    public Rect billing;
    public ColorStateList license;
    public int loadAd;
    public ColorStateList metrica;
    public int mopub;
    public PorterDuff.Mode purchase;
    public float smaato;
    public float startapp;
    public C15190e vip;
    public final float yandex;

    public C3774e(C3774e c3774e) {
        this.metrica = null;
        this.license = null;
        this.appmetrica = null;
        this.purchase = PorterDuff.Mode.SRC_IN;
        this.billing = null;
        this.yandex = 1.0f;
        this.startapp = 1.0f;
        this.mopub = 255;
        this.advert = 0.0f;
        this.smaato = 0.0f;
        this.amazon = 0;
        this.loadAd = 0;
        this.Signature = Paint.Style.FILL_AND_STROKE;
        this.ad = c3774e.ad;
        this.vip = c3774e.vip;
        this.adcel = c3774e.adcel;
        this.metrica = c3774e.metrica;
        this.license = c3774e.license;
        this.purchase = c3774e.purchase;
        this.appmetrica = c3774e.appmetrica;
        this.mopub = c3774e.mopub;
        this.yandex = c3774e.yandex;
        this.loadAd = c3774e.loadAd;
        this.startapp = c3774e.startapp;
        this.advert = c3774e.advert;
        this.smaato = c3774e.smaato;
        this.amazon = c3774e.amazon;
        this.Signature = c3774e.Signature;
        if (c3774e.billing != null) {
            this.billing = new Rect(c3774e.billing);
        }
    }

    public C3774e(C15339e c15339e) {
        this.metrica = null;
        this.license = null;
        this.appmetrica = null;
        this.purchase = PorterDuff.Mode.SRC_IN;
        this.billing = null;
        this.yandex = 1.0f;
        this.startapp = 1.0f;
        this.mopub = 255;
        this.advert = 0.0f;
        this.smaato = 0.0f;
        this.amazon = 0;
        this.loadAd = 0;
        this.Signature = Paint.Style.FILL_AND_STROKE;
        this.ad = c15339e;
        this.vip = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C11252e c11252e = new C11252e(this);
        c11252e.f22599e = true;
        return c11252e;
    }
}
