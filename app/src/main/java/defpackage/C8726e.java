package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8726e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C8726e f17602e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C13141e f17603e = new C13141e(4);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f17604e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f17605e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f17606e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f17607e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f17608e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f17609e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public byte f17610e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f17611e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public List f17612e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f17613e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public List f17614e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public EnumC15990e f17615e;

    static {
        C8726e c8726e = new C8726e();
        f17602e = c8726e;
        c8726e.f17606e = 1;
        c8726e.f17611e = 0;
        c8726e.f17604e = BuildConfig.FLAVOR;
        c8726e.f17615e = EnumC15990e.NONE;
        List list = Collections.EMPTY_LIST;
        c8726e.f17614e = list;
        c8726e.f17612e = list;
    }

    public C8726e() {
        this.f17609e = -1;
        this.f17607e = -1;
        this.f17610e = (byte) -1;
        this.f17605e = -1;
        this.f17613e = AbstractC6732e.f13911e;
    }

    public C8726e(C4285e c4285e) {
        this.f17609e = -1;
        this.f17607e = -1;
        this.f17610e = (byte) -1;
        this.f17605e = -1;
        this.f17606e = 1;
        boolean z = false;
        this.f17611e = 0;
        this.f17604e = BuildConfig.FLAVOR;
        EnumC15990e enumC15990e = EnumC15990e.NONE;
        this.f17615e = enumC15990e;
        List list = Collections.EMPTY_LIST;
        this.f17614e = list;
        this.f17612e = list;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int admob = c4285e.admob();
                        if (admob != 0) {
                            if (admob == 8) {
                                this.f17608e |= 1;
                                this.f17606e = c4285e.amazon();
                            } else if (admob == 16) {
                                this.f17608e |= 2;
                                this.f17611e = c4285e.amazon();
                            } else if (admob == 24) {
                                int amazon = c4285e.amazon();
                                EnumC15990e enumC15990e2 = amazon != 0 ? amazon != 1 ? amazon != 2 ? null : EnumC15990e.DESC_TO_CLASS_ID : EnumC15990e.INTERNAL_TO_CLASS_ID : enumC15990e;
                                if (enumC15990e2 == null) {
                                    m2672protected.m2689e(admob);
                                    m2672protected.m2689e(amazon);
                                } else {
                                    this.f17608e |= 8;
                                    this.f17615e = enumC15990e2;
                                }
                            } else if (admob == 32) {
                                if ((i & 16) != 16) {
                                    this.f17614e = new ArrayList();
                                    i |= 16;
                                }
                                this.f17614e.add(Integer.valueOf(c4285e.amazon()));
                            } else if (admob == 34) {
                                int billing = c4285e.billing(c4285e.amazon());
                                if ((i & 16) != 16 && c4285e.appmetrica() > 0) {
                                    this.f17614e = new ArrayList();
                                    i |= 16;
                                }
                                while (c4285e.appmetrica() > 0) {
                                    this.f17614e.add(Integer.valueOf(c4285e.amazon()));
                                }
                                c4285e.purchase(billing);
                            } else if (admob == 40) {
                                if ((i & 32) != 32) {
                                    this.f17612e = new ArrayList();
                                    i |= 32;
                                }
                                this.f17612e.add(Integer.valueOf(c4285e.amazon()));
                            } else if (admob == 42) {
                                int billing2 = c4285e.billing(c4285e.amazon());
                                if ((i & 32) != 32 && c4285e.appmetrica() > 0) {
                                    this.f17612e = new ArrayList();
                                    i |= 32;
                                }
                                while (c4285e.appmetrica() > 0) {
                                    this.f17612e.add(Integer.valueOf(c4285e.amazon()));
                                }
                                c4285e.purchase(billing2);
                            } else if (admob == 50) {
                                C1884e yandex = c4285e.yandex();
                                this.f17608e |= 4;
                                this.f17604e = yandex;
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
                if ((i & 16) == 16) {
                    this.f17614e = DesugarCollections.unmodifiableList(this.f17614e);
                }
                if ((i & 32) == 32) {
                    this.f17612e = DesugarCollections.unmodifiableList(this.f17612e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f17613e = c1974e.purchase();
                    throw th2;
                }
                this.f17613e = c1974e.purchase();
                throw th;
            }
        }
        if ((i & 16) == 16) {
            this.f17614e = DesugarCollections.unmodifiableList(this.f17614e);
        }
        if ((i & 32) == 32) {
            this.f17612e = DesugarCollections.unmodifiableList(this.f17612e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f17613e = c1974e.purchase();
            throw th3;
        }
        this.f17613e = c1974e.purchase();
    }

    public C8726e(C7337e c7337e) {
        this.f17609e = -1;
        this.f17607e = -1;
        this.f17610e = (byte) -1;
        this.f17605e = -1;
        this.f17613e = c7337e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        if (this.f17610e == 1) {
            return true;
        }
        this.f17610e = (byte) 1;
        return true;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C7337e billing = C7337e.billing();
        billing.yandex(this);
        return billing;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C7337e.billing();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        AbstractC6732e abstractC6732e;
        int i = this.f17605e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f17608e & 1) == 1 ? C9831e.Signature(1, this.f17606e) : 0;
        if ((this.f17608e & 2) == 2) {
            Signature += C9831e.Signature(2, this.f17611e);
        }
        if ((this.f17608e & 8) == 8) {
            Signature += C9831e.loadAd(3, this.f17615e.f31516e);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17614e.size(); i3++) {
            i2 += C9831e.admob(((Integer) this.f17614e.get(i3)).intValue());
        }
        int i4 = Signature + i2;
        if (!this.f17614e.isEmpty()) {
            i4 = i4 + 1 + C9831e.admob(i2);
        }
        this.f17609e = i2;
        int i5 = 0;
        for (int i6 = 0; i6 < this.f17612e.size(); i6++) {
            i5 += C9831e.admob(((Integer) this.f17612e.get(i6)).intValue());
        }
        int i7 = i4 + i5;
        if (!this.f17612e.isEmpty()) {
            i7 = i7 + 1 + C9831e.admob(i5);
        }
        this.f17607e = i5;
        if ((this.f17608e & 4) == 4) {
            Object obj = this.f17604e;
            if (obj instanceof String) {
                try {
                    abstractC6732e = new C1884e(((String) obj).getBytes("UTF-8"));
                    this.f17604e = abstractC6732e;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            } else {
                abstractC6732e = (AbstractC6732e) obj;
            }
            i7 += abstractC6732e.size() + C9831e.pro(abstractC6732e.size()) + C9831e.tapsense(6);
        }
        int size = this.f17613e.size() + i7;
        this.f17605e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        AbstractC6732e abstractC6732e;
        metrica();
        if ((this.f17608e & 1) == 1) {
            c9831e.m2695for(1, this.f17606e);
        }
        if ((this.f17608e & 2) == 2) {
            c9831e.m2695for(2, this.f17611e);
        }
        if ((this.f17608e & 8) == 8) {
            c9831e.m2715volatile(3, this.f17615e.f31516e);
        }
        if (this.f17614e.size() > 0) {
            c9831e.m2689e(34);
            c9831e.m2689e(this.f17609e);
        }
        for (int i = 0; i < this.f17614e.size(); i++) {
            c9831e.m2680continue(((Integer) this.f17614e.get(i)).intValue());
        }
        if (this.f17612e.size() > 0) {
            c9831e.m2689e(42);
            c9831e.m2689e(this.f17607e);
        }
        for (int i2 = 0; i2 < this.f17612e.size(); i2++) {
            c9831e.m2680continue(((Integer) this.f17612e.get(i2)).intValue());
        }
        if ((this.f17608e & 4) == 4) {
            Object obj = this.f17604e;
            if (obj instanceof String) {
                try {
                    abstractC6732e = new C1884e(((String) obj).getBytes("UTF-8"));
                    this.f17604e = abstractC6732e;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            } else {
                abstractC6732e = (AbstractC6732e) obj;
            }
            c9831e.m2691e(6, 2);
            c9831e.m2689e(abstractC6732e.size());
            c9831e.m2690e(abstractC6732e);
        }
        c9831e.m2690e(this.f17613e);
    }
}
