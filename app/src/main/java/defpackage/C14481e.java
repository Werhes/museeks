package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٔؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14481e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C13141e f28621e = new C13141e(6);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C14481e f28622e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte f28623e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f28624e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f28625e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C3545e f28626e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f28627e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f28628e;

    static {
        C14481e c14481e = new C14481e();
        f28622e = c14481e;
        c14481e.f28624e = 0;
        c14481e.f28626e = C3545e.f7986e;
    }

    public C14481e() {
        this.f28623e = (byte) -1;
        this.f28628e = -1;
        this.f28627e = AbstractC6732e.f13911e;
    }

    public C14481e(C4285e c4285e, C18521e c18521e) {
        C11877e c11877e;
        this.f28623e = (byte) -1;
        this.f28628e = -1;
        boolean z = false;
        this.f28624e = 0;
        this.f28626e = C3545e.f7986e;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        while (!z) {
            try {
                try {
                    int admob = c4285e.admob();
                    if (admob != 0) {
                        if (admob == 8) {
                            this.f28625e |= 1;
                            this.f28624e = c4285e.amazon();
                        } else if (admob == 18) {
                            if ((this.f28625e & 2) == 2) {
                                C3545e c3545e = this.f28626e;
                                c3545e.getClass();
                                c11877e = C3545e.adcel(c3545e);
                            } else {
                                c11877e = null;
                            }
                            C3545e c3545e2 = (C3545e) c4285e.adcel(C3545e.f7985e, c18521e);
                            this.f28626e = c3545e2;
                            if (c11877e != null) {
                                c11877e.yandex(c3545e2);
                                this.f28626e = c11877e.purchase();
                            }
                            this.f28625e |= 2;
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
                    this.f28627e = c1974e.purchase();
                    throw th2;
                }
                this.f28627e = c1974e.purchase();
                throw th;
            }
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f28627e = c1974e.purchase();
            throw th3;
        }
        this.f28627e = c1974e.purchase();
    }

    public C14481e(C18223e c18223e) {
        this.f28623e = (byte) -1;
        this.f28628e = -1;
        this.f28627e = c18223e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f28623e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f28625e;
        if ((i & 1) != 1) {
            this.f28623e = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.f28623e = (byte) 0;
            return false;
        }
        if (this.f28626e.ad()) {
            this.f28623e = (byte) 1;
            return true;
        }
        this.f28623e = (byte) 0;
        return false;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C18223e c18223e = new C18223e(0);
        c18223e.f35685e = C3545e.f7986e;
        c18223e.yandex(this);
        return c18223e;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        C18223e c18223e = new C18223e(0);
        c18223e.f35685e = C3545e.f7986e;
        return c18223e;
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f28628e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f28625e & 1) == 1 ? C9831e.Signature(1, this.f28624e) : 0;
        if ((this.f28625e & 2) == 2) {
            Signature += C9831e.subscription(2, this.f28626e);
        }
        int size = this.f28627e.size() + Signature;
        this.f28628e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        if ((this.f28625e & 1) == 1) {
            c9831e.m2695for(1, this.f28624e);
        }
        if ((this.f28625e & 2) == 2) {
            c9831e.m2704public(2, this.f28626e);
        }
        c9831e.m2690e(this.f28627e);
    }
}
