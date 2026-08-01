package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۚۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8202e implements InterfaceC10481e {
    public static final C11883e isVip = AbstractC9743e.startapp(new C17187e(11), new C8436e(0, 24));
    public final C7850e Signature;
    public final C13751e ad;
    public C13915e adcel;
    public final C4695e admob;
    public final C0571e advert;
    public final C6594e amazon;
    public final C0576e appmetrica;
    public float billing;
    public final C10197e license;
    public final C7513e loadAd;
    public C17908e metrica;
    public final C6827e mopub;
    public final C0576e pro;
    public final C15274e purchase;
    public final InterfaceC3314e remoteconfig;
    public final C0576e signatures;
    public final C2245e smaato;
    public final boolean startapp;
    public final InterfaceC3314e subscription;
    public final C10312e tapsense;
    public boolean vip;
    public final C18237e yandex;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eٟٓؔ] */
    public C8202e(int i, int i2) {
        ?? obj = new Object();
        obj.ad = -1;
        obj.appmetrica = new C12431e(0, new InterfaceC5066e[16]);
        obj.metrica = -1;
        this.ad = obj;
        this.license = new C10197e(i, i2, 0);
        this.appmetrica = new C0576e(AbstractC8644e.ad, C10990e.f21771e);
        this.purchase = new C15274e();
        this.yandex = new C18237e(new C2109e(20, this));
        this.startapp = true;
        this.mopub = new C6827e(this, 0);
        this.advert = new C0571e();
        this.smaato = new C2245e();
        this.amazon = new C6594e(17);
        this.loadAd = new C7513e(new C17766e(this, i, 1));
        this.Signature = new C7850e(15, this);
        this.admob = new C4695e();
        this.subscription = AbstractC8508e.vip();
        this.remoteconfig = AbstractC8508e.vip();
        Boolean bool = Boolean.FALSE;
        this.pro = AbstractC14533e.startapp(bool);
        this.signatures = AbstractC14533e.startapp(bool);
        this.tapsense = new C10312e(1);
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean ad() {
        return this.yandex.ad();
    }

    @Override // defpackage.InterfaceC10481e
    public final float appmetrica(float f) {
        return this.yandex.appmetrica(f);
    }

    public final C17908e billing() {
        return (C17908e) this.appmetrica.getValue();
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean license() {
        return ((Boolean) this.pro.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean metrica() {
        return ((Boolean) this.signatures.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final void purchase(C17908e c17908e, boolean z, boolean z2) {
        C6564e c6564e;
        C6564e c6564e2;
        C6564e c6564e3;
        ?? r0 = c17908e.smaato;
        int i = c17908e.Signature;
        C8305e c8305e = c17908e.ad;
        int i2 = c17908e.vip;
        this.loadAd.appmetrica = r0.size();
        Object obj = null;
        obj = null;
        C10312e c10312e = this.tapsense;
        C10197e c10197e = this.license;
        if (!z && this.vip) {
            this.metrica = c17908e;
            AbstractC13717e adcel = AbstractC12640e.adcel();
            Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
            AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
            try {
                if (c10312e.isVip() && i2 == c10197e.metrica.purchase() && c8305e != null && (c6564e3 = (C6564e) AbstractC1660e.ads(c8305e.vip)) != null && c6564e3.ad == c10197e.vip.purchase()) {
                    c10312e.firebase();
                }
                Unit unit = Unit.INSTANCE;
                AbstractC12640e.Signature(adcel, smaato, appmetrica);
                return;
            } catch (Throwable th) {
                AbstractC12640e.Signature(adcel, smaato, appmetrica);
                throw th;
            }
        }
        if (z) {
            this.vip = true;
        }
        this.billing -= c17908e.license;
        this.appmetrica.setValue(c17908e);
        this.signatures.setValue(Boolean.valueOf(((c8305e != null ? c8305e.ad : 0) == 0 && i2 == 0) ? false : true));
        this.pro.setValue(Boolean.valueOf(c17908e.metrica));
        if (z2) {
            c10197e.getClass();
            if (!(((float) i2) >= 0.0f)) {
                AbstractC8889e.metrica("scrollOffset should be non-negative");
            }
            c10197e.metrica.startapp(i2);
        } else {
            c10197e.getClass();
            if (c8305e != null && (c6564e2 = (C6564e) AbstractC1660e.ads(c8305e.vip)) != null) {
                obj = c6564e2.vip;
            }
            c10197e.appmetrica = obj;
            if (c10197e.license || i > 0) {
                c10197e.license = true;
                if ((((float) i2) >= 0.0f) == false) {
                    AbstractC8889e.metrica("scrollOffset should be non-negative (" + i2 + ')');
                }
                c10197e.ad((c8305e == null || (c6564e = (C6564e) AbstractC1660e.ads(c8305e.vip)) == null) ? 0 : c6564e.ad, i2);
            }
            if (this.startapp) {
                C13751e c13751e = this.ad;
                C12431e c12431e = (C12431e) c13751e.appmetrica;
                int i3 = c13751e.ad;
                boolean z3 = c13751e.vip;
                if (i3 != -1 && !r0.isEmpty() && i3 != C13751e.metrica(c17908e, z3)) {
                    c13751e.ad = -1;
                    Object[] objArr = c12431e.f24870e;
                    int i4 = c12431e.f24868e;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((InterfaceC5066e) objArr[i5]).cancel();
                    }
                    c12431e.startapp();
                }
                int i6 = c13751e.metrica;
                if (i6 != -1 && c13751e.license != 0.0f && i6 != i && !r0.isEmpty()) {
                    int metrica = C13751e.metrica(c17908e, c13751e.license < 0.0f);
                    int ad = C13751e.ad(c17908e, c13751e.license < 0.0f);
                    if (ad >= 0 && ad < i && metrica != c13751e.ad && metrica >= 0) {
                        c13751e.ad = metrica;
                        c12431e.startapp();
                        c12431e.purchase(c12431e.f24868e, this.Signature.m2346while(metrica));
                    }
                }
                c13751e.metrica = i;
            }
        }
        if (z) {
            c10312e.m2794class(c17908e.purchase, c17908e.startapp, c17908e.yandex);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r5.yandex.vip(r6, r7, r0) != r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r5.advert.adcel(r0) == r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.InterfaceC10481e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(defpackage.EnumC6955e r6, kotlin.jvm.functions.Function2 r7, defpackage.InterfaceC5083e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.C14838e
            if (r0 == 0) goto L13
            r0 = r8
            eٜٔۚ r0 = (defpackage.C14838e) r0
            int r1 = r0.f29376e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29376e = r1
            goto L18
        L13:
            eٜٔۚ r0 = new eٜٔۚ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f29379e
            int r1 = r0.f29376e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r8)
            goto L6c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            eؚٖؓ r6 = r0.f29375e
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            eؚؗۨ r6 = r0.f29377e
            defpackage.AbstractC2003e.purchase(r8)
            goto L5c
        L3d:
            defpackage.AbstractC2003e.purchase(r8)
            eؑۜٝ r8 = r5.appmetrica
            java.lang.Object r8 = r8.getValue()
            e٘ٞۥ r1 = defpackage.AbstractC8644e.ad
            if (r8 != r1) goto L5c
            r0.f29377e = r6
            r8 = r7
            eؚٖؓ r8 = (defpackage.AbstractC7185e) r8
            r0.f29375e = r8
            r0.f29376e = r3
            eّؑۜ r8 = r5.advert
            java.lang.Object r8 = r8.adcel(r0)
            if (r8 != r4) goto L5c
            goto L6b
        L5c:
            r8 = 0
            r0.f29377e = r8
            r0.f29375e = r8
            r0.f29376e = r2
            eٝؒ r8 = r5.yandex
            java.lang.Object r6 = r8.vip(r6, r7, r0)
            if (r6 != r4) goto L6c
        L6b:
            return r4
        L6c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8202e.vip(eؚؗۨ, kotlin.jvm.functions.Function2, eًؗۖ):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.lang.Object] */
    public final void yandex(float f, C17908e c17908e) {
        if (this.startapp) {
            C13751e c13751e = this.ad;
            C12431e c12431e = (C12431e) c13751e.appmetrica;
            if (!c17908e.smaato.isEmpty()) {
                int i = 0;
                boolean z = f < 0.0f;
                int metrica = C13751e.metrica(c17908e, z);
                int ad = C13751e.ad(c17908e, z);
                if (ad >= 0) {
                    EnumC17426e enumC17426e = c17908e.admob;
                    ?? r7 = c17908e.smaato;
                    if (ad < c17908e.Signature) {
                        if (metrica != c13751e.ad && metrica >= 0) {
                            if (c13751e.vip != z) {
                                Object[] objArr = c12431e.f24870e;
                                int i2 = c12431e.f24868e;
                                for (int i3 = 0; i3 < i2; i3++) {
                                    ((InterfaceC5066e) objArr[i3]).cancel();
                                }
                            }
                            c13751e.vip = z;
                            c13751e.ad = metrica;
                            c12431e.startapp();
                            c12431e.purchase(c12431e.f24868e, this.Signature.m2346while(metrica));
                        }
                        if (z) {
                            C6564e c6564e = (C6564e) AbstractC13480e.m3570break(r7);
                            if (((AbstractC3167e.ad(c6564e, enumC17426e) + ((int) (enumC17426e == EnumC17426e.f34146e ? c6564e.pro & 4294967295L : c6564e.pro >> 32))) + c17908e.remoteconfig) - c17908e.loadAd < (-f)) {
                                Object[] objArr2 = c12431e.f24870e;
                                int i4 = c12431e.f24868e;
                                while (i < i4) {
                                    ((InterfaceC5066e) objArr2[i]).ad();
                                    i++;
                                }
                            }
                        } else if (c17908e.amazon - AbstractC3167e.ad((C6564e) AbstractC13480e.m3591interface(r7), enumC17426e) < f) {
                            Object[] objArr3 = c12431e.f24870e;
                            int i5 = c12431e.f24868e;
                            while (i < i5) {
                                ((InterfaceC5066e) objArr3[i]).ad();
                                i++;
                            }
                        }
                    }
                }
            }
            c13751e.license = f;
        }
    }
}
