package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10067e extends AbstractC0641e {

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C10067e f19878e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C13141e f19879e = new C13141e(27);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f19880e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f19881e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public byte f19882e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f19883e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public List f19884e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC6732e f19885e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C13212e f19886e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C3545e f19887e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f19888e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f19889e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f19890e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C13212e f19891e;

    static {
        C10067e c10067e = new C10067e();
        f19878e = c10067e;
        c10067e.f19888e = 0;
        c10067e.f19880e = 0;
        C13212e c13212e = C13212e.f26218e;
        c10067e.f19891e = c13212e;
        c10067e.f19890e = 0;
        c10067e.f19886e = c13212e;
        c10067e.f19889e = 0;
        c10067e.f19884e = Collections.EMPTY_LIST;
        c10067e.f19887e = C3545e.f7986e;
    }

    public C10067e() {
        this.f19882e = (byte) -1;
        this.f19881e = -1;
        this.f19885e = AbstractC6732e.f13911e;
    }

    public C10067e(C4285e c4285e, C18521e c18521e) {
        this.f19882e = (byte) -1;
        this.f19881e = -1;
        boolean z = false;
        this.f19888e = 0;
        this.f19880e = 0;
        C13212e c13212e = C13212e.f26218e;
        this.f19891e = c13212e;
        this.f19890e = 0;
        this.f19886e = c13212e;
        this.f19889e = 0;
        this.f19884e = Collections.EMPTY_LIST;
        this.f19887e = C3545e.f7986e;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int admob = c4285e.admob();
                    if (admob != 0) {
                        if (admob == 8) {
                            this.f19883e |= 1;
                            this.f19888e = c4285e.amazon();
                        } else if (admob != 16) {
                            C11877e c11877e = null;
                            C3333e c3333e = null;
                            C3333e c3333e2 = null;
                            if (admob == 26) {
                                if ((this.f19883e & 4) == 4) {
                                    C13212e c13212e2 = this.f19891e;
                                    c13212e2.getClass();
                                    c3333e = C13212e.subscription(c13212e2);
                                }
                                C13212e c13212e3 = (C13212e) c4285e.adcel(C13212e.f26219e, c18521e);
                                this.f19891e = c13212e3;
                                if (c3333e != null) {
                                    c3333e.startapp(c13212e3);
                                    this.f19891e = c3333e.billing();
                                }
                                this.f19883e |= 4;
                            } else if (admob == 34) {
                                if ((this.f19883e & 16) == 16) {
                                    C13212e c13212e4 = this.f19886e;
                                    c13212e4.getClass();
                                    c3333e2 = C13212e.subscription(c13212e4);
                                }
                                C13212e c13212e5 = (C13212e) c4285e.adcel(C13212e.f26219e, c18521e);
                                this.f19886e = c13212e5;
                                if (c3333e2 != null) {
                                    c3333e2.startapp(c13212e5);
                                    this.f19886e = c3333e2.billing();
                                }
                                this.f19883e |= 16;
                            } else if (admob == 40) {
                                this.f19883e |= 8;
                                this.f19890e = c4285e.amazon();
                            } else if (admob == 48) {
                                this.f19883e |= 32;
                                this.f19889e = c4285e.amazon();
                            } else if (admob == 58) {
                                int i = (c == true ? 1 : 0) & '@';
                                c = c;
                                if (i != 64) {
                                    this.f19884e = new ArrayList();
                                    c = '@';
                                }
                                this.f19884e.add(c4285e.adcel(C4599e.f9905e, c18521e));
                            } else if (admob == 66) {
                                if ((this.f19883e & 64) == 64) {
                                    C3545e c3545e = this.f19887e;
                                    c3545e.getClass();
                                    c11877e = C3545e.adcel(c3545e);
                                }
                                C3545e c3545e2 = (C3545e) c4285e.adcel(C3545e.f7985e, c18521e);
                                this.f19887e = c3545e2;
                                if (c11877e != null) {
                                    c11877e.yandex(c3545e2);
                                    this.f19887e = c11877e.purchase();
                                }
                                this.f19883e |= 64;
                            } else if (!amazon(c4285e, m2672protected, c18521e, admob)) {
                            }
                        } else {
                            this.f19883e |= 2;
                            this.f19880e = c4285e.amazon();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '@') == 64) {
                        this.f19884e = DesugarCollections.unmodifiableList(this.f19884e);
                    }
                    try {
                        m2672protected.crashlytics();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f19885e = c1974e.purchase();
                        throw th2;
                    }
                    this.f19885e = c1974e.purchase();
                    smaato();
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
        if (((c == true ? 1 : 0) & '@') == 64) {
            this.f19884e = DesugarCollections.unmodifiableList(this.f19884e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f19885e = c1974e.purchase();
            throw th3;
        }
        this.f19885e = c1974e.purchase();
        smaato();
    }

    public C10067e(C15908e c15908e) {
        super(c15908e);
        this.f19882e = (byte) -1;
        this.f19881e = -1;
        this.f19885e = c15908e.f19037e;
    }

    public final C15908e Signature() {
        C15908e yandex = C15908e.yandex();
        yandex.startapp(this);
        return yandex;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f19882e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f19883e;
        if ((i & 2) != 2) {
            this.f19882e = (byte) 0;
            return false;
        }
        if ((i & 4) == 4 && !this.f19891e.ad()) {
            this.f19882e = (byte) 0;
            return false;
        }
        if ((this.f19883e & 16) == 16 && !this.f19886e.ad()) {
            this.f19882e = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f19884e.size(); i2++) {
            if (!((C4599e) this.f19884e.get(i2)).ad()) {
                this.f19882e = (byte) 0;
                return false;
            }
        }
        if ((this.f19883e & 64) == 64 && !this.f19887e.ad()) {
            this.f19882e = (byte) 0;
            return false;
        }
        if (startapp()) {
            this.f19882e = (byte) 1;
            return true;
        }
        this.f19882e = (byte) 0;
        return false;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C15908e yandex = C15908e.yandex();
        yandex.startapp(this);
        return yandex;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C15908e.yandex();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f19881e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f19883e & 1) == 1 ? C9831e.Signature(1, this.f19888e) : 0;
        if ((this.f19883e & 2) == 2) {
            Signature += C9831e.Signature(2, this.f19880e);
        }
        if ((this.f19883e & 4) == 4) {
            Signature += C9831e.subscription(3, this.f19891e);
        }
        if ((this.f19883e & 16) == 16) {
            Signature += C9831e.subscription(4, this.f19886e);
        }
        if ((this.f19883e & 8) == 8) {
            Signature += C9831e.Signature(5, this.f19890e);
        }
        if ((this.f19883e & 32) == 32) {
            Signature += C9831e.Signature(6, this.f19889e);
        }
        for (int i2 = 0; i2 < this.f19884e.size(); i2++) {
            Signature += C9831e.subscription(7, (AbstractC6649e) this.f19884e.get(i2));
        }
        if ((this.f19883e & 64) == 64) {
            Signature += C9831e.subscription(8, this.f19887e);
        }
        int size = this.f19885e.size() + adcel() + Signature;
        this.f19881e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        C18540e c18540e = new C18540e(this);
        if ((this.f19883e & 1) == 1) {
            c9831e.m2695for(1, this.f19888e);
        }
        if ((this.f19883e & 2) == 2) {
            c9831e.m2695for(2, this.f19880e);
        }
        if ((this.f19883e & 4) == 4) {
            c9831e.m2704public(3, this.f19891e);
        }
        if ((this.f19883e & 16) == 16) {
            c9831e.m2704public(4, this.f19886e);
        }
        if ((this.f19883e & 8) == 8) {
            c9831e.m2695for(5, this.f19890e);
        }
        if ((this.f19883e & 32) == 32) {
            c9831e.m2695for(6, this.f19889e);
        }
        for (int i = 0; i < this.f19884e.size(); i++) {
            c9831e.m2704public(7, (AbstractC6649e) this.f19884e.get(i));
        }
        if ((this.f19883e & 64) == 64) {
            c9831e.m2704public(8, this.f19887e);
        }
        c18540e.m4583synchronized(200, c9831e);
        c9831e.m2690e(this.f19885e);
    }

    @Override // defpackage.InterfaceC8149e
    public final AbstractC6649e vip() {
        return f19878e;
    }
}
