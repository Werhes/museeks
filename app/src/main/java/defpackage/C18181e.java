package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18181e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C13141e f35596e = new C13141e(9);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C18181e f35597e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte f35598e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f35599e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f35600e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C1884e f35601e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f35602e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f35603e;

    static {
        C18181e c18181e = new C18181e();
        f35597e = c18181e;
        c18181e.f35599e = 0;
        c18181e.f35601e = AbstractC6732e.f13911e;
    }

    public C18181e() {
        this.f35598e = (byte) -1;
        this.f35603e = -1;
        this.f35602e = AbstractC6732e.f13911e;
    }

    public C18181e(C4285e c4285e) {
        this.f35598e = (byte) -1;
        this.f35603e = -1;
        boolean z = false;
        this.f35599e = 0;
        this.f35601e = AbstractC6732e.f13911e;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        while (!z) {
            try {
                try {
                    int admob = c4285e.admob();
                    if (admob != 0) {
                        if (admob == 8) {
                            this.f35600e |= 1;
                            this.f35599e = c4285e.amazon();
                        } else if (admob == 18) {
                            this.f35600e |= 2;
                            this.f35601e = c4285e.yandex();
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
                    this.f35602e = c1974e.purchase();
                    throw th2;
                }
                this.f35602e = c1974e.purchase();
                throw th;
            }
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f35602e = c1974e.purchase();
            throw th3;
        }
        this.f35602e = c1974e.purchase();
    }

    public C18181e(C18223e c18223e) {
        this.f35598e = (byte) -1;
        this.f35603e = -1;
        this.f35602e = c18223e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f35598e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f35600e;
        if ((i & 1) != 1) {
            this.f35598e = (byte) 0;
            return false;
        }
        if ((i & 2) == 2) {
            this.f35598e = (byte) 1;
            return true;
        }
        this.f35598e = (byte) 0;
        return false;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C18223e c18223e = new C18223e(1);
        c18223e.f35685e = AbstractC6732e.f13911e;
        c18223e.startapp(this);
        return c18223e;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        C18223e c18223e = new C18223e(1);
        c18223e.f35685e = AbstractC6732e.f13911e;
        return c18223e;
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f35603e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f35600e & 1) == 1 ? C9831e.Signature(1, this.f35599e) : 0;
        if ((this.f35600e & 2) == 2) {
            C1884e c1884e = this.f35601e;
            Signature += c1884e.size() + C9831e.pro(c1884e.size()) + C9831e.tapsense(2);
        }
        int size = this.f35602e.size() + Signature;
        this.f35603e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        if ((this.f35600e & 1) == 1) {
            c9831e.m2695for(1, this.f35599e);
        }
        if ((this.f35600e & 2) == 2) {
            C1884e c1884e = this.f35601e;
            c9831e.m2691e(2, 2);
            c9831e.m2689e(c1884e.size());
            c9831e.m2690e(c1884e);
        }
        c9831e.m2690e(this.f35602e);
    }
}
