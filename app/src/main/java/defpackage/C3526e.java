package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٞۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3526e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C13141e f7946e = new C13141e(26);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C3526e f7947e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte f7948e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public List f7949e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f7950e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f7951e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f7952e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f7953e;

    static {
        C3526e c3526e = new C3526e();
        f7947e = c3526e;
        c3526e.f7949e = Collections.EMPTY_LIST;
        c3526e.f7951e = -1;
    }

    public C3526e() {
        this.f7948e = (byte) -1;
        this.f7953e = -1;
        this.f7952e = AbstractC6732e.f13911e;
    }

    public C3526e(C2766e c2766e) {
        this.f7948e = (byte) -1;
        this.f7953e = -1;
        this.f7952e = c2766e.f19037e;
    }

    public C3526e(C4285e c4285e, C18521e c18521e) {
        this.f7948e = (byte) -1;
        this.f7953e = -1;
        this.f7949e = Collections.EMPTY_LIST;
        this.f7951e = -1;
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
                                    this.f7949e = new ArrayList();
                                    z2 = true;
                                }
                                this.f7949e.add(c4285e.adcel(C13212e.f26219e, c18521e));
                            } else if (admob == 16) {
                                this.f7950e |= 1;
                                this.f7951e = c4285e.amazon();
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
                    this.f7949e = DesugarCollections.unmodifiableList(this.f7949e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f7952e = c1974e.purchase();
                    throw th2;
                }
                this.f7952e = c1974e.purchase();
                throw th;
            }
        }
        if (z2) {
            this.f7949e = DesugarCollections.unmodifiableList(this.f7949e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f7952e = c1974e.purchase();
            throw th3;
        }
        this.f7952e = c1974e.purchase();
    }

    public static C2766e startapp(C3526e c3526e) {
        C2766e yandex = C2766e.yandex();
        yandex.adcel(c3526e);
        return yandex;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f7948e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f7949e.size(); i++) {
            if (!((C13212e) this.f7949e.get(i)).ad()) {
                this.f7948e = (byte) 0;
                return false;
            }
        }
        this.f7948e = (byte) 1;
        return true;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        return startapp(this);
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C2766e.yandex();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f7953e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f7949e.size(); i3++) {
            i2 += C9831e.subscription(1, (AbstractC6649e) this.f7949e.get(i3));
        }
        if ((this.f7950e & 1) == 1) {
            i2 += C9831e.Signature(2, this.f7951e);
        }
        int size = this.f7952e.size() + i2;
        this.f7953e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        for (int i = 0; i < this.f7949e.size(); i++) {
            c9831e.m2704public(1, (AbstractC6649e) this.f7949e.get(i));
        }
        if ((this.f7950e & 1) == 1) {
            c9831e.m2695for(2, this.f7951e);
        }
        c9831e.m2690e(this.f7952e);
    }
}
