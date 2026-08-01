package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؒۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14456e implements InterfaceC7183e, InterfaceC13158e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10014e f28568e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C12429e f28569e;

    public C14456e(C10014e c10014e) {
        this.f28568e = c10014e;
        this.f28569e = c10014e.f19777e;
    }

    @Override // defpackage.InterfaceC13158e
    public final InterfaceC17242e ads(int i, int i2, Map map, Function1 function1) {
        return this.f28569e.mo500public(i, i2, map, null, function1);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: const */
    public final int mo491const(long j) {
        return this.f28569e.mo491const(j);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: default */
    public final long mo492default(float f) {
        return this.f28569e.mo492default(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘْؖ */
    public final int mo493e(float f) {
        C12429e c12429e = this.f28569e;
        c12429e.getClass();
        return AbstractC4653e.ad(c12429e, f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘؕۥ */
    public final long mo494e(long j) {
        C12429e c12429e = this.f28569e;
        c12429e.getClass();
        return AbstractC4653e.appmetrica(j, c12429e);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eٓٛۢ */
    public final float mo495e(long j) {
        C12429e c12429e = this.f28569e;
        c12429e.getClass();
        return AbstractC4653e.license(j, c12429e);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: final */
    public final float mo496final(int i) {
        return this.f28569e.mo496final(i);
    }

    @Override // defpackage.InterfaceC14388e
    public final float firebase(long j) {
        C12429e c12429e = this.f28569e;
        c12429e.getClass();
        return AbstractC4653e.vip(j, c12429e);
    }

    @Override // defpackage.InterfaceC0732e
    public final EnumC7792e getLayoutDirection() {
        return this.f28569e.f24862e;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: instanceof */
    public final float mo497instanceof(float f) {
        return this.f28569e.vip() * f;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new */
    public final float mo498new(float f) {
        return f / this.f28569e.vip();
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        return this.f28569e.f24859e;
    }

    @Override // defpackage.InterfaceC13158e
    /* renamed from: public */
    public final InterfaceC17242e mo500public(int i, int i2, Map map, Function1 function1, Function1 function12) {
        return this.f28569e.mo500public(i, i2, C9139e.f18290e, function1, function12);
    }

    @Override // defpackage.InterfaceC7183e
    public final List subscription(Object obj, Function2 function2) {
        C10014e c10014e = this.f28568e;
        C13915e c13915e = c10014e.f19781e;
        C0583e c0583e = c10014e.f19782e;
        C13915e c13915e2 = (C13915e) c0583e.billing(obj);
        if (c13915e2 != null && ((C12431e) ((C8794e) c13915e.Signature()).f17708e).advert(c13915e2) < c10014e.f19779e) {
            return c13915e2.amazon();
        }
        C0583e c0583e2 = c10014e.f19770e;
        C0583e c0583e3 = c10014e.f19772e;
        C12431e c12431e = c10014e.f19769e;
        if (c12431e.f24868e < c10014e.f19768e) {
            AbstractC14070e.ad("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        C13915e c13915e3 = (C13915e) c0583e.billing(obj);
        int i = c12431e.f24868e;
        int i2 = c10014e.f19768e;
        if (i == i2) {
            c12431e.license(obj);
        } else {
            Object[] objArr = c12431e.f24870e;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        c10014e.f19768e++;
        boolean vip = c0583e3.vip(obj);
        if (vip || c13915e3 != null) {
            if (!vip && c13915e3 != null) {
                c10014e.mopub(((C12431e) ((C8794e) c13915e.Signature()).f17708e).advert(c13915e3), ((C12431e) ((C8794e) c13915e.Signature()).f17708e).f24868e);
                c10014e.f19775e++;
                c0583e.advert(obj);
                c0583e3.amazon(obj, c13915e3);
                c0583e2.amazon(obj, c10014e.purchase(obj));
                if (c13915e.m3708extends()) {
                    c10014e.yandex();
                }
            }
            C13915e c13915e4 = (C13915e) c0583e3.billing(obj);
            C5017e c5017e = c13915e4 != null ? (C5017e) c10014e.f19783e.billing(c13915e4) : null;
            if (c5017e != null && c5017e.license) {
                c10014e.amazon(c13915e4, obj, false, function2);
            }
            if ((c5017e != null ? c5017e.purchase : null) != null) {
                c10014e.license(c5017e, true);
            }
        } else {
            c10014e.advert(obj, function2, false);
            c0583e2.amazon(obj, c10014e.purchase(obj));
        }
        C13915e c13915e5 = (C13915e) c0583e3.billing(obj);
        if (c13915e5 == null) {
            return C13664e.f27089e;
        }
        List m3361private = c13915e5.f27612e.Signature.m3361private();
        C8794e c8794e = (C8794e) m3361private;
        int i3 = ((C12431e) c8794e.f17708e).f24868e;
        for (int i4 = 0; i4 < i3; i4++) {
            ((C12570e) c8794e.get(i4)).f25213e.vip = true;
        }
        return m3361private;
    }

    @Override // defpackage.InterfaceC14388e
    public final long tapsense(long j) {
        C12429e c12429e = this.f28569e;
        c12429e.getClass();
        return AbstractC4653e.metrica(j, c12429e);
    }

    @Override // defpackage.InterfaceC0732e
    /* renamed from: transient */
    public final boolean mo398transient() {
        return this.f28569e.mo398transient();
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f28569e.f24860e;
    }
}
