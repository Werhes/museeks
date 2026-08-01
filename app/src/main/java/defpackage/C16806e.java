package defpackage;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16806e implements InterfaceC18147e {
    public int Signature;
    public final C11184e ad;
    public int admob;
    public final C15683e appmetrica;
    public C16975e billing;
    public C16975e crashlytics;
    public long firebase;

    /* renamed from: goto, reason: not valid java name */
    public long f32944goto;

    /* renamed from: interface, reason: not valid java name */
    public boolean f32945interface;
    public boolean isPro;
    public final InterfaceC14469e license;
    public boolean premium;
    public Object purchase;
    public int remoteconfig;
    public C16975e subs;
    public int subscription;

    /* renamed from: this, reason: not valid java name */
    public boolean f32946this;
    public InterfaceC16612e yandex;
    public final C15475e vip = new Object();
    public int startapp = 1000;
    public long[] adcel = new long[1000];
    public long[] mopub = new long[1000];
    public long[] amazon = new long[1000];
    public int[] smaato = new int[1000];
    public int[] advert = new int[1000];
    public C17737e[] loadAd = new C17737e[1000];
    public final Csuper metrica = new Csuper(new C11180e(6));
    public long pro = Long.MIN_VALUE;
    public long tapsense = Long.MIN_VALUE;
    public long isVip = Long.MIN_VALUE;
    public boolean ads = true;
    public boolean applovin = true;

    /* renamed from: class, reason: not valid java name */
    public boolean f32943class = true;
    public long signatures = Long.MIN_VALUE;
    public int inmobi = -1;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, eٕٕؒ] */
    public C16806e(InterfaceC16970e interfaceC16970e, InterfaceC14469e interfaceC14469e, C15683e c15683e) {
        this.license = interfaceC14469e;
        this.appmetrica = c15683e;
        this.ad = new C11184e(interfaceC16970e);
    }

    public final synchronized long Signature() {
        return this.isVip;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // defpackage.InterfaceC18147e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ad(long r14, int r16, int r17, int r18, defpackage.C17737e r19) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16806e.ad(long, int, int, int, eِ٘ٓ):void");
    }

    public final void adcel(long j, boolean z) {
        Throwable th;
        C11184e c11184e = this.ad;
        synchronized (this) {
            try {
                try {
                    int i = this.Signature;
                    long j2 = -1;
                    if (i != 0) {
                        long[] jArr = this.amazon;
                        int i2 = this.subscription;
                        if (j >= jArr[i2]) {
                            if (z) {
                                try {
                                    int i3 = this.remoteconfig;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int amazon = amazon(i2, i, j, false);
                            if (amazon != -1) {
                                j2 = startapp(amazon);
                            }
                            c11184e.ad(j2);
                        }
                    }
                    c11184e.ad(j2);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final synchronized long admob() {
        return Math.max(this.tapsense, subscription(this.remoteconfig));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x008f, code lost:
    
        if (r11.isPro != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0091, code lost:
    
        if (r5 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0094, code lost:
    
        r15 = r11.crashlytics;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0096, code lost:
    
        if (r15 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0098, code lost:
    
        if (r0 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x009c, code lost:
    
        if (r15 == r11.billing) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x009e, code lost:
    
        isPro(r15, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ads(defpackage.C13391e r12, defpackage.C7507e r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16806e.ads(eْٝۜ, eؚ۠ۢ, int, boolean):int");
    }

    public final long advert(int i) {
        int i2 = this.admob;
        int i3 = this.Signature;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        AbstractC2301e.billing(i4 >= 0 && i4 <= i3 - this.remoteconfig);
        int i5 = this.Signature - i4;
        this.Signature = i5;
        this.isVip = Math.max(this.tapsense, subscription(i5));
        if (i4 == 0 && this.isPro) {
            z = true;
        }
        this.isPro = z;
        int i6 = this.inmobi;
        if (i6 != -1 && i < i6) {
            this.inmobi = -1;
        }
        Csuper csuper = this.metrica;
        SparseArray sparseArray = (SparseArray) csuper.f36469e;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((C11180e) csuper.f36471e).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        csuper.f36470e = sparseArray.size() > 0 ? Math.min(csuper.f36470e, sparseArray.size() - 1) : -1;
        int i7 = this.Signature;
        if (i7 == 0) {
            return 0L;
        }
        return this.mopub[pro(i7 - 1)] + this.advert[r9];
    }

    public final int amazon(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.amazon[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.smaato[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.startapp) {
                i = 0;
            }
        }
        return i3;
    }

    public final synchronized long applovin() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.remoteconfig != this.Signature ? this.adcel[pro(this.remoteconfig)] : this.firebase;
    }

    @Override // defpackage.InterfaceC18147e
    public final void appmetrica(int i, C1292e c1292e) {
        vip(c1292e, i, 0);
    }

    /* JADX WARN: Type inference failed for: r6v26, types: [eٌٍۖ, java.lang.Object] */
    @Override // defpackage.InterfaceC18147e
    public final void billing(C16975e c16975e) {
        C16975e loadAd = loadAd(c16975e);
        boolean z = false;
        this.premium = false;
        this.subs = c16975e;
        synchronized (this) {
            try {
                this.ads = false;
                if (!Objects.equals(loadAd, this.crashlytics)) {
                    if (!(((SparseArray) this.metrica.f36469e).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.metrica.f36469e;
                        if (((C3819e) sparseArray.valueAt(sparseArray.size() - 1)).ad.equals(loadAd)) {
                            SparseArray sparseArray2 = (SparseArray) this.metrica.f36469e;
                            this.crashlytics = ((C3819e) sparseArray2.valueAt(sparseArray2.size() - 1)).ad;
                            boolean z2 = this.f32943class;
                            C16975e c16975e2 = this.crashlytics;
                            String str = c16975e2.loadAd;
                            this.f32943class = z2 & (AbstractC8542e.yandex(str) != 1 && AbstractC8542e.ad(str, c16975e2.mopub));
                            this.f32945interface = false;
                            z = true;
                        }
                    }
                    this.crashlytics = loadAd;
                    boolean z22 = this.f32943class;
                    C16975e c16975e22 = this.crashlytics;
                    String str2 = c16975e22.loadAd;
                    this.f32943class = z22 & (AbstractC8542e.yandex(str2) != 1 && AbstractC8542e.ad(str2, c16975e22.mopub));
                    this.f32945interface = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ?? r6 = this.purchase;
        if (r6 == 0 || !z) {
            return;
        }
        r6.remoteconfig();
    }

    /* renamed from: class, reason: not valid java name */
    public final synchronized void m4176class(long j) {
        Throwable th;
        C16806e c16806e;
        long j2;
        int i;
        try {
            try {
                if (j == this.signatures) {
                    return;
                }
                int i2 = -1;
                if (j == Long.MIN_VALUE) {
                    try {
                        this.inmobi = -1;
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (j <= this.isVip) {
                    c16806e = this;
                    j2 = j;
                    i = c16806e.smaato(this.subscription, this.Signature, j2, false);
                } else {
                    c16806e = this;
                    j2 = j;
                    i = -1;
                }
                if (i != -1) {
                    i2 = c16806e.admob + i;
                }
                c16806e.inmobi = i2;
                c16806e.signatures = j2;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized boolean crashlytics(int i) {
        subs();
        int i2 = this.admob;
        if (i >= i2 && i <= this.Signature + i2) {
            int i3 = this.inmobi;
            if (i3 != -1 && i >= i3) {
                return false;
            }
            this.pro = Long.MIN_VALUE;
            this.remoteconfig = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean firebase(long j, boolean z) {
        Throwable th;
        long min;
        C16806e c16806e;
        long j2;
        int amazon;
        try {
            try {
                subs();
                int pro = pro(this.remoteconfig);
                long j3 = this.signatures;
                if (j3 != Long.MIN_VALUE) {
                    try {
                        min = Math.min(this.isVip, j3);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    min = this.isVip;
                }
                int i = this.remoteconfig;
                int i2 = this.Signature;
                if (!(i != i2) || j < this.amazon[pro] || (j > min && !z)) {
                    return false;
                }
                if (this.f32943class) {
                    amazon = smaato(pro, i2 - i, j, z);
                    c16806e = this;
                    j2 = j;
                } else {
                    int i3 = i2 - i;
                    c16806e = this;
                    j2 = j;
                    amazon = c16806e.amazon(pro, i3, j2, true);
                }
                if (amazon == -1) {
                    return false;
                }
                c16806e.pro = j2;
                c16806e.remoteconfig += amazon;
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final boolean inmobi(int i) {
        InterfaceC16612e interfaceC16612e = this.yandex;
        if (interfaceC16612e == null || interfaceC16612e.getState() == 4) {
            return true;
        }
        return (this.smaato[i] & 1073741824) == 0 && this.yandex.vip();
    }

    /* renamed from: interface, reason: not valid java name */
    public final synchronized void m4177interface(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.remoteconfig + i <= this.Signature) {
                    z = true;
                    AbstractC2301e.billing(z);
                    this.remoteconfig += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        AbstractC2301e.billing(z);
        this.remoteconfig += i;
    }

    public final void isPro(C16975e c16975e, C13391e c13391e) {
        C16975e c16975e2;
        C16975e c16975e3 = this.billing;
        boolean z = c16975e3 == null;
        C9284e c9284e = c16975e3 == null ? null : c16975e3.remoteconfig;
        this.billing = c16975e;
        C9284e c9284e2 = c16975e.remoteconfig;
        InterfaceC14469e interfaceC14469e = this.license;
        if (interfaceC14469e != null) {
            int mo2038e = interfaceC14469e.mo2038e(c16975e);
            C11445e ad = c16975e.ad();
            ad.f23023protected = mo2038e;
            c16975e2 = new C16975e(ad);
        } else {
            c16975e2 = c16975e;
        }
        c13391e.f26644e = c16975e2;
        c13391e.f26645e = this.yandex;
        if (interfaceC14469e == null) {
            return;
        }
        if (z || !Objects.equals(c9284e, c9284e2)) {
            InterfaceC16612e interfaceC16612e = this.yandex;
            C15683e c15683e = this.appmetrica;
            InterfaceC16612e yandex = interfaceC14469e.yandex(c15683e, c16975e);
            this.yandex = yandex;
            c13391e.f26645e = yandex;
            if (interfaceC16612e != null) {
                interfaceC16612e.metrica(c15683e);
            }
        }
    }

    public final synchronized boolean isVip(boolean z) {
        C16975e c16975e;
        int remoteconfig = remoteconfig();
        int i = this.inmobi;
        boolean z2 = true;
        if (i != -1 && remoteconfig >= i) {
            return true;
        }
        if (this.remoteconfig != this.Signature) {
            if (((C3819e) this.metrica.inmobi(remoteconfig)).ad != this.billing) {
                return true;
            }
            return inmobi(pro(this.remoteconfig));
        }
        if (!z && !this.isPro && ((c16975e = this.crashlytics) == null || c16975e == this.billing)) {
            z2 = false;
        }
        return z2;
    }

    @Override // defpackage.InterfaceC18147e
    public final /* synthetic */ void license(long j) {
    }

    public C16975e loadAd(C16975e c16975e) {
        if (this.f32944goto == 0 || c16975e.pro == Long.MAX_VALUE) {
            return c16975e;
        }
        C11445e ad = c16975e.ad();
        ad.remoteconfig = c16975e.pro + this.f32944goto;
        return new C16975e(ad);
    }

    @Override // defpackage.InterfaceC18147e
    public final int metrica(InterfaceC15672e interfaceC15672e, int i, boolean z) {
        C11184e c11184e = this.ad;
        int vip = c11184e.vip(i);
        C18524e c18524e = c11184e.purchase;
        C10919e c10919e = (C10919e) c18524e.f36317e;
        int read = interfaceC15672e.read(c10919e.ad, ((int) (c11184e.billing - c18524e.f36318e)) + c10919e.vip, vip);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = c11184e.billing + read;
        c11184e.billing = j;
        C18524e c18524e2 = c11184e.purchase;
        if (j == c18524e2.f36319e) {
            c11184e.purchase = (C18524e) c18524e2.f36316e;
        }
        return read;
    }

    public final void mopub() {
        long startapp;
        C11184e c11184e = this.ad;
        synchronized (this) {
            int i = this.Signature;
            startapp = i == 0 ? -1L : startapp(i);
        }
        c11184e.ad(startapp);
    }

    public final void premium(boolean z) {
        C11184e c11184e = this.ad;
        C18524e c18524e = c11184e.license;
        InterfaceC16970e interfaceC16970e = c11184e.ad;
        if (((C10919e) c18524e.f36317e) != null) {
            interfaceC16970e.appmetrica(c18524e);
            c18524e.f36317e = null;
            c18524e.f36316e = null;
        }
        C18524e c18524e2 = c11184e.license;
        int i = c11184e.vip;
        AbstractC2301e.subscription(((C10919e) c18524e2.f36317e) == null);
        c18524e2.f36318e = 0L;
        c18524e2.f36319e = i;
        C18524e c18524e3 = c11184e.license;
        c11184e.appmetrica = c18524e3;
        c11184e.purchase = c18524e3;
        c11184e.billing = 0L;
        interfaceC16970e.admob();
        this.Signature = 0;
        this.admob = 0;
        this.subscription = 0;
        this.remoteconfig = 0;
        this.inmobi = -1;
        this.applovin = true;
        this.pro = Long.MIN_VALUE;
        this.tapsense = Long.MIN_VALUE;
        this.isVip = Long.MIN_VALUE;
        this.isPro = false;
        Csuper csuper = this.metrica;
        SparseArray sparseArray = (SparseArray) csuper.f36469e;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((C11180e) csuper.f36471e).accept(sparseArray.valueAt(i2));
        }
        csuper.f36470e = -1;
        sparseArray.clear();
        if (z) {
            this.subs = null;
            this.crashlytics = null;
            this.ads = true;
            this.f32943class = true;
        }
    }

    public final int pro(int i) {
        int i2 = this.subscription + i;
        int i3 = this.startapp;
        return i2 < i3 ? i2 : i2 - i3;
    }

    @Override // defpackage.InterfaceC18147e
    public final int purchase(InterfaceC15672e interfaceC15672e, int i, boolean z) {
        return metrica(interfaceC15672e, i, z);
    }

    public final int remoteconfig() {
        return this.admob + this.remoteconfig;
    }

    public final synchronized int signatures(long j, boolean z) {
        try {
            try {
                int pro = pro(this.remoteconfig);
                int i = this.remoteconfig;
                int i2 = this.Signature;
                if (!(i != i2) || j < this.amazon[pro]) {
                    return 0;
                }
                if (j > this.isVip && z) {
                    return i2 - i;
                }
                int amazon = amazon(pro, i2 - i, j, true);
                if (amazon == -1) {
                    return 0;
                }
                return amazon;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final int smaato(int i, int i2, long j, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.amazon[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.startapp) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    public final long startapp(int i) {
        this.tapsense = Math.max(this.tapsense, subscription(i));
        this.Signature -= i;
        int i2 = this.admob + i;
        this.admob = i2;
        int i3 = this.subscription + i;
        this.subscription = i3;
        int i4 = this.startapp;
        if (i3 >= i4) {
            this.subscription = i3 - i4;
        }
        int i5 = this.remoteconfig - i;
        this.remoteconfig = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.remoteconfig = 0;
        }
        Csuper csuper = this.metrica;
        SparseArray sparseArray = (SparseArray) csuper.f36469e;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((C11180e) csuper.f36471e).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = csuper.f36470e;
            if (i8 > 0) {
                csuper.f36470e = i8 - 1;
            }
            i6 = i7;
        }
        if (this.Signature != 0) {
            return this.mopub[this.subscription];
        }
        int i9 = this.subscription;
        if (i9 == 0) {
            i9 = this.startapp;
        }
        return this.mopub[i9 - 1] + this.advert[r7];
    }

    public final synchronized void subs() {
        this.remoteconfig = 0;
        C11184e c11184e = this.ad;
        c11184e.appmetrica = c11184e.license;
    }

    public final long subscription(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int pro = pro(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.amazon[pro]);
            if ((this.smaato[pro] & 1) != 0) {
                return j;
            }
            pro--;
            if (pro == -1) {
                pro = this.startapp - 1;
            }
        }
        return j;
    }

    public final synchronized C16975e tapsense() {
        return this.ads ? null : this.crashlytics;
    }

    @Override // defpackage.InterfaceC18147e
    public final void vip(C1292e c1292e, int i, int i2) {
        while (true) {
            C11184e c11184e = this.ad;
            if (i <= 0) {
                c11184e.getClass();
                return;
            }
            int vip = c11184e.vip(i);
            C18524e c18524e = c11184e.purchase;
            C10919e c10919e = (C10919e) c18524e.f36317e;
            c1292e.mopub(((int) (c11184e.billing - c18524e.f36318e)) + c10919e.vip, vip, c10919e.ad);
            i -= vip;
            long j = c11184e.billing + vip;
            c11184e.billing = j;
            C18524e c18524e2 = c11184e.purchase;
            if (j == c18524e2.f36319e) {
                c11184e.purchase = (C18524e) c18524e2.f36316e;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (((defpackage.C3819e) r9.valueAt(r9.size() - 1)).ad.equals(r8.crashlytics) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void yandex(long r9, int r11, long r12, int r14, defpackage.C17737e r15) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16806e.yandex(long, int, long, int, eِ٘ٓ):void");
    }
}
