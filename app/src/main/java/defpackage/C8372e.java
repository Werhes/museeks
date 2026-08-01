package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8372e extends AbstractC0641e {

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C8372e f17123e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C13141e f17124e = new C13141e(25);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f17125e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f17126e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public byte f17127e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f17128e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f17129e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC6732e f17130e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public List f17131e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public List f17132e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f17133e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public List f17134e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public EnumC0655e f17135e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f17136e;

    static {
        C8372e c8372e = new C8372e();
        f17123e = c8372e;
        c8372e.f17133e = 0;
        c8372e.f17125e = 0;
        c8372e.f17136e = false;
        c8372e.f17135e = EnumC0655e.INV;
        List list = Collections.EMPTY_LIST;
        c8372e.f17131e = list;
        c8372e.f17134e = list;
        c8372e.f17132e = list;
    }

    public C8372e() {
        this.f17129e = -1;
        this.f17127e = (byte) -1;
        this.f17126e = -1;
        this.f17130e = AbstractC6732e.f13911e;
    }

    public C8372e(C4259e c4259e) {
        super(c4259e);
        this.f17129e = -1;
        this.f17127e = (byte) -1;
        this.f17126e = -1;
        this.f17130e = c4259e.f19037e;
    }

    public C8372e(C4285e c4285e, C18521e c18521e) {
        this.f17129e = -1;
        this.f17127e = (byte) -1;
        this.f17126e = -1;
        this.f17133e = 0;
        this.f17125e = 0;
        this.f17136e = false;
        EnumC0655e enumC0655e = EnumC0655e.INV;
        this.f17135e = enumC0655e;
        List list = Collections.EMPTY_LIST;
        this.f17131e = list;
        this.f17134e = list;
        this.f17132e = list;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int admob = c4285e.admob();
                        if (admob != 0) {
                            if (admob == 8) {
                                this.f17128e |= 1;
                                this.f17133e = c4285e.amazon();
                            } else if (admob == 16) {
                                this.f17128e |= 2;
                                this.f17125e = c4285e.amazon();
                            } else if (admob == 24) {
                                this.f17128e |= 4;
                                this.f17136e = c4285e.loadAd() != 0;
                            } else if (admob == 32) {
                                int amazon = c4285e.amazon();
                                EnumC0655e enumC0655e2 = amazon != 0 ? amazon != 1 ? amazon != 2 ? null : enumC0655e : EnumC0655e.OUT : EnumC0655e.IN;
                                if (enumC0655e2 == null) {
                                    m2672protected.m2689e(admob);
                                    m2672protected.m2689e(amazon);
                                } else {
                                    this.f17128e |= 8;
                                    this.f17135e = enumC0655e2;
                                }
                            } else if (admob == 42) {
                                if ((i & 16) != 16) {
                                    this.f17131e = new ArrayList();
                                    i |= 16;
                                }
                                this.f17131e.add(c4285e.adcel(C13212e.f26219e, c18521e));
                            } else if (admob == 48) {
                                if ((i & 32) != 32) {
                                    this.f17134e = new ArrayList();
                                    i |= 32;
                                }
                                this.f17134e.add(Integer.valueOf(c4285e.amazon()));
                            } else if (admob == 50) {
                                int billing = c4285e.billing(c4285e.amazon());
                                if ((i & 32) != 32 && c4285e.appmetrica() > 0) {
                                    this.f17134e = new ArrayList();
                                    i |= 32;
                                }
                                while (c4285e.appmetrica() > 0) {
                                    this.f17134e.add(Integer.valueOf(c4285e.amazon()));
                                }
                                c4285e.purchase(billing);
                            } else if (admob == 802) {
                                if ((i & 64) != 64) {
                                    this.f17132e = new ArrayList();
                                    i |= 64;
                                }
                                this.f17132e.add(c4285e.adcel(C4599e.f9905e, c18521e));
                            } else if (amazon(c4285e, m2672protected, c18521e, admob)) {
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
                if ((i & 16) == 16) {
                    this.f17131e = DesugarCollections.unmodifiableList(this.f17131e);
                }
                if ((i & 32) == 32) {
                    this.f17134e = DesugarCollections.unmodifiableList(this.f17134e);
                }
                if ((i & 64) == 64) {
                    this.f17132e = DesugarCollections.unmodifiableList(this.f17132e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f17130e = c1974e.purchase();
                    throw th2;
                }
                this.f17130e = c1974e.purchase();
                smaato();
                throw th;
            }
        }
        if ((i & 16) == 16) {
            this.f17131e = DesugarCollections.unmodifiableList(this.f17131e);
        }
        if ((i & 32) == 32) {
            this.f17134e = DesugarCollections.unmodifiableList(this.f17134e);
        }
        if ((i & 64) == 64) {
            this.f17132e = DesugarCollections.unmodifiableList(this.f17132e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f17130e = c1974e.purchase();
            throw th3;
        }
        this.f17130e = c1974e.purchase();
        smaato();
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f17127e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f17128e;
        if ((i & 1) != 1) {
            this.f17127e = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.f17127e = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f17131e.size(); i2++) {
            if (!((C13212e) this.f17131e.get(i2)).ad()) {
                this.f17127e = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f17132e.size(); i3++) {
            if (!((C4599e) this.f17132e.get(i3)).ad()) {
                this.f17127e = (byte) 0;
                return false;
            }
        }
        if (startapp()) {
            this.f17127e = (byte) 1;
            return true;
        }
        this.f17127e = (byte) 0;
        return false;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C4259e yandex = C4259e.yandex();
        yandex.startapp(this);
        return yandex;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C4259e.yandex();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f17126e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f17128e & 1) == 1 ? C9831e.Signature(1, this.f17133e) : 0;
        if ((this.f17128e & 2) == 2) {
            Signature += C9831e.Signature(2, this.f17125e);
        }
        if ((this.f17128e & 4) == 4) {
            Signature += C9831e.tapsense(3) + 1;
        }
        if ((this.f17128e & 8) == 8) {
            Signature += C9831e.loadAd(4, this.f17135e.f2921e);
        }
        for (int i2 = 0; i2 < this.f17131e.size(); i2++) {
            Signature += C9831e.subscription(5, (AbstractC6649e) this.f17131e.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f17134e.size(); i4++) {
            i3 += C9831e.admob(((Integer) this.f17134e.get(i4)).intValue());
        }
        int i5 = Signature + i3;
        if (!this.f17134e.isEmpty()) {
            i5 = i5 + 1 + C9831e.admob(i3);
        }
        this.f17129e = i3;
        for (int i6 = 0; i6 < this.f17132e.size(); i6++) {
            i5 += C9831e.subscription(100, (AbstractC6649e) this.f17132e.get(i6));
        }
        int size = this.f17130e.size() + adcel() + i5;
        this.f17126e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        C18540e c18540e = new C18540e(this);
        if ((this.f17128e & 1) == 1) {
            c9831e.m2695for(1, this.f17133e);
        }
        if ((this.f17128e & 2) == 2) {
            c9831e.m2695for(2, this.f17125e);
        }
        if ((this.f17128e & 4) == 4) {
            boolean z = this.f17136e;
            c9831e.m2691e(3, 0);
            c9831e.m2688e(z ? 1 : 0);
        }
        if ((this.f17128e & 8) == 8) {
            c9831e.m2715volatile(4, this.f17135e.f2921e);
        }
        for (int i = 0; i < this.f17131e.size(); i++) {
            c9831e.m2704public(5, (AbstractC6649e) this.f17131e.get(i));
        }
        if (this.f17134e.size() > 0) {
            c9831e.m2689e(50);
            c9831e.m2689e(this.f17129e);
        }
        for (int i2 = 0; i2 < this.f17134e.size(); i2++) {
            c9831e.m2680continue(((Integer) this.f17134e.get(i2)).intValue());
        }
        for (int i3 = 0; i3 < this.f17132e.size(); i3++) {
            c9831e.m2704public(100, (AbstractC6649e) this.f17132e.get(i3));
        }
        c18540e.m4583synchronized(1000, c9831e);
        c9831e.m2690e(this.f17130e);
    }

    @Override // defpackage.InterfaceC8149e
    public final AbstractC6649e vip() {
        return f17123e;
    }
}
