package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٚٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4993e implements InterfaceC10481e {
    public static final C11883e isPro = AbstractC9743e.startapp(new C17187e(15), new C8436e(0, 25));
    public final C6594e Signature;
    public final C13751e ad;
    public final C18237e adcel;
    public final C7513e admob;
    public C13915e advert;
    public final C0571e amazon;
    public final C10197e appmetrica;
    public final C15274e billing;
    public final C10312e inmobi;
    public final InterfaceC3314e isVip;
    public boolean license;
    public final C2245e loadAd;
    public C13648e metrica;
    public final boolean mopub;
    public final InterfaceC3314e pro;
    public final C0576e purchase;
    public final C4695e remoteconfig;
    public final C0576e signatures;
    public final C6827e smaato;
    public boolean startapp;
    public final C6325e subscription;
    public final C0576e tapsense;
    public boolean vip;
    public float yandex;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eٟٓؔ] */
    public C4993e(int i, int i2) {
        ?? obj = new Object();
        obj.ad = -1;
        obj.metrica = -1;
        this.ad = obj;
        this.appmetrica = new C10197e(i, i2, 1);
        this.purchase = new C0576e(AbstractC9735e.ad, C10990e.f21771e);
        this.billing = new C15274e();
        this.adcel = new C18237e(new C2109e(24, this));
        this.mopub = true;
        this.smaato = new C6827e(this, 1);
        this.amazon = new C0571e();
        this.loadAd = new C2245e();
        this.Signature = new C6594e(17);
        this.admob = new C7513e(new C17028e(this, i, 11));
        this.subscription = new C6325e(17, this);
        this.remoteconfig = new C4695e();
        this.pro = AbstractC8508e.vip();
        Boolean bool = Boolean.FALSE;
        this.signatures = AbstractC14533e.startapp(bool);
        this.tapsense = AbstractC14533e.startapp(bool);
        this.isVip = AbstractC8508e.vip();
        this.inmobi = new C10312e(1);
    }

    public static Object adcel(C4993e c4993e, int i, AbstractC7185e abstractC7185e) {
        c4993e.getClass();
        Object vip = c4993e.vip(EnumC6955e.f14256e, new C17402e(c4993e, i, (InterfaceC5083e) null), abstractC7185e);
        return vip == EnumC2821e.f6782e ? vip : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean ad() {
        return this.adcel.ad();
    }

    @Override // defpackage.InterfaceC10481e
    public final float appmetrica(float f) {
        return this.adcel.appmetrica(f);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final void billing(C13648e c13648e, boolean z, boolean z2) {
        String str;
        long j;
        ?? r2 = c13648e.mopub;
        int i = c13648e.amazon;
        int i2 = c13648e.vip;
        C3225e c3225e = c13648e.ad;
        this.admob.appmetrica = r2.size();
        C10312e c10312e = this.inmobi;
        C10197e c10197e = this.appmetrica;
        if (!z && this.vip) {
            this.metrica = c13648e;
            AbstractC13717e adcel = AbstractC12640e.adcel();
            Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
            AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
            try {
                if (c10312e.isVip() && c3225e != null && c3225e.ad == c10197e.vip.purchase() && i2 == c10197e.metrica.purchase()) {
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
        this.tapsense.setValue(Boolean.valueOf(((c3225e != null ? c3225e.ad : 0) == 0 && i2 == 0) ? false : true));
        this.signatures.setValue(Boolean.valueOf(c13648e.metrica));
        this.yandex -= c13648e.license;
        this.purchase.setValue(c13648e);
        if (z2) {
            c10197e.getClass();
            if (!(((float) i2) >= 0.0f)) {
                AbstractC8889e.metrica("scrollOffset should be non-negative");
            }
            c10197e.metrica.startapp(i2);
        } else {
            C3225e c3225e2 = (C3225e) AbstractC13480e.m3604this(r2);
            C3225e c3225e3 = (C3225e) AbstractC13480e.m3569abstract(r2);
            if (c3225e2 != null) {
                str = "scrollOffset should be non-negative";
                j = c3225e2.ad;
            } else {
                str = "scrollOffset should be non-negative";
                j = -1;
            }
            AbstractC14204e.m3773final(j, "firstVisibleItem:index");
            AbstractC14204e.m3773final(c3225e3 != null ? c3225e3.ad : -1L, "lastVisibleItem:index");
            c10197e.getClass();
            c10197e.appmetrica = c3225e != null ? c3225e.mopub : null;
            if (c10197e.license || i > 0) {
                c10197e.license = true;
                if (!(((float) i2) >= 0.0f)) {
                    AbstractC8889e.metrica(str);
                }
                c10197e.ad(c3225e != null ? c3225e.ad : 0, i2);
            }
            if (this.mopub) {
                C13751e c13751e = this.ad;
                int i3 = c13751e.ad;
                boolean z3 = c13751e.vip;
                if (i3 != -1 && !r2.isEmpty() && i3 != C13751e.vip(c13648e, z3)) {
                    c13751e.ad = -1;
                    InterfaceC5066e interfaceC5066e = (InterfaceC5066e) c13751e.appmetrica;
                    if (interfaceC5066e != null) {
                        interfaceC5066e.cancel();
                    }
                    c13751e.appmetrica = null;
                }
                int i4 = c13751e.metrica;
                if (i4 != -1 && c13751e.license != 0.0f && i4 != i && !r2.isEmpty()) {
                    int vip = C13751e.vip(c13648e, c13751e.license < 0.0f);
                    if (vip >= 0 && vip < i) {
                        c13751e.ad = vip;
                        c13751e.appmetrica = AbstractC5087e.m1742break(this.subscription, vip);
                    }
                }
                c13751e.metrica = i;
            }
        }
        if (z) {
            c10312e.m2794class(c13648e.purchase, c13648e.startapp, c13648e.yandex);
        }
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean license() {
        return ((Boolean) this.signatures.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean metrica() {
        return ((Boolean) this.tapsense.getValue()).booleanValue();
    }

    public final void mopub(int i, int i2, boolean z) {
        C10197e c10197e = this.appmetrica;
        if (c10197e.vip.purchase() != i || c10197e.metrica.purchase() != i2) {
            C2245e c2245e = this.loadAd;
            c2245e.purchase();
            c2245e.license = null;
            c2245e.vip = -1;
        }
        c10197e.ad(i, i2);
        c10197e.appmetrica = null;
        if (!z) {
            AbstractC8508e.purchase(this.pro);
            return;
        }
        C13915e c13915e = this.advert;
        if (c13915e != null) {
            c13915e.advert();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object purchase(int r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C11365e
            if (r0 == 0) goto L13
            r0 = r6
            eُۣۤ r0 = (defpackage.C11365e) r0
            int r1 = r0.f22877e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22877e = r1
            goto L18
        L13:
            eُۣۤ r0 = new eُۣۤ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f22876e
            int r1 = r0.f22877e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            defpackage.AbstractC2003e.purchase(r6)     // Catch: java.lang.Throwable -> L26
            goto L48
        L26:
            r5 = move-exception
            goto L4d
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            defpackage.AbstractC2003e.purchase(r6)
            r4.startapp = r3     // Catch: java.lang.Throwable -> L26
            eٖٕؒ r6 = new eٖٕؒ     // Catch: java.lang.Throwable -> L26
            r1 = 0
            r6.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> L26
            r0.f22877e = r3     // Catch: java.lang.Throwable -> L26
            eؚؗۨ r5 = defpackage.EnumC6955e.f14256e     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = r4.vip(r5, r6, r0)     // Catch: java.lang.Throwable -> L26
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r5 != r6) goto L48
            return r6
        L48:
            r4.startapp = r2
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L4d:
            r4.startapp = r2
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4993e.purchase(int, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final void startapp(float f, C13648e c13648e) {
        InterfaceC5066e interfaceC5066e;
        InterfaceC5066e interfaceC5066e2;
        if (this.mopub) {
            ?? r0 = c13648e.mopub;
            ?? r1 = c13648e.mopub;
            boolean isEmpty = r0.isEmpty();
            C13751e c13751e = this.ad;
            if (!isEmpty) {
                boolean z = f < 0.0f;
                int vip = C13751e.vip(c13648e, z);
                if (vip >= 0 && vip < c13648e.amazon) {
                    if (vip != c13751e.ad) {
                        if (c13751e.vip != z) {
                            c13751e.ad = -1;
                            InterfaceC5066e interfaceC5066e3 = (InterfaceC5066e) c13751e.appmetrica;
                            if (interfaceC5066e3 != null) {
                                interfaceC5066e3.cancel();
                            }
                            c13751e.appmetrica = null;
                        }
                        c13751e.vip = z;
                        c13751e.ad = vip;
                        c13751e.appmetrica = AbstractC5087e.m1742break(this.subscription, vip);
                    }
                    if (z) {
                        C3225e c3225e = (C3225e) AbstractC13480e.m3570break(r1);
                        if (((c3225e.loadAd + c3225e.Signature) + c13648e.admob) - c13648e.smaato < (-f) && (interfaceC5066e2 = (InterfaceC5066e) c13751e.appmetrica) != null) {
                            interfaceC5066e2.ad();
                        }
                    } else if (c13648e.advert - ((C3225e) AbstractC13480e.m3591interface(r1)).loadAd < f && (interfaceC5066e = (InterfaceC5066e) c13751e.appmetrica) != null) {
                        interfaceC5066e.ad();
                    }
                }
            }
            c13751e.license = f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r5.adcel.vip(r6, r7, r0) != r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r5.amazon.adcel(r0) == r4) goto L23;
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
            boolean r0 = r8 instanceof defpackage.C7979e
            if (r0 == 0) goto L13
            r0 = r8
            eًٗٝ r0 = (defpackage.C7979e) r0
            int r1 = r0.f16159e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16159e = r1
            goto L18
        L13:
            eًٗٝ r0 = new eًٗٝ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f16162e
            int r1 = r0.f16159e
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
            eؚٖؓ r6 = r0.f16158e
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            eؚؗۨ r6 = r0.f16160e
            defpackage.AbstractC2003e.purchase(r8)
            goto L5c
        L3d:
            defpackage.AbstractC2003e.purchase(r8)
            eؑۜٝ r8 = r5.purchase
            java.lang.Object r8 = r8.getValue()
            eؘْۧ r1 = defpackage.AbstractC9735e.ad
            if (r8 != r1) goto L5c
            r0.f16160e = r6
            r8 = r7
            eؚٖؓ r8 = (defpackage.AbstractC7185e) r8
            r0.f16158e = r8
            r0.f16159e = r3
            eّؑۜ r8 = r5.amazon
            java.lang.Object r8 = r8.adcel(r0)
            if (r8 != r4) goto L5c
            goto L6b
        L5c:
            r8 = 0
            r0.f16160e = r8
            r0.f16158e = r8
            r0.f16159e = r2
            eٝؒ r8 = r5.adcel
            java.lang.Object r6 = r8.vip(r6, r7, r0)
            if (r6 != r4) goto L6c
        L6b:
            return r4
        L6c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4993e.vip(eؚؗۨ, kotlin.jvm.functions.Function2, eًؗۖ):java.lang.Object");
    }

    public final C13648e yandex() {
        return (C13648e) this.purchase.getValue();
    }
}
