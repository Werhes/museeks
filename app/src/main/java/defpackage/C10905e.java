package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10905e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C10905e f21602e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C13141e f21603e = new C13141e(20);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public EnumC5155e f21604e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f21605e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f21606e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f21607e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f21608e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f21609e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public byte f21610e;

    static {
        C10905e c10905e = new C10905e();
        f21602e = c10905e;
        c10905e.f21605e = -1;
        c10905e.f21607e = 0;
        c10905e.f21604e = EnumC5155e.PACKAGE;
    }

    public C10905e() {
        this.f21610e = (byte) -1;
        this.f21609e = -1;
        this.f21608e = AbstractC6732e.f13911e;
    }

    public C10905e(C4285e c4285e) {
        this.f21610e = (byte) -1;
        this.f21609e = -1;
        this.f21605e = -1;
        boolean z = false;
        this.f21607e = 0;
        EnumC5155e enumC5155e = EnumC5155e.PACKAGE;
        this.f21604e = enumC5155e;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        while (!z) {
            try {
                try {
                    int admob = c4285e.admob();
                    if (admob != 0) {
                        if (admob == 8) {
                            this.f21606e |= 1;
                            this.f21605e = c4285e.amazon();
                        } else if (admob == 16) {
                            this.f21606e |= 2;
                            this.f21607e = c4285e.amazon();
                        } else if (admob == 24) {
                            int amazon = c4285e.amazon();
                            EnumC5155e enumC5155e2 = amazon != 0 ? amazon != 1 ? amazon != 2 ? null : EnumC5155e.LOCAL : enumC5155e : EnumC5155e.CLASS;
                            if (enumC5155e2 == null) {
                                m2672protected.m2689e(admob);
                                m2672protected.m2689e(amazon);
                            } else {
                                this.f21606e |= 4;
                                this.f21604e = enumC5155e2;
                            }
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
                    this.f21608e = c1974e.purchase();
                    throw th2;
                }
                this.f21608e = c1974e.purchase();
                throw th;
            }
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f21608e = c1974e.purchase();
            throw th3;
        }
        this.f21608e = c1974e.purchase();
    }

    public C10905e(C18132e c18132e) {
        this.f21610e = (byte) -1;
        this.f21609e = -1;
        this.f21608e = c18132e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f21610e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f21606e & 2) == 2) {
            this.f21610e = (byte) 1;
            return true;
        }
        this.f21610e = (byte) 0;
        return false;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C18132e billing = C18132e.billing();
        billing.yandex(this);
        return billing;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C18132e.billing();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f21609e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f21606e & 1) == 1 ? C9831e.Signature(1, this.f21605e) : 0;
        if ((this.f21606e & 2) == 2) {
            Signature += C9831e.Signature(2, this.f21607e);
        }
        if ((this.f21606e & 4) == 4) {
            Signature += C9831e.loadAd(3, this.f21604e.f11042e);
        }
        int size = this.f21608e.size() + Signature;
        this.f21609e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        if ((this.f21606e & 1) == 1) {
            c9831e.m2695for(1, this.f21605e);
        }
        if ((this.f21606e & 2) == 2) {
            c9831e.m2695for(2, this.f21607e);
        }
        if ((this.f21606e & 4) == 4) {
            c9831e.m2715volatile(3, this.f21604e.f11042e);
        }
        c9831e.m2690e(this.f21608e);
    }
}
