package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17758e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C13141e f34830e = new C13141e(1);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C17758e f34831e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte f34832e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f34833e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f34834e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f34835e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f34836e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f34837e;

    static {
        C17758e c17758e = new C17758e();
        f34831e = c17758e;
        c17758e.f34833e = 0;
        c17758e.f34835e = 0;
    }

    public C17758e() {
        this.f34832e = (byte) -1;
        this.f34837e = -1;
        this.f34836e = AbstractC6732e.f13911e;
    }

    public C17758e(C4285e c4285e) {
        this.f34832e = (byte) -1;
        this.f34837e = -1;
        boolean z = false;
        this.f34833e = 0;
        this.f34835e = 0;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        while (!z) {
            try {
                try {
                    int admob = c4285e.admob();
                    if (admob != 0) {
                        if (admob == 8) {
                            this.f34834e |= 1;
                            this.f34833e = c4285e.amazon();
                        } else if (admob == 16) {
                            this.f34834e |= 2;
                            this.f34835e = c4285e.amazon();
                        } else if (!c4285e.signatures(admob, m2672protected)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        m2672protected.crashlytics();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f34836e = c1974e.purchase();
                        throw th2;
                    }
                    this.f34836e = c1974e.purchase();
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
            this.f34836e = c1974e.purchase();
            throw th3;
        }
        this.f34836e = c1974e.purchase();
    }

    public C17758e(C9197e c9197e) {
        this.f34832e = (byte) -1;
        this.f34837e = -1;
        this.f34836e = c9197e.f19037e;
    }

    public static C9197e startapp(C17758e c17758e) {
        C9197e c9197e = new C9197e(1);
        c9197e.startapp(c17758e);
        return c9197e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        if (this.f34832e == 1) {
            return true;
        }
        this.f34832e = (byte) 1;
        return true;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        return startapp(this);
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return new C9197e(1);
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f34837e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f34834e & 1) == 1 ? C9831e.Signature(1, this.f34833e) : 0;
        if ((this.f34834e & 2) == 2) {
            Signature += C9831e.Signature(2, this.f34835e);
        }
        int size = this.f34836e.size() + Signature;
        this.f34837e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        if ((this.f34834e & 1) == 1) {
            c9831e.m2695for(1, this.f34833e);
        }
        if ((this.f34834e & 2) == 2) {
            c9831e.m2695for(2, this.f34835e);
        }
        c9831e.m2690e(this.f34836e);
    }
}
