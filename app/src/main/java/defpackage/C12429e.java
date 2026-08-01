package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12429e implements InterfaceC7183e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public float f24859e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public float f24860e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C10014e f24861e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public EnumC7792e f24862e = EnumC7792e.f15793e;

    public C12429e(C10014e c10014e) {
        this.f24861e = c10014e;
    }

    @Override // defpackage.InterfaceC13158e
    public final InterfaceC17242e ads(int i, int i2, Map map, Function1 function1) {
        return mo500public(i, i2, map, null, function1);
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

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘْؖ */
    public final /* synthetic */ int mo493e(float f) {
        return AbstractC4653e.ad(this, f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘؕۥ */
    public final /* synthetic */ long mo494e(long j) {
        return AbstractC4653e.appmetrica(j, this);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eٓٛۢ */
    public final /* synthetic */ float mo495e(long j) {
        return AbstractC4653e.license(j, this);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: final */
    public final float mo496final(int i) {
        return i / vip();
    }

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ float firebase(long j) {
        return AbstractC4653e.vip(j, this);
    }

    @Override // defpackage.InterfaceC0732e
    public final EnumC7792e getLayoutDirection() {
        return this.f24862e;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: instanceof */
    public final float mo497instanceof(float f) {
        return vip() * f;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new */
    public final float mo498new(float f) {
        return f / vip();
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        return this.f24859e;
    }

    @Override // defpackage.InterfaceC13158e
    /* renamed from: public */
    public final InterfaceC17242e mo500public(int i, int i2, Map map, Function1 function1, Function1 function12) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC14070e.metrica("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C13617e(i, i2, map, function1, this, this.f24861e, function12);
    }

    @Override // defpackage.InterfaceC7183e
    public final List subscription(Object obj, Function2 function2) {
        C10014e c10014e = this.f24861e;
        c10014e.yandex();
        C13915e c13915e = c10014e.f19781e;
        int i = c13915e.f27612e.license;
        if (i != 1 && i != 3 && i != 2 && i != 4) {
            AbstractC14070e.metrica("subcompose can only be used inside the measure or layout blocks");
        }
        C0583e c0583e = c10014e.f19782e;
        Object billing = c0583e.billing(obj);
        if (billing == null) {
            billing = (C13915e) c10014e.f19772e.advert(obj);
            if (billing != null) {
                if (c10014e.f19775e <= 0) {
                    AbstractC14070e.metrica("Check failed.");
                }
                c10014e.f19775e--;
            } else {
                billing = c10014e.loadAd(obj);
                if (billing == null) {
                    int i2 = c10014e.f19779e;
                    C13915e c13915e2 = new C13915e(2);
                    c13915e.f27611e = true;
                    c13915e.subs(i2, c13915e2);
                    Unit unit = Unit.INSTANCE;
                    c13915e.f27611e = false;
                    billing = c13915e2;
                }
            }
            c0583e.amazon(obj, billing);
        }
        C13915e c13915e3 = (C13915e) billing;
        if (AbstractC13480e.m3592native(c10014e.f19779e, c13915e.Signature()) != c13915e3) {
            int advert = ((C12431e) ((C8794e) c13915e.Signature()).f17708e).advert(c13915e3);
            if (advert < c10014e.f19779e) {
                AbstractC14070e.ad("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = c10014e.f19779e;
            if (i3 != advert) {
                c10014e.mopub(advert, i3);
            }
        }
        c10014e.f19779e++;
        c10014e.amazon(c13915e3, obj, false, function2);
        return (i == 1 || i == 3) ? c13915e3.amazon() : c13915e3.smaato();
    }

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ long tapsense(long j) {
        return AbstractC4653e.metrica(j, this);
    }

    @Override // defpackage.InterfaceC0732e
    /* renamed from: transient */
    public final boolean mo398transient() {
        int i = this.f24861e.f19781e.f27612e.license;
        return i == 4 || i == 2;
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f24860e;
    }
}
