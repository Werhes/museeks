package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3845e extends AbstractC2649e implements InterfaceC8149e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C13141e f8490e = new C13141e(14);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C3845e f8491e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public EnumC3014e f8492e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f8493e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public byte f8494e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f8495e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public List f8496e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f8497e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f8498e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public List f8499e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC6732e f8500e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f8501e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C13212e f8502e;

    static {
        C3845e c3845e = new C3845e();
        f8491e = c3845e;
        c3845e.f8493e = 0;
        c3845e.f8498e = 0;
        c3845e.f8492e = EnumC3014e.TRUE;
        c3845e.f8502e = C13212e.f26218e;
        c3845e.f8501e = 0;
        List list = Collections.EMPTY_LIST;
        c3845e.f8496e = list;
        c3845e.f8499e = list;
    }

    public C3845e() {
        this.f8494e = (byte) -1;
        this.f8497e = -1;
        this.f8500e = AbstractC6732e.f13911e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public C3845e(C4285e c4285e, C18521e c18521e) {
        EnumC3014e enumC3014e;
        this.f8494e = (byte) -1;
        this.f8497e = -1;
        boolean z = false;
        this.f8493e = 0;
        this.f8498e = 0;
        EnumC3014e enumC3014e2 = EnumC3014e.TRUE;
        this.f8492e = enumC3014e2;
        this.f8502e = C13212e.f26218e;
        this.f8501e = 0;
        List list = Collections.EMPTY_LIST;
        this.f8496e = list;
        this.f8499e = list;
        C1974e c1974e = new C1974e();
        C9831e m2672protected = C9831e.m2672protected(c1974e, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int admob = c4285e.admob();
                        if (admob != 0) {
                            if (admob == 8) {
                                this.f8495e |= 1;
                                this.f8493e = c4285e.amazon();
                            } else if (admob != 16) {
                                C3333e c3333e = null;
                                EnumC3014e enumC3014e3 = null;
                                if (admob == 24) {
                                    int amazon = c4285e.amazon();
                                    if (amazon != 0) {
                                        if (amazon == 1) {
                                            enumC3014e3 = EnumC3014e.FALSE;
                                        } else if (amazon == 2) {
                                            enumC3014e3 = EnumC3014e.NULL;
                                        }
                                        enumC3014e = enumC3014e3;
                                    } else {
                                        enumC3014e = enumC3014e2;
                                    }
                                    if (enumC3014e == null) {
                                        m2672protected.m2689e(admob);
                                        m2672protected.m2689e(amazon);
                                    } else {
                                        this.f8495e |= 4;
                                        this.f8492e = enumC3014e;
                                    }
                                } else if (admob == 34) {
                                    if ((this.f8495e & 8) == 8) {
                                        C13212e c13212e = this.f8502e;
                                        c13212e.getClass();
                                        c3333e = C13212e.subscription(c13212e);
                                    }
                                    C3333e c3333e2 = c3333e;
                                    C13212e c13212e2 = (C13212e) c4285e.adcel(C13212e.f26219e, c18521e);
                                    this.f8502e = c13212e2;
                                    if (c3333e2 != null) {
                                        c3333e2.startapp(c13212e2);
                                        this.f8502e = c3333e2.billing();
                                    }
                                    this.f8495e |= 8;
                                } else if (admob != 40) {
                                    C13141e c13141e = f8490e;
                                    if (admob == 50) {
                                        int i = (c == true ? 1 : 0) & 32;
                                        c = c;
                                        if (i != 32) {
                                            this.f8496e = new ArrayList();
                                            c = (c == true ? 1 : 0) | ' ';
                                        }
                                        this.f8496e.add(c4285e.adcel(c13141e, c18521e));
                                    } else if (admob == 58) {
                                        int i2 = (c == true ? 1 : 0) & 64;
                                        c = c;
                                        if (i2 != 64) {
                                            this.f8499e = new ArrayList();
                                            c = (c == true ? 1 : 0) | '@';
                                        }
                                        this.f8499e.add(c4285e.adcel(c13141e, c18521e));
                                    } else if (!c4285e.signatures(admob, m2672protected)) {
                                    }
                                } else {
                                    this.f8495e |= 16;
                                    this.f8501e = c4285e.amazon();
                                }
                            } else {
                                this.f8495e |= 2;
                                this.f8498e = c4285e.amazon();
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
                if (((c == true ? 1 : 0) & 32) == 32) {
                    this.f8496e = DesugarCollections.unmodifiableList(this.f8496e);
                }
                if (((c == true ? 1 : 0) & 64) == 64) {
                    this.f8499e = DesugarCollections.unmodifiableList(this.f8499e);
                }
                try {
                    m2672protected.crashlytics();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8500e = c1974e.purchase();
                    throw th2;
                }
                this.f8500e = c1974e.purchase();
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & 32) == 32) {
            this.f8496e = DesugarCollections.unmodifiableList(this.f8496e);
        }
        if (((c == true ? 1 : 0) & 64) == 64) {
            this.f8499e = DesugarCollections.unmodifiableList(this.f8499e);
        }
        try {
            m2672protected.crashlytics();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8500e = c1974e.purchase();
            throw th3;
        }
        this.f8500e = c1974e.purchase();
    }

    public C3845e(C4664e c4664e) {
        this.f8494e = (byte) -1;
        this.f8497e = -1;
        this.f8500e = c4664e.f19037e;
    }

    @Override // defpackage.InterfaceC8149e
    public final boolean ad() {
        byte b = this.f8494e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f8495e & 8) == 8 && !this.f8502e.ad()) {
            this.f8494e = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f8496e.size(); i++) {
            if (!((C3845e) this.f8496e.get(i)).ad()) {
                this.f8494e = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f8499e.size(); i2++) {
            if (!((C3845e) this.f8499e.get(i2)).ad()) {
                this.f8494e = (byte) 0;
                return false;
            }
        }
        this.f8494e = (byte) 1;
        return true;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e appmetrica() {
        C4664e billing = C4664e.billing();
        billing.yandex(this);
        return billing;
    }

    @Override // defpackage.AbstractC6649e
    public final AbstractC9594e license() {
        return C4664e.billing();
    }

    @Override // defpackage.AbstractC6649e
    public final int metrica() {
        int i = this.f8497e;
        if (i != -1) {
            return i;
        }
        int Signature = (this.f8495e & 1) == 1 ? C9831e.Signature(1, this.f8493e) : 0;
        if ((this.f8495e & 2) == 2) {
            Signature += C9831e.Signature(2, this.f8498e);
        }
        if ((this.f8495e & 4) == 4) {
            Signature += C9831e.loadAd(3, this.f8492e.f7068e);
        }
        if ((this.f8495e & 8) == 8) {
            Signature += C9831e.subscription(4, this.f8502e);
        }
        if ((this.f8495e & 16) == 16) {
            Signature += C9831e.Signature(5, this.f8501e);
        }
        for (int i2 = 0; i2 < this.f8496e.size(); i2++) {
            Signature += C9831e.subscription(6, (AbstractC6649e) this.f8496e.get(i2));
        }
        for (int i3 = 0; i3 < this.f8499e.size(); i3++) {
            Signature += C9831e.subscription(7, (AbstractC6649e) this.f8499e.get(i3));
        }
        int size = this.f8500e.size() + Signature;
        this.f8497e = size;
        return size;
    }

    @Override // defpackage.AbstractC6649e
    public final void purchase(C9831e c9831e) {
        metrica();
        if ((this.f8495e & 1) == 1) {
            c9831e.m2695for(1, this.f8493e);
        }
        if ((this.f8495e & 2) == 2) {
            c9831e.m2695for(2, this.f8498e);
        }
        if ((this.f8495e & 4) == 4) {
            c9831e.m2715volatile(3, this.f8492e.f7068e);
        }
        if ((this.f8495e & 8) == 8) {
            c9831e.m2704public(4, this.f8502e);
        }
        if ((this.f8495e & 16) == 16) {
            c9831e.m2695for(5, this.f8501e);
        }
        for (int i = 0; i < this.f8496e.size(); i++) {
            c9831e.m2704public(6, (AbstractC6649e) this.f8496e.get(i));
        }
        for (int i2 = 0; i2 < this.f8499e.size(); i2++) {
            c9831e.m2704public(7, (AbstractC6649e) this.f8499e.get(i2));
        }
        c9831e.m2690e(this.f8500e);
    }
}
