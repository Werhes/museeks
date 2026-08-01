package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً۟ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8244e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C8244e f16743e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C13141e f16744e = new C13141e(21);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte f16745e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public InterfaceC12326e f16746e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f16747e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f16748e;

    static {
        C8244e c8244e = new C8244e();
        f16743e = c8244e;
        c8244e.f16746e = C1064e.f3589e;
    }

    public C8244e() {
        this.f16745e = (byte) -1;
        this.f16747e = -1;
        this.f16748e = AbstractC6732e.f13911e;
    }

    public C8244e(C4285e c4285e) {
        this.f16745e = (byte) -1;
        this.f16747e = -1;
        this.f16746e = C1064e.f3589e;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int admob = c4285e.admob();
                        if (admob != 0) {
                            if (admob == 10) {
                                C1884e yandex = c4285e.yandex();
                                if (!z2) {
                                    this.f16746e = new C1064e();
                                    z2 = true;
                                }
                                this.f16746e.isPro(yandex);
                            } else if (!c4285e.signatures(admob, m2672protected)) {
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
                if (z2) {
                    this.f16746e = this.f16746e.signatures();
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f16748e = c1974e.purchase();
                    throw th2;
                }
                this.f16748e = c1974e.purchase();
                throw th;
            }
        }
        if (z2) {
            this.f16746e = this.f16746e.signatures();
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f16748e = c1974e.purchase();
            throw th3;
        }
        this.f16748e = c1974e.purchase();
    }

    public C8244e(C6240e c6240e) {
        this.f16745e = (byte) -1;
        this.f16747e = -1;
        this.f16748e = c6240e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        if (this.f16745e == 1) {
            return true;
        }
        this.f16745e = (byte) 1;
        return true;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C6240e c6240e = new C6240e(3);
        c6240e.f13044e = C1064e.f3589e;
        c6240e.smaato(this);
        return c6240e;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        C6240e c6240e = new C6240e(3);
        c6240e.f13044e = C1064e.f3589e;
        return c6240e;
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f16747e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f16746e.size(); i3++) {
            AbstractC6732e pro = this.f16746e.pro(i3);
            i2 += pro.size() + C9831e.pro(pro.size());
        }
        int size = this.f16748e.size() + this.f16746e.size() + i2;
        this.f16747e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        for (int i = 0; i < this.f16746e.size(); i++) {
            AbstractC6732e pro = this.f16746e.pro(i);
            c9831e.m2691e(1, 2);
            c9831e.m2689e(pro.size());
            c9831e.m2690e(pro);
        }
        c9831e.m2690e(this.f16748e);
    }
}
