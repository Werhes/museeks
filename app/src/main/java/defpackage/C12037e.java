package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ۠ۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12037e implements InterfaceC3828e {
    public long Signature;
    public int adcel;
    public long admob;
    public float advert;
    public float amazon;
    public int applovin;
    public long appmetrica;
    public Matrix billing;
    public boolean inmobi;
    public C9508e isPro;
    public boolean isVip;
    public final RenderNode license;
    public float loadAd;
    public final C14434e metrica;
    public float mopub;
    public float pro;
    public Paint purchase;
    public float remoteconfig;
    public float signatures;
    public float smaato;
    public float startapp;
    public float subscription;
    public boolean tapsense;
    public final C16125e vip;
    public boolean yandex;

    public C12037e() {
        C16125e c16125e = new C16125e();
        C14434e c14434e = new C14434e();
        this.vip = c16125e;
        this.metrica = c14434e;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.license = renderNode;
        this.appmetrica = 0L;
        renderNode.setClipToBounds(false);
        m3312abstract(renderNode, 0);
        this.startapp = 1.0f;
        this.adcel = 3;
        this.mopub = 1.0f;
        this.advert = 1.0f;
        long j = C3618e.vip;
        this.Signature = j;
        this.admob = j;
        this.signatures = 8.0f;
        this.applovin = 0;
    }

    @Override // defpackage.InterfaceC3828e
    public final float Signature() {
        return this.remoteconfig;
    }

    /* renamed from: abstract, reason: not valid java name */
    public final void m3312abstract(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.purchase);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, this.purchase);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.purchase);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.InterfaceC3828e
    public final float ad() {
        return this.startapp;
    }

    @Override // defpackage.InterfaceC3828e
    public final void adcel() {
        this.license.discardDisplayList();
    }

    @Override // defpackage.InterfaceC3828e
    public final boolean admob() {
        return this.license.hasDisplayList();
    }

    @Override // defpackage.InterfaceC3828e
    public final float ads() {
        return this.signatures;
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
        this.mopub = f;
        this.license.setScaleX(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final C9508e appmetrica() {
        return this.isPro;
    }

    @Override // defpackage.InterfaceC3828e
    public final void billing(float f) {
        this.amazon = f;
        this.license.setTranslationY(f);
    }

    /* renamed from: break, reason: not valid java name */
    public final void m3313break() {
        boolean z = this.tapsense;
        boolean z2 = false;
        boolean z3 = z && !this.yandex;
        if (z && this.yandex) {
            z2 = true;
        }
        if (z3 != this.isVip) {
            this.isVip = z3;
            this.license.setClipToBounds(z3);
        }
        if (z2 != this.inmobi) {
            this.inmobi = z2;
            this.license.setClipToOutline(z2);
        }
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: class */
    public final void mo275class(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e, C16446e c16446e, C17097e c17097e) {
        C14434e c14434e = this.metrica;
        RecordingCanvas beginRecording = this.license.beginRecording();
        try {
            C16125e c16125e = this.vip;
            C11648e c11648e = c16125e.ad;
            Canvas canvas = c11648e.ad;
            c11648e.ad = beginRecording;
            C18478e c18478e = c14434e.f28537e;
            c18478e.m4532const(interfaceC14388e);
            c18478e.m4542for(enumC7792e);
            c18478e.f36227e = c16446e;
            c18478e.m4533continue(this.appmetrica);
            c18478e.m4541finally(c11648e);
            c17097e.invoke(c14434e);
            c16125e.ad.ad = canvas;
        } finally {
            this.license.endRecording();
        }
    }

    @Override // defpackage.InterfaceC3828e
    public final void crashlytics(boolean z) {
        this.tapsense = z;
        m3313break();
    }

    /* renamed from: default, reason: not valid java name */
    public final void m3314default() {
        int i = this.applovin;
        if (i != 1 && this.adcel == 3 && this.isPro == null) {
            m3312abstract(this.license, i);
        } else {
            m3312abstract(this.license, 1);
        }
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: extends */
    public final void mo277extends(float f) {
        this.signatures = f;
        this.license.setCameraDistance(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final float firebase() {
        return this.subscription;
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: goto */
    public final void mo278goto(float f) {
        this.smaato = f;
        this.license.setTranslationX(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final void inmobi(long j) {
        this.Signature = j;
        this.license.setAmbientShadowColor(AbstractC6532e.m2193extends(j));
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: interface */
    public final void mo279interface(int i) {
        this.applovin = i;
        m3314default();
    }

    @Override // defpackage.InterfaceC3828e
    public final void isPro() {
        Paint paint = this.purchase;
        if (paint == null) {
            paint = new Paint();
            this.purchase = paint;
        }
        paint.setColorFilter(null);
        m3314default();
    }

    @Override // defpackage.InterfaceC3828e
    public final long isVip() {
        return this.admob;
    }

    @Override // defpackage.InterfaceC3828e
    public final void license(float f) {
        this.loadAd = f;
        this.license.setElevation(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final void loadAd(float f) {
        this.advert = f;
        this.license.setScaleY(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final float metrica() {
        return this.mopub;
    }

    @Override // defpackage.InterfaceC3828e
    public final void mopub(int i, long j, int i2) {
        this.license.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.appmetrica = AbstractC8116e.startapp(j);
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: native */
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
        this.isPro = c9508e;
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC16048e.m4106this(this.license, c9508e);
        }
    }

    @Override // defpackage.InterfaceC3828e
    public final long pro() {
        return this.Signature;
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: protected */
    public final int mo281protected() {
        return this.adcel;
    }

    @Override // defpackage.InterfaceC3828e
    public final void purchase(float f) {
        this.pro = f;
        this.license.setRotationZ(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final void remoteconfig(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.license.resetPivot();
        } else {
            this.license.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.license.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.InterfaceC3828e
    public final void signatures(float f) {
        this.startapp = f;
        this.license.setAlpha(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final int smaato() {
        return this.applovin;
    }

    @Override // defpackage.InterfaceC3828e
    public final void startapp(int i) {
        this.adcel = i;
        Paint paint = this.purchase;
        if (paint == null) {
            paint = new Paint();
            this.purchase = paint;
        }
        paint.setBlendMode(AbstractC14204e.m3771default(i));
        m3314default();
    }

    @Override // defpackage.InterfaceC3828e
    public final float subs() {
        return this.smaato;
    }

    @Override // defpackage.InterfaceC3828e
    public final float subscription() {
        return this.pro;
    }

    @Override // defpackage.InterfaceC3828e
    public final float tapsense() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: this */
    public final void mo282this(long j) {
        this.admob = j;
        this.license.setSpotShadowColor(AbstractC6532e.m2193extends(j));
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: throw */
    public final float mo283throw() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: try */
    public final void mo284try(float f) {
        this.subscription = f;
        this.license.setRotationX(f);
    }

    @Override // defpackage.InterfaceC3828e
    public final void vip(float f) {
        this.remoteconfig = f;
        this.license.setRotationY(f);
    }

    @Override // defpackage.InterfaceC3828e
    /* renamed from: while */
    public final float mo285while() {
        return this.advert;
    }

    @Override // defpackage.InterfaceC3828e
    public final void yandex(Outline outline, long j) {
        this.license.setOutline(outline);
        this.yandex = outline != null;
        m3313break();
    }
}
