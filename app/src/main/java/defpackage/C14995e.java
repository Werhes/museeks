package defpackage;

import android.os.Trace;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔ۟ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14995e {
    public Object ad;
    public Object adcel;
    public Object appmetrica;
    public Object billing;
    public Object license;
    public Object metrica;
    public Object mopub;
    public Object purchase;
    public Object startapp;
    public Object vip;
    public Object yandex;

    public C14995e() {
        C12431e c12431e = new C12431e(0, new InterfaceC9374e[16]);
        this.metrica = c12431e;
        C12618e c12618e = AbstractC1710e.ad;
        this.license = new C12618e();
        this.appmetrica = c12431e;
        this.purchase = new C12431e(0, new Object[16]);
        this.billing = new C12431e(0, new Function0[16]);
    }

    public C14995e(Enum r3) {
        this.ad = new C14099e(9);
        this.vip = new C10684e();
        this.metrica = AbstractC14533e.startapp(r3);
        this.license = AbstractC14533e.startapp(r3);
        this.billing = AbstractC14533e.purchase(new C8812e(this, 0));
        this.startapp = new C2616e(Float.NaN);
        this.yandex = AbstractC14533e.appmetrica(C12575e.f25232e, new C8812e(this, 1));
        this.adcel = new C2616e(0.0f);
        this.appmetrica = AbstractC14533e.startapp(null);
        this.purchase = AbstractC14533e.startapp(new C1295e(C13664e.f27089e, new float[0]));
        this.mopub = new C5624e(this);
    }

    public static Object vip(C14995e c14995e, Function3 function3, AbstractC10731e abstractC10731e) {
        C10684e c10684e = (C10684e) c14995e.vip;
        C17212e c17212e = new C17212e(c14995e, (InterfaceC5083e) null, function3);
        c10684e.getClass();
        Object appmetrica = AbstractC9743e.appmetrica(new C6365e(EnumC6955e.f14256e, c10684e, c17212e, null), abstractC10731e);
        return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
    }

    public static final boolean yandex(InterfaceC9374e interfaceC9374e, C12431e c12431e) {
        Object[] objArr = c12431e.f24870e;
        int i = c12431e.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC14620e applovin = ((InterfaceC9374e) objArr[i2]).applovin();
            if (applovin instanceof C16283e) {
                C12431e c12431e2 = ((C16283e) applovin).f31971e;
                if (c12431e2.smaato(interfaceC9374e) || yandex(interfaceC9374e, c12431e2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object ad(java.lang.Object r11, defpackage.EnumC6955e r12, kotlin.jvm.functions.Function4 r13, defpackage.AbstractC10731e r14) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.appmetrica
            r1 = r0
            eؑۜٝ r1 = (defpackage.C0576e) r1
            boolean r0 = r14 instanceof defpackage.C18083e
            if (r0 == 0) goto L18
            r0 = r14
            e٘ۢ۠ r0 = (defpackage.C18083e) r0
            int r2 = r0.f35468e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r0.f35468e = r2
            goto L1d
        L18:
            e٘ۢ۠ r0 = new e٘ۢ۠
            r0.<init>(r10, r14)
        L1d:
            java.lang.Object r14 = r0.f35467e
            int r2 = r0.f35468e
            r3 = 1
            r8 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            defpackage.AbstractC2003e.purchase(r14)     // Catch: java.lang.Throwable -> L2c
            r5 = r10
            goto L65
        L2c:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L6f
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            defpackage.AbstractC2003e.purchase(r14)
            eؒۙۥ r14 = r10.startapp()
            boolean r14 = r14.metrica(r11)
            if (r14 == 0) goto L73
            java.lang.Object r14 = r10.vip     // Catch: java.lang.Throwable -> L6c
            eَّۧ r14 = (defpackage.C10684e) r14     // Catch: java.lang.Throwable -> L6c
            eّٜ٘ r4 = new eّٜ٘     // Catch: java.lang.Throwable -> L6c
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L69
            r0.f35468e = r3     // Catch: java.lang.Throwable -> L69
            r14.getClass()     // Catch: java.lang.Throwable -> L69
            eؙّۤ r11 = new eؙّۤ     // Catch: java.lang.Throwable -> L69
            r11.<init>(r12, r14, r4, r8)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r11 = defpackage.AbstractC9743e.appmetrica(r11, r0)     // Catch: java.lang.Throwable -> L69
            eٟؔۙ r12 = defpackage.EnumC2821e.f6782e
            if (r11 != r12) goto L65
            return r12
        L65:
            r1.setValue(r8)
            goto L8f
        L69:
            r0 = move-exception
        L6a:
            r11 = r0
            goto L6f
        L6c:
            r0 = move-exception
            r5 = r10
            goto L6a
        L6f:
            r1.setValue(r8)
            throw r11
        L73:
            r5 = r10
            r6 = r11
            java.lang.Object r11 = r5.ad
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r11 = r11.invoke(r6)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L8f
            java.lang.Object r11 = r5.license
            eؑۜٝ r11 = (defpackage.C0576e) r11
            r11.setValue(r6)
            r10.amazon(r6)
        L8f:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14995e.ad(java.lang.Object, eؚؗۨ, kotlin.jvm.functions.Function4, eُؑ۠):java.lang.Object");
    }

    public float adcel(float f) {
        C2616e c2616e = (C2616e) this.startapp;
        return AbstractC3062e.vip((Float.isNaN(c2616e.purchase()) ? 0.0f : c2616e.purchase()) + f, startapp().appmetrica(), startapp().license());
    }

    public void advert(InterfaceC9374e interfaceC9374e) {
        ((C12431e) this.appmetrica).license(interfaceC9374e);
        ((C12618e) this.license).ad(interfaceC9374e);
    }

    public void amazon(Object obj) {
        ((C0576e) this.metrica).setValue(obj);
    }

    public void appmetrica() {
        C12431e c12431e = (C12431e) this.metrica;
        C12431e c12431e2 = (C12431e) this.purchase;
        Set set = (Set) this.ad;
        if (set == null) {
            return;
        }
        this.mopub = null;
        int i = 4;
        if (c12431e2.f24868e != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C12618e c12618e = (C12618e) this.yandex;
                int i2 = c12431e2.f24868e;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = c12431e2.f24870e[i2];
                    try {
                        if (obj instanceof InterfaceC9374e) {
                            InterfaceC14620e applovin = ((InterfaceC9374e) obj).applovin();
                            set.remove(applovin);
                            applovin.vip();
                        }
                        if (obj instanceof InterfaceC16503e) {
                            if (c12618e == null || !c12618e.metrica(obj)) {
                                ((InterfaceC16503e) obj).vip();
                            } else {
                                ((InterfaceC16503e) obj).ad();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        C3344e c3344e = (C3344e) this.vip;
                        if (c3344e != null) {
                            AbstractC3415e.mopub(th, new C5625e(c3344e, obj, i));
                        }
                        throw th;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c12431e.f24868e != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.ad;
                if (set2 != null) {
                    Object[] objArr = c12431e.f24870e;
                    int i3 = c12431e.f24868e;
                    for (int i4 = 0; i4 < i3; i4++) {
                        InterfaceC9374e interfaceC9374e = (InterfaceC9374e) objArr[i4];
                        InterfaceC14620e applovin2 = interfaceC9374e.applovin();
                        set2.remove(applovin2);
                        try {
                            applovin2.metrica();
                            Unit unit3 = Unit.INSTANCE;
                        } catch (Throwable th3) {
                            C3344e c3344e2 = (C3344e) this.vip;
                            if (c3344e2 != null) {
                                AbstractC3415e.mopub(th3, new C5625e(c3344e2, interfaceC9374e, i));
                            }
                            throw th3;
                        }
                    }
                }
                Unit unit4 = Unit.INSTANCE;
            } finally {
                Trace.endSection();
            }
        }
    }

    public void billing(InterfaceC9374e interfaceC9374e) {
        C12431e c12431e = (C12431e) this.metrica;
        if (!((C12618e) this.license).metrica(interfaceC9374e)) {
            C12618e c12618e = (C12618e) this.mopub;
            if (c12618e == null || !c12618e.metrica(interfaceC9374e)) {
                ((C12431e) this.purchase).license(interfaceC9374e);
                return;
            }
            return;
        }
        ((C12618e) this.license).smaato(interfaceC9374e);
        if (!((C12431e) this.appmetrica).smaato(interfaceC9374e) && !c12431e.smaato(interfaceC9374e)) {
            yandex(interfaceC9374e, c12431e);
        }
        Set set = (Set) this.ad;
        if (set == null) {
            return;
        }
        set.add(interfaceC9374e.applovin());
    }

    public void license() {
        Set set = (Set) this.ad;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC14620e interfaceC14620e = (InterfaceC14620e) it.next();
                it.remove();
                interfaceC14620e.ad();
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void loadAd(C1295e c1295e, Object obj) {
        C0576e c0576e = (C0576e) this.appmetrica;
        if (AbstractC7890e.billing(startapp(), c1295e)) {
            return;
        }
        ((C0576e) this.purchase).setValue(c1295e);
        C10684e c10684e = (C10684e) this.vip;
        C17651e c17651e = c10684e.vip;
        C17651e c17651e2 = c10684e.vip;
        boolean purchase = c17651e.purchase();
        if (purchase) {
            try {
                C5624e c5624e = (C5624e) this.mopub;
                float purchase2 = startapp().purchase(obj);
                if (!Float.isNaN(purchase2)) {
                    c5624e.ad(purchase2, 0.0f);
                    c0576e.setValue(null);
                }
                amazon(obj);
                ((C0576e) this.license).setValue(obj);
                c17651e2.billing(null);
            } catch (Throwable th) {
                c17651e2.billing(null);
                throw th;
            }
        }
        if (purchase) {
            return;
        }
        c0576e.setValue(obj);
    }

    public void metrica() {
        this.ad = null;
        this.vip = null;
        C12431e c12431e = (C12431e) this.metrica;
        c12431e.startapp();
        ((C12618e) this.license).vip();
        this.appmetrica = c12431e;
        ((C12431e) this.purchase).startapp();
        ((C12431e) this.billing).startapp();
        this.yandex = null;
        this.startapp = null;
        this.adcel = null;
    }

    public void mopub(Set set, C3344e c3344e) {
        metrica();
        this.ad = set;
        this.vip = c3344e;
    }

    public void purchase() {
        C12431e c12431e = (C12431e) this.billing;
        if (c12431e.f24868e != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = c12431e.f24870e;
                int i = c12431e.f24868e;
                for (int i2 = 0; i2 < i; i2++) {
                    ((Function0) objArr[i2]).invoke();
                }
                c12431e.startapp();
                Unit unit = Unit.INSTANCE;
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public float smaato() {
        C2616e c2616e = (C2616e) this.startapp;
        if (Float.isNaN(c2616e.purchase())) {
            AbstractC8889e.metrica("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c2616e.purchase();
    }

    public C1295e startapp() {
        return (C1295e) ((C0576e) this.purchase).getValue();
    }
}
