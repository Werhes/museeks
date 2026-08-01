package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۟ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14265e {
    public final MaterialButton ad;
    public ColorStateList adcel;
    public boolean admob;
    public ColorStateList advert;
    public int appmetrica;
    public int billing;
    public int license;
    public int metrica;
    public ColorStateList mopub;
    public int pro;
    public int purchase;
    public RippleDrawable remoteconfig;
    public C11252e smaato;
    public PorterDuff.Mode startapp;
    public C15339e vip;
    public int yandex;
    public boolean amazon = false;
    public boolean loadAd = false;
    public boolean Signature = false;
    public boolean subscription = true;

    public C14265e(MaterialButton materialButton, C15339e c15339e) {
        this.ad = materialButton;
        this.vip = c15339e;
    }

    public final InterfaceC13298e ad() {
        RippleDrawable rippleDrawable = this.remoteconfig;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.remoteconfig.getNumberOfLayers() > 2 ? (InterfaceC13298e) this.remoteconfig.getDrawable(2) : (InterfaceC13298e) this.remoteconfig.getDrawable(1);
    }

    public final void appmetrica() {
        C11252e c11252e = new C11252e(this.vip);
        MaterialButton materialButton = this.ad;
        c11252e.adcel(materialButton.getContext());
        c11252e.setTintList(this.adcel);
        PorterDuff.Mode mode = this.startapp;
        if (mode != null) {
            c11252e.setTintMode(mode);
        }
        float f = this.yandex;
        ColorStateList colorStateList = this.mopub;
        c11252e.f22618e.adcel = f;
        c11252e.invalidateSelf();
        C3774e c3774e = c11252e.f22618e;
        if (c3774e.license != colorStateList) {
            c3774e.license = colorStateList;
            c11252e.onStateChange(c11252e.getState());
        }
        C11252e c11252e2 = new C11252e(this.vip);
        c11252e2.setTint(0);
        float f2 = this.yandex;
        int advert = this.amazon ? AbstractC9546e.advert(materialButton, R.attr.colorSurface) : 0;
        c11252e2.f22618e.adcel = f2;
        c11252e2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(advert);
        C3774e c3774e2 = c11252e2.f22618e;
        if (c3774e2.license != valueOf) {
            c3774e2.license = valueOf;
            c11252e2.onStateChange(c11252e2.getState());
        }
        C11252e c11252e3 = new C11252e(this.vip);
        this.smaato = c11252e3;
        c11252e3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC16058e.metrica(this.advert), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c11252e2, c11252e}), this.metrica, this.appmetrica, this.license, this.purchase), this.smaato);
        this.remoteconfig = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C11252e vip = vip(false);
        if (vip != null) {
            vip.mopub(this.pro);
            vip.setState(materialButton.getDrawableState());
        }
    }

    public final void license(int i, int i2) {
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        MaterialButton materialButton = this.ad;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.appmetrica;
        int i4 = this.purchase;
        this.purchase = i2;
        this.appmetrica = i;
        if (!this.loadAd) {
            appmetrica();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void metrica(C15339e c15339e) {
        this.vip = c15339e;
        if (vip(false) != null) {
            vip(false).setShapeAppearanceModel(c15339e);
        }
        if (vip(true) != null) {
            vip(true).setShapeAppearanceModel(c15339e);
        }
        if (ad() != null) {
            ad().setShapeAppearanceModel(c15339e);
        }
    }

    public final void purchase() {
        C11252e vip = vip(false);
        C11252e vip2 = vip(true);
        if (vip != null) {
            float f = this.yandex;
            ColorStateList colorStateList = this.mopub;
            vip.f22618e.adcel = f;
            vip.invalidateSelf();
            C3774e c3774e = vip.f22618e;
            if (c3774e.license != colorStateList) {
                c3774e.license = colorStateList;
                vip.onStateChange(vip.getState());
            }
            if (vip2 != null) {
                float f2 = this.yandex;
                int advert = this.amazon ? AbstractC9546e.advert(this.ad, R.attr.colorSurface) : 0;
                vip2.f22618e.adcel = f2;
                vip2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(advert);
                C3774e c3774e2 = vip2.f22618e;
                if (c3774e2.license != valueOf) {
                    c3774e2.license = valueOf;
                    vip2.onStateChange(vip2.getState());
                }
            }
        }
    }

    public final C11252e vip(boolean z) {
        RippleDrawable rippleDrawable = this.remoteconfig;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C11252e) ((LayerDrawable) ((InsetDrawable) this.remoteconfig.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }
}
