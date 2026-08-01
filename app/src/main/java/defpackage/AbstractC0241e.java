package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؑٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0241e implements InterfaceC0396e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f1489e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public long f1491e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C16975e[] f1493e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f1494e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public C11010e f1495e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f1496e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C18208e f1497e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public boolean f1498e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f1500e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public long f1501e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C11443e f1502e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public InterfaceC4543e f1503e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C17381e f1505e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C5350e f1506e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f1504e = new Object();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13391e f1492e = new C13391e(23, false);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public long f1490e = Long.MIN_VALUE;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public AbstractC6690e f1499e = AbstractC6690e.ad;

    public AbstractC0241e(int i) {
        this.f1496e = i;
    }

    @Override // defpackage.InterfaceC0396e
    public void ad(int i, Object obj) {
    }

    public abstract void adcel();

    public void admob() {
    }

    public void ads(float f, float f2) {
    }

    public abstract void advert(long j, boolean z, boolean z2);

    public void amazon() {
    }

    public final void applovin(long j, boolean z, boolean z2) {
        this.f1494e = false;
        this.f1491e = j;
        this.f1490e = j;
        if (!z2) {
            InterfaceC4543e interfaceC4543e = this.f1503e;
            interfaceC4543e.getClass();
            z2 = interfaceC4543e.amazon(j - this.f1501e) != 0;
        }
        advert(j, z, z2);
    }

    public InterfaceC7387e appmetrica() {
        return null;
    }

    public final boolean billing() {
        return this.f1490e == Long.MIN_VALUE;
    }

    public boolean crashlytics(long j) {
        return false;
    }

    public long license(long j, long j2) {
        if (this.f1500e == 1) {
            return (startapp() || yandex()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public void loadAd() {
    }

    public void metrica() {
    }

    public void mopub(boolean z, boolean z2) {
    }

    public abstract int premium(C16975e c16975e);

    public final int pro(C13391e c13391e, C7507e c7507e, int i) {
        InterfaceC4543e interfaceC4543e = this.f1503e;
        interfaceC4543e.getClass();
        int admob = interfaceC4543e.admob(c13391e, c7507e, i);
        if (admob == -4) {
            if (c7507e.metrica(4)) {
                this.f1490e = Long.MIN_VALUE;
                return this.f1494e ? -4 : -3;
            }
            long j = c7507e.f15301e + this.f1501e;
            c7507e.f15301e = j;
            this.f1490e = Math.max(this.f1490e, j);
            return admob;
        }
        if (admob == -5) {
            C16975e c16975e = (C16975e) c13391e.f26644e;
            c16975e.getClass();
            long j2 = c16975e.pro;
            if (j2 != Long.MAX_VALUE) {
                C11445e ad = c16975e.ad();
                ad.remoteconfig = j2 + this.f1501e;
                c13391e.f26644e = new C16975e(ad);
            }
        }
        return admob;
    }

    public abstract String purchase();

    public void remoteconfig() {
    }

    public abstract void signatures(long j, long j2);

    public void smaato() {
    }

    public abstract boolean startapp();

    public int subs() {
        return 0;
    }

    public void subscription(C16975e[] c16975eArr, long j, long j2, C18208e c18208e) {
    }

    public final void tapsense(C16975e[] c16975eArr, InterfaceC4543e interfaceC4543e, long j, long j2, C18208e c18208e) {
        AbstractC2301e.subscription(!this.f1494e);
        this.f1503e = interfaceC4543e;
        this.f1497e = c18208e;
        if (this.f1490e == Long.MIN_VALUE) {
            this.f1490e = j;
        }
        this.f1493e = c16975eArr;
        this.f1501e = j2;
        subscription(c16975eArr, j, j2, c18208e);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C5681e vip(java.lang.Exception r12, defpackage.C16975e r13, boolean r14, int r15) {
        /*
            r11 = this;
            r0 = 4
            if (r13 == 0) goto L1a
            boolean r1 = r11.f1498e
            if (r1 != 0) goto L1a
            r1 = 1
            r11.f1498e = r1
            r1 = 0
            int r2 = r11.premium(r13)     // Catch: java.lang.Throwable -> L14 defpackage.C5681e -> L18
            r2 = r2 & 7
            r11.f1498e = r1
            goto L1b
        L14:
            r0 = move-exception
            r11.f1498e = r1
            throw r0
        L18:
            r11.f1498e = r1
        L1a:
            r2 = r0
        L1b:
            java.lang.String r5 = r11.purchase()
            int r6 = r11.f1489e
            eَٛ r9 = r11.f1497e
            eٍؘٗ r1 = new eٍؘٗ
            if (r13 != 0) goto L29
            r8 = r0
            goto L2a
        L29:
            r8 = r2
        L2a:
            r2 = 1
            r3 = r12
            r7 = r13
            r10 = r14
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0241e.vip(java.lang.Exception, eٌْٗ, boolean, int):eٍؘٗ");
    }

    public boolean yandex() {
        return billing();
    }
}
