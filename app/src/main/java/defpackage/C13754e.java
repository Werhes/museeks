package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13754e extends AbstractC0641e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C13754e f27244e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C13141e f27245e = new C13141e(13);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public List f27246e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f27247e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC6732e f27248e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f27249e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f27250e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public byte f27251e;

    static {
        C13754e c13754e = new C13754e();
        f27244e = c13754e;
        c13754e.f27249e = 0;
        c13754e.f27246e = Collections.EMPTY_LIST;
    }

    public C13754e() {
        this.f27251e = (byte) -1;
        this.f27250e = -1;
        this.f27248e = AbstractC6732e.f13911e;
    }

    public C13754e(C4285e c4285e, C18521e c18521e) {
        this.f27251e = (byte) -1;
        this.f27250e = -1;
        boolean z = false;
        this.f27249e = 0;
        this.f27246e = Collections.EMPTY_LIST;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int admob = c4285e.admob();
                    if (admob != 0) {
                        if (admob == 8) {
                            this.f27247e |= 1;
                            this.f27249e = c4285e.amazon();
                        } else if (admob == 18) {
                            if ((c & 2) != 2) {
                                this.f27246e = new ArrayList();
                                c = 2;
                            }
                            this.f27246e.add(c4285e.adcel(C4599e.f9905e, c18521e));
                        } else if (!amazon(c4285e, m2672protected, c18521e, admob)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((c & 2) == 2) {
                        this.f27246e = DesugarCollections.unmodifiableList(this.f27246e);
                    }
                    try {
                        m2672protected.crashlytics();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27248e = c1974e.purchase();
                        throw th2;
                    }
                    this.f27248e = c1974e.purchase();
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
        if ((c & 2) == 2) {
            this.f27246e = DesugarCollections.unmodifiableList(this.f27246e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27248e = c1974e.purchase();
            throw th3;
        }
        this.f27248e = c1974e.purchase();
        smaato();
    }

    public C13754e(C11281e c11281e) {
        super(c11281e);
        this.f27251e = (byte) -1;
        this.f27250e = -1;
        this.f27248e = c11281e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f27251e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f27246e.size(); i++) {
            if (!((C4599e) this.f27246e.get(i)).ad()) {
                this.f27251e = (byte) 0;
                return false;
            }
        }
        if (startapp()) {
            this.f27251e = (byte) 1;
            return true;
        }
        this.f27251e = (byte) 0;
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙّؑ, eٍٜ٘, eُۜؗ] */
    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        ?? abstractC12173e = new AbstractC12173e();
        abstractC12173e.f22666e = Collections.EMPTY_LIST;
        abstractC12173e.yandex(this);
        return abstractC12173e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙّؑ, eٍٜ٘, eُۜؗ] */
    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        ?? abstractC12173e = new AbstractC12173e();
        abstractC12173e.f22666e = Collections.EMPTY_LIST;
        return abstractC12173e;
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f27250e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f27247e & 1) == 1 ? C9831e.Signature(1, this.f27249e) : 0;
        for (int i2 = 0; i2 < this.f27246e.size(); i2++) {
            Signature += C9831e.subscription(2, (AbstractC6649e) this.f27246e.get(i2));
        }
        int size = this.f27248e.size() + adcel() + Signature;
        this.f27250e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        C18540e c18540e = new C18540e(this);
        if ((this.f27247e & 1) == 1) {
            c9831e.m2695for(1, this.f27249e);
        }
        for (int i = 0; i < this.f27246e.size(); i++) {
            c9831e.m2704public(2, (AbstractC6649e) this.f27246e.get(i));
        }
        c18540e.m4583synchronized(200, c9831e);
        c9831e.m2690e(this.f27248e);
    }

    @Override // defpackage.InterfaceC8149e
    public final AbstractC6649e vip() {
        return f27244e;
    }
}
