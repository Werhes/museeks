package defpackage;

import android.graphics.Paint;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؐۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14434e implements InterfaceC2235e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C11447e f28536e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C18478e f28537e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C11447e f28538e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17539e f28539e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, e٘ؕٛ] */
    public C14434e() {
        ?? obj = new Object();
        obj.ad = AbstractC14753e.ad;
        obj.vip = EnumC7792e.f15794e;
        obj.metrica = C1217e.ad;
        obj.license = 0L;
        this.f28539e = obj;
        this.f28537e = new C18478e(this);
    }

    public static C11447e ad(C14434e c14434e, long j, AbstractC4970e abstractC4970e, float f, C2815e c2815e, int i) {
        C11447e purchase = c14434e.purchase(abstractC4970e);
        if (f != 1.0f) {
            j = C3618e.vip(C3618e.license(j) * f, j);
        }
        Paint paint = purchase.ad;
        if (!C3618e.metrica(AbstractC6532e.vip(paint.getColor()), j)) {
            purchase.appmetrica(j);
        }
        if (purchase.metrica != null) {
            purchase.startapp(null);
        }
        if (!AbstractC7890e.billing(purchase.license, c2815e)) {
            purchase.purchase(c2815e);
        }
        if (purchase.vip != i) {
            purchase.license(i);
        }
        if (paint.isFilterBitmap()) {
            return purchase;
        }
        purchase.billing(1);
        return purchase;
    }

    public static C11447e license(C14434e c14434e, long j, float f, int i) {
        C11447e c11447e = c14434e.f28538e;
        if (c11447e == null) {
            c11447e = AbstractC17331e.vip();
            c11447e.smaato(1);
            c14434e.f28538e = c11447e;
        }
        Paint paint = c11447e.ad;
        if (!C3618e.metrica(AbstractC6532e.vip(paint.getColor()), j)) {
            c11447e.appmetrica(j);
        }
        if (c11447e.metrica != null) {
            c11447e.startapp(null);
        }
        if (!AbstractC7890e.billing(c11447e.license, null)) {
            c11447e.purchase(null);
        }
        if (c11447e.vip != 3) {
            c11447e.license(3);
        }
        if (paint.getStrokeWidth() != f) {
            c11447e.advert(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (c11447e.ad() != i) {
            c11447e.adcel(i);
        }
        if (c11447e.vip() != 0) {
            c11447e.mopub(0);
        }
        if (!AbstractC7890e.billing(c11447e.appmetrica, null)) {
            c11447e.yandex(null);
        }
        if (paint.isFilterBitmap()) {
            return c11447e;
        }
        c11447e.billing(1);
        return c11447e;
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: abstract */
    public final void mo775abstract(long j, float f, long j2, AbstractC4970e abstractC4970e) {
        this.f28539e.metrica.metrica(f, j2, ad(this, j, abstractC4970e, 1.0f, null, 3));
    }

    @Override // defpackage.InterfaceC2235e
    public final void applovin(C1362e c1362e, long j, float f, C2815e c2815e, int i) {
        this.f28539e.metrica.Signature(c1362e, j, metrica(null, C6590e.ad, f, c2815e, i, 1));
    }

    public final void appmetrica(AbstractC4457e abstractC4457e, long j, long j2, float f, float f2) {
        InterfaceC14576e interfaceC14576e = this.f28539e.metrica;
        C11447e c11447e = this.f28538e;
        if (c11447e == null) {
            c11447e = AbstractC17331e.vip();
            c11447e.smaato(1);
            this.f28538e = c11447e;
        }
        Paint paint = c11447e.ad;
        if (abstractC4457e != null) {
            abstractC4457e.ad(f2, this.f28537e.m4560try(), c11447e);
        } else if (paint.getAlpha() / 255.0f != f2) {
            c11447e.metrica(f2);
        }
        if (!AbstractC7890e.billing(c11447e.license, null)) {
            c11447e.purchase(null);
        }
        if (c11447e.vip != 3) {
            c11447e.license(3);
        }
        if (paint.getStrokeWidth() != f) {
            c11447e.advert(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (c11447e.ad() != 0) {
            c11447e.adcel(0);
        }
        if (c11447e.vip() != 0) {
            c11447e.mopub(0);
        }
        if (!AbstractC7890e.billing(c11447e.appmetrica, null)) {
            c11447e.yandex(null);
        }
        if (!paint.isFilterBitmap()) {
            c11447e.billing(1);
        }
        interfaceC14576e.yandex(j, j2, c11447e);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: const */
    public final int mo491const(long j) {
        return Math.round(mo495e(j));
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: default */
    public final long mo492default(float f) {
        return AbstractC4653e.purchase(this, mo498new(f));
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: extends */
    public final void mo776extends(long j, long j2, long j3, float f, int i) {
        this.f28539e.metrica.yandex(j2, j3, license(this, j, f, i));
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: eؑۥؘ */
    public final void mo777e(C1362e c1362e, long j, long j2, long j3, float f, C2815e c2815e, int i) {
        this.f28539e.metrica.license(c1362e, j, j2, j3, metrica(null, C6590e.ad, f, c2815e, 3, i));
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: eؒۤۨ */
    public final void mo778e(ArrayList arrayList, long j, float f) {
        this.f28539e.metrica.subscription(arrayList, license(this, j, f, 1));
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘْؖ */
    public final /* synthetic */ int mo493e(float f) {
        return AbstractC4653e.ad(this, f);
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: eٌؖۡ */
    public final long mo779e() {
        return AbstractC5092e.license(this.f28537e.m4560try());
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘؕۥ */
    public final /* synthetic */ long mo494e(long j) {
        return AbstractC4653e.appmetrica(j, this);
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: eَٖٓ */
    public final void mo780e(AbstractC4457e abstractC4457e, long j, long j2, float f, AbstractC4970e abstractC4970e, C2815e c2815e, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.f28539e.metrica.mopub(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), metrica(abstractC4457e, abstractC4970e, f, c2815e, i, 1));
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eٓٛۢ */
    public final /* synthetic */ float mo495e(long j) {
        return AbstractC4653e.license(j, this);
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: eٟٗۦ */
    public final void mo781e(long j, long j2, long j3, float f, AbstractC4970e abstractC4970e, C2815e c2815e, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f28539e.metrica.mopub(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), ad(this, j, abstractC4970e, f, c2815e, i));
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: final */
    public final float mo496final(int i) {
        return i / vip();
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: finally */
    public final C18478e mo782finally() {
        return this.f28537e;
    }

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ float firebase(long j) {
        return AbstractC4653e.vip(j, this);
    }

    @Override // defpackage.InterfaceC2235e
    public final EnumC7792e getLayoutDirection() {
        return this.f28539e.vip;
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: import */
    public final void mo783import(long j, long j2, long j3, long j4, AbstractC4970e abstractC4970e) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f28539e.metrica.purchase(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), ad(this, j, abstractC4970e, 1.0f, null, 3));
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: instanceof */
    public final float mo497instanceof(float f) {
        return vip() * f;
    }

    public final C11447e metrica(AbstractC4457e abstractC4457e, AbstractC4970e abstractC4970e, float f, C2815e c2815e, int i, int i2) {
        C11447e purchase = purchase(abstractC4970e);
        if (abstractC4457e != null) {
            abstractC4457e.ad(f, this.f28537e.m4560try(), purchase);
        } else {
            Paint paint = purchase.ad;
            if (purchase.metrica != null) {
                purchase.startapp(null);
            }
            long vip = AbstractC6532e.vip(paint.getColor());
            long j = C3618e.vip;
            if (!C3618e.metrica(vip, j)) {
                purchase.appmetrica(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                purchase.metrica(f);
            }
        }
        if (!AbstractC7890e.billing(purchase.license, c2815e)) {
            purchase.purchase(c2815e);
        }
        if (purchase.vip != i) {
            purchase.license(i);
        }
        if (purchase.ad.isFilterBitmap() == i2) {
            return purchase;
        }
        purchase.billing(i2);
        return purchase;
    }

    @Override // defpackage.InterfaceC2235e
    public final void mopub(C17985e c17985e, long j, float f, AbstractC4970e abstractC4970e) {
        this.f28539e.metrica.appmetrica(c17985e, ad(this, j, abstractC4970e, f, null, 3));
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new */
    public final float mo498new(float f) {
        return f / vip();
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        return this.f28539e.ad.mo499package();
    }

    public final C11447e purchase(AbstractC4970e abstractC4970e) {
        if (AbstractC7890e.billing(abstractC4970e, C6590e.ad)) {
            C11447e c11447e = this.f28536e;
            if (c11447e != null) {
                return c11447e;
            }
            C11447e vip = AbstractC17331e.vip();
            vip.smaato(0);
            this.f28536e = vip;
            return vip;
        }
        if (!(abstractC4970e instanceof C13121e)) {
            throw new C14803e(10);
        }
        C11447e c11447e2 = this.f28538e;
        if (c11447e2 == null) {
            c11447e2 = AbstractC17331e.vip();
            c11447e2.smaato(1);
            this.f28538e = c11447e2;
        }
        Paint paint = c11447e2.ad;
        float strokeWidth = paint.getStrokeWidth();
        C13121e c13121e = (C13121e) abstractC4970e;
        C1667e c1667e = c13121e.appmetrica;
        float f = c13121e.ad;
        if (strokeWidth != f) {
            c11447e2.advert(f);
        }
        int ad = c11447e2.ad();
        int i = c13121e.metrica;
        if (ad != i) {
            c11447e2.adcel(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = c13121e.vip;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int vip2 = c11447e2.vip();
        int i2 = c13121e.license;
        if (vip2 != i2) {
            c11447e2.mopub(i2);
        }
        if (!AbstractC7890e.billing(c11447e2.appmetrica, c1667e)) {
            c11447e2.yandex(c1667e);
        }
        return c11447e2;
    }

    @Override // defpackage.InterfaceC2235e
    public final void remoteconfig(long j, C16446e c16446e, Function1 function1) {
        c16446e.appmetrica(this, this.f28539e.vip, j, new C5337e(this, function1, 10));
    }

    @Override // defpackage.InterfaceC2235e
    public final void subs(long j, float f, float f2, long j2, long j3, float f3, AbstractC4970e abstractC4970e) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f28539e.metrica.tapsense(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, ad(this, j, abstractC4970e, f3, null, 3));
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: synchronized */
    public final void mo784synchronized(C17985e c17985e, AbstractC4457e abstractC4457e, float f, AbstractC4970e abstractC4970e, C2815e c2815e, int i) {
        this.f28539e.metrica.appmetrica(c17985e, metrica(abstractC4457e, abstractC4970e, f, c2815e, i, 1));
    }

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ long tapsense(long j) {
        return AbstractC4653e.metrica(j, this);
    }

    @Override // defpackage.InterfaceC2235e
    /* renamed from: throws */
    public final void mo785throws(AbstractC4457e abstractC4457e, long j, long j2, long j3, float f, AbstractC4970e abstractC4970e, C2815e c2815e, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.f28539e.metrica.purchase(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), metrica(abstractC4457e, abstractC4970e, f, c2815e, i, 1));
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f28539e.ad.vip();
    }

    @Override // defpackage.InterfaceC2235e
    public final long yandex() {
        return this.f28537e.m4560try();
    }
}
