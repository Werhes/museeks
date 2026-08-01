package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٖٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15503e extends AbstractC0641e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C15503e f30625e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C13141e f30626e = new C13141e(17);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C12162e f30627e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f30628e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC6732e f30629e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public byte f30630e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C8244e f30631e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f30632e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public List f30633e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C14882e f30634e;

    static {
        C15503e c15503e = new C15503e();
        f30625e = c15503e;
        c15503e.f30631e = C8244e.f16743e;
        c15503e.f30627e = C12162e.f24449e;
        c15503e.f30634e = C14882e.f29476e;
        c15503e.f30633e = Collections.EMPTY_LIST;
    }

    public C15503e() {
        this.f30630e = (byte) -1;
        this.f30632e = -1;
        this.f30629e = AbstractC6732e.f13911e;
    }

    public C15503e(C4285e c4285e, C18521e c18521e) {
        this.f30630e = (byte) -1;
        this.f30632e = -1;
        this.f30631e = C8244e.f16743e;
        this.f30627e = C12162e.f24449e;
        this.f30634e = C14882e.f29476e;
        this.f30633e = Collections.EMPTY_LIST;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int admob = c4285e.admob();
                    if (admob != 0) {
                        C7708e c7708e = null;
                        C6240e c6240e = null;
                        C6240e c6240e2 = null;
                        if (admob == 10) {
                            if ((this.f30628e & 1) == 1) {
                                C8244e c8244e = this.f30631e;
                                c8244e.getClass();
                                c6240e = new C6240e(3);
                                c6240e.f13044e = C1064e.f3589e;
                                c6240e.smaato(c8244e);
                            }
                            C8244e c8244e2 = (C8244e) c4285e.adcel(C8244e.f16744e, c18521e);
                            this.f30631e = c8244e2;
                            if (c6240e != null) {
                                c6240e.smaato(c8244e2);
                                this.f30631e = c6240e.yandex();
                            }
                            this.f30628e |= 1;
                        } else if (admob == 18) {
                            if ((this.f30628e & 2) == 2) {
                                C12162e c12162e = this.f30627e;
                                c12162e.getClass();
                                c6240e2 = new C6240e(1);
                                c6240e2.f13044e = Collections.EMPTY_LIST;
                                c6240e2.mopub(c12162e);
                            }
                            C12162e c12162e2 = (C12162e) c4285e.adcel(C12162e.f24450e, c18521e);
                            this.f30627e = c12162e2;
                            if (c6240e2 != null) {
                                c6240e2.mopub(c12162e2);
                                this.f30627e = c6240e2.billing();
                            }
                            this.f30628e |= 2;
                        } else if (admob == 26) {
                            if ((this.f30628e & 4) == 4) {
                                C14882e c14882e = this.f30634e;
                                c14882e.getClass();
                                c7708e = C7708e.yandex();
                                c7708e.startapp(c14882e);
                            }
                            C14882e c14882e2 = (C14882e) c4285e.adcel(C14882e.f29475e, c18521e);
                            this.f30634e = c14882e2;
                            if (c7708e != null) {
                                c7708e.startapp(c14882e2);
                                this.f30634e = c7708e.billing();
                            }
                            this.f30628e |= 4;
                        } else if (admob == 34) {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.f30633e = new ArrayList();
                                c = '\b';
                            }
                            this.f30633e.add(c4285e.adcel(C2009e.f5256e, c18521e));
                        } else if (!amazon(c4285e, m2672protected, c18521e, admob)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '\b') == 8) {
                        this.f30633e = DesugarCollections.unmodifiableList(this.f30633e);
                    }
                    try {
                        m2672protected.crashlytics();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f30629e = c1974e.purchase();
                        throw th2;
                    }
                    this.f30629e = c1974e.purchase();
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
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.f30633e = DesugarCollections.unmodifiableList(this.f30633e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f30629e = c1974e.purchase();
            throw th3;
        }
        this.f30629e = c1974e.purchase();
        smaato();
    }

    public C15503e(C10213e c10213e) {
        super(c10213e);
        this.f30630e = (byte) -1;
        this.f30632e = -1;
        this.f30629e = c10213e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f30630e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f30628e & 2) == 2 && !this.f30627e.ad()) {
            this.f30630e = (byte) 0;
            return false;
        }
        if ((this.f30628e & 4) == 4 && !this.f30634e.ad()) {
            this.f30630e = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f30633e.size(); i++) {
            if (!((C2009e) this.f30633e.get(i)).ad()) {
                this.f30630e = (byte) 0;
                return false;
            }
        }
        if (startapp()) {
            this.f30630e = (byte) 1;
            return true;
        }
        this.f30630e = (byte) 0;
        return false;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C10213e yandex = C10213e.yandex();
        yandex.startapp(this);
        return yandex;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C10213e.yandex();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f30632e;
        if (i != -1) {
            return i;
        }
        int subscription = (this.f30628e & 1) == 1 ? C9831e.subscription(1, this.f30631e) : 0;
        if ((this.f30628e & 2) == 2) {
            subscription += C9831e.subscription(2, this.f30627e);
        }
        if ((this.f30628e & 4) == 4) {
            subscription += C9831e.subscription(3, this.f30634e);
        }
        for (int i2 = 0; i2 < this.f30633e.size(); i2++) {
            subscription += C9831e.subscription(4, (AbstractC6649e) this.f30633e.get(i2));
        }
        int size = this.f30629e.size() + adcel() + subscription;
        this.f30632e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        C18540e c18540e = new C18540e(this);
        if ((this.f30628e & 1) == 1) {
            c9831e.m2704public(1, this.f30631e);
        }
        if ((this.f30628e & 2) == 2) {
            c9831e.m2704public(2, this.f30627e);
        }
        if ((this.f30628e & 4) == 4) {
            c9831e.m2704public(3, this.f30634e);
        }
        for (int i = 0; i < this.f30633e.size(); i++) {
            c9831e.m2704public(4, (AbstractC6649e) this.f30633e.get(i));
        }
        c18540e.m4583synchronized(200, c9831e);
        c9831e.m2690e(this.f30629e);
    }

    @Override // defpackage.InterfaceC8149e
    public final AbstractC6649e vip() {
        return f30625e;
    }
}
