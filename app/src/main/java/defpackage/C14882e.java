package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14882e extends AbstractC0641e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C13141e f29475e = new C13141e(16);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C14882e f29476e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public List f29477e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f29478e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f29479e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC6732e f29480e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C2553e f29481e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public List f29482e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public byte f29483e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C3526e f29484e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public List f29485e;

    static {
        C14882e c14882e = new C14882e();
        f29476e = c14882e;
        List list = Collections.EMPTY_LIST;
        c14882e.f29482e = list;
        c14882e.f29477e = list;
        c14882e.f29485e = list;
        c14882e.f29484e = C3526e.f7947e;
        c14882e.f29481e = C2553e.f6409e;
    }

    public C14882e() {
        this.f29483e = (byte) -1;
        this.f29479e = -1;
        this.f29480e = AbstractC6732e.f13911e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public C14882e(C4285e c4285e, C18521e c18521e) {
        this.f29483e = (byte) -1;
        this.f29479e = -1;
        List list = Collections.EMPTY_LIST;
        this.f29482e = list;
        this.f29477e = list;
        this.f29485e = list;
        this.f29484e = C3526e.f7947e;
        this.f29481e = C2553e.f6409e;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int admob = c4285e.admob();
                        if (admob != 0) {
                            if (admob == 26) {
                                int i = (c == true ? 1 : 0) & 1;
                                c = c;
                                if (i != 1) {
                                    this.f29482e = new ArrayList();
                                    c = (c == true ? 1 : 0) | 1;
                                }
                                this.f29482e.add(c4285e.adcel(C9920e.f19580e, c18521e));
                            } else if (admob == 34) {
                                int i2 = (c == true ? 1 : 0) & 2;
                                c = c;
                                if (i2 != 2) {
                                    this.f29477e = new ArrayList();
                                    c = (c == true ? 1 : 0) | 2;
                                }
                                this.f29477e.add(c4285e.adcel(C17485e.f34249e, c18521e));
                            } else if (admob != 42) {
                                C6240e c6240e = null;
                                C2766e c2766e = null;
                                if (admob == 242) {
                                    if ((this.f29478e & 1) == 1) {
                                        C3526e c3526e = this.f29484e;
                                        c3526e.getClass();
                                        c2766e = C3526e.startapp(c3526e);
                                    }
                                    C3526e c3526e2 = (C3526e) c4285e.adcel(C3526e.f7946e, c18521e);
                                    this.f29484e = c3526e2;
                                    if (c2766e != null) {
                                        c2766e.adcel(c3526e2);
                                        this.f29484e = c2766e.billing();
                                    }
                                    this.f29478e |= 1;
                                } else if (admob == 258) {
                                    if ((this.f29478e & 2) == 2) {
                                        C2553e c2553e = this.f29481e;
                                        c2553e.getClass();
                                        c6240e = new C6240e(2);
                                        c6240e.f13044e = Collections.EMPTY_LIST;
                                        c6240e.amazon(c2553e);
                                    }
                                    C2553e c2553e2 = (C2553e) c4285e.adcel(C2553e.f6410e, c18521e);
                                    this.f29481e = c2553e2;
                                    if (c6240e != null) {
                                        c6240e.amazon(c2553e2);
                                        this.f29481e = c6240e.startapp();
                                    }
                                    this.f29478e |= 2;
                                } else if (!amazon(c4285e, m2672protected, c18521e, admob)) {
                                }
                            } else {
                                int i3 = (c == true ? 1 : 0) & 4;
                                c = c;
                                if (i3 != 4) {
                                    this.f29485e = new ArrayList();
                                    c = (c == true ? 1 : 0) | 4;
                                }
                                this.f29485e.add(c4285e.adcel(C16162e.f31743e, c18521e));
                            }
                        }
                        z = true;
                    } catch (C14226e e) {
                        e.f28108e = this;
                        throw e;
                    }
                } catch (IOException e2) {
                    C14226e c14226e = new C14226e(e2.getMessage());
                    c14226e.f28108e = this;
                    throw c14226e;
                }
            } catch (Throwable th) {
                if (((c == true ? 1 : 0) & 1) == 1) {
                    this.f29482e = DesugarCollections.unmodifiableList(this.f29482e);
                }
                if (((c == true ? 1 : 0) & 2) == 2) {
                    this.f29477e = DesugarCollections.unmodifiableList(this.f29477e);
                }
                if (((c == true ? 1 : 0) & 4) == 4) {
                    this.f29485e = DesugarCollections.unmodifiableList(this.f29485e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f29480e = c1974e.purchase();
                    throw th2;
                }
                this.f29480e = c1974e.purchase();
                smaato();
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & 1) == 1) {
            this.f29482e = DesugarCollections.unmodifiableList(this.f29482e);
        }
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.f29477e = DesugarCollections.unmodifiableList(this.f29477e);
        }
        if (((c == true ? 1 : 0) & 4) == 4) {
            this.f29485e = DesugarCollections.unmodifiableList(this.f29485e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f29480e = c1974e.purchase();
            throw th3;
        }
        this.f29480e = c1974e.purchase();
        smaato();
    }

    public C14882e(C7708e c7708e) {
        super(c7708e);
        this.f29483e = (byte) -1;
        this.f29479e = -1;
        this.f29480e = c7708e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f29483e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f29482e.size(); i++) {
            if (!((C9920e) this.f29482e.get(i)).ad()) {
                this.f29483e = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f29477e.size(); i2++) {
            if (!((C17485e) this.f29477e.get(i2)).ad()) {
                this.f29483e = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f29485e.size(); i3++) {
            if (!((C16162e) this.f29485e.get(i3)).ad()) {
                this.f29483e = (byte) 0;
                return false;
            }
        }
        if ((this.f29478e & 1) == 1 && !this.f29484e.ad()) {
            this.f29483e = (byte) 0;
            return false;
        }
        if (startapp()) {
            this.f29483e = (byte) 1;
            return true;
        }
        this.f29483e = (byte) 0;
        return false;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C7708e yandex = C7708e.yandex();
        yandex.startapp(this);
        return yandex;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C7708e.yandex();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f29479e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f29482e.size(); i3++) {
            i2 += C9831e.subscription(3, (AbstractC6649e) this.f29482e.get(i3));
        }
        for (int i4 = 0; i4 < this.f29477e.size(); i4++) {
            i2 += C9831e.subscription(4, (AbstractC6649e) this.f29477e.get(i4));
        }
        for (int i5 = 0; i5 < this.f29485e.size(); i5++) {
            i2 += C9831e.subscription(5, (AbstractC6649e) this.f29485e.get(i5));
        }
        if ((this.f29478e & 1) == 1) {
            i2 += C9831e.subscription(30, this.f29484e);
        }
        if ((this.f29478e & 2) == 2) {
            i2 += C9831e.subscription(32, this.f29481e);
        }
        int size = this.f29480e.size() + adcel() + i2;
        this.f29479e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        C18540e c18540e = new C18540e(this);
        for (int i = 0; i < this.f29482e.size(); i++) {
            c9831e.m2704public(3, (AbstractC6649e) this.f29482e.get(i));
        }
        for (int i2 = 0; i2 < this.f29477e.size(); i2++) {
            c9831e.m2704public(4, (AbstractC6649e) this.f29477e.get(i2));
        }
        for (int i3 = 0; i3 < this.f29485e.size(); i3++) {
            c9831e.m2704public(5, (AbstractC6649e) this.f29485e.get(i3));
        }
        if ((this.f29478e & 1) == 1) {
            c9831e.m2704public(30, this.f29484e);
        }
        if ((this.f29478e & 2) == 2) {
            c9831e.m2704public(32, this.f29481e);
        }
        c18540e.m4583synchronized(200, c9831e);
        c9831e.m2690e(this.f29480e);
    }

    @Override // defpackage.InterfaceC8149e
    public final AbstractC6649e vip() {
        return f29476e;
    }
}
