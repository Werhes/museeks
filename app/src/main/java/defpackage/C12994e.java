package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12994e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C13141e f25900e = new C13141e(28);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C12994e f25901e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public EnumC13839e f25902e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f25903e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f25904e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f25905e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public EnumC7709e f25906e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f25907e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public byte f25908e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f25909e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f25910e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f25911e;

    static {
        C12994e c12994e = new C12994e();
        f25901e = c12994e;
        c12994e.f25903e = 0;
        c12994e.f25907e = 0;
        c12994e.f25902e = EnumC13839e.ERROR;
        c12994e.f25911e = 0;
        c12994e.f25910e = 0;
        c12994e.f25906e = EnumC7709e.LANGUAGE_VERSION;
    }

    public C12994e() {
        this.f25908e = (byte) -1;
        this.f25904e = -1;
        this.f25909e = AbstractC6732e.f13911e;
    }

    public C12994e(C4285e c4285e) {
        this.f25908e = (byte) -1;
        this.f25904e = -1;
        boolean z = false;
        this.f25903e = 0;
        this.f25907e = 0;
        EnumC13839e enumC13839e = EnumC13839e.ERROR;
        this.f25902e = enumC13839e;
        this.f25911e = 0;
        this.f25910e = 0;
        EnumC7709e enumC7709e = EnumC7709e.LANGUAGE_VERSION;
        this.f25906e = enumC7709e;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        while (!z) {
            try {
                try {
                    int admob = c4285e.admob();
                    if (admob != 0) {
                        if (admob == 8) {
                            this.f25905e |= 1;
                            this.f25903e = c4285e.amazon();
                        } else if (admob != 16) {
                            EnumC7709e enumC7709e2 = null;
                            EnumC13839e enumC13839e2 = null;
                            if (admob == 24) {
                                int amazon = c4285e.amazon();
                                if (amazon == 0) {
                                    enumC13839e2 = EnumC13839e.WARNING;
                                } else if (amazon == 1) {
                                    enumC13839e2 = enumC13839e;
                                } else if (amazon == 2) {
                                    enumC13839e2 = EnumC13839e.HIDDEN;
                                }
                                if (enumC13839e2 == null) {
                                    m2672protected.m2689e(admob);
                                    m2672protected.m2689e(amazon);
                                } else {
                                    this.f25905e |= 4;
                                    this.f25902e = enumC13839e2;
                                }
                            } else if (admob == 32) {
                                this.f25905e |= 8;
                                this.f25911e = c4285e.amazon();
                            } else if (admob == 40) {
                                this.f25905e |= 16;
                                this.f25910e = c4285e.amazon();
                            } else if (admob == 48) {
                                int amazon2 = c4285e.amazon();
                                if (amazon2 == 0) {
                                    enumC7709e2 = enumC7709e;
                                } else if (amazon2 == 1) {
                                    enumC7709e2 = EnumC7709e.COMPILER_VERSION;
                                } else if (amazon2 == 2) {
                                    enumC7709e2 = EnumC7709e.API_VERSION;
                                }
                                if (enumC7709e2 == null) {
                                    m2672protected.m2689e(admob);
                                    m2672protected.m2689e(amazon2);
                                } else {
                                    this.f25905e |= 32;
                                    this.f25906e = enumC7709e2;
                                }
                            } else if (!c4285e.signatures(admob, m2672protected)) {
                            }
                        } else {
                            this.f25905e |= 2;
                            this.f25907e = c4285e.amazon();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        m2672protected.crashlytics();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25909e = c1974e.purchase();
                        throw th2;
                    }
                    this.f25909e = c1974e.purchase();
                    throw th;
                }
            } catch (C14226e e) {
                e.f28108e = this;
                throw e;
            } catch (IOException e2) {
                C14226e c14226e = new C14226e(e2.getMessage());
                c14226e.f28108e = this;
                throw c14226e;
            }
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f25909e = c1974e.purchase();
            throw th3;
        }
        this.f25909e = c1974e.purchase();
    }

    public C12994e(C17858e c17858e) {
        this.f25908e = (byte) -1;
        this.f25904e = -1;
        this.f25909e = c17858e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        if (this.f25908e == 1) {
            return true;
        }
        this.f25908e = (byte) 1;
        return true;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C17858e billing = C17858e.billing();
        billing.yandex(this);
        return billing;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C17858e.billing();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f25904e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f25905e & 1) == 1 ? C9831e.Signature(1, this.f25903e) : 0;
        if ((this.f25905e & 2) == 2) {
            Signature += C9831e.Signature(2, this.f25907e);
        }
        if ((this.f25905e & 4) == 4) {
            Signature += C9831e.loadAd(3, this.f25902e.f27411e);
        }
        if ((this.f25905e & 8) == 8) {
            Signature += C9831e.Signature(4, this.f25911e);
        }
        if ((this.f25905e & 16) == 16) {
            Signature += C9831e.Signature(5, this.f25910e);
        }
        if ((this.f25905e & 32) == 32) {
            Signature += C9831e.loadAd(6, this.f25906e.f15644e);
        }
        int size = this.f25909e.size() + Signature;
        this.f25904e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        if ((this.f25905e & 1) == 1) {
            c9831e.m2695for(1, this.f25903e);
        }
        if ((this.f25905e & 2) == 2) {
            c9831e.m2695for(2, this.f25907e);
        }
        if ((this.f25905e & 4) == 4) {
            c9831e.m2715volatile(3, this.f25902e.f27411e);
        }
        if ((this.f25905e & 8) == 8) {
            c9831e.m2695for(4, this.f25911e);
        }
        if ((this.f25905e & 16) == 16) {
            c9831e.m2695for(5, this.f25910e);
        }
        if ((this.f25905e & 32) == 32) {
            c9831e.m2715volatile(6, this.f25906e.f15644e);
        }
        c9831e.m2690e(this.f25909e);
    }
}
