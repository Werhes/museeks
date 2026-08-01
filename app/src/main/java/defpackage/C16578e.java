package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16578e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C16578e f32521e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C13141e f32522e = new C13141e(23);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f32523e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public EnumC8270e f32524e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f32525e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C13212e f32526e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f32527e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f32528e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public byte f32529e;

    static {
        C16578e c16578e = new C16578e();
        f32521e = c16578e;
        c16578e.f32524e = EnumC8270e.INV;
        c16578e.f32526e = C13212e.f26218e;
        c16578e.f32523e = 0;
    }

    public C16578e() {
        this.f32529e = (byte) -1;
        this.f32528e = -1;
        this.f32527e = AbstractC6732e.f13911e;
    }

    public C16578e(C4285e c4285e, C18521e c18521e) {
        this.f32529e = (byte) -1;
        this.f32528e = -1;
        EnumC8270e enumC8270e = EnumC8270e.INV;
        this.f32524e = enumC8270e;
        this.f32526e = C13212e.f26218e;
        boolean z = false;
        this.f32523e = 0;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        while (!z) {
            try {
                try {
                    try {
                        int admob = c4285e.admob();
                        if (admob != 0) {
                            C3333e c3333e = null;
                            EnumC8270e enumC8270e2 = null;
                            if (admob == 8) {
                                int amazon = c4285e.amazon();
                                if (amazon == 0) {
                                    enumC8270e2 = EnumC8270e.IN;
                                } else if (amazon == 1) {
                                    enumC8270e2 = EnumC8270e.OUT;
                                } else if (amazon == 2) {
                                    enumC8270e2 = enumC8270e;
                                } else if (amazon == 3) {
                                    enumC8270e2 = EnumC8270e.STAR;
                                }
                                if (enumC8270e2 == null) {
                                    m2672protected.m2689e(admob);
                                    m2672protected.m2689e(amazon);
                                } else {
                                    this.f32525e |= 1;
                                    this.f32524e = enumC8270e2;
                                }
                            } else if (admob == 18) {
                                if ((this.f32525e & 2) == 2) {
                                    C13212e c13212e = this.f32526e;
                                    c13212e.getClass();
                                    c3333e = C13212e.subscription(c13212e);
                                }
                                C13212e c13212e2 = (C13212e) c4285e.adcel(C13212e.f26219e, c18521e);
                                this.f32526e = c13212e2;
                                if (c3333e != null) {
                                    c3333e.startapp(c13212e2);
                                    this.f32526e = c3333e.billing();
                                }
                                this.f32525e |= 2;
                            } else if (admob == 24) {
                                this.f32525e |= 4;
                                this.f32523e = c4285e.amazon();
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
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f32527e = c1974e.purchase();
                    throw th2;
                }
                this.f32527e = c1974e.purchase();
                throw th;
            }
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f32527e = c1974e.purchase();
            throw th3;
        }
        this.f32527e = c1974e.purchase();
    }

    public C16578e(C11003e c11003e) {
        this.f32529e = (byte) -1;
        this.f32528e = -1;
        this.f32527e = c11003e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f32529e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f32525e & 2) != 2 || this.f32526e.ad()) {
            this.f32529e = (byte) 1;
            return true;
        }
        this.f32529e = (byte) 0;
        return false;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C11003e billing = C11003e.billing();
        billing.yandex(this);
        return billing;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C11003e.billing();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f32528e;
        if (i != -1) {
            return i;
        }
        int loadAd = (this.f32525e & 1) == 1 ? C9831e.loadAd(1, this.f32524e.f16796e) : 0;
        if ((this.f32525e & 2) == 2) {
            loadAd += C9831e.subscription(2, this.f32526e);
        }
        if ((this.f32525e & 4) == 4) {
            loadAd += C9831e.Signature(3, this.f32523e);
        }
        int size = this.f32527e.size() + loadAd;
        this.f32528e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        if ((this.f32525e & 1) == 1) {
            c9831e.m2715volatile(1, this.f32524e.f16796e);
        }
        if ((this.f32525e & 2) == 2) {
            c9831e.m2704public(2, this.f32526e);
        }
        if ((this.f32525e & 4) == 4) {
            c9831e.m2695for(3, this.f32523e);
        }
        c9831e.m2690e(this.f32527e);
    }
}
