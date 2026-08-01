package defpackage;

import android.os.Trace;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۨٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6086e {
    public final C13915e ad;
    public boolean license;
    public boolean metrica;
    public C5602e startapp;
    public final C18478e vip = new C18478e(14);
    public final C5891e appmetrica = new C5891e(6);
    public final C12431e purchase = new C12431e(0, new C13915e[16]);
    public final long billing = 1;
    public final C12431e yandex = new C12431e(0, new C11319e[16]);

    public C6086e(C13915e c13915e) {
        this.ad = c13915e;
    }

    public static final boolean ad(C6086e c6086e, C13915e c13915e, boolean z) {
        AbstractC3698e placementScope;
        C14747e c14747e;
        C13915e tapsense;
        C13915e c13915e2 = c6086e.ad;
        boolean z2 = c13915e.f27620e;
        C11874e c11874e = c13915e.f27612e;
        if (!z2 && advert(c13915e)) {
            C5602e c5602e = c13915e == c13915e2 ? c6086e.startapp : null;
            if (z) {
                r3 = c11874e.appmetrica ? license(c13915e, c5602e) : false;
                if ((r3 || c11874e.purchase) && AbstractC7890e.billing(c13915e.m3728while(), Boolean.TRUE)) {
                    c13915e.m3727try();
                }
            } else {
                boolean appmetrica = c13915e.subscription() ? appmetrica(c13915e, c5602e) : false;
                if (c13915e.admob() && (c13915e == c13915e2 || ((tapsense = c13915e.tapsense()) != null && tapsense.m3724throw() && c11874e.Signature.f25214e))) {
                    if (c13915e == c13915e2) {
                        if (c13915e.f27614e == 3) {
                            c13915e.purchase();
                        }
                        C13915e tapsense2 = c13915e.tapsense();
                        if (tapsense2 == null || (c14747e = (C14747e) tapsense2.f27592e.license) == null || (placementScope = c14747e.f18510e) == null) {
                            placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e)).getPlacementScope();
                        }
                        AbstractC3698e.advert(placementScope, c11874e.Signature, 0, 0);
                    } else {
                        c13915e.m3704catch();
                    }
                    C5891e c5891e = c6086e.appmetrica;
                    c5891e.getClass();
                    if (c13915e.f27595e > 0) {
                        ((C12431e) c5891e.f12440e).license(c13915e);
                        c13915e.f27600e = true;
                    }
                }
                r3 = appmetrica;
            }
            c6086e.purchase();
        }
        return r3;
    }

    public static boolean adcel(C13915e c13915e) {
        C17596e c17596e;
        C10324e c10324e;
        if (c13915e.f27612e.appmetrica) {
            return (c13915e.pro() == 3 && ((c17596e = c13915e.f27612e.admob) == null || (c10324e = c17596e.f34475e) == null || !c10324e.appmetrica())) ? false : true;
        }
        return false;
    }

    public static boolean advert(C13915e c13915e) {
        C17596e c17596e;
        C10324e c10324e;
        C11874e c11874e = c13915e.f27612e;
        return c13915e.m3724throw() || c11874e.Signature.f25214e || mopub(c13915e) || AbstractC7890e.billing(c13915e.m3728while(), Boolean.TRUE) || adcel(c13915e) || c11874e.Signature.f25208e.appmetrica() || !((c17596e = c11874e.admob) == null || (c10324e = c17596e.f34475e) == null || !c10324e.appmetrica());
    }

    public static boolean appmetrica(C13915e c13915e, C5602e c5602e) {
        boolean z;
        if (c5602e != null) {
            if (c13915e.f27614e == 3) {
                c13915e.appmetrica();
            }
            z = c13915e.f27612e.Signature.m3357continue(c5602e.ad);
        } else {
            C12570e c12570e = c13915e.f27612e.Signature;
            C5602e c5602e2 = c12570e.f25184e ? new C5602e(c12570e.f6805e) : null;
            if (c5602e2 != null) {
                if (c13915e.f27614e == 3) {
                    c13915e.appmetrica();
                }
                z = c13915e.f27612e.Signature.m3357continue(c5602e2.ad);
            } else {
                c13915e.getClass();
                z = false;
            }
        }
        C13915e tapsense = c13915e.tapsense();
        if (z && tapsense != null) {
            if (c13915e.remoteconfig() == 1) {
                C13915e.m3699strictfp(tapsense, false, 3);
                return z;
            }
            if (c13915e.remoteconfig() == 2) {
                tapsense.m3716new(false);
            }
        }
        return z;
    }

    public static boolean license(C13915e c13915e, C5602e c5602e) {
        boolean m4367continue;
        C13915e c13915e2 = c13915e.f27587e;
        C11874e c11874e = c13915e.f27612e;
        if (c13915e2 == null) {
            return false;
        }
        if (c5602e != null) {
            if (c13915e2 != null) {
                m4367continue = c11874e.admob.m4367continue(c5602e.ad);
            }
            m4367continue = false;
        } else {
            C17596e c17596e = c11874e.admob;
            C5602e c5602e2 = c17596e != null ? c17596e.f34462e : null;
            if (c5602e2 != null && c13915e2 != null) {
                m4367continue = c17596e.m4367continue(c5602e2.ad);
            }
            m4367continue = false;
        }
        C13915e tapsense = c13915e.tapsense();
        if (m4367continue && tapsense != null) {
            if (tapsense.f27587e == null) {
                C13915e.m3699strictfp(tapsense, false, 3);
                return m4367continue;
            }
            if (c13915e.pro() == 1) {
                C13915e.m3700super(tapsense, false, 3);
                return m4367continue;
            }
            if (c13915e.pro() == 2) {
                tapsense.m3709final(false);
            }
        }
        return m4367continue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r0 != 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r4 = r4.tapsense();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r4 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r4.m3724throw() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0005, code lost:
    
        if (r4.subscription() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r4.remoteconfig() != 3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r4.f27612e.Signature.f25208e.appmetrica() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r0 = r4.tapsense();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r0 = r0.f27612e.license;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean mopub(defpackage.C13915e r4) {
        /*
            boolean r0 = r4.subscription()
            r1 = 0
            if (r0 == 0) goto L37
        L7:
            int r0 = r4.remoteconfig()
            r2 = 3
            r3 = 1
            if (r0 != r2) goto L29
            eِٞؐ r0 = r4.f27612e
            eٌّٚ r0 = r0.Signature
            eَ٘ؖ r0 = r0.f25208e
            boolean r0 = r0.appmetrica()
            if (r0 != 0) goto L29
            eِٓؔ r0 = r4.tapsense()
            if (r0 == 0) goto L26
            eِٞؐ r0 = r0.f27612e
            int r0 = r0.license
            goto L27
        L26:
            r0 = r1
        L27:
            if (r0 != r3) goto L37
        L29:
            eِٓؔ r4 = r4.tapsense()
            if (r4 != 0) goto L30
            goto L37
        L30:
            boolean r0 = r4.m3724throw()
            if (r0 == 0) goto L7
            return r3
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6086e.mopub(eِٓؔ):boolean");
    }

    public final boolean Signature(C13915e c13915e, boolean z) {
        boolean z2 = false;
        if (!c13915e.f27620e && advert(c13915e)) {
            C5602e c5602e = c13915e == this.ad ? this.startapp : null;
            if (z) {
                if (c13915e.f27612e.appmetrica) {
                    z2 = license(c13915e, c5602e);
                }
            } else if (c13915e.subscription()) {
                z2 = appmetrica(c13915e, c5602e);
            }
            purchase();
        }
        return z2;
    }

    public final void admob(C13915e c13915e) {
        C12431e ads = c13915e.ads();
        Object[] objArr = ads.f24870e;
        int i = ads.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            C13915e c13915e2 = (C13915e) objArr[i2];
            if (c13915e2.remoteconfig() == 1 || c13915e2.f27612e.Signature.f25208e.appmetrica()) {
                if (AbstractC2467e.startapp(c13915e2)) {
                    subscription(c13915e2, true);
                } else {
                    admob(c13915e2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:21:0x003d, B:23:0x005f, B:26:0x0075, B:28:0x007d, B:29:0x0080, B:32:0x008e, B:34:0x0094, B:35:0x0098, B:37:0x009f, B:38:0x00a2, B:40:0x00a8, B:42:0x00ae, B:44:0x00ba, B:45:0x00c3, B:48:0x0066, B:50:0x0072), top: B:20:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:21:0x003d, B:23:0x005f, B:26:0x0075, B:28:0x007d, B:29:0x0080, B:32:0x008e, B:34:0x0094, B:35:0x0098, B:37:0x009f, B:38:0x00a2, B:40:0x00a8, B:42:0x00ae, B:44:0x00ba, B:45:0x00c3, B:48:0x0066, B:50:0x0072), top: B:20:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:21:0x003d, B:23:0x005f, B:26:0x0075, B:28:0x007d, B:29:0x0080, B:32:0x008e, B:34:0x0094, B:35:0x0098, B:37:0x009f, B:38:0x00a2, B:40:0x00a8, B:42:0x00ae, B:44:0x00ba, B:45:0x00c3, B:48:0x0066, B:50:0x0072), top: B:20:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:21:0x003d, B:23:0x005f, B:26:0x0075, B:28:0x007d, B:29:0x0080, B:32:0x008e, B:34:0x0094, B:35:0x0098, B:37:0x009f, B:38:0x00a2, B:40:0x00a8, B:42:0x00ae, B:44:0x00ba, B:45:0x00c3, B:48:0x0066, B:50:0x0072), top: B:20:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void amazon(defpackage.C13915e r6, long r7) {
        /*
            r5 = this;
            boolean r0 = r6.f27620e
            eِٞؐ r1 = r6.f27612e
            if (r0 == 0) goto L7
            return
        L7:
            eِٓؔ r0 = r5.ad
            boolean r2 = r6.equals(r0)
            if (r2 == 0) goto L14
            java.lang.String r2 = "measureAndLayout called on root"
            defpackage.AbstractC14070e.ad(r2)
        L14:
            boolean r2 = r0.m3708extends()
            if (r2 != 0) goto L1f
            java.lang.String r2 = "performMeasureAndLayout called with unattached root"
            defpackage.AbstractC14070e.ad(r2)
        L1f:
            boolean r0 = r0.m3724throw()
            if (r0 != 0) goto L2a
            java.lang.String r0 = "performMeasureAndLayout called with unplaced root"
            defpackage.AbstractC14070e.ad(r0)
        L2a:
            boolean r0 = r5.metrica
            if (r0 == 0) goto L33
            java.lang.String r0 = "performMeasureAndLayout called during measure layout"
            defpackage.AbstractC14070e.ad(r0)
        L33:
            eؘّٛ r0 = r5.startapp
            if (r0 == 0) goto Ld2
            r0 = 1
            r5.metrica = r0
            r2 = 0
            r5.license = r2
            eۤۡ r3 = r5.vip     // Catch: java.lang.Throwable -> L64
            java.lang.Object r4 = r3.f36228e     // Catch: java.lang.Throwable -> L64
            eؙُْ r4 = (defpackage.C6325e) r4     // Catch: java.lang.Throwable -> L64
            r4.m2152interface(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r4 = r3.f36227e     // Catch: java.lang.Throwable -> L64
            eؙُْ r4 = (defpackage.C6325e) r4     // Catch: java.lang.Throwable -> L64
            r4.m2152interface(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r3 = r3.f36229e     // Catch: java.lang.Throwable -> L64
            eؙُْ r3 = (defpackage.C6325e) r3     // Catch: java.lang.Throwable -> L64
            r3.m2152interface(r6)     // Catch: java.lang.Throwable -> L64
            eؘّٛ r3 = new eؘّٛ     // Catch: java.lang.Throwable -> L64
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L64
            boolean r3 = license(r6, r3)     // Catch: java.lang.Throwable -> L64
            if (r3 != 0) goto L66
            boolean r3 = r1.purchase     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L75
            goto L66
        L64:
            r6 = move-exception
            goto Lcb
        L66:
            java.lang.Boolean r3 = r6.m3728while()     // Catch: java.lang.Throwable -> L64
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L64
            boolean r3 = defpackage.AbstractC7890e.billing(r3, r4)     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L75
            r6.m3727try()     // Catch: java.lang.Throwable -> L64
        L75:
            r5.billing(r6)     // Catch: java.lang.Throwable -> L64
            int r3 = r6.f27614e     // Catch: java.lang.Throwable -> L64
            r4 = 3
            if (r3 != r4) goto L80
            r6.appmetrica()     // Catch: java.lang.Throwable -> L64
        L80:
            eٌّٚ r1 = r1.Signature     // Catch: java.lang.Throwable -> L64
            boolean r7 = r1.m3357continue(r7)     // Catch: java.lang.Throwable -> L64
            eِٓؔ r8 = r6.tapsense()     // Catch: java.lang.Throwable -> L64
            if (r7 == 0) goto La2
            if (r8 == 0) goto La2
            int r7 = r6.remoteconfig()     // Catch: java.lang.Throwable -> L64
            if (r7 != r0) goto L98
            defpackage.C13915e.m3699strictfp(r8, r2, r4)     // Catch: java.lang.Throwable -> L64
            goto La2
        L98:
            int r7 = r6.remoteconfig()     // Catch: java.lang.Throwable -> L64
            r1 = 2
            if (r7 != r1) goto La2
            r8.m3716new(r2)     // Catch: java.lang.Throwable -> L64
        La2:
            boolean r7 = r6.admob()     // Catch: java.lang.Throwable -> L64
            if (r7 == 0) goto Lc3
            boolean r7 = r6.m3724throw()     // Catch: java.lang.Throwable -> L64
            if (r7 == 0) goto Lc3
            r6.m3704catch()     // Catch: java.lang.Throwable -> L64
            eؘٟۚ r7 = r5.appmetrica     // Catch: java.lang.Throwable -> L64
            r7.getClass()     // Catch: java.lang.Throwable -> L64
            int r8 = r6.f27595e     // Catch: java.lang.Throwable -> L64
            if (r8 <= 0) goto Lc3
            java.lang.Object r7 = r7.f12440e     // Catch: java.lang.Throwable -> L64
            eّّؔ r7 = (defpackage.C12431e) r7     // Catch: java.lang.Throwable -> L64
            r7.license(r6)     // Catch: java.lang.Throwable -> L64
            r6.f27600e = r0     // Catch: java.lang.Throwable -> L64
        Lc3:
            r5.purchase()     // Catch: java.lang.Throwable -> L64
            r5.metrica = r2
            r5.license = r2
            goto Ld2
        Lcb:
            throw r6     // Catch: java.lang.Throwable -> Lcc
        Lcc:
            r6 = move-exception
            r5.metrica = r2
            r5.license = r2
            throw r6
        Ld2:
            r5.vip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6086e.amazon(eِٓؔ, long):void");
    }

    public final void billing(C13915e c13915e) {
        C12431e ads = c13915e.ads();
        Object[] objArr = ads.f24870e;
        int i = ads.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            C13915e c13915e2 = (C13915e) objArr[i2];
            if (AbstractC7890e.billing(c13915e2.m3728while(), Boolean.TRUE) && !c13915e2.f27620e) {
                if (this.vip.applovin(c13915e2)) {
                    c13915e2.m3727try();
                }
                billing(c13915e2);
            }
        }
    }

    public final void loadAd() {
        C18478e c18478e = this.vip;
        if (c18478e.m4530catch()) {
            C13915e c13915e = this.ad;
            if (!c13915e.m3708extends()) {
                AbstractC14070e.ad("performMeasureAndLayout called with unattached root");
            }
            if (!c13915e.m3724throw()) {
                AbstractC14070e.ad("performMeasureAndLayout called with unplaced root");
            }
            if (this.metrica) {
                AbstractC14070e.ad("performMeasureAndLayout called during measure layout");
            }
            if (this.startapp != null) {
                this.metrica = true;
                this.license = false;
                try {
                    if ((((C5721e) ((C6325e) c18478e.f36229e).f13170e).isEmpty() || ((C5721e) ((C6325e) c18478e.f36228e).f13170e).isEmpty()) ? false : true) {
                        if (c13915e.f27587e != null) {
                            subscription(c13915e, true);
                        } else {
                            admob(c13915e);
                        }
                    }
                    subscription(c13915e, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.metrica = false;
                        this.license = false;
                    }
                }
            }
        }
    }

    public final void metrica(boolean z) {
        C5891e c5891e = this.appmetrica;
        if (z) {
            C12431e c12431e = (C12431e) c5891e.f12440e;
            C13915e c13915e = this.ad;
            if (c13915e.f27595e > 0) {
                c12431e.startapp();
                c12431e.license(c13915e);
                c13915e.f27600e = true;
            }
        }
        if (((C12431e) c5891e.f12440e).f24868e != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                c5891e.subs();
                Unit unit = Unit.INSTANCE;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void pro(long j) {
        C5602e c5602e = this.startapp;
        if (c5602e == null ? false : C5602e.vip(c5602e.ad, j)) {
            return;
        }
        if (this.metrica) {
            AbstractC14070e.ad("updateRootConstraints called while measuring");
        }
        this.startapp = new C5602e(j);
        C13915e c13915e = this.ad;
        C13915e c13915e2 = c13915e.f27587e;
        C11874e c11874e = c13915e.f27612e;
        if (c13915e2 != null) {
            c11874e.appmetrica = true;
        }
        c11874e.Signature.f25185e = true;
        this.vip.subscription(c13915e2 == null ? 3 : 1, c13915e);
    }

    public final void purchase() {
        C12431e c12431e = this.yandex;
        int i = c12431e.f24868e;
        if (i != 0) {
            Object[] objArr = c12431e.f24870e;
            for (int i2 = 0; i2 < i; i2++) {
                C11319e c11319e = (C11319e) objArr[i2];
                C13915e c13915e = c11319e.ad;
                boolean z = c11319e.metrica;
                C13915e c13915e2 = c11319e.ad;
                if (c13915e.m3708extends()) {
                    if (c11319e.vip) {
                        C13915e.m3700super(c13915e2, z, 2);
                    } else {
                        C13915e.m3699strictfp(c13915e2, z, 2);
                    }
                }
            }
            c12431e.startapp();
        }
    }

    public final boolean remoteconfig(C13915e c13915e, boolean z) {
        int m2467class = AbstractC8703e.m2467class(c13915e.f27612e.license);
        if (m2467class != 0 && m2467class != 1) {
            if (m2467class == 2 || m2467class == 3) {
                this.yandex.license(new C11319e(c13915e, false, z));
            } else {
                if (m2467class != 4) {
                    throw new C14803e(10);
                }
                if (!c13915e.subscription() || z) {
                    c13915e.f27612e.Signature.f25185e = true;
                    if (!c13915e.f27620e && (c13915e.m3724throw() || mopub(c13915e))) {
                        C13915e tapsense = c13915e.tapsense();
                        if (tapsense == null || !tapsense.subscription()) {
                            this.vip.subscription(3, c13915e);
                        }
                        if (!this.license) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean smaato(C16598e c16598e) {
        boolean z;
        boolean z2;
        C13915e c13915e;
        boolean z3;
        boolean Signature;
        C18478e c18478e = this.vip;
        C13915e c13915e2 = this.ad;
        if (!c13915e2.m3708extends()) {
            AbstractC14070e.ad("performMeasureAndLayout called with unattached root");
        }
        if (!c13915e2.m3724throw()) {
            AbstractC14070e.ad("performMeasureAndLayout called with unplaced root");
        }
        if (this.metrica) {
            AbstractC14070e.ad("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.startapp != null) {
            this.metrica = true;
            this.license = true;
            try {
                boolean m4530catch = c18478e.m4530catch();
                C6325e c6325e = (C6325e) c18478e.f36228e;
                if (m4530catch) {
                    z = false;
                    while (true) {
                        C6325e c6325e2 = (C6325e) c18478e.f36229e;
                        C6325e c6325e3 = (C6325e) c18478e.f36227e;
                        if (!((C5721e) c6325e.f13170e).isEmpty()) {
                            c13915e = (C13915e) ((C5721e) c6325e.f13170e).first();
                            c6325e.m2152interface(c13915e);
                            z3 = c13915e.f27587e != null;
                            z2 = false;
                        } else if (!((C5721e) c6325e3.f13170e).isEmpty()) {
                            c13915e = (C13915e) ((C5721e) c6325e3.f13170e).first();
                            c6325e3.m2152interface(c13915e);
                            z3 = c13915e.f27587e != null;
                            z2 = true;
                        } else {
                            if (((C5721e) c6325e2.f13170e).isEmpty()) {
                                break;
                            }
                            C13915e c13915e3 = (C13915e) ((C5721e) c6325e2.f13170e).first();
                            c6325e2.m2152interface(c13915e3);
                            z2 = true;
                            c13915e = c13915e3;
                            z3 = false;
                        }
                        if (z2) {
                            Signature = ad(this, c13915e, z3);
                        } else {
                            Signature = Signature(c13915e, z3);
                            if (c13915e.f27612e.purchase) {
                                c18478e.subscription(2, c13915e);
                            }
                            if (c13915e.admob()) {
                                c18478e.subscription(4, c13915e);
                            }
                        }
                        if (c13915e == c13915e2 && Signature) {
                            z = true;
                        }
                    }
                    if (c16598e != null) {
                        c16598e.invoke();
                    }
                } else {
                    z = false;
                }
                this.metrica = false;
                this.license = false;
                z4 = z;
            } finally {
            }
        }
        vip();
        return z4;
    }

    public final void startapp(C13915e c13915e, boolean z) {
        C17596e c17596e;
        C10324e c10324e;
        C12431e ads = c13915e.ads();
        Object[] objArr = ads.f24870e;
        int i = ads.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            C13915e c13915e2 = (C13915e) objArr[i2];
            if ((!z && (c13915e2.remoteconfig() == 1 || c13915e2.f27612e.Signature.f25208e.appmetrica())) || (z && (c13915e2.pro() == 1 || ((c17596e = c13915e2.f27612e.admob) != null && (c10324e = c17596e.f34475e) != null && c10324e.appmetrica())))) {
                boolean startapp = AbstractC2467e.startapp(c13915e2);
                C11874e c11874e = c13915e2.f27612e;
                if (startapp && !z) {
                    if (c11874e.appmetrica && this.vip.applovin(c13915e2)) {
                        Signature(c13915e2, true);
                    } else {
                        yandex(c13915e2, true);
                    }
                }
                if (z ? c11874e.appmetrica : c13915e2.subscription()) {
                    Signature(c13915e2, z);
                }
                if (!(z ? c11874e.appmetrica : c13915e2.subscription())) {
                    startapp(c13915e2, z);
                }
            }
        }
        if (z ? c13915e.f27612e.appmetrica : c13915e.subscription()) {
            Signature(c13915e, z);
        }
    }

    public final void subscription(C13915e c13915e, boolean z) {
        if (c13915e.f27620e) {
            return;
        }
        C5602e c5602e = c13915e == this.ad ? this.startapp : null;
        if (z) {
            license(c13915e, c5602e);
        } else {
            appmetrica(c13915e, c5602e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2, types: [eْۤۡ] */
    public final void vip() {
        int i;
        AbstractC13616e abstractC13616e;
        C12431e c12431e;
        int i2;
        C12431e c12431e2 = this.purchase;
        Object[] objArr = c12431e2.f24870e;
        int i3 = c12431e2.f24868e;
        for (0; i < i3; i + 1) {
            C14742e c14742e = ((C13915e) objArr[i]).f27592e;
            C14747e c14747e = (C14747e) c14742e.license;
            int i4 = 4194304;
            boolean billing = AbstractC5180e.billing(4194304);
            if (billing) {
                abstractC13616e = c14747e.f29169e;
            } else {
                abstractC13616e = c14747e.f29169e.f27011e;
                i = abstractC13616e == null ? i + 1 : 0;
            }
            C10122e c10122e = AbstractC17732e.f34770e;
            AbstractC13616e m4403e = c14747e.m4403e(billing);
            while (m4403e != null && (m4403e.f27020e & i4) != 0) {
                if ((m4403e.f27014e & i4) != 0) {
                    AbstractC6126e abstractC6126e = m4403e;
                    C12431e c12431e3 = null;
                    while (abstractC6126e != 0) {
                        if (abstractC6126e instanceof InterfaceC18105e) {
                            ((InterfaceC18105e) abstractC6126e).Signature((C14747e) c14742e.license);
                        } else if ((abstractC6126e.f27014e & i4) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                            AbstractC13616e abstractC13616e2 = abstractC6126e.f12873e;
                            int i5 = 0;
                            AbstractC13616e abstractC13616e3 = abstractC6126e;
                            c12431e = c12431e3;
                            while (abstractC13616e2 != null) {
                                int i6 = i4;
                                if ((abstractC13616e2.f27014e & i6) != 0) {
                                    i5++;
                                    c12431e = c12431e;
                                    if (i5 == 1) {
                                        abstractC13616e3 = abstractC13616e2;
                                    } else {
                                        if (c12431e == null) {
                                            c12431e = new C12431e(0, new AbstractC13616e[16]);
                                        }
                                        if (abstractC13616e3 != null) {
                                            c12431e.license(abstractC13616e3);
                                            abstractC13616e3 = null;
                                        }
                                        c12431e.license(abstractC13616e2);
                                    }
                                }
                                abstractC13616e2 = abstractC13616e2.f27024e;
                                i4 = i6;
                                abstractC13616e3 = abstractC13616e3;
                                c12431e = c12431e;
                            }
                            i2 = i4;
                            c12431e = c12431e;
                            if (i5 == 1) {
                                i4 = i2;
                                abstractC6126e = abstractC13616e3;
                                c12431e3 = c12431e;
                            }
                            abstractC13616e3 = AbstractC5851e.vip(c12431e);
                            i4 = i2;
                            abstractC6126e = abstractC13616e3;
                            c12431e3 = c12431e;
                        }
                        i2 = i4;
                        c12431e = c12431e3;
                        abstractC13616e3 = AbstractC5851e.vip(c12431e);
                        i4 = i2;
                        abstractC6126e = abstractC13616e3;
                        c12431e3 = c12431e;
                    }
                }
                int i7 = i4;
                if (m4403e != abstractC13616e) {
                    m4403e = m4403e.f27024e;
                    i4 = i7;
                }
            }
        }
        c12431e2.startapp();
    }

    public final void yandex(C13915e c13915e, boolean z) {
        if (!this.metrica) {
            AbstractC14070e.metrica("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? c13915e.f27612e.appmetrica : c13915e.subscription()) {
            AbstractC14070e.ad("node not yet measured");
        }
        startapp(c13915e, z);
    }
}
