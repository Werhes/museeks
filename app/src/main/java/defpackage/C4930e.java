package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4930e {
    public final ViewTreeObserverOnGlobalLayoutListenerC5014e ad;
    public final C17073e adcel;
    public boolean appmetrica;
    public boolean billing;
    public final C12328e license;
    public final C14998e metrica;
    public final C2359e mopub;
    public boolean purchase;
    public long startapp;
    public final Csuper vip;
    public RunnableC7547e yandex;

    public C4930e(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e) {
        this.ad = viewTreeObserverOnGlobalLayoutListenerC5014e;
        Csuper csuper = new Csuper((char) 0, 25);
        csuper.f36469e = new long[192];
        csuper.f36471e = new long[192];
        this.vip = csuper;
        this.metrica = new C14998e();
        this.license = new C12328e();
        this.startapp = -1L;
        this.adcel = new C17073e(14, this);
        this.mopub = new C2359e();
    }

    public static void billing(C13915e c13915e) {
        if (c13915e.f27586e) {
            InterfaceC0983e interfaceC0983e = ((AbstractC17732e) c13915e.f27592e.appmetrica).f34778e;
            if (interfaceC0983e == null || AbstractC11309e.billing(((C5048e) interfaceC0983e).vip())) {
                c13915e.f27586e = false;
                if (c13915e.f27582e) {
                    c13915e.f27613e = license(c13915e);
                    c13915e.f27582e = false;
                }
                if (C11490e.vip(c13915e.f27613e, 9223372034707292159L)) {
                    return;
                }
                C12431e ads = c13915e.ads();
                Object[] objArr = ads.f24870e;
                int i = ads.f24868e;
                for (int i2 = 0; i2 < i; i2++) {
                    billing((C13915e) objArr[i2]);
                }
            }
        }
    }

    public static long license(C13915e c13915e) {
        C14742e c14742e = c13915e.f27592e;
        AbstractC17732e abstractC17732e = (AbstractC17732e) c14742e.appmetrica;
        long j = 0;
        for (AbstractC17732e abstractC17732e2 = (C14747e) c14742e.license; abstractC17732e2 != null && abstractC17732e2 != abstractC17732e; abstractC17732e2 = abstractC17732e2.f34794e) {
            InterfaceC0983e interfaceC0983e = abstractC17732e2.f34778e;
            if (interfaceC0983e != null && !AbstractC11309e.billing(((C5048e) interfaceC0983e).vip())) {
                return 9223372034707292159L;
            }
            j = C11490e.license(j, abstractC17732e2.f34793e);
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad() {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4930e.ad():void");
    }

    public final void appmetrica(C13915e c13915e) {
        long j;
        InterfaceC0983e interfaceC0983e;
        boolean m3724throw = c13915e.m3724throw();
        C14742e c14742e = c13915e.f27592e;
        if (m3724throw && c13915e.f27625e) {
            C13915e tapsense = c13915e.tapsense();
            if (tapsense == null || tapsense.f27586e) {
                j = tapsense == null ? 0L : 9223372034707292159L;
            } else {
                if (tapsense.f27582e) {
                    tapsense.f27582e = false;
                    tapsense.f27613e = license(tapsense);
                }
                j = tapsense.f27613e;
            }
            AbstractC17732e abstractC17732e = (AbstractC17732e) c14742e.appmetrica;
            if (C11490e.vip(j, 9223372034707292159L) || !((interfaceC0983e = abstractC17732e.f34778e) == null || AbstractC11309e.billing(((C5048e) interfaceC0983e).vip()))) {
                metrica(c13915e);
            } else if (c13915e.f27586e) {
                metrica(c13915e);
                billing(c13915e);
            } else {
                long license = C11490e.license(j, abstractC17732e.f34793e);
                C12570e c12570e = c13915e.f27612e.Signature;
                int mo1206break = c12570e.mo1206break();
                int mo1209protected = c12570e.mo1209protected();
                int i = c13915e.f27594e;
                boolean z = c13915e.f27624e;
                Csuper csuper = this.vip;
                long j2 = 4294967295L;
                if (!z) {
                    c13915e.f27624e = true;
                    boolean yandex = c14742e.yandex(1024);
                    boolean yandex2 = c14742e.yandex(16);
                    boolean ad = this.metrica.ad.ad(i);
                    if (tapsense != null) {
                        int i2 = tapsense.f27594e;
                        int i3 = (int) (license >> 32);
                        int i4 = (int) (license & 4294967295L);
                        int i5 = i & 33554431;
                        long[] jArr = (long[]) csuper.f36469e;
                        int i6 = csuper.f36470e - 3;
                        while (true) {
                            if (i6 < 0) {
                                break;
                            }
                            if ((((int) jArr[i6 + 2]) & 33554431) == i2) {
                                long j3 = jArr[i6];
                                int i7 = ((int) (j3 >> 32)) + i3;
                                int i8 = ((int) j3) + i4;
                                csuper.m4656this(i5, i7, i8, mo1206break + i7, i8 + mo1209protected, i2, yandex, yandex2, ad, i6);
                                break;
                            }
                            i6 -= 3;
                        }
                    } else {
                        int i9 = (int) (license >> 32);
                        int i10 = (int) (license & 4294967295L);
                        csuper.m4656this(i, i9, i10, i9 + mo1206break, i10 + mo1209protected, (r22 & 32) != 0 ? -1 : 0, yandex, yandex2, ad, -1);
                    }
                } else if (tapsense == null) {
                    int i11 = (int) (license >> 32);
                    int i12 = (int) (license & 4294967295L);
                    int i13 = mo1206break + i11;
                    int i14 = i12 + mo1209protected;
                    int i15 = i & 33554431;
                    long[] jArr2 = (long[]) csuper.f36469e;
                    int i16 = csuper.f36470e;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= jArr2.length - 2 || i17 >= i16) {
                            break;
                        }
                        int i18 = i17 + 2;
                        long j4 = jArr2[i18];
                        if ((((int) j4) & 33554431) == i15) {
                            long j5 = jArr2[i17];
                            jArr2[i17] = (i11 << 32) | (i12 & 4294967295L);
                            jArr2[i17 + 1] = (i14 & 4294967295L) | (i13 << 32);
                            jArr2[i18] = (((j4 >> 63) & 1) << 60) | j4;
                            int i19 = i11 - ((int) (j5 >> 32));
                            int i20 = i12 - ((int) j5);
                            if ((i19 != 0) | (i20 != 0)) {
                                csuper.m4655synchronized(i19, (AbstractC15043e.vip & j4) | (((i17 + 3) & 33554431) << 25), i20);
                            }
                        } else {
                            i17 += 3;
                        }
                    }
                } else {
                    int i21 = tapsense.f27594e;
                    int i22 = (int) (license >> 32);
                    int i23 = (int) (license & 4294967295L);
                    int i24 = i & 33554431;
                    long[] jArr3 = (long[]) csuper.f36469e;
                    int i25 = csuper.f36470e;
                    int i26 = 0;
                    while (true) {
                        if (i26 >= jArr3.length - 2 || i26 >= i25) {
                            break;
                        }
                        long j6 = j2;
                        if ((((int) jArr3[i26 + 2]) & 33554431) == i21) {
                            long j7 = jArr3[i26];
                            int i27 = ((int) (j7 >> 32)) + i22;
                            int i28 = ((int) j7) + i23;
                            int i29 = i27 + mo1206break;
                            int i30 = i28 + mo1209protected;
                            i26 += 3;
                            while (i26 < jArr3.length - 2 && i26 < i25) {
                                int i31 = i26 + 2;
                                int i32 = i21;
                                int i33 = i22;
                                long j8 = jArr3[i31];
                                int i34 = i23;
                                if ((((int) j8) & 33554431) == i24) {
                                    long j9 = jArr3[i26];
                                    long[] jArr4 = jArr3;
                                    int i35 = i27 - ((int) (j9 >> 32));
                                    int i36 = i28 - ((int) j9);
                                    jArr4[i26] = (i28 & j6) | (i27 << 32);
                                    jArr4[i26 + 1] = (i29 << 32) | (i30 & j6);
                                    jArr4[i31] = j8 | (((j8 >> 63) & 1) << 60);
                                    if (i35 != 0 || i36 != 0) {
                                        csuper.m4655synchronized(i35, (j8 & AbstractC15043e.vip) | (((i26 + 3) & 33554431) << 25), i36);
                                    }
                                } else {
                                    i26 += 3;
                                    i21 = i32;
                                    i22 = i33;
                                    i23 = i34;
                                }
                            }
                        }
                        i26 += 3;
                        jArr3 = jArr3;
                        j2 = j6;
                        i21 = i21;
                        i22 = i22;
                        i23 = i23;
                    }
                }
            }
            c13915e.f27625e = false;
            this.appmetrica = true;
            yandex();
        }
    }

    public final void metrica(C13915e c13915e) {
        boolean z;
        boolean z2 = true;
        c13915e.f27586e = true;
        C14742e c14742e = c13915e.f27592e;
        AbstractC17732e abstractC17732e = (AbstractC17732e) c14742e.appmetrica;
        C12570e c12570e = c13915e.f27612e.Signature;
        int mo1206break = c12570e.mo1206break();
        float mo1209protected = c12570e.mo1209protected();
        C2359e c2359e = this.mopub;
        c2359e.vip = 0.0f;
        c2359e.metrica = 0.0f;
        c2359e.license = mo1206break;
        c2359e.appmetrica = mo1209protected;
        while (true) {
            if (abstractC17732e == null) {
                break;
            }
            C13915e c13915e2 = abstractC17732e.f34782e;
            if (abstractC17732e == ((AbstractC17732e) c13915e2.f27592e.appmetrica) && !c13915e2.f27586e) {
                if (!C11490e.vip(vip(c13915e2), 9223372034707292159L)) {
                    c2359e.appmetrica((Float.floatToRawIntBits((int) (r9 >> 32)) << 32) | (Float.floatToRawIntBits((int) (r9 & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            InterfaceC0983e interfaceC0983e = abstractC17732e.f34778e;
            if (interfaceC0983e != null) {
                float[] vip = ((C5048e) interfaceC0983e).vip();
                if (!AbstractC11309e.billing(vip)) {
                    C6739e.metrica(vip, c2359e);
                }
            }
            long j = abstractC17732e.f34793e;
            c2359e.appmetrica((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            abstractC17732e = abstractC17732e.f34794e;
        }
        int i = (int) c2359e.vip;
        int i2 = (int) c2359e.metrica;
        int i3 = (int) c2359e.license;
        int i4 = (int) c2359e.appmetrica;
        int i5 = c13915e.f27594e;
        boolean z3 = c13915e.f27624e;
        c13915e.f27624e = true;
        Csuper csuper = this.vip;
        if (z3) {
            int i6 = i5 & 33554431;
            long[] jArr = (long[]) csuper.f36469e;
            int i7 = csuper.f36470e;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                long j2 = jArr[i9];
                z = z2;
                if ((((int) j2) & 33554431) == i6) {
                    jArr[i8] = (i << 32) | (i2 & 4294967295L);
                    jArr[i8 + 1] = (i3 << 32) | (i4 & 4294967295L);
                    jArr[i9] = (((j2 >> 63) & 1) << 60) | j2;
                    break;
                }
                i8 += 3;
                z2 = z;
            }
        }
        z = z2;
        C13915e tapsense = c13915e.tapsense();
        csuper.m4656this(i5, i, i2, i3, i4, (r22 & 32) != 0 ? -1 : tapsense != null ? tapsense.f27594e : -1, c14742e.yandex(1024), c14742e.yandex(16), this.metrica.ad.ad(i5), -1);
        c13915e.f27625e = false;
        this.appmetrica = z;
        C12431e ads = c13915e.ads();
        Object[] objArr = ads.f24870e;
        int i10 = ads.f24868e;
        for (int i11 = 0; i11 < i10; i11++) {
            C13915e c13915e3 = (C13915e) objArr[i11];
            if (c13915e3.m3724throw()) {
                metrica(c13915e3);
            }
        }
    }

    public final void purchase(C13915e c13915e) {
        if (c13915e.f27624e) {
            int i = c13915e.f27594e & 33554431;
            Csuper csuper = this.vip;
            long[] jArr = (long[]) csuper.f36469e;
            int i2 = csuper.f36470e;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = AbstractC15043e.metrica;
                    break;
                }
                i3 += 3;
            }
            c13915e.f27624e = false;
            c13915e.f27625e = true;
            this.appmetrica = true;
            this.billing = true;
        }
    }

    public final long vip(C13915e c13915e) {
        long j;
        int i = c13915e.f27594e & 33554431;
        Csuper csuper = this.vip;
        long[] jArr = (long[]) csuper.f36469e;
        int i2 = csuper.f36470e;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((int) (j >> 32)) << 32) | (((int) j) & 4294967295L);
    }

    public final void yandex() {
        RunnableC7547e runnableC7547e = this.yandex;
        boolean z = runnableC7547e != null;
        long j = this.metrica.metrica;
        if (j >= 0 || !z) {
            if (this.startapp == j && z) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.ad;
            if (runnableC7547e != null) {
                if (!AbstractC0869e.premium(runnableC7547e)) {
                    runnableC7547e = null;
                }
                if (runnableC7547e != null) {
                    viewTreeObserverOnGlobalLayoutListenerC5014e.removeCallbacks(runnableC7547e);
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.startapp = max;
            RunnableC7547e runnableC7547e2 = new RunnableC7547e(0, this.adcel);
            viewTreeObserverOnGlobalLayoutListenerC5014e.postDelayed(runnableC7547e2, max - currentTimeMillis);
            this.yandex = runnableC7547e2;
        }
    }
}
