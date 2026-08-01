package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٝ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8839e implements AutoCloseable {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C10445e f17742e = new C10445e("[a-z0-9_-]{1,120}");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C10675e f17743e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f17744e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f17745e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C10675e f17746e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f17747e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f17748e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f17749e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C6312e f17750e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public boolean f17751e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f17752e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Object f17753e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C9674e f17754e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C10675e f17755e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f17756e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10675e f17757e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C14826e f17758e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final LinkedHashMap f17759e;

    public C8839e(long j, AbstractC11062e abstractC11062e, C10675e c10675e) {
        this.f17757e = c10675e;
        this.f17749e = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f17746e = c10675e.appmetrica("journal");
        this.f17755e = c10675e.appmetrica("journal.tmp");
        this.f17743e = c10675e.appmetrica("journal.bkp");
        this.f17759e = new LinkedHashMap(0, 0.75f, true);
        C11380e ad = AbstractC5097e.ad();
        C15553e c15553e = AbstractC3743e.f8333e;
        C15420e c15420e = AbstractC6731e.ad;
        this.f17758e = AbstractC9743e.ad(AbstractC5797e.vip(ad, ExecutorC3603e.f8134e.mo685static(1)));
        this.f17753e = new Object();
        this.f17750e = new C6312e(abstractC11062e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x010c, code lost:
    
        if ((r10.f17747e >= 2000) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105 A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:17:0x0032, B:27:0x0040, B:29:0x0058, B:30:0x006b, B:32:0x0079, B:34:0x0080, B:37:0x005e, B:39:0x00a0, B:41:0x00a7, B:44:0x00ac, B:46:0x00ba, B:49:0x00bf, B:50:0x00fa, B:52:0x0105, B:56:0x0111, B:59:0x010e, B:60:0x00d7, B:62:0x00ec, B:64:0x00f7, B:67:0x0090, B:69:0x0115, B:70:0x011c), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(defpackage.C8839e r10, defpackage.C5609e r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8839e.ad(eٌٝ۟, eؘْؗ, boolean):void");
    }

    public static void crashlytics(String str) {
        if (!f17742e.license(str)) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\"").toString());
        }
    }

    public final void Signature() {
        Iterator it = this.f17759e.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            C4016e c4016e = (C4016e) it.next();
            if (c4016e.billing == null) {
                for (int i = 0; i < 2; i++) {
                    j += c4016e.vip[i];
                }
            } else {
                c4016e.billing = null;
                for (int i2 = 0; i2 < 2; i2++) {
                    C10675e c10675e = (C10675e) c4016e.metrica.get(i2);
                    C6312e c6312e = this.f17750e;
                    c6312e.loadAd(c10675e, false);
                    c6312e.loadAd((C10675e) c4016e.license.get(i2), false);
                }
                it.remove();
            }
        }
        this.f17756e = j;
    }

    public final void ads(C4016e c4016e) {
        C9674e c9674e;
        int i = c4016e.yandex;
        String str = c4016e.ad;
        if (i > 0 && (c9674e = this.f17754e) != null) {
            c9674e.mo2631private("DIRTY");
            c9674e.writeByte(32);
            c9674e.mo2631private(str);
            c9674e.writeByte(10);
            c9674e.flush();
        }
        if (c4016e.yandex > 0 || c4016e.billing != null) {
            c4016e.purchase = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.f17750e.loadAd((C10675e) c4016e.metrica.get(i2), false);
            long j = this.f17756e;
            long[] jArr = c4016e.vip;
            this.f17756e = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.f17747e++;
        C9674e c9674e2 = this.f17754e;
        if (c9674e2 != null) {
            c9674e2.mo2631private("REMOVE");
            c9674e2.writeByte(32);
            c9674e2.mo2631private(str);
            c9674e2.writeByte(10);
            c9674e2.flush();
        }
        this.f17759e.remove(str);
        if (this.f17747e >= 2000) {
            loadAd();
        }
    }

    public final void advert() {
        synchronized (this.f17753e) {
            try {
                if (this.f17744e) {
                    return;
                }
                this.f17750e.loadAd(this.f17755e, false);
                if (this.f17750e.isVip(this.f17743e)) {
                    if (this.f17750e.isVip(this.f17746e)) {
                        this.f17750e.loadAd(this.f17743e, false);
                    } else {
                        this.f17750e.license(this.f17743e, this.f17746e);
                    }
                }
                if (this.f17750e.isVip(this.f17746e)) {
                    try {
                        try {
                            isVip();
                            Signature();
                            this.f17744e = true;
                            return;
                        } catch (Throwable th) {
                            this.f17748e = false;
                            throw th;
                        }
                    } catch (IOException unused) {
                        close();
                        AbstractC12110e.vip(this.f17750e, this.f17757e);
                        this.f17748e = false;
                    }
                }
                m2504goto();
                this.f17744e = true;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f17753e) {
            try {
                if (this.f17744e && !this.f17748e) {
                    for (C4016e c4016e : (C4016e[]) this.f17759e.values().toArray(new C4016e[0])) {
                        C5609e c5609e = c4016e.billing;
                        if (c5609e != null) {
                            C4016e c4016e2 = (C4016e) c5609e.f11962e;
                            if (AbstractC7890e.billing(c4016e2.billing, c5609e)) {
                                c4016e2.purchase = true;
                            }
                        }
                    }
                    subs();
                    AbstractC9743e.license(this.f17758e, null);
                    this.f17754e.close();
                    this.f17754e = null;
                    this.f17748e = true;
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                this.f17748e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m2504goto() {
        synchronized (this.f17753e) {
            try {
                C9674e c9674e = this.f17754e;
                if (c9674e != null) {
                    c9674e.close();
                }
                C9674e c9674e2 = new C9674e(this.f17750e.mo1914break(this.f17755e, false));
                try {
                    c9674e2.mo2631private("libcore.io.DiskLruCache");
                    c9674e2.writeByte(10);
                    c9674e2.mo2631private("1");
                    c9674e2.writeByte(10);
                    c9674e2.license(3);
                    c9674e2.writeByte(10);
                    c9674e2.license(2);
                    c9674e2.writeByte(10);
                    c9674e2.writeByte(10);
                    for (C4016e c4016e : this.f17759e.values()) {
                        if (c4016e.billing != null) {
                            c9674e2.mo2631private("DIRTY");
                            c9674e2.writeByte(32);
                            c9674e2.mo2631private(c4016e.ad);
                            c9674e2.writeByte(10);
                        } else {
                            c9674e2.mo2631private("CLEAN");
                            c9674e2.writeByte(32);
                            c9674e2.mo2631private(c4016e.ad);
                            for (long j : c4016e.vip) {
                                c9674e2.writeByte(32);
                                c9674e2.license(j);
                            }
                            c9674e2.writeByte(10);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    try {
                        c9674e2.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        c9674e2.close();
                    } catch (Throwable th3) {
                        AbstractC13362e.license(th, th3);
                    }
                }
                if (th != null) {
                    throw th;
                }
                if (this.f17750e.isVip(this.f17746e)) {
                    this.f17750e.license(this.f17746e, this.f17743e);
                    this.f17750e.license(this.f17755e, this.f17746e);
                    this.f17750e.loadAd(this.f17743e, false);
                } else {
                    this.f17750e.license(this.f17755e, this.f17746e);
                }
                this.f17754e = new C9674e(new C16751e(this.f17750e.f13142e.ad(this.f17746e), new C10739e(16, this), 1));
                this.f17747e = 0;
                this.f17745e = false;
                this.f17752e = false;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void inmobi(String str) {
        String substring;
        int m1865interface = AbstractC5304e.m1865interface(str, ' ', 0, 6);
        if (m1865interface == -1) {
            throw new IOException(AbstractC17861e.Signature("unexpected journal line: ", str));
        }
        int i = m1865interface + 1;
        int m1865interface2 = AbstractC5304e.m1865interface(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f17759e;
        if (m1865interface2 == -1) {
            substring = str.substring(i);
            if (m1865interface == 6 && AbstractC6507e.pro(str, "REMOVE", false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, m1865interface2);
        }
        Object obj = linkedHashMap.get(substring);
        if (obj == null) {
            obj = new C4016e(this, substring);
            linkedHashMap.put(substring, obj);
        }
        C4016e c4016e = (C4016e) obj;
        if (m1865interface2 == -1 || m1865interface != 5 || !AbstractC6507e.pro(str, "CLEAN", false)) {
            if (m1865interface2 == -1 && m1865interface == 5 && AbstractC6507e.pro(str, "DIRTY", false)) {
                c4016e.billing = new C5609e(this, c4016e);
                return;
            } else {
                if (m1865interface2 != -1 || m1865interface != 4 || !AbstractC6507e.pro(str, "READ", false)) {
                    throw new IOException(AbstractC17861e.Signature("unexpected journal line: ", str));
                }
                return;
            }
        }
        List m1868package = AbstractC5304e.m1868package(str.substring(m1865interface2 + 1), new char[]{' '});
        c4016e.appmetrica = true;
        c4016e.billing = null;
        if (m1868package.size() != 2) {
            throw new IOException("unexpected journal line: " + m1868package);
        }
        try {
            int size = m1868package.size();
            for (int i2 = 0; i2 < size; i2++) {
                c4016e.vip[i2] = Long.parseLong((String) m1868package.get(i2));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + m1868package);
        }
    }

    public final void isVip() {
        C6312e c6312e = this.f17750e;
        AbstractC11062e abstractC11062e = c6312e.f13142e;
        C10675e c10675e = this.f17746e;
        C13197e c13197e = new C13197e(abstractC11062e.mo1918implements(c10675e));
        try {
            String mo1678case = c13197e.mo1678case(Long.MAX_VALUE);
            String mo1678case2 = c13197e.mo1678case(Long.MAX_VALUE);
            String mo1678case3 = c13197e.mo1678case(Long.MAX_VALUE);
            String mo1678case4 = c13197e.mo1678case(Long.MAX_VALUE);
            String mo1678case5 = c13197e.mo1678case(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(mo1678case) || !"1".equals(mo1678case2) || !AbstractC7890e.billing(String.valueOf(3), mo1678case3) || !AbstractC7890e.billing(String.valueOf(2), mo1678case4) || mo1678case5.length() > 0) {
                throw new IOException("unexpected journal header: [" + mo1678case + ", " + mo1678case2 + ", " + mo1678case3 + ", " + mo1678case4 + ", " + mo1678case5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    inmobi(c13197e.mo1678case(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f17747e = i - this.f17759e.size();
                    if (c13197e.yandex()) {
                        this.f17754e = new C9674e(new C16751e(c6312e.f13142e.ad(c10675e), new C10739e(16, this), 1));
                    } else {
                        m2504goto();
                    }
                    Unit unit = Unit.INSTANCE;
                    try {
                        c13197e.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                c13197e.close();
            } catch (Throwable th3) {
                AbstractC13362e.license(th, th3);
            }
        }
    }

    public final C5609e license(String str) {
        synchronized (this.f17753e) {
            if (this.f17748e) {
                throw new IllegalStateException("cache is closed");
            }
            crashlytics(str);
            advert();
            C4016e c4016e = (C4016e) this.f17759e.get(str);
            if ((c4016e != null ? c4016e.billing : null) != null) {
                return null;
            }
            if (c4016e != null && c4016e.yandex != 0) {
                return null;
            }
            if (!this.f17751e && !this.f17752e) {
                C9674e c9674e = this.f17754e;
                c9674e.mo2631private("DIRTY");
                c9674e.writeByte(32);
                c9674e.mo2631private(str);
                c9674e.writeByte(10);
                c9674e.flush();
                if (this.f17745e) {
                    return null;
                }
                if (c4016e == null) {
                    c4016e = new C4016e(this, str);
                    this.f17759e.put(str, c4016e);
                }
                C5609e c5609e = new C5609e(this, c4016e);
                c4016e.billing = c5609e;
                return c5609e;
            }
            loadAd();
            return null;
        }
    }

    public final void loadAd() {
        AbstractC5336e.purchase(this.f17758e, null, 0, new C9042e(this, null, 16), 3);
    }

    public final C5106e purchase(String str) {
        C5106e ad;
        synchronized (this.f17753e) {
            if (this.f17748e) {
                throw new IllegalStateException("cache is closed");
            }
            crashlytics(str);
            advert();
            C4016e c4016e = (C4016e) this.f17759e.get(str);
            if (c4016e != null && (ad = c4016e.ad()) != null) {
                boolean z = true;
                this.f17747e++;
                C9674e c9674e = this.f17754e;
                c9674e.mo2631private("READ");
                c9674e.writeByte(32);
                c9674e.mo2631private(str);
                c9674e.writeByte(10);
                c9674e.flush();
                if (this.f17747e < 2000) {
                    z = false;
                }
                if (z) {
                    loadAd();
                }
                return ad;
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        ads(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void subs() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f17756e
            long r2 = r4.f17749e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f17759e
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            eٍؖۨ r1 = (defpackage.C4016e) r1
            boolean r2 = r1.purchase
            if (r2 != 0) goto L12
            r4.ads(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f17751e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8839e.subs():void");
    }
}
