package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۜؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12000e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C12000e f23982e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C13141e f23983e = new C13141e(12);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C3845e f23984e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public EnumC12838e f23985e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f23986e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public byte f23987e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public List f23988e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f23989e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f23990e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public EnumC1233e f23991e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public EnumC2829e f23992e;

    static {
        C12000e c12000e = new C12000e();
        f23982e = c12000e;
        c12000e.f23985e = EnumC12838e.RETURNS_CONSTANT;
        c12000e.f23988e = Collections.EMPTY_LIST;
        c12000e.f23984e = C3845e.f8491e;
        c12000e.f23992e = EnumC2829e.AT_MOST_ONCE;
        c12000e.f23991e = EnumC1233e.CONCLUSION_CONDITION;
    }

    public C12000e() {
        this.f23987e = (byte) -1;
        this.f23989e = -1;
        this.f23990e = AbstractC6732e.f13911e;
    }

    public C12000e(C4285e c4285e, C18521e c18521e) {
        this.f23987e = (byte) -1;
        this.f23989e = -1;
        EnumC12838e enumC12838e = EnumC12838e.RETURNS_CONSTANT;
        this.f23985e = enumC12838e;
        this.f23988e = Collections.EMPTY_LIST;
        this.f23984e = C3845e.f8491e;
        EnumC2829e enumC2829e = EnumC2829e.AT_MOST_ONCE;
        this.f23992e = enumC2829e;
        EnumC1233e enumC1233e = EnumC1233e.CONCLUSION_CONDITION;
        this.f23991e = enumC1233e;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int admob = c4285e.admob();
                    if (admob != 0) {
                        EnumC1233e enumC1233e2 = null;
                        EnumC12838e enumC12838e2 = null;
                        C4664e c4664e = null;
                        EnumC2829e enumC2829e2 = null;
                        if (admob == 8) {
                            int amazon = c4285e.amazon();
                            if (amazon == 0) {
                                enumC12838e2 = enumC12838e;
                            } else if (amazon == 1) {
                                enumC12838e2 = EnumC12838e.CALLS;
                            } else if (amazon == 2) {
                                enumC12838e2 = EnumC12838e.RETURNS_NOT_NULL;
                            }
                            if (enumC12838e2 == null) {
                                m2672protected.m2689e(admob);
                                m2672protected.m2689e(amazon);
                            } else {
                                this.f23986e |= 1;
                                this.f23985e = enumC12838e2;
                            }
                        } else if (admob == 18) {
                            int i = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i != 2) {
                                this.f23988e = new ArrayList();
                                c = 2;
                            }
                            this.f23988e.add(c4285e.adcel(C3845e.f8490e, c18521e));
                        } else if (admob == 26) {
                            if ((this.f23986e & 2) == 2) {
                                C3845e c3845e = this.f23984e;
                                c3845e.getClass();
                                c4664e = C4664e.billing();
                                c4664e.yandex(c3845e);
                            }
                            C3845e c3845e2 = (C3845e) c4285e.adcel(C3845e.f8490e, c18521e);
                            this.f23984e = c3845e2;
                            if (c4664e != null) {
                                c4664e.yandex(c3845e2);
                                this.f23984e = c4664e.purchase();
                            }
                            this.f23986e |= 2;
                        } else if (admob == 32) {
                            int amazon2 = c4285e.amazon();
                            if (amazon2 == 0) {
                                enumC2829e2 = enumC2829e;
                            } else if (amazon2 == 1) {
                                enumC2829e2 = EnumC2829e.EXACTLY_ONCE;
                            } else if (amazon2 == 2) {
                                enumC2829e2 = EnumC2829e.AT_LEAST_ONCE;
                            }
                            if (enumC2829e2 == null) {
                                m2672protected.m2689e(admob);
                                m2672protected.m2689e(amazon2);
                            } else {
                                this.f23986e |= 4;
                                this.f23992e = enumC2829e2;
                            }
                        } else if (admob == 40) {
                            int amazon3 = c4285e.amazon();
                            if (amazon3 == 0) {
                                enumC1233e2 = enumC1233e;
                            } else if (amazon3 == 1) {
                                enumC1233e2 = EnumC1233e.RETURNS_CONDITION;
                            } else if (amazon3 == 2) {
                                enumC1233e2 = EnumC1233e.HOLDSIN_CONDITION;
                            }
                            if (enumC1233e2 == null) {
                                m2672protected.m2689e(admob);
                                m2672protected.m2689e(amazon3);
                            } else {
                                this.f23986e |= 8;
                                this.f23991e = enumC1233e2;
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
                if (((c == true ? 1 : 0) & 2) == 2) {
                    this.f23988e = DesugarCollections.unmodifiableList(this.f23988e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f23990e = c1974e.purchase();
                    throw th2;
                }
                this.f23990e = c1974e.purchase();
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.f23988e = DesugarCollections.unmodifiableList(this.f23988e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f23990e = c1974e.purchase();
            throw th3;
        }
        this.f23990e = c1974e.purchase();
    }

    public C12000e(C11826e c11826e) {
        this.f23987e = (byte) -1;
        this.f23989e = -1;
        this.f23990e = c11826e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f23987e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f23988e.size(); i++) {
            if (!((C3845e) this.f23988e.get(i)).ad()) {
                this.f23987e = (byte) 0;
                return false;
            }
        }
        if ((this.f23986e & 2) != 2 || this.f23984e.ad()) {
            this.f23987e = (byte) 1;
            return true;
        }
        this.f23987e = (byte) 0;
        return false;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C11826e startapp = C11826e.startapp();
        startapp.mopub(this);
        return startapp;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C11826e.startapp();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f23989e;
        if (i != -1) {
            return i;
        }
        int loadAd = (this.f23986e & 1) == 1 ? C9831e.loadAd(1, this.f23985e.f25661e) : 0;
        for (int i2 = 0; i2 < this.f23988e.size(); i2++) {
            loadAd += C9831e.subscription(2, (AbstractC6649e) this.f23988e.get(i2));
        }
        if ((this.f23986e & 2) == 2) {
            loadAd += C9831e.subscription(3, this.f23984e);
        }
        if ((this.f23986e & 4) == 4) {
            loadAd += C9831e.loadAd(4, this.f23992e.f6796e);
        }
        if ((this.f23986e & 8) == 8) {
            loadAd += C9831e.loadAd(5, this.f23991e.f3903e);
        }
        int size = this.f23990e.size() + loadAd;
        this.f23989e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        if ((this.f23986e & 1) == 1) {
            c9831e.m2715volatile(1, this.f23985e.f25661e);
        }
        for (int i = 0; i < this.f23988e.size(); i++) {
            c9831e.m2704public(2, (AbstractC6649e) this.f23988e.get(i));
        }
        if ((this.f23986e & 2) == 2) {
            c9831e.m2704public(3, this.f23984e);
        }
        if ((this.f23986e & 4) == 4) {
            c9831e.m2715volatile(4, this.f23992e.f6796e);
        }
        if ((this.f23986e & 8) == 8) {
            c9831e.m2715volatile(5, this.f23991e.f3903e);
        }
        c9831e.m2690e(this.f23990e);
    }
}
