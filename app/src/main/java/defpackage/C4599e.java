package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؒۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4599e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C13141e f9905e = new C13141e(5);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C4599e f9906e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte f9907e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f9908e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f9909e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public List f9910e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f9911e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f9912e;

    static {
        C4599e c4599e = new C4599e();
        f9906e = c4599e;
        c4599e.f9908e = 0;
        c4599e.f9910e = Collections.EMPTY_LIST;
    }

    public C4599e() {
        this.f9907e = (byte) -1;
        this.f9912e = -1;
        this.f9911e = AbstractC6732e.f13911e;
    }

    public C4599e(C2766e c2766e) {
        this.f9907e = (byte) -1;
        this.f9912e = -1;
        this.f9911e = c2766e.f19037e;
    }

    public C4599e(C4285e c4285e, C18521e c18521e) {
        this.f9907e = (byte) -1;
        this.f9912e = -1;
        boolean z = false;
        this.f9908e = 0;
        this.f9910e = Collections.EMPTY_LIST;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int admob = c4285e.admob();
                    if (admob != 0) {
                        if (admob == 8) {
                            this.f9909e |= 1;
                            this.f9908e = c4285e.amazon();
                        } else if (admob == 18) {
                            if ((c & 2) != 2) {
                                this.f9910e = new ArrayList();
                                c = 2;
                            }
                            this.f9910e.add(c4285e.adcel(C14481e.f28621e, c18521e));
                        } else if (!c4285e.signatures(admob, m2672protected)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((c & 2) == 2) {
                        this.f9910e = DesugarCollections.unmodifiableList(this.f9910e);
                    }
                    try {
                        m2672protected.crashlytics();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f9911e = c1974e.purchase();
                        throw th2;
                    }
                    this.f9911e = c1974e.purchase();
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
        if ((c & 2) == 2) {
            this.f9910e = DesugarCollections.unmodifiableList(this.f9910e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f9911e = c1974e.purchase();
            throw th3;
        }
        this.f9911e = c1974e.purchase();
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f9907e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f9909e & 1) != 1) {
            this.f9907e = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f9910e.size(); i++) {
            if (!((C14481e) this.f9910e.get(i)).ad()) {
                this.f9907e = (byte) 0;
                return false;
            }
        }
        this.f9907e = (byte) 1;
        return true;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C2766e c2766e = new C2766e(0);
        c2766e.f6672e = Collections.EMPTY_LIST;
        c2766e.startapp(this);
        return c2766e;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        C2766e c2766e = new C2766e(0);
        c2766e.f6672e = Collections.EMPTY_LIST;
        return c2766e;
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f9912e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f9909e & 1) == 1 ? C9831e.Signature(1, this.f9908e) : 0;
        for (int i2 = 0; i2 < this.f9910e.size(); i2++) {
            Signature += C9831e.subscription(2, (AbstractC6649e) this.f9910e.get(i2));
        }
        int size = this.f9911e.size() + Signature;
        this.f9912e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        if ((this.f9909e & 1) == 1) {
            c9831e.m2695for(1, this.f9908e);
        }
        for (int i = 0; i < this.f9910e.size(); i++) {
            c9831e.m2704public(2, (AbstractC6649e) this.f9910e.get(i));
        }
        c9831e.m2690e(this.f9911e);
    }
}
