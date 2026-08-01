package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٟؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2553e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C2553e f6409e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C13141e f6410e = new C13141e(29);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte f6411e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public List f6412e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f6413e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f6414e;

    static {
        C2553e c2553e = new C2553e();
        f6409e = c2553e;
        c2553e.f6412e = Collections.EMPTY_LIST;
    }

    public C2553e() {
        this.f6411e = (byte) -1;
        this.f6413e = -1;
        this.f6414e = AbstractC6732e.f13911e;
    }

    public C2553e(C4285e c4285e, C18521e c18521e) {
        this.f6411e = (byte) -1;
        this.f6413e = -1;
        this.f6412e = Collections.EMPTY_LIST;
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
                                    this.f6412e = new ArrayList();
                                    z2 = true;
                                }
                                this.f6412e.add(c4285e.adcel(C12994e.f25900e, c18521e));
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
                    this.f6412e = DesugarCollections.unmodifiableList(this.f6412e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f6414e = c1974e.purchase();
                    throw th2;
                }
                this.f6414e = c1974e.purchase();
                throw th;
            }
        }
        if (z2) {
            this.f6412e = DesugarCollections.unmodifiableList(this.f6412e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f6414e = c1974e.purchase();
            throw th3;
        }
        this.f6414e = c1974e.purchase();
    }

    public C2553e(C6240e c6240e) {
        this.f6411e = (byte) -1;
        this.f6413e = -1;
        this.f6414e = c6240e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        if (this.f6411e == 1) {
            return true;
        }
        this.f6411e = (byte) 1;
        return true;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C6240e c6240e = new C6240e(2);
        c6240e.f13044e = Collections.EMPTY_LIST;
        c6240e.amazon(this);
        return c6240e;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        C6240e c6240e = new C6240e(2);
        c6240e.f13044e = Collections.EMPTY_LIST;
        return c6240e;
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f6413e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f6412e.size(); i3++) {
            i2 += C9831e.subscription(1, (AbstractC6649e) this.f6412e.get(i3));
        }
        int size = this.f6414e.size() + i2;
        this.f6413e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        for (int i = 0; i < this.f6412e.size(); i++) {
            c9831e.m2704public(1, (AbstractC6649e) this.f6412e.get(i));
        }
        c9831e.m2690e(this.f6414e);
    }

    public final C6240e startapp() {
        C6240e c6240e = new C6240e(2);
        c6240e.f13044e = Collections.EMPTY_LIST;
        c6240e.amazon(this);
        return c6240e;
    }
}
