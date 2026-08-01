package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12162e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C12162e f24449e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C13141e f24450e = new C13141e(19);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte f24451e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public List f24452e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f24453e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f24454e;

    static {
        C12162e c12162e = new C12162e();
        f24449e = c12162e;
        c12162e.f24452e = Collections.EMPTY_LIST;
    }

    public C12162e() {
        this.f24451e = (byte) -1;
        this.f24453e = -1;
        this.f24454e = AbstractC6732e.f13911e;
    }

    public C12162e(C4285e c4285e, C18521e c18521e) {
        this.f24451e = (byte) -1;
        this.f24453e = -1;
        this.f24452e = Collections.EMPTY_LIST;
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
                                if (!z2) {
                                    this.f24452e = new ArrayList();
                                    z2 = true;
                                }
                                this.f24452e.add(c4285e.adcel(C10905e.f21603e, c18521e));
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
                    this.f24452e = DesugarCollections.unmodifiableList(this.f24452e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f24454e = c1974e.purchase();
                    throw th2;
                }
                this.f24454e = c1974e.purchase();
                throw th;
            }
        }
        if (z2) {
            this.f24452e = DesugarCollections.unmodifiableList(this.f24452e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f24454e = c1974e.purchase();
            throw th3;
        }
        this.f24454e = c1974e.purchase();
    }

    public C12162e(C6240e c6240e) {
        this.f24451e = (byte) -1;
        this.f24453e = -1;
        this.f24454e = c6240e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f24451e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f24452e.size(); i++) {
            if (!((C10905e) this.f24452e.get(i)).ad()) {
                this.f24451e = (byte) 0;
                return false;
            }
        }
        this.f24451e = (byte) 1;
        return true;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C6240e c6240e = new C6240e(1);
        c6240e.f13044e = Collections.EMPTY_LIST;
        c6240e.mopub(this);
        return c6240e;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        C6240e c6240e = new C6240e(1);
        c6240e.f13044e = Collections.EMPTY_LIST;
        return c6240e;
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f24453e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f24452e.size(); i3++) {
            i2 += C9831e.subscription(1, (AbstractC6649e) this.f24452e.get(i3));
        }
        int size = this.f24454e.size() + i2;
        this.f24453e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        for (int i = 0; i < this.f24452e.size(); i++) {
            c9831e.m2704public(1, (AbstractC6649e) this.f24452e.get(i));
        }
        c9831e.m2690e(this.f24454e);
    }
}
