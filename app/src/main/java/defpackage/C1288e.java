package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۙٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1288e implements InterfaceC3828e {
    public static final C1895e subs = new Canvas();
    public float Signature;
    public long adcel;
    public boolean admob;
    public float ads;
    public boolean advert;
    public int amazon;
    public float applovin;
    public final Resources appmetrica;
    public Paint billing;
    public long inmobi;
    public float isPro;
    public long isVip;
    public final C17267e license;
    public int loadAd;
    public final C16125e metrica;
    public boolean mopub;
    public C9508e premium;
    public float pro;
    public final Rect purchase;
    public float remoteconfig;
    public float signatures;
    public boolean smaato;
    public int startapp;
    public float subscription;
    public float tapsense;
    public final AbstractC13533e vip;
    public int yandex;

    public C1288e(AbstractC13533e abstractC13533e) {
        C16125e c16125e = new C16125e();
        C14434e c14434e = new C14434e();
        this.vip = abstractC13533e;
        this.metrica = c16125e;
        C17267e c17267e = new C17267e(abstractC13533e, c16125e, c14434e);
        this.license = c17267e;
        this.appmetrica = abstractC13533e.getResources();
        this.purchase = new Rect();
        abstractC13533e.addView(c17267e);
        c17267e.setClipBounds(null);
        this.adcel = 0L;
        View.generateViewId();
        this.amazon = 3;
        this.loadAd = 0;
        this.Signature = 1.0f;
        this.subscription = 1.0f;
        this.remoteconfig = 1.0f;
        long j = C3618e.vip;
        this.isVip = j;
        this.inmobi = j;
    }

    @Override // defpackage.InterfaceC3828e
    public final float Signature() {
        return this.applovin;
    }

    /* renamed from: abstract, reason: not valid java name */
    public final void m561abstract() {
        int i = this.loadAd;
        if (i != 1 && this.amazon == 3) {
            m562break(i);
        } else {
            m562break(1);
        }
    }

    @Override // defpackage.InterfaceC3828e
    public final float ad() {
        return this.Signature;
    }

    @Override // defpackage.InterfaceC3828e
    public final void adcel() {
        this.vip.removeViewInLayout(this.license);
    }

    @Override // defpackage.InterfaceC3828e
    public final /* synthetic */ boolean admob() {
        return true;
    }

    @Override // defpackage.InterfaceC3828e
    public final float ads() {
        return this.license.getCameraDistance() / this.appmetrica.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.InterfaceC3828e
    public final void advert(InterfaceC14576e interfaceC14576e) {
        Rect rect;
        boolean z = this.mopub;
        C17267e c17267e = this.license;
        if (z) {
            if ((this.smaato || c17267e.getClipToOutline()) && !this.advert) {
                rect = this.purchase;
                rect.left = 0;
                rect.top = 0;
                rect.right = c17267e.getWidth();
                rect.bottom = c17267e.getHeight();
            } else {
                rect = null;
            }
            c17267e.setClipBounds(rect);
        }
        Canvas canvas = AbstractC16863e.ad;
        if (((C11648e) interfaceC14576e).ad.isHardwareAccelerated()) {
            this.vip.ad(interfaceC14576e, c17267e, c17267e.getDrawingTime());
        }
    }

    @Override // defpackage.InterfaceC3828e
    public final C2815e amazon() {
        return null;
    }

    @Override // defpackage.InterfaceC3828e
    public final void applovin(float f) {
        this.subscription = f;
        this.license.setScaleX(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final C9508e appmetrica() {
        return this.premium;
    }

    @Override // defpackage.InterfaceC3828e
    public final void billing(float f) {
        this.signatures = f;
        this.license.setTranslationY(f);
    }

    /* renamed from: break, reason: not valid java name */
    public final void m562break(int i) {
        C17267e c17267e = this.license;
        boolean z = true;
        if (i == 1) {
            c17267e.setLayerType(2, this.billing);
        } else if (i == 2) {
            c17267e.setLayerType(0, this.billing);
            z = false;
        } else {
            c17267e.setLayerType(0, this.billing);
        }
        c17267e.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: class */
    public final void mo275class(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e, C16446e c16446e, C17097e c17097e) {
        C17267e c17267e = this.license;
        ViewParent parent = c17267e.getParent();
        AbstractC13533e abstractC13533e = this.vip;
        if (parent == null) {
            abstractC13533e.addView(c17267e);
        }
        c17267e.f33901e = interfaceC14388e;
        c17267e.f33897e = enumC7792e;
        c17267e.f33899e = c17097e;
        c17267e.f33895e = c16446e;
        if (c17267e.isAttachedToWindow()) {
            c17267e.setVisibility(4);
            c17267e.setVisibility(0);
            try {
                C16125e c16125e = this.metrica;
                C1895e c1895e = subs;
                C11648e c11648e = c16125e.ad;
                Canvas canvas = c11648e.ad;
                c11648e.ad = c1895e;
                abstractC13533e.ad(c11648e, c17267e, c17267e.getDrawingTime());
                c16125e.ad.ad = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.InterfaceC3828e
    public final void crashlytics(boolean z) {
        boolean z2 = false;
        this.smaato = z && !this.advert;
        this.mopub = true;
        if (z && this.advert) {
            z2 = true;
        }
        this.license.setClipToOutline(z2);
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: extends */
    public final void mo277extends(float f) {
        this.license.setCameraDistance(f * this.appmetrica.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.InterfaceC3828e
    public final float firebase() {
        return this.isPro;
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: goto */
    public final void mo278goto(float f) {
        this.pro = f;
        this.license.setTranslationX(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final void inmobi(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.isVip = j;
            AbstractC17305e.m4290new(this.license, AbstractC6532e.m2193extends(j));
        }
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: interface */
    public final void mo279interface(int i) {
        this.loadAd = i;
        m561abstract();
    }

    @Override // defpackage.InterfaceC3828e
    public final void isPro() {
        Paint paint = this.billing;
        if (paint == null) {
            paint = new Paint();
            this.billing = paint;
        }
        paint.setColorFilter(null);
        m561abstract();
    }

    @Override // defpackage.InterfaceC3828e
    public final long isVip() {
        return this.inmobi;
    }

    @Override // defpackage.InterfaceC3828e
    public final void license(float f) {
        this.tapsense = f;
        this.license.setElevation(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final void loadAd(float f) {
        this.remoteconfig = f;
        this.license.setScaleY(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final float metrica() {
        return this.subscription;
    }

    @Override // defpackage.InterfaceC3828e
    public final void mopub(int i, long j, int i2) {
        boolean vip = C12729e.vip(this.adcel, j);
        C17267e c17267e = this.license;
        if (vip) {
            int i3 = this.yandex;
            if (i3 != i) {
                c17267e.offsetLeftAndRight(i - i3);
            }
            int i4 = this.startapp;
            if (i4 != i2) {
                c17267e.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.smaato || c17267e.getClipToOutline()) {
                this.mopub = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            c17267e.layout(i, i2, i + i5, i2 + i6);
            this.adcel = j;
            if (this.admob) {
                c17267e.setPivotX(i5 / 2.0f);
                c17267e.setPivotY(i6 / 2.0f);
            }
        }
        this.yandex = i;
        this.startapp = i2;
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: native */
    public final Matrix mo280native() {
        return this.license.getMatrix();
    }

    @Override // defpackage.InterfaceC3828e
    public final void premium(C9508e c9508e) {
        this.premium = c9508e;
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC16048e.m4105native(this.license, c9508e);
        }
    }

    @Override // defpackage.InterfaceC3828e
    public final long pro() {
        return this.isVip;
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: protected */
    public final int mo281protected() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC3828e
    public final void purchase(float f) {
        this.ads = f;
        this.license.setRotation(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final void remoteconfig(long j) {
        long j2 = 9223372034707292159L & j;
        C17267e c17267e = this.license;
        if (j2 != 9205357640488583168L) {
            this.admob = false;
            c17267e.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            c17267e.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                AbstractC17305e.m4293protected(c17267e);
                return;
            }
            this.admob = true;
            c17267e.setPivotX(((int) (this.adcel >> 32)) / 2.0f);
            c17267e.setPivotY(((int) (4294967295L & this.adcel)) / 2.0f);
        }
    }

    @Override // defpackage.InterfaceC3828e
    public final void signatures(float f) {
        this.Signature = f;
        this.license.setAlpha(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final int smaato() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC3828e
    public final void startapp(int i) {
        this.amazon = i;
        Paint paint = this.billing;
        if (paint == null) {
            paint = new Paint();
            this.billing = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC14204e.m3769catch(i)));
        m561abstract();
    }

    @Override // defpackage.InterfaceC3828e
    public final float subs() {
        return this.pro;
    }

    @Override // defpackage.InterfaceC3828e
    public final float subscription() {
        return this.ads;
    }

    @Override // defpackage.InterfaceC3828e
    public final float tapsense() {
        return this.signatures;
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: this */
    public final void mo282this(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.inmobi = j;
            AbstractC17305e.m4295strictfp(this.license, AbstractC6532e.m2193extends(j));
        }
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: throw */
    public final float mo283throw() {
        return this.tapsense;
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: try */
    public final void mo284try(float f) {
        this.isPro = f;
        this.license.setRotationX(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final void vip(float f) {
        this.applovin = f;
        this.license.setRotationY(f);
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: while */
    public final float mo285while() {
        return this.remoteconfig;
    }

    @Override // defpackage.InterfaceC3828e
    public final void yandex(Outline outline, long j) {
        C17267e c17267e = this.license;
        c17267e.f33893e = outline;
        c17267e.invalidateOutline();
        if ((this.smaato || c17267e.getClipToOutline()) && outline != null) {
            c17267e.setClipToOutline(true);
            if (this.smaato) {
                this.smaato = false;
                this.mopub = true;
            }
        }
        this.advert = outline != null;
    }
}
