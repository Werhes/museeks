package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12499e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C13141e f25031e = new C13141e(3);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C12499e f25032e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte f25033e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public List f25034e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public List f25035e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f25036e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f25037e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f25038e;

    static {
        C12499e c12499e = new C12499e();
        f25032e = c12499e;
        List list = Collections.EMPTY_LIST;
        c12499e.f25035e = list;
        c12499e.f25034e = list;
    }

    public C12499e() {
        this.f25036e = -1;
        this.f25033e = (byte) -1;
        this.f25038e = -1;
        this.f25037e = AbstractC6732e.f13911e;
    }

    public C12499e(C4285e c4285e, C18521e c18521e) {
        this.f25036e = -1;
        this.f25033e = (byte) -1;
        this.f25038e = -1;
        List list = Collections.EMPTY_LIST;
        this.f25035e = list;
        this.f25034e = list;
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
                            if (admob == 10) {
                                if ((i & 1) != 1) {
                                    this.f25035e = new ArrayList();
                                    i |= 1;
                                }
                                this.f25035e.add(c4285e.adcel(C8726e.f17603e, c18521e));
                            } else if (admob == 40) {
                                if ((i & 2) != 2) {
                                    this.f25034e = new ArrayList();
                                    i |= 2;
                                }
                                this.f25034e.add(Integer.valueOf(c4285e.amazon()));
                            } else if (admob == 42) {
                                int billing = c4285e.billing(c4285e.amazon());
                                if ((i & 2) != 2 && c4285e.appmetrica() > 0) {
                                    this.f25034e = new ArrayList();
                                    i |= 2;
                                }
                                while (c4285e.appmetrica() > 0) {
                                    this.f25034e.add(Integer.valueOf(c4285e.amazon()));
                                }
                                c4285e.purchase(billing);
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
                if ((i & 1) == 1) {
                    this.f25035e = DesugarCollections.unmodifiableList(this.f25035e);
                }
                if ((i & 2) == 2) {
                    this.f25034e = DesugarCollections.unmodifiableList(this.f25034e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f25037e = c1974e.purchase();
                    throw th2;
                }
                this.f25037e = c1974e.purchase();
                throw th;
            }
        }
        if ((i & 1) == 1) {
            this.f25035e = DesugarCollections.unmodifiableList(this.f25035e);
        }
        if ((i & 2) == 2) {
            this.f25034e = DesugarCollections.unmodifiableList(this.f25034e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f25037e = c1974e.purchase();
            throw th3;
        }
        this.f25037e = c1974e.purchase();
    }

    public C12499e(C16851e c16851e) {
        this.f25036e = -1;
        this.f25033e = (byte) -1;
        this.f25038e = -1;
        this.f25037e = c16851e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        if (this.f25033e == 1) {
            return true;
        }
        this.f25033e = (byte) 1;
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍٜ٘, eؚٗؐ] */
    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        ?? abstractC9594e = new AbstractC9594e();
        List list = Collections.EMPTY_LIST;
        abstractC9594e.f33024e = list;
        abstractC9594e.f33026e = list;
        abstractC9594e.billing(this);
        return abstractC9594e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍٜ٘, eؚٗؐ] */
    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        ?? abstractC9594e = new AbstractC9594e();
        List list = Collections.EMPTY_LIST;
        abstractC9594e.f33024e = list;
        abstractC9594e.f33026e = list;
        return abstractC9594e;
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f25038e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f25035e.size(); i3++) {
            i2 += C9831e.subscription(1, (AbstractC6649e) this.f25035e.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f25034e.size(); i5++) {
            i4 += C9831e.admob(((Integer) this.f25034e.get(i5)).intValue());
        }
        int i6 = i2 + i4;
        if (!this.f25034e.isEmpty()) {
            i6 = i6 + 1 + C9831e.admob(i4);
        }
        this.f25036e = i4;
        int size = this.f25037e.size() + i6;
        this.f25038e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        for (int i = 0; i < this.f25035e.size(); i++) {
            c9831e.m2704public(1, (AbstractC6649e) this.f25035e.get(i));
        }
        if (this.f25034e.size() > 0) {
            c9831e.m2689e(42);
            c9831e.m2689e(this.f25036e);
        }
        for (int i2 = 0; i2 < this.f25034e.size(); i2++) {
            c9831e.m2680continue(((Integer) this.f25034e.get(i2)).intValue());
        }
        c9831e.m2690e(this.f25037e);
    }
}
