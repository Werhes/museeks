package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۢؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4442e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C4442e f9636e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C13141e f9637e = new C13141e(2);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C17758e f9638e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C17298e f9639e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f9640e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public byte f9641e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C17758e f9642e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f9643e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f9644e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C17758e f9645e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C17758e f9646e;

    static {
        C4442e c4442e = new C4442e();
        f9636e = c4442e;
        c4442e.f9639e = C17298e.f33934e;
        C17758e c17758e = C17758e.f34831e;
        c4442e.f9642e = c17758e;
        c4442e.f9638e = c17758e;
        c4442e.f9646e = c17758e;
        c4442e.f9645e = c17758e;
    }

    public C4442e() {
        this.f9641e = (byte) -1;
        this.f9643e = -1;
        this.f9644e = AbstractC6732e.f13911e;
    }

    public C4442e(C4285e c4285e, C18521e c18521e) {
        this.f9641e = (byte) -1;
        this.f9643e = -1;
        this.f9639e = C17298e.f33934e;
        C17758e c17758e = C17758e.f34831e;
        this.f9642e = c17758e;
        this.f9638e = c17758e;
        this.f9646e = c17758e;
        this.f9645e = c17758e;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int admob = c4285e.admob();
                    if (admob != 0) {
                        C9197e c9197e = null;
                        if (admob == 10) {
                            if ((this.f9640e & 1) == 1) {
                                C17298e c17298e = this.f9639e;
                                c17298e.getClass();
                                c9197e = new C9197e(0);
                                c9197e.yandex(c17298e);
                            }
                            C17298e c17298e2 = (C17298e) c4285e.adcel(C17298e.f33933e, c18521e);
                            this.f9639e = c17298e2;
                            if (c9197e != null) {
                                c9197e.yandex(c17298e2);
                                this.f9639e = c9197e.purchase();
                            }
                            this.f9640e |= 1;
                        } else if (admob == 18) {
                            if ((this.f9640e & 2) == 2) {
                                C17758e c17758e2 = this.f9642e;
                                c17758e2.getClass();
                                c9197e = C17758e.startapp(c17758e2);
                            }
                            C17758e c17758e3 = (C17758e) c4285e.adcel(C17758e.f34830e, c18521e);
                            this.f9642e = c17758e3;
                            if (c9197e != null) {
                                c9197e.startapp(c17758e3);
                                this.f9642e = c9197e.billing();
                            }
                            this.f9640e |= 2;
                        } else if (admob == 26) {
                            if ((this.f9640e & 4) == 4) {
                                C17758e c17758e4 = this.f9638e;
                                c17758e4.getClass();
                                c9197e = C17758e.startapp(c17758e4);
                            }
                            C17758e c17758e5 = (C17758e) c4285e.adcel(C17758e.f34830e, c18521e);
                            this.f9638e = c17758e5;
                            if (c9197e != null) {
                                c9197e.startapp(c17758e5);
                                this.f9638e = c9197e.billing();
                            }
                            this.f9640e |= 4;
                        } else if (admob == 34) {
                            if ((this.f9640e & 8) == 8) {
                                C17758e c17758e6 = this.f9646e;
                                c17758e6.getClass();
                                c9197e = C17758e.startapp(c17758e6);
                            }
                            C17758e c17758e7 = (C17758e) c4285e.adcel(C17758e.f34830e, c18521e);
                            this.f9646e = c17758e7;
                            if (c9197e != null) {
                                c9197e.startapp(c17758e7);
                                this.f9646e = c9197e.billing();
                            }
                            this.f9640e |= 8;
                        } else if (admob == 42) {
                            if ((this.f9640e & 16) == 16) {
                                C17758e c17758e8 = this.f9645e;
                                c17758e8.getClass();
                                c9197e = C17758e.startapp(c17758e8);
                            }
                            C17758e c17758e9 = (C17758e) c4285e.adcel(C17758e.f34830e, c18521e);
                            this.f9645e = c17758e9;
                            if (c9197e != null) {
                                c9197e.startapp(c17758e9);
                                this.f9645e = c9197e.billing();
                            }
                            this.f9640e |= 16;
                        } else if (!c4285e.signatures(admob, m2672protected)) {
                        }
                    }
                    z = true;
                } catch (C14226e e) {
                    e.f28108e = this;
                    throw e;
                } catch (IOException e2) {
                    C14226e c14226e = new C14226e(e2.getMessage());
                    c14226e.f28108e = this;
                    throw c14226e;
                }
            } catch (Throwable th) {
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f9644e = c1974e.purchase();
                    throw th2;
                }
                this.f9644e = c1974e.purchase();
                throw th;
            }
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f9644e = c1974e.purchase();
            throw th3;
        }
        this.f9644e = c1974e.purchase();
    }

    public C4442e(C11826e c11826e) {
        this.f9641e = (byte) -1;
        this.f9643e = -1;
        this.f9644e = c11826e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        if (this.f9641e == 1) {
            return true;
        }
        this.f9641e = (byte) 1;
        return true;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C11826e yandex = C11826e.yandex();
        yandex.adcel(this);
        return yandex;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C11826e.yandex();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f9643e;
        if (i != -1) {
            return i;
        }
        int subscription = (this.f9640e & 1) == 1 ? C9831e.subscription(1, this.f9639e) : 0;
        if ((this.f9640e & 2) == 2) {
            subscription += C9831e.subscription(2, this.f9642e);
        }
        if ((this.f9640e & 4) == 4) {
            subscription += C9831e.subscription(3, this.f9638e);
        }
        if ((this.f9640e & 8) == 8) {
            subscription += C9831e.subscription(4, this.f9646e);
        }
        if ((this.f9640e & 16) == 16) {
            subscription += C9831e.subscription(5, this.f9645e);
        }
        int size = this.f9644e.size() + subscription;
        this.f9643e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        if ((this.f9640e & 1) == 1) {
            c9831e.m2704public(1, this.f9639e);
        }
        if ((this.f9640e & 2) == 2) {
            c9831e.m2704public(2, this.f9642e);
        }
        if ((this.f9640e & 4) == 4) {
            c9831e.m2704public(3, this.f9638e);
        }
        if ((this.f9640e & 8) == 8) {
            c9831e.m2704public(4, this.f9646e);
        }
        if ((this.f9640e & 16) == 16) {
            c9831e.m2704public(5, this.f9645e);
        }
        c9831e.m2690e(this.f9644e);
    }

    public final boolean startapp() {
        return (this.f9640e & 4) == 4;
    }
}
