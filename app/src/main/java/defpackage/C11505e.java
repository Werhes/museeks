package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11505e extends AbstractC0641e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C13141e f23114e = new C13141e(10);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C11505e f23115e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public List f23116e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f23117e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f23118e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC6732e f23119e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public List f23120e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f23121e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public byte f23122e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public List f23123e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public List f23124e;

    static {
        C11505e c11505e = new C11505e();
        f23115e = c11505e;
        c11505e.f23121e = 6;
        List list = Collections.EMPTY_LIST;
        c11505e.f23116e = list;
        c11505e.f23124e = list;
        c11505e.f23123e = list;
        c11505e.f23120e = list;
    }

    public C11505e() {
        this.f23122e = (byte) -1;
        this.f23118e = -1;
        this.f23119e = AbstractC6732e.f13911e;
    }

    public C11505e(C2812e c2812e) {
        super(c2812e);
        this.f23122e = (byte) -1;
        this.f23118e = -1;
        this.f23119e = c2812e.f19037e;
    }

    public C11505e(C4285e c4285e, C18521e c18521e) {
        this.f23122e = (byte) -1;
        this.f23118e = -1;
        this.f23121e = 6;
        List list = Collections.EMPTY_LIST;
        this.f23116e = list;
        this.f23124e = list;
        this.f23123e = list;
        this.f23120e = list;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int admob = c4285e.admob();
                    if (admob != 0) {
                        if (admob == 8) {
                            this.f23117e |= 1;
                            this.f23121e = c4285e.amazon();
                        } else if (admob == 18) {
                            if ((i & 2) != 2) {
                                this.f23116e = new ArrayList();
                                i |= 2;
                            }
                            this.f23116e.add(c4285e.adcel(C10067e.f19879e, c18521e));
                        } else if (admob == 26) {
                            if ((i & 16) != 16) {
                                this.f23120e = new ArrayList();
                                i |= 16;
                            }
                            this.f23120e.add(c4285e.adcel(C4599e.f9905e, c18521e));
                        } else if (admob == 248) {
                            if ((i & 4) != 4) {
                                this.f23124e = new ArrayList();
                                i |= 4;
                            }
                            this.f23124e.add(Integer.valueOf(c4285e.amazon()));
                        } else if (admob == 250) {
                            int billing = c4285e.billing(c4285e.amazon());
                            if ((i & 4) != 4 && c4285e.appmetrica() > 0) {
                                this.f23124e = new ArrayList();
                                i |= 4;
                            }
                            while (c4285e.appmetrica() > 0) {
                                this.f23124e.add(Integer.valueOf(c4285e.amazon()));
                            }
                            c4285e.purchase(billing);
                        } else if (admob == 258) {
                            if ((i & 8) != 8) {
                                this.f23123e = new ArrayList();
                                i |= 8;
                            }
                            this.f23123e.add(c4285e.adcel(C18181e.f35596e, c18521e));
                        } else if (!amazon(c4285e, m2672protected, c18521e, admob)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.f23116e = DesugarCollections.unmodifiableList(this.f23116e);
                    }
                    if ((i & 16) == 16) {
                        this.f23120e = DesugarCollections.unmodifiableList(this.f23120e);
                    }
                    if ((i & 4) == 4) {
                        this.f23124e = DesugarCollections.unmodifiableList(this.f23124e);
                    }
                    if ((i & 8) == 8) {
                        this.f23123e = DesugarCollections.unmodifiableList(this.f23123e);
                    }
                    try {
                        m2672protected.crashlytics();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f23119e = c1974e.purchase();
                        throw th2;
                    }
                    this.f23119e = c1974e.purchase();
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
        if ((i & 2) == 2) {
            this.f23116e = DesugarCollections.unmodifiableList(this.f23116e);
        }
        if ((i & 16) == 16) {
            this.f23120e = DesugarCollections.unmodifiableList(this.f23120e);
        }
        if ((i & 4) == 4) {
            this.f23124e = DesugarCollections.unmodifiableList(this.f23124e);
        }
        if ((i & 8) == 8) {
            this.f23123e = DesugarCollections.unmodifiableList(this.f23123e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f23119e = c1974e.purchase();
            throw th3;
        }
        this.f23119e = c1974e.purchase();
        smaato();
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f23122e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f23116e.size(); i++) {
            if (!((C10067e) this.f23116e.get(i)).ad()) {
                this.f23122e = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f23123e.size(); i2++) {
            if (!((C18181e) this.f23123e.get(i2)).ad()) {
                this.f23122e = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f23120e.size(); i3++) {
            if (!((C4599e) this.f23120e.get(i3)).ad()) {
                this.f23122e = (byte) 0;
                return false;
            }
        }
        if (startapp()) {
            this.f23122e = (byte) 1;
            return true;
        }
        this.f23122e = (byte) 0;
        return false;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C2812e yandex = C2812e.yandex();
        yandex.startapp(this);
        return yandex;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C2812e.yandex();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f23118e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f23117e & 1) == 1 ? C9831e.Signature(1, this.f23121e) : 0;
        for (int i2 = 0; i2 < this.f23116e.size(); i2++) {
            Signature += C9831e.subscription(2, (AbstractC6649e) this.f23116e.get(i2));
        }
        for (int i3 = 0; i3 < this.f23120e.size(); i3++) {
            Signature += C9831e.subscription(3, (AbstractC6649e) this.f23120e.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f23124e.size(); i5++) {
            i4 += C9831e.admob(((Integer) this.f23124e.get(i5)).intValue());
        }
        int size = (this.f23124e.size() * 2) + Signature + i4;
        for (int i6 = 0; i6 < this.f23123e.size(); i6++) {
            size += C9831e.subscription(32, (AbstractC6649e) this.f23123e.get(i6));
        }
        int size2 = this.f23119e.size() + adcel() + size;
        this.f23118e = size2;
        return size2;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        C18540e c18540e = new C18540e(this);
        if ((this.f23117e & 1) == 1) {
            c9831e.m2695for(1, this.f23121e);
        }
        for (int i = 0; i < this.f23116e.size(); i++) {
            c9831e.m2704public(2, (AbstractC6649e) this.f23116e.get(i));
        }
        for (int i2 = 0; i2 < this.f23120e.size(); i2++) {
            c9831e.m2704public(3, (AbstractC6649e) this.f23120e.get(i2));
        }
        for (int i3 = 0; i3 < this.f23124e.size(); i3++) {
            c9831e.m2695for(31, ((Integer) this.f23124e.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.f23123e.size(); i4++) {
            c9831e.m2704public(32, (AbstractC6649e) this.f23123e.get(i4));
        }
        c18540e.m4583synchronized(19000, c9831e);
        c9831e.m2690e(this.f23119e);
    }

    @Override // defpackage.InterfaceC8149e
    public final AbstractC6649e vip() {
        return f23115e;
    }
}
