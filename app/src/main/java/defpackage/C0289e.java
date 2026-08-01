package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٓؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289e implements InterfaceC3828e {
    public static final AtomicBoolean subs = new AtomicBoolean(true);
    public float Signature;
    public int adcel;
    public float admob;
    public boolean ads;
    public float advert;
    public float amazon;
    public boolean applovin;
    public long appmetrica;
    public Matrix billing;
    public float inmobi;
    public boolean isPro;
    public float isVip;
    public final RenderNode license;
    public float loadAd;
    public final C14434e metrica;
    public int mopub;
    public C9508e premium;
    public long pro;
    public Paint purchase;
    public long remoteconfig;
    public float signatures;
    public boolean smaato;
    public long startapp;
    public float subscription;
    public float tapsense;
    public final C16125e vip;
    public boolean yandex;

    public C0289e(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, C16125e c16125e, C14434e c14434e) {
        this.vip = c16125e;
        this.metrica = c14434e;
        RenderNode create = RenderNode.create("Compose", viewTreeObserverOnGlobalLayoutListenerC5014e);
        this.license = create;
        this.appmetrica = 0L;
        this.startapp = 0L;
        if (subs.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                AbstractC10840e.metrica(create, AbstractC10840e.ad(create));
                AbstractC10840e.license(create, AbstractC10840e.vip(create));
            }
            if (i >= 24) {
                AbstractC4458e.ad(create);
            } else {
                AbstractC0028e.ad(create);
            }
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        m273abstract(0);
        this.adcel = 0;
        this.mopub = 3;
        this.advert = 1.0f;
        this.amazon = 1.0f;
        this.loadAd = 1.0f;
        long j = C3618e.vip;
        this.remoteconfig = j;
        this.pro = j;
        this.inmobi = 8.0f;
    }

    @Override // defpackage.InterfaceC3828e
    public final float Signature() {
        return this.tapsense;
    }

    /* renamed from: abstract, reason: not valid java name */
    public final void m273abstract(int i) {
        RenderNode renderNode = this.license;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.purchase);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.purchase);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.purchase);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.InterfaceC3828e
    public final float ad() {
        return this.advert;
    }

    @Override // defpackage.InterfaceC3828e
    public final void adcel() {
        if (Build.VERSION.SDK_INT >= 24) {
            AbstractC4458e.ad(this.license);
        } else {
            AbstractC0028e.ad(this.license);
        }
    }

    @Override // defpackage.InterfaceC3828e
    public final boolean admob() {
        return this.license.isValid();
    }

    @Override // defpackage.InterfaceC3828e
    public final float ads() {
        return this.inmobi;
    }

    @Override // defpackage.InterfaceC3828e
    public final void advert(InterfaceC14576e interfaceC14576e) {
        Canvas canvas = AbstractC16863e.ad;
        ((C11648e) interfaceC14576e).ad.drawRenderNode(this.license);
    }

    @Override // defpackage.InterfaceC3828e
    public final C2815e amazon() {
        return null;
    }

    @Override // defpackage.InterfaceC3828e
    public final void applovin(float f) {
        this.amazon = f;
        this.license.setScaleX(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final C9508e appmetrica() {
        return this.premium;
    }

    @Override // defpackage.InterfaceC3828e
    public final void billing(float f) {
        this.admob = f;
        this.license.setTranslationY(f);
    }

    /* renamed from: break, reason: not valid java name */
    public final void m274break() {
        boolean z = this.isPro;
        boolean z2 = false;
        boolean z3 = z && !this.yandex;
        if (z && this.yandex) {
            z2 = true;
        }
        if (z3 != this.applovin) {
            this.applovin = z3;
            this.license.setClipToBounds(z3);
        }
        if (z2 != this.ads) {
            this.ads = z2;
            this.license.setClipToOutline(z2);
        }
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: class, reason: not valid java name */
    public final void mo275class(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e, C16446e c16446e, C17097e c17097e) {
        Canvas start = this.license.start(Math.max((int) (this.appmetrica >> 32), (int) (this.startapp >> 32)), Math.max((int) (this.appmetrica & 4294967295L), (int) (4294967295L & this.startapp)));
        try {
            C11648e c11648e = this.vip.ad;
            Canvas canvas = c11648e.ad;
            c11648e.ad = start;
            C14434e c14434e = this.metrica;
            C18478e c18478e = c14434e.f28537e;
            long startapp = AbstractC8116e.startapp(this.appmetrica);
            InterfaceC14388e m4534extends = c18478e.m4534extends();
            EnumC7792e m4562while = c18478e.m4562while();
            InterfaceC14576e m4557this = c18478e.m4557this();
            long m4560try = c18478e.m4560try();
            C16446e c16446e2 = (C16446e) c18478e.f36227e;
            c18478e.m4532const(interfaceC14388e);
            c18478e.m4542for(enumC7792e);
            c18478e.m4541finally(c11648e);
            c18478e.m4533continue(startapp);
            c18478e.f36227e = c16446e;
            c11648e.billing();
            try {
                c17097e.invoke(c14434e);
                c11648e.admob();
                c18478e.m4532const(m4534extends);
                c18478e.m4542for(m4562while);
                c18478e.m4541finally(m4557this);
                c18478e.m4533continue(m4560try);
                c18478e.f36227e = c16446e2;
                c11648e.ad = canvas;
                this.license.end(start);
            } catch (Throwable th) {
                c11648e.admob();
                C18478e c18478e2 = c14434e.f28537e;
                c18478e2.m4532const(m4534extends);
                c18478e2.m4542for(m4562while);
                c18478e2.m4541finally(m4557this);
                c18478e2.m4533continue(m4560try);
                c18478e2.f36227e = c16446e2;
                throw th;
            }
        } catch (Throwable th2) {
            this.license.end(start);
            throw th2;
        }
    }

    @Override // defpackage.InterfaceC3828e
    public final void crashlytics(boolean z) {
        this.isPro = z;
        m274break();
    }

    /* renamed from: default, reason: not valid java name */
    public final void m276default() {
        int i = this.adcel;
        if (i != 1 && this.mopub == 3) {
            m273abstract(i);
        } else {
            m273abstract(1);
        }
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: extends, reason: not valid java name */
    public final void mo277extends(float f) {
        this.inmobi = f;
        this.license.setCameraDistance(-f);
    }

    @Override // defpackage.InterfaceC3828e
    public final float firebase() {
        return this.signatures;
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: goto, reason: not valid java name */
    public final void mo278goto(float f) {
        this.Signature = f;
        this.license.setTranslationX(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final void inmobi(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.remoteconfig = j;
            AbstractC10840e.metrica(this.license, AbstractC6532e.m2193extends(j));
        }
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: interface, reason: not valid java name */
    public final void mo279interface(int i) {
        this.adcel = i;
        m276default();
    }

    @Override // defpackage.InterfaceC3828e
    public final void isPro() {
        m276default();
    }

    @Override // defpackage.InterfaceC3828e
    public final long isVip() {
        return this.pro;
    }

    @Override // defpackage.InterfaceC3828e
    public final void license(float f) {
        this.subscription = f;
        this.license.setElevation(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final void loadAd(float f) {
        this.loadAd = f;
        this.license.setScaleY(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final float metrica() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC3828e
    public final void mopub(int i, long j, int i2) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.license.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (C12729e.vip(this.appmetrica, j)) {
            return;
        }
        if (this.smaato) {
            this.license.setPivotX(i3 / 2.0f);
            this.license.setPivotY(i4 / 2.0f);
        }
        this.appmetrica = j;
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: native, reason: not valid java name */
    public final Matrix mo280native() {
        Matrix matrix = this.billing;
        if (matrix == null) {
            matrix = new Matrix();
            this.billing = matrix;
        }
        this.license.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.InterfaceC3828e
    public final void premium(C9508e c9508e) {
        this.premium = c9508e;
    }

    @Override // defpackage.InterfaceC3828e
    public final long pro() {
        return this.remoteconfig;
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: protected, reason: not valid java name */
    public final int mo281protected() {
        return this.mopub;
    }

    @Override // defpackage.InterfaceC3828e
    public final void purchase(float f) {
        this.isVip = f;
        this.license.setRotation(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final void remoteconfig(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.smaato = true;
            this.license.setPivotX(((int) (this.appmetrica >> 32)) / 2.0f);
            this.license.setPivotY(((int) (4294967295L & this.appmetrica)) / 2.0f);
        } else {
            this.smaato = false;
            this.license.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.license.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.InterfaceC3828e
    public final void signatures(float f) {
        this.advert = f;
        this.license.setAlpha(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final int smaato() {
        return this.adcel;
    }

    @Override // defpackage.InterfaceC3828e
    public final void startapp(int i) {
        if (this.mopub == i) {
            return;
        }
        this.mopub = i;
        Paint paint = this.purchase;
        if (paint == null) {
            paint = new Paint();
            this.purchase = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC14204e.m3769catch(i)));
        m276default();
    }

    @Override // defpackage.InterfaceC3828e
    public final float subs() {
        return this.Signature;
    }

    @Override // defpackage.InterfaceC3828e
    public final float subscription() {
        return this.isVip;
    }

    @Override // defpackage.InterfaceC3828e
    public final float tapsense() {
        return this.admob;
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: this, reason: not valid java name */
    public final void mo282this(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.pro = j;
            AbstractC10840e.license(this.license, AbstractC6532e.m2193extends(j));
        }
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: throw, reason: not valid java name */
    public final float mo283throw() {
        return this.subscription;
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: try, reason: not valid java name */
    public final void mo284try(float f) {
        this.signatures = f;
        this.license.setRotationX(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final void vip(float f) {
        this.tapsense = f;
        this.license.setRotationY(f);
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: while, reason: not valid java name */
    public final float mo285while() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC3828e
    public final void yandex(Outline outline, long j) {
        this.startapp = j;
        this.license.setOutline(outline);
        this.yandex = outline != null;
        m274break();
    }
}
