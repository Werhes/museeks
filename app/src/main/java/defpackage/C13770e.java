package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13770e {
    public C14768e Signature;

    /* renamed from: abstract, reason: not valid java name */
    public final C3344e f27284abstract;
    public final AbstractC7919e ad;
    public C12262e adcel;
    public boolean admob;
    public int ads;
    public int advert;
    public final C14608e appmetrica;
    public final C5389e billing;

    /* renamed from: break, reason: not valid java name */
    public InterfaceC15992e f27285break;

    /* renamed from: case, reason: not valid java name */
    public long f27286case;

    /* renamed from: catch, reason: not valid java name */
    public C8395e f27287catch;

    /* renamed from: class, reason: not valid java name */
    public boolean f27288class;
    public final C2336e crashlytics;

    /* renamed from: default, reason: not valid java name */
    public final InterfaceC8850e f27289default;

    /* renamed from: extends, reason: not valid java name */
    public InterfaceC3483e f27290extends;
    public final ArrayList firebase;

    /* renamed from: goto, reason: not valid java name */
    public C18516e f27291goto;

    /* renamed from: implements, reason: not valid java name */
    public boolean f27292implements;

    /* renamed from: interface, reason: not valid java name */
    public C0690e f27293interface;
    public boolean isPro;
    public boolean isVip;
    public final C4799e license;
    public int[] loadAd;
    public final C18516e metrica;
    public int mopub;

    /* renamed from: native, reason: not valid java name */
    public boolean f27294native;
    public int premium;

    /* renamed from: protected, reason: not valid java name */
    public C5657e f27295protected;
    public final C14608e purchase;
    public int smaato;
    public boolean subs;
    public boolean subscription;
    public C3123e tapsense;

    /* renamed from: this, reason: not valid java name */
    public C14479e f27296this;

    /* renamed from: throw, reason: not valid java name */
    public C14608e f27297throw;

    /* renamed from: try, reason: not valid java name */
    public C3155e f27298try;
    public final AbstractC5830e vip;

    /* renamed from: while, reason: not valid java name */
    public final C18143e f27299while;
    public final C17489e yandex;
    public final ArrayList startapp = new ArrayList();
    public final C2025e amazon = new C2025e((byte) 0, 2);
    public final ArrayList remoteconfig = new ArrayList();
    public final C2025e pro = new C2025e((byte) 0, 2);
    public InterfaceC3483e signatures = C16158e.f31735e;
    public final C2025e inmobi = new C2025e((byte) 0, 2);
    public int applovin = -1;

    public C13770e(AbstractC7919e abstractC7919e, AbstractC5830e abstractC5830e, C18516e c18516e, C4799e c4799e, C14608e c14608e, C14608e c14608e2, C5389e c5389e, C17489e c17489e) {
        this.ad = abstractC7919e;
        this.vip = abstractC5830e;
        this.metrica = c18516e;
        this.license = c4799e;
        this.appmetrica = c14608e;
        this.purchase = c14608e2;
        this.billing = c5389e;
        this.yandex = c17489e;
        this.subs = abstractC5830e.purchase() || abstractC5830e.license();
        this.crashlytics = new C2336e(0, this);
        this.firebase = new ArrayList();
        C0690e startapp = c18516e.startapp();
        startapp.metrica();
        this.f27293interface = startapp;
        C18516e c18516e2 = new C18516e();
        if (abstractC5830e.purchase()) {
            c18516e2.billing();
        }
        if (abstractC5830e.license()) {
            c18516e2.f36306e = new C3123e();
        }
        this.f27291goto = c18516e2;
        C14479e adcel = c18516e2.adcel();
        adcel.appmetrica(true);
        this.f27296this = adcel;
        this.f27299while = new C18143e(this, c14608e);
        C0690e startapp2 = this.f27291goto.startapp();
        try {
            C3155e ad = startapp2.ad(0);
            startapp2.metrica();
            this.f27298try = ad;
            this.f27295protected = new C5657e();
            this.f27284abstract = new C3344e(this);
            InterfaceC8850e adcel2 = abstractC5830e.adcel();
            InterfaceC8850e applovin = applovin();
            this.f27289default = adcel2.mo394const(applovin == null ? C2693e.f6576e : applovin);
        } catch (Throwable th) {
            startapp2.metrica();
            throw th;
        }
    }

    /* renamed from: try, reason: not valid java name */
    public static final int m3652try(C13770e c13770e, int i, boolean z, int i2) {
        int i3;
        long[] jArr;
        Object[] objArr;
        int i4;
        long[] jArr2;
        Object[] objArr2;
        int i5;
        int i6;
        C0690e c0690e = c13770e.f27293interface;
        C18143e c18143e = c13770e.f27299while;
        boolean adcel = c0690e.adcel(i);
        int[] iArr = c0690e.vip;
        int i7 = 0;
        if (adcel) {
            int startapp = c0690e.startapp(i);
            Object Signature = c0690e.Signature(iArr, i);
            if (startapp == 206 && AbstractC7890e.billing(Signature, AbstractC1889e.appmetrica)) {
                Object yandex = c0690e.yandex(i, 0);
                InterfaceC9374e interfaceC9374e = yandex instanceof InterfaceC9374e ? (InterfaceC9374e) yandex : null;
                Object applovin = interfaceC9374e != null ? interfaceC9374e.applovin() : null;
                C5598e c5598e = applovin instanceof C5598e ? (C5598e) applovin : null;
                if (c5598e != null) {
                    C12618e c12618e = c5598e.f11954e.appmetrica;
                    Object[] objArr3 = c12618e.vip;
                    long[] jArr3 = c12618e.ad;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr3[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = i7;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        C13770e c13770e2 = (C13770e) objArr3[(i8 << 3) + i11];
                                        C18143e c18143e2 = c13770e2.f27299while;
                                        C17489e c17489e = c13770e2.yandex;
                                        i5 = i9;
                                        C18516e c18516e = c13770e2.metrica;
                                        if (c18516e.f36304e <= 0 || (c18516e.f36309e[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            objArr2 = objArr3;
                                            i6 = 0;
                                        } else {
                                            synchronized (c17489e.f34300e) {
                                                c17489e.Signature();
                                                jArr2 = jArr3;
                                                C0583e c0583e = c17489e.f34290e;
                                                objArr2 = objArr3;
                                                c17489e.f34290e = AbstractC16565e.license();
                                                try {
                                                    c17489e.f34298e.m3679synchronized(c0583e);
                                                    Unit unit = Unit.INSTANCE;
                                                } finally {
                                                }
                                            }
                                            C14608e c14608e = new C14608e();
                                            c13770e2.f27297throw = c14608e;
                                            C0690e startapp2 = c18516e.startapp();
                                            try {
                                                c13770e2.f27293interface = startapp2;
                                                C14608e c14608e2 = c18143e2.vip;
                                                try {
                                                    c18143e2.vip = c14608e;
                                                    c13770e2.m3685while(0);
                                                    c18143e2.vip();
                                                    if (c18143e2.metrica) {
                                                        c18143e2.vip.metrica.adcel(C7900e.license);
                                                        if (c18143e2.metrica) {
                                                            i6 = 0;
                                                            c18143e2.license(false);
                                                            c18143e2.license(false);
                                                            c18143e2.vip.metrica.adcel(C16952e.license);
                                                            c18143e2.metrica = false;
                                                        }
                                                    }
                                                    i6 = 0;
                                                } finally {
                                                }
                                            } finally {
                                                startapp2.metrica();
                                            }
                                        }
                                        c13770e.vip.subscription(c17489e);
                                    } else {
                                        jArr2 = jArr3;
                                        objArr2 = objArr3;
                                        i5 = i9;
                                        i6 = i7;
                                    }
                                    j >>= i5;
                                    i11++;
                                    objArr3 = objArr2;
                                    i7 = i6;
                                    jArr3 = jArr2;
                                    i9 = i5;
                                }
                                jArr = jArr3;
                                objArr = objArr3;
                                int i12 = i9;
                                i4 = i7;
                                if (i10 != i12) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                objArr = objArr3;
                                i4 = i7;
                            }
                            if (i8 == length) {
                                break;
                            }
                            i8++;
                            objArr3 = objArr;
                            i7 = i4;
                            jArr3 = jArr;
                        }
                    }
                }
                return c0690e.loadAd(i);
            }
            i3 = 1;
            if (!c0690e.advert(i)) {
                return c0690e.loadAd(i);
            }
        } else {
            i3 = 1;
            if (c0690e.license(i)) {
                int i13 = iArr[(i * 5) + 3] + i;
                int i14 = 0;
                for (int i15 = i + 1; i15 < i13; i15 += iArr[(i15 * 5) + 3]) {
                    boolean advert = c0690e.advert(i15);
                    if (advert) {
                        c18143e.metrica();
                        Object amazon = c0690e.amazon(i15);
                        c18143e.metrica();
                        c18143e.yandex.add(amazon);
                    }
                    i14 += m3652try(c13770e, i15, advert || z, advert ? 0 : i2 + i14);
                    if (advert) {
                        c18143e.metrica();
                        c18143e.ad();
                    }
                }
                if (!c0690e.advert(i)) {
                    return i14;
                }
            } else if (!c0690e.advert(i)) {
                return c0690e.loadAd(i);
            }
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05bf  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Signature(boolean r43) {
        /*
            Method dump skipped, instructions count: 1615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13770e.Signature(boolean):void");
    }

    /* renamed from: abstract, reason: not valid java name */
    public final void m3653abstract() {
        C0690e c0690e = this.f27293interface;
        int i = c0690e.startapp;
        this.advert = i >= 0 ? c0690e.vip[(i * 5) + 1] & 67108863 : 0;
        c0690e.pro();
    }

    public final void ad() {
        startapp();
        this.startapp.clear();
        this.amazon.metrica = 0;
        this.pro.metrica = 0;
        this.inmobi.metrica = 0;
        this.tapsense = null;
        C5657e c5657e = this.f27295protected;
        c5657e.purchase.billing();
        c5657e.appmetrica.billing();
        this.f27286case = 0;
        this.ads = 0;
        this.subscription = false;
        this.f27292implements = false;
        this.isPro = false;
        this.f27288class = false;
        this.applovin = -1;
        C0690e c0690e = this.f27293interface;
        if (!c0690e.purchase) {
            c0690e.metrica();
        }
        if (this.f27296this.isVip) {
            return;
        }
        tapsense();
    }

    public final Object adcel(AbstractC4455e abstractC4455e) {
        return AbstractC3167e.vip(advert(), abstractC4455e);
    }

    public final void admob() {
        Signature(false);
        C2846e inmobi = inmobi();
        if (inmobi != null) {
            int i = inmobi.vip;
            if ((i & 1) != 0) {
                inmobi.vip = i | 2;
            }
        }
    }

    public final boolean ads() {
        C2846e inmobi;
        return (this.f27292implements || this.isPro || this.isVip || (inmobi = inmobi()) == null || (inmobi.vip & 8) != 0) ? false : true;
    }

    public final InterfaceC3483e advert() {
        InterfaceC3483e interfaceC3483e;
        InterfaceC3483e interfaceC3483e2 = this.f27290extends;
        if (interfaceC3483e2 != null) {
            return interfaceC3483e2;
        }
        int i = this.f27293interface.startapp;
        boolean z = this.f27292implements;
        C12840e c12840e = AbstractC1889e.metrica;
        if (z && this.f27294native) {
            int i2 = this.f27296this.tapsense;
            while (i2 > 0) {
                if (this.f27296this.remoteconfig(i2) == 202 && AbstractC7890e.billing(this.f27296this.pro(i2), c12840e)) {
                    InterfaceC3483e interfaceC3483e3 = (InterfaceC3483e) this.f27296this.admob(i2);
                    this.f27290extends = interfaceC3483e3;
                    return interfaceC3483e3;
                }
                C14479e c14479e = this.f27296this;
                i2 = c14479e.firebase(c14479e.vip, i2);
            }
        }
        if (this.f27293interface.metrica > 0) {
            while (i > 0) {
                if (this.f27293interface.startapp(i) == 202) {
                    C0690e c0690e = this.f27293interface;
                    if (AbstractC7890e.billing(c0690e.Signature(c0690e.vip, i), c12840e)) {
                        C3123e c3123e = this.tapsense;
                        if (c3123e == null || (interfaceC3483e = (InterfaceC3483e) c3123e.vip(i)) == null) {
                            C0690e c0690e2 = this.f27293interface;
                            interfaceC3483e = (InterfaceC3483e) c0690e2.vip(c0690e2.vip, i);
                        }
                        this.f27290extends = interfaceC3483e;
                        return interfaceC3483e;
                    }
                }
                i = this.f27293interface.admob(i);
            }
        }
        InterfaceC3483e interfaceC3483e4 = this.signatures;
        this.f27290extends = interfaceC3483e4;
        return interfaceC3483e4;
    }

    public final void amazon(C0583e c0583e, Function2 function2) {
        ArrayList arrayList = this.remoteconfig;
        if (this.f27288class) {
            AbstractC1889e.ad("Reentrant composition is not supported");
        }
        this.billing.purchase();
        Trace.beginSection("Compose:recompose");
        try {
            long billing = AbstractC12909e.adcel().billing();
            this.premium = (int) (billing ^ (billing >>> 32));
            this.tapsense = null;
            m3679synchronized(c0583e);
            this.mopub = 0;
            this.f27288class = true;
            try {
                m3667instanceof();
                Object crashlytics = crashlytics();
                if (crashlytics != function2 && function2 != null) {
                    m3663finally(function2);
                }
                C2336e c2336e = this.crashlytics;
                C12431e license = AbstractC14533e.license();
                try {
                    license.license(c2336e);
                    C12840e c12840e = AbstractC1889e.ad;
                    if (function2 != null) {
                        m3656catch(200, c12840e);
                        AbstractC9476e.purchase(2, function2);
                        function2.invoke(this, 1);
                        Signature(false);
                    } else if (!this.isVip || crashlytics == null || crashlytics.equals(C2987e.ad)) {
                        m3654break();
                    } else {
                        m3656catch(200, c12840e);
                        AbstractC9476e.purchase(2, crashlytics);
                        Function2 function22 = (Function2) crashlytics;
                        AbstractC9476e.purchase(2, function22);
                        function22.invoke(this, 1);
                        Signature(false);
                    }
                    license.amazon(license.f24868e - 1);
                    pro();
                    this.f27288class = false;
                    arrayList.clear();
                    if (!this.f27296this.isVip) {
                        AbstractC1889e.ad("Check failed");
                    }
                    tapsense();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    license.amazon(license.f24868e - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final C3344e applovin() {
        if (this.vip.mopub()) {
            return this.f27284abstract;
        }
        return null;
    }

    public final boolean appmetrica(long j) {
        Object crashlytics = crashlytics();
        if ((crashlytics instanceof Long) && j == ((Number) crashlytics).longValue()) {
            return false;
        }
        m3663finally(Long.valueOf(j));
        return true;
    }

    public final boolean billing(boolean z) {
        Object crashlytics = crashlytics();
        if ((crashlytics instanceof Boolean) && z == ((Boolean) crashlytics).booleanValue()) {
            return false;
        }
        m3663finally(Boolean.valueOf(z));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1  */
    /* renamed from: break, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3654break() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13770e.m3654break():void");
    }

    /* renamed from: case, reason: not valid java name */
    public final void m3655case() {
        m3665implements(-127, null, null, 0);
    }

    /* renamed from: catch, reason: not valid java name */
    public final void m3656catch(int i, C12840e c12840e) {
        m3665implements(i, c12840e, null, 0);
    }

    /* renamed from: class, reason: not valid java name */
    public final int m3657class(int i) {
        int admob = this.f27293interface.admob(i) + 1;
        int i2 = 0;
        while (admob < i) {
            if (!this.f27293interface.mopub(admob)) {
                i2++;
            }
            admob += AbstractC2855e.ad(this.f27293interface.vip, admob);
        }
        return i2;
    }

    /* renamed from: const, reason: not valid java name */
    public final int m3658const(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.loadAd;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.f27293interface.loadAd(i) : i2;
        }
        C14768e c14768e = this.Signature;
        if (c14768e == null || c14768e.metrica(i) < 0) {
            return 0;
        }
        int metrica = c14768e.metrica(i);
        if (metrica >= 0) {
            return c14768e.metrica[metrica];
        }
        AbstractC14783e.startapp("Cannot find value for key " + i);
        throw null;
    }

    public final Object crashlytics() {
        boolean z = this.f27292implements;
        C5170e c5170e = C2987e.ad;
        if (!z) {
            Object smaato = this.f27293interface.smaato();
            if (!this.isPro || (smaato instanceof C2773e)) {
                return smaato;
            }
        } else if (this.subscription) {
            AbstractC1889e.ad("A call to createNode(), emitNode() or useNode() expected");
            return c5170e;
        }
        return c5170e;
    }

    /* renamed from: default, reason: not valid java name */
    public final void m3659default() {
        if (this.advert != 0) {
            AbstractC1889e.ad("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f27292implements) {
            return;
        }
        C2846e inmobi = inmobi();
        if (inmobi != null) {
            int i = inmobi.vip;
            if ((i & 128) == 0) {
                inmobi.vip = i | 16;
            }
        }
        if (this.remoteconfig.isEmpty()) {
            m3653abstract();
        } else {
            m3664goto();
        }
    }

    /* renamed from: else, reason: not valid java name */
    public final void m3660else(int i, int i2) {
        int m3658const = m3658const(i);
        if (m3658const != i2) {
            int i3 = i2 - m3658const;
            ArrayList arrayList = this.startapp;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int m3658const2 = m3658const(i) + i3;
                m3674return(i, m3658const2);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        C12262e c12262e = (C12262e) arrayList.get(i4);
                        if (c12262e != null && c12262e.ad(i, m3658const2)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.f27293interface.startapp;
                } else if (this.f27293interface.advert(i)) {
                    return;
                } else {
                    i = this.f27293interface.admob(i);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /* renamed from: extends, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3661extends(int r7, int r8, int r9) {
        /*
            r6 = this;
            eؑۥٓ r0 = r6.f27293interface
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.admob(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.admob(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.admob(r7)
            int r2 = r0.admob(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.admob(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.admob(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.admob(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.admob(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.admob(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.admob(r9)
            int r1 = r0.admob(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.advert(r7)
            if (r1 == 0) goto L7a
            e٘ۦٟ r1 = r6.f27299while
            r1.ad()
        L7a:
            int r7 = r0.admob(r7)
            goto L6b
        L7f:
            r6.loadAd(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13770e.m3661extends(int, int, int):void");
    }

    /* renamed from: final, reason: not valid java name */
    public final void m3662final(int i, Object obj) {
        m3665implements(i, obj, null, 0);
    }

    /* renamed from: finally, reason: not valid java name */
    public final void m3663finally(Object obj) {
        if (this.f27292implements) {
            C14479e c14479e = this.f27296this;
            if (c14479e.amazon <= 0 || c14479e.startapp == c14479e.mopub) {
                c14479e.m3812class(obj);
                return;
            }
            C3123e c3123e = c14479e.remoteconfig;
            if (c3123e == null) {
                c3123e = new C3123e();
            }
            c14479e.remoteconfig = c3123e;
            int i = c14479e.tapsense;
            Object vip = c3123e.vip(i);
            if (vip == null) {
                vip = new C12328e();
                c3123e.startapp(i, vip);
            }
            ((C12328e) vip).ad(obj);
            return;
        }
        C0690e c0690e = this.f27293interface;
        boolean z = c0690e.amazon;
        C18143e c18143e = this.f27299while;
        if (!z) {
            C3155e ad = c0690e.ad(c0690e.startapp);
            C12021e c12021e = c18143e.vip.metrica;
            c12021e.adcel(C10009e.license);
            AbstractC0207e.mopub(c12021e, 0, ad, 1, obj);
            return;
        }
        int metrica = (c0690e.advert - AbstractC2855e.metrica(c0690e.vip, c0690e.startapp)) - 1;
        if (c18143e.ad.f27293interface.startapp - c18143e.purchase >= 0) {
            c18143e.license(true);
            C12021e c12021e2 = c18143e.vip.metrica;
            c12021e2.adcel(C8907e.yandex);
            AbstractC0207e.adcel(c12021e2, 0, obj);
            c12021e2.billing[c12021e2.yandex - c12021e2.appmetrica[c12021e2.purchase - 1].vip] = metrica;
            return;
        }
        C0690e c0690e2 = this.f27293interface;
        C3155e ad2 = c0690e2.ad(c0690e2.startapp);
        C12021e c12021e3 = c18143e.vip.metrica;
        c12021e3.adcel(C8907e.billing);
        AbstractC0207e.mopub(c12021e3, 0, obj, 1, ad2);
        c12021e3.billing[c12021e3.yandex - c12021e3.appmetrica[c12021e3.purchase - 1].vip] = metrica;
    }

    public final List firebase() {
        AbstractC5830e abstractC5830e = this.vip;
        InterfaceC12254e yandex = abstractC5830e.yandex();
        C17489e c17489e = AbstractC0869e.premium(yandex) ? (C17489e) yandex : null;
        if (c17489e != null) {
            C18516e c18516e = c17489e.f34306e;
            C0690e startapp = AbstractC2855e.appmetrica(c18516e).startapp();
            try {
                Integer metrica = AbstractC4107e.metrica(startapp, abstractC5830e, 0, startapp.metrica);
                if (metrica != null) {
                    startapp = AbstractC2855e.appmetrica(c18516e).startapp();
                    try {
                        ArrayList smaato = AbstractC4107e.smaato(startapp, metrica.intValue(), 0);
                        startapp.metrica();
                        return AbstractC13480e.m3584final(smaato, c17489e.f34298e.firebase());
                    } finally {
                    }
                }
            } finally {
            }
        }
        return C13664e.f27089e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a9, code lost:
    
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.vip < r5) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0320  */
    /* JADX WARN: Type inference failed for: r6v3, types: [eؑ۟ؖ] */
    /* JADX WARN: Type inference failed for: r8v9, types: [eؓؕٚ] */
    /* renamed from: goto, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3664goto() {
        /*
            Method dump skipped, instructions count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13770e.m3664goto():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* renamed from: implements, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3665implements(int r29, java.lang.Object r30, java.lang.Object r31, int r32) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13770e.m3665implements(int, java.lang.Object, java.lang.Object, int):void");
    }

    /* renamed from: import, reason: not valid java name */
    public final void m3666import() {
        m3665implements(125, null, null, 2);
        this.subscription = true;
    }

    public final C2846e inmobi() {
        if (this.ads != 0) {
            return null;
        }
        ArrayList arrayList = this.firebase;
        if (AbstractC5851e.license(arrayList)) {
            return (C2846e) AbstractC17861e.mopub(1, arrayList);
        }
        return null;
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final void m3667instanceof() {
        this.smaato = 0;
        this.f27293interface = this.metrica.startapp();
        m3665implements(100, null, null, 0);
        AbstractC5830e abstractC5830e = this.vip;
        abstractC5830e.pro();
        InterfaceC3483e startapp = abstractC5830e.startapp();
        this.inmobi.appmetrica(this.isVip ? 1 : 0);
        this.isVip = purchase(startapp);
        this.f27290extends = null;
        if (!this.admob) {
            this.admob = abstractC5830e.appmetrica();
        }
        if (!this.subs) {
            this.subs = abstractC5830e.purchase();
        }
        if (this.subs) {
            startapp = ((C16158e) startapp).appmetrica(AbstractC12512e.ad, new C14448e(applovin()));
        }
        this.signatures = startapp;
        Set set = (Set) AbstractC3167e.vip(startapp, AbstractC4344e.ad);
        if (set != null) {
            set.add(isVip());
            abstractC5830e.loadAd(set);
        }
        long billing = abstractC5830e.billing();
        m3665implements((int) (billing ^ (billing >>> 32)), null, null, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r10 == null) goto L29;
     */
    /* renamed from: interface, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3668interface(defpackage.C17489e r9, defpackage.C17489e r10, java.lang.Integer r11, java.util.List r12, kotlin.jvm.functions.Function0 r13) {
        /*
            r8 = this;
            boolean r0 = r8.f27288class
            int r1 = r8.mopub
            r2 = 1
            r8.f27288class = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.mopub = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            eؙۖؕ r6 = (defpackage.C6571e) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.f13544e     // Catch: java.lang.Throwable -> L24
            eؔۚۥ r7 = (defpackage.C2846e) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.f13543e     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.m3675static(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L62
        L26:
            r8.m3675static(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L59
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L53
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L53
            if (r11 < 0) goto L53
            r9.f34291e = r10     // Catch: java.lang.Throwable -> L24
            r9.f34299e = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L4d
            r9.f34291e = r5     // Catch: java.lang.Throwable -> L24
            r9.f34299e = r2     // Catch: java.lang.Throwable -> L24
            goto L57
        L4d:
            r10 = move-exception
            r9.f34291e = r5     // Catch: java.lang.Throwable -> L24
            r9.f34299e = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L53:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L57:
            if (r10 != 0) goto L5d
        L59:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L5d:
            r8.f27288class = r0
            r8.mopub = r1
            return r10
        L62:
            r8.f27288class = r0
            r8.mopub = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13770e.m3668interface(eٌ٘ؒ, eٌ٘ؒ, java.lang.Integer, java.util.List, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    public final boolean isPro() {
        if (!ads() || this.isVip) {
            return true;
        }
        C2846e inmobi = inmobi();
        return (inmobi == null || (inmobi.vip & 4) == 0) ? false : true;
    }

    public final InterfaceC16460e isVip() {
        C8395e c8395e = this.f27287catch;
        if (c8395e != null) {
            return c8395e;
        }
        C8395e c8395e2 = new C8395e(this.yandex);
        this.f27287catch = c8395e2;
        return c8395e2;
    }

    public final boolean license(int i) {
        Object crashlytics = crashlytics();
        if ((crashlytics instanceof Integer) && i == ((Number) crashlytics).intValue()) {
            return false;
        }
        m3663finally(Integer.valueOf(i));
        return true;
    }

    public final void loadAd(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        loadAd(this.f27293interface.admob(i), i2);
        if (this.f27293interface.advert(i)) {
            Object amazon = this.f27293interface.amazon(i);
            C18143e c18143e = this.f27299while;
            c18143e.metrica();
            c18143e.yandex.add(amazon);
        }
    }

    public final boolean metrica(float f) {
        Object crashlytics = crashlytics();
        if ((crashlytics instanceof Float) && f == ((Number) crashlytics).floatValue()) {
            return false;
        }
        m3663finally(Float.valueOf(f));
        return true;
    }

    public final void mopub(Function0 function0) {
        if (!this.subscription) {
            AbstractC1889e.ad("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.subscription = false;
        if (!this.f27292implements) {
            AbstractC1889e.ad("createNode() can only be called when inserting");
        }
        C2025e c2025e = this.amazon;
        int i = c2025e.vip[c2025e.metrica - 1];
        C14479e c14479e = this.f27296this;
        C3155e vip = c14479e.vip(c14479e.tapsense);
        this.advert++;
        C5657e c5657e = this.f27295protected;
        C12021e c12021e = c5657e.appmetrica;
        c12021e.adcel(C8907e.appmetrica);
        AbstractC0207e.adcel(c12021e, 0, function0);
        c12021e.billing[c12021e.yandex - c12021e.appmetrica[c12021e.purchase - 1].vip] = i;
        AbstractC0207e.adcel(c12021e, 1, vip);
        C12021e c12021e2 = c5657e.purchase;
        c12021e2.adcel(C8907e.purchase);
        c12021e2.billing[c12021e2.yandex - c12021e2.appmetrica[c12021e2.purchase - 1].vip] = i;
        AbstractC0207e.adcel(c12021e2, 0, vip);
    }

    /* renamed from: native, reason: not valid java name */
    public final void m3669native(InterfaceC3483e interfaceC3483e) {
        C3123e c3123e = this.tapsense;
        if (c3123e == null) {
            c3123e = new C3123e();
            this.tapsense = c3123e;
        }
        c3123e.startapp(this.f27293interface.billing, interfaceC3483e);
    }

    /* renamed from: new, reason: not valid java name */
    public final void m3670new(Object obj, boolean z) {
        if (z) {
            C0690e c0690e = this.f27293interface;
            if (c0690e.mopub <= 0) {
                if ((c0690e.vip[(c0690e.billing * 5) + 1] & 1073741824) == 0) {
                    AbstractC6536e.ad("Expected a node group");
                }
                c0690e.signatures();
                return;
            }
            return;
        }
        if (obj != null && this.f27293interface.purchase() != obj) {
            C18143e c18143e = this.f27299while;
            c18143e.getClass();
            c18143e.license(false);
            C12021e c12021e = c18143e.vip.metrica;
            c12021e.adcel(C9103e.license);
            AbstractC0207e.adcel(c12021e, 0, obj);
        }
        this.f27293interface.signatures();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: package, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C13770e m3671package(int r7) {
        /*
            r6 = this;
            r6.m3676strictfp(r7)
            boolean r7 = r6.f27292implements
            eؘؓٞ r0 = r6.billing
            java.util.ArrayList r1 = r6.firebase
            eٌ٘ؒ r2 = r6.yandex
            if (r7 == 0) goto L26
            eؔۚۥ r7 = new eؔۚۥ
            r7.<init>(r2)
            r1.add(r7)
            r6.m3663finally(r7)
            int r1 = r6.premium
            r7.appmetrica = r1
            int r1 = r7.vip
            r1 = r1 & (-17)
            r7.vip = r1
            r0.purchase()
            return r6
        L26:
            eؑۥٓ r7 = r6.f27293interface
            int r7 = r7.startapp
            java.util.ArrayList r3 = r6.remoteconfig
            int r7 = defpackage.AbstractC4224e.license(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            eؓؓؐ r7 = (defpackage.C1547e) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            eؑۥٓ r3 = r6.f27293interface
            java.lang.Object r3 = r3.smaato()
            eٕؗۜ r4 = defpackage.C2987e.ad
            boolean r4 = defpackage.AbstractC7890e.billing(r3, r4)
            if (r4 == 0) goto L51
            eؔۚۥ r3 = new eؔۚۥ
            r3.<init>(r2)
            r6.m3663finally(r3)
            goto L53
        L51:
            eؔۚۥ r3 = (defpackage.C2846e) r3
        L53:
            r2 = 1
            r4 = 0
            if (r7 != 0) goto L6b
            int r7 = r3.vip
            r5 = r7 & 64
            if (r5 == 0) goto L5f
            r5 = r2
            goto L60
        L5f:
            r5 = r4
        L60:
            if (r5 == 0) goto L66
            r7 = r7 & (-65)
            r3.vip = r7
        L66:
            if (r5 == 0) goto L69
            goto L6b
        L69:
            r7 = r4
            goto L6c
        L6b:
            r7 = r2
        L6c:
            int r5 = r3.vip
            if (r7 == 0) goto L73
            r7 = r5 | 8
            goto L75
        L73:
            r7 = r5 & (-9)
        L75:
            r3.vip = r7
            r1.add(r3)
            int r7 = r6.premium
            r3.appmetrica = r7
            int r7 = r3.vip
            r7 = r7 & (-17)
            r3.vip = r7
            r0.purchase()
            int r7 = r3.vip
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lb7
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.175E-43)
            r3.vip = r7
            e٘ۦٟ r7 = r6.f27299while
            eٌۣٔ r7 = r7.vip
            eِ۟ٞ r7 = r7.metrica
            eَُٝ r0 = defpackage.C10194e.license
            r7.adcel(r0)
            defpackage.AbstractC0207e.adcel(r7, r4, r3)
            boolean r7 = r6.isPro
            if (r7 != 0) goto Lb7
            int r7 = r3.vip
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto Lb7
            r6.isPro = r2
            eؑۥٓ r0 = r6.f27293interface
            int r0 = r0.startapp
            r6.applovin = r0
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.vip = r7
        Lb7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13770e.m3671package(int):eٓؕۥ");
    }

    public final void premium(ArrayList arrayList) {
        C0690e c0690e;
        C13770e c13770e = this;
        C14608e c14608e = c13770e.purchase;
        C18143e c18143e = c13770e.f27299while;
        C14608e c14608e2 = c18143e.vip;
        try {
            c18143e.vip = c14608e;
            c14608e.metrica.adcel(C16969e.license);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                C6571e c6571e = (C6571e) arrayList.get(i);
                AbstractC14546e abstractC14546e = (AbstractC14546e) c6571e.f13544e;
                abstractC14546e.getClass();
                C3155e metrica = AbstractC12184e.metrica(null);
                C18516e appmetrica = AbstractC2855e.appmetrica(null);
                int appmetrica2 = appmetrica.appmetrica(metrica);
                C9898e c9898e = new C9898e();
                c18143e.vip();
                C12021e c12021e = c18143e.vip.metrica;
                c12021e.adcel(C3403e.license);
                AbstractC0207e.mopub(c12021e, 0, c9898e, 1, metrica);
                if (appmetrica.equals(c13770e.f27291goto)) {
                    if (!c13770e.f27296this.isVip) {
                        AbstractC1889e.ad("Check failed");
                    }
                    c13770e.tapsense();
                }
                C0690e startapp = appmetrica.startapp();
                try {
                    startapp.subscription(appmetrica2);
                    c18143e.purchase = appmetrica2;
                    try {
                        C14608e c14608e3 = new C14608e();
                        c0690e = startapp;
                        try {
                            m3668interface(null, null, null, C13664e.f27089e, new Csynchronized(c13770e, c14608e3, startapp, abstractC14546e, 11));
                            C14608e c14608e4 = c18143e.vip;
                            c14608e4.getClass();
                            if (!c14608e3.metrica.startapp()) {
                                C12021e c12021e2 = c14608e4.metrica;
                                c12021e2.adcel(C13320e.license);
                                AbstractC0207e.mopub(c12021e2, 0, c14608e3, 1, c9898e);
                            }
                            Unit unit = Unit.INSTANCE;
                            c0690e.metrica();
                            c18143e.vip.metrica.adcel(C7900e.license);
                            i++;
                            c13770e = this;
                        } catch (Throwable th) {
                            th = th;
                            c0690e.metrica();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c0690e = startapp;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c0690e = startapp;
                }
            }
            c18143e.vip();
            c18143e.vip.metrica.adcel(C0049e.license);
            c18143e.purchase = 0;
            c18143e.vip = c14608e2;
        } catch (Throwable th4) {
            c18143e.vip = c14608e2;
            throw th4;
        }
    }

    /* renamed from: private, reason: not valid java name */
    public final void m3672private(int i) {
        m3665implements(i, null, null, 0);
    }

    public final void pro() {
        Signature(false);
        this.vip.metrica();
        Signature(false);
        C18143e c18143e = this.f27299while;
        if (c18143e.metrica) {
            c18143e.license(false);
            c18143e.license(false);
            c18143e.vip.metrica.adcel(C16952e.license);
            c18143e.metrica = false;
        }
        c18143e.vip();
        if (c18143e.license.metrica != 0) {
            AbstractC1889e.ad("Missed recording an endGroup()");
        }
        if (!this.startapp.isEmpty()) {
            AbstractC1889e.ad("Start/end imbalance");
        }
        startapp();
        this.f27293interface.metrica();
        this.isVip = this.inmobi.license() != 0;
    }

    /* renamed from: protected, reason: not valid java name */
    public final boolean m3673protected(int i, boolean z) {
        C2846e inmobi;
        if ((i & 1) == 0 && (this.f27292implements || this.isPro)) {
            InterfaceC15992e interfaceC15992e = this.f27285break;
            if (interfaceC15992e == null || (inmobi = inmobi()) == null || !interfaceC15992e.appmetrica() || (inmobi.vip & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                return true;
            }
            inmobi.purchase();
            boolean z2 = this.isPro;
            int i2 = inmobi.vip;
            inmobi.vip = (z2 ? i2 | 128 : i2 & (-129)) | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            C12021e c12021e = this.f27299while.vip.metrica;
            c12021e.adcel(C2445e.license);
            AbstractC0207e.adcel(c12021e, 0, inmobi);
            this.vip.admob(inmobi);
            return false;
        }
        if (!z && ads()) {
            return false;
        }
        return true;
    }

    public final boolean purchase(Object obj) {
        if (AbstractC7890e.billing(crashlytics(), obj)) {
            return false;
        }
        m3663finally(obj);
        return true;
    }

    public final void remoteconfig() {
        if (this.f27288class || this.applovin != 0) {
            AbstractC6536e.ad("Cannot disable reuse from root if it was caused by other groups");
        }
        this.applovin = -1;
        this.isPro = false;
    }

    /* renamed from: return, reason: not valid java name */
    public final void m3674return(int i, int i2) {
        if (m3658const(i) != i2) {
            if (i < 0) {
                C14768e c14768e = this.Signature;
                if (c14768e == null) {
                    c14768e = new C14768e();
                    this.Signature = c14768e;
                }
                c14768e.purchase(i, i2);
                return;
            }
            int[] iArr = this.loadAd;
            if (iArr == null) {
                iArr = new int[this.f27293interface.metrica];
                AbstractC1660e.tapsense(-1, 0, 6, iArr);
                this.loadAd = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final void signatures(boolean z, C12262e c12262e) {
        this.startapp.add(this.adcel);
        this.adcel = c12262e;
        int i = this.advert;
        C2025e c2025e = this.amazon;
        c2025e.appmetrica(i);
        c2025e.appmetrica(this.smaato);
        c2025e.appmetrica(this.mopub);
        if (z) {
            this.mopub = 0;
        }
        this.advert = 0;
        this.smaato = 0;
    }

    public final C7812e smaato() {
        Collection collection;
        if (!this.vip.mopub()) {
            return null;
        }
        C1169e license = AbstractC6874e.license();
        C14479e c14479e = this.f27296this;
        license.addAll(AbstractC4107e.vip(c14479e, null, c14479e.pro, null));
        C0690e c0690e = this.f27293interface;
        boolean z = c0690e.purchase;
        int[] iArr = c0690e.vip;
        if (z || c0690e.metrica == 0) {
            collection = C13664e.f27089e;
        } else {
            C8793e c8793e = new C8793e(0, c0690e);
            int i = c0690e.startapp;
            Object valueOf = Integer.valueOf(c0690e.advert - AbstractC2855e.metrica(iArr, i));
            while (i >= 0) {
                c8793e.appmetrica(c0690e.startapp(i), c0690e.mopub(i) ? c0690e.Signature(iArr, i) : C2987e.ad, c0690e.ad.smaato(i), valueOf);
                valueOf = c0690e.ad(i);
                i = c0690e.admob(i);
            }
            collection = c8793e.f12432e;
        }
        license.addAll(collection);
        license.addAll(firebase());
        return new C7812e(AbstractC6874e.metrica(license), this.subs);
    }

    public final void startapp() {
        this.adcel = null;
        this.mopub = 0;
        this.advert = 0;
        this.f27286case = 0L;
        this.subscription = false;
        C18143e c18143e = this.f27299while;
        c18143e.metrica = false;
        c18143e.license.metrica = 0;
        c18143e.purchase = 0;
        c18143e.appmetrica = true;
        c18143e.billing = 0;
        c18143e.yandex.clear();
        c18143e.startapp = -1;
        c18143e.adcel = -1;
        c18143e.mopub = -1;
        c18143e.advert = 0;
        this.firebase.clear();
        this.loadAd = null;
        this.Signature = null;
    }

    /* renamed from: static, reason: not valid java name */
    public final boolean m3675static(C2846e c2846e, Object obj) {
        C3155e c3155e = c2846e.metrica;
        if (c3155e == null) {
            return false;
        }
        int appmetrica = this.f27293interface.ad.appmetrica(AbstractC12184e.metrica(c3155e));
        if (!this.f27288class || appmetrica < this.f27293interface.billing) {
            return false;
        }
        ArrayList arrayList = this.remoteconfig;
        int license = AbstractC4224e.license(appmetrica, arrayList);
        if (license < 0) {
            int i = -(license + 1);
            if (!(obj instanceof C6656e)) {
                obj = null;
            }
            arrayList.add(i, new C1547e(c2846e, appmetrica, obj));
            return true;
        }
        C1547e c1547e = (C1547e) arrayList.get(license);
        if (!(obj instanceof C6656e)) {
            c1547e.metrica = null;
            return true;
        }
        Object obj2 = c1547e.metrica;
        if (obj2 == null) {
            c1547e.metrica = obj;
            return true;
        }
        if (obj2 instanceof C12618e) {
            ((C12618e) obj2).ad(obj);
            return true;
        }
        C12618e c12618e = AbstractC1710e.ad;
        C12618e c12618e2 = new C12618e(2);
        c12618e2.advert(obj2);
        c12618e2.advert(obj);
        c1547e.metrica = c12618e2;
        return true;
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m3676strictfp(int i) {
        int i2;
        int i3;
        if (this.adcel != null) {
            m3665implements(i, null, null, 0);
            return;
        }
        if (this.subscription) {
            AbstractC1889e.ad("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f27286case = Long.rotateLeft(Long.rotateLeft(this.f27286case, 3) ^ i, 3) ^ this.smaato;
        this.smaato++;
        C0690e c0690e = this.f27293interface;
        boolean z = this.f27292implements;
        C5170e c5170e = C2987e.ad;
        if (z) {
            c0690e.mopub++;
            this.f27296this.m3808abstract(c5170e, c5170e, false, i);
            signatures(false, null);
            return;
        }
        if (c0690e.billing() == i && ((i3 = c0690e.billing) >= c0690e.yandex || (c0690e.vip[(i3 * 5) + 1] & 536870912) == 0)) {
            c0690e.signatures();
            signatures(false, null);
            return;
        }
        if (c0690e.mopub <= 0 && (i2 = c0690e.billing) != c0690e.yandex) {
            int i4 = this.mopub;
            m3680this();
            this.f27299while.appmetrica(i4, c0690e.remoteconfig());
            AbstractC4224e.ad(i2, c0690e.billing, this.remoteconfig);
        }
        c0690e.mopub++;
        this.f27292implements = true;
        this.f27290extends = null;
        if (this.f27296this.isVip) {
            C14479e adcel = this.f27291goto.adcel();
            this.f27296this = adcel;
            adcel.m3823while();
            this.f27294native = false;
            this.f27290extends = null;
        }
        C14479e c14479e = this.f27296this;
        c14479e.license();
        int i5 = c14479e.pro;
        c14479e.m3808abstract(c5170e, c5170e, false, i);
        this.f27298try = c14479e.vip(i5);
        signatures(false, null);
    }

    public final void subs(InterfaceC3483e interfaceC3483e, Object obj) {
        m3662final(126665345, null);
        crashlytics();
        m3663finally(obj);
        long j = this.f27286case;
        try {
            this.f27286case = 126665345;
            if (this.f27292implements) {
                C14479e.applovin(this.f27296this);
            }
            boolean z = (this.f27292implements || AbstractC7890e.billing(this.f27293interface.purchase(), interfaceC3483e)) ? false : true;
            if (z) {
                m3669native(interfaceC3483e);
            }
            m3665implements(202, AbstractC1889e.metrica, interfaceC3483e, 0);
            this.f27290extends = null;
            boolean z2 = this.isVip;
            this.isVip = z;
            C2892e c2892e = new C2892e(-59194059, true, new C11213e(25, obj));
            AbstractC9476e.purchase(2, c2892e);
            c2892e.invoke(this, 1);
            this.isVip = z2;
        } finally {
        }
    }

    public final C2846e subscription() {
        C2846e c2846e;
        C3155e ad;
        C16202e c16202e;
        ArrayList arrayList = this.firebase;
        C2846e c2846e2 = AbstractC5851e.license(arrayList) ? (C2846e) arrayList.remove(arrayList.size() - 1) : null;
        if (c2846e2 != null) {
            c2846e2.vip &= -9;
            this.billing.purchase();
            int i = this.premium;
            C17866e c17866e = c2846e2.purchase;
            if (c17866e != null && (c2846e2.vip & 16) == 0) {
                Object[] objArr = c17866e.vip;
                int[] iArr = c17866e.metrica;
                long[] jArr = c17866e.ad;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    loop0: while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = objArr[i5];
                                    if (iArr[i5] != i) {
                                        c16202e = new C16202e(c2846e2, i, c17866e, 4);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            c16202e = null;
            C18143e c18143e = this.f27299while;
            if (c16202e != null) {
                C12021e c12021e = c18143e.vip.metrica;
                c12021e.adcel(C2086e.license);
                AbstractC0207e.mopub(c12021e, 0, c16202e, 1, this.yandex);
            }
            int i6 = c2846e2.vip;
            if ((i6 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                c2846e2.vip = i6 & (-513);
                C12021e c12021e2 = c18143e.vip.metrica;
                c12021e2.adcel(C13744e.license);
                AbstractC0207e.adcel(c12021e2, 0, c2846e2);
                int i7 = c2846e2.vip;
                c2846e2.vip = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    c2846e2.vip = i7 & (-1153);
                    if (this.applovin == this.f27293interface.startapp) {
                        this.isPro = false;
                        this.applovin = -1;
                    }
                }
            }
        }
        if (c2846e2 != null) {
            int i8 = c2846e2.vip;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.admob)) {
                if (c2846e2.metrica == null) {
                    if (this.f27292implements) {
                        C14479e c14479e = this.f27296this;
                        ad = c14479e.vip(c14479e.tapsense);
                    } else {
                        C0690e c0690e = this.f27293interface;
                        ad = c0690e.ad(c0690e.startapp);
                    }
                    c2846e2.metrica = ad;
                }
                c2846e2.vip &= -5;
                c2846e = c2846e2;
                Signature(false);
                return c2846e;
            }
        }
        c2846e = null;
        Signature(false);
        return c2846e;
    }

    /* renamed from: super, reason: not valid java name */
    public final void m3677super() {
        m3665implements(125, null, null, 1);
        this.subscription = true;
    }

    /* renamed from: switch, reason: not valid java name */
    public final C16158e m3678switch(InterfaceC3483e interfaceC3483e, C16158e c16158e) {
        C7748e ad = ((C16158e) interfaceC3483e).ad();
        ad.putAll(c16158e);
        C16158e build = ad.build();
        m3656catch(204, AbstractC1889e.license);
        crashlytics();
        m3663finally(build);
        crashlytics();
        m3663finally(c16158e);
        Signature(false);
        return build;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public final void m3679synchronized(C0583e c0583e) {
        ArrayList arrayList = this.remoteconfig;
        for (int billing = AbstractC6874e.billing(arrayList); -1 < billing; billing--) {
            C1547e c1547e = (C1547e) arrayList.get(billing);
            C3155e c3155e = c1547e.ad.metrica;
            C3155e metrica = c3155e != null ? AbstractC12184e.metrica(c3155e) : null;
            if (metrica == null || !metrica.ad()) {
                arrayList.remove(billing);
            } else {
                int i = c1547e.vip;
                int i2 = metrica.ad;
                if (i != i2) {
                    c1547e.vip = i2;
                }
            }
        }
        Object[] objArr = c0583e.vip;
        Object[] objArr2 = c0583e.metrica;
        long[] jArr = c0583e.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            C2846e c2846e = (C2846e) obj;
                            C3155e c3155e2 = c2846e.metrica;
                            if (c3155e2 != null) {
                                int i7 = AbstractC12184e.metrica(c3155e2).ad;
                                if (obj2 == C14914e.f29567e) {
                                    obj2 = null;
                                }
                                arrayList.add(new C1547e(c2846e, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        AbstractC5167e.signatures(AbstractC4224e.ad, arrayList);
    }

    public final void tapsense() {
        C18516e c18516e = new C18516e();
        if (this.subs) {
            c18516e.billing();
        }
        if (this.vip.license()) {
            c18516e.f36306e = new C3123e();
        }
        this.f27291goto = c18516e;
        C14479e adcel = c18516e.adcel();
        adcel.appmetrica(true);
        this.f27296this = adcel;
    }

    /* renamed from: this, reason: not valid java name */
    public final void m3680this() {
        int i;
        m3685while(this.f27293interface.billing);
        C18143e c18143e = this.f27299while;
        c18143e.license(false);
        C2025e c2025e = c18143e.license;
        C13770e c13770e = c18143e.ad;
        C0690e c0690e = c13770e.f27293interface;
        if (c0690e.metrica > 0 && c2025e.metrica(-2) != (i = c0690e.startapp)) {
            if (!c18143e.metrica && c18143e.appmetrica) {
                c18143e.license(false);
                c18143e.vip.metrica.adcel(C9804e.license);
                c18143e.metrica = true;
            }
            if (i > 0) {
                C3155e ad = c0690e.ad(i);
                c2025e.appmetrica(i);
                c18143e.license(false);
                C12021e c12021e = c18143e.vip.metrica;
                c12021e.adcel(C11347e.license);
                AbstractC0207e.adcel(c12021e, 0, ad);
                c18143e.metrica = true;
            }
        }
        c18143e.vip.metrica.adcel(C16737e.license);
        int i2 = c18143e.purchase;
        C0690e c0690e2 = c13770e.f27293interface;
        c18143e.purchase = c0690e2.vip[(c0690e2.billing * 5) + 3] + i2;
    }

    /* renamed from: throw, reason: not valid java name */
    public final Object m3681throw() {
        boolean z = this.f27292implements;
        C5170e c5170e = C2987e.ad;
        if (!z) {
            Object smaato = this.f27293interface.smaato();
            if (!this.isPro || (smaato instanceof C2773e)) {
                return smaato instanceof InterfaceC9374e ? ((InterfaceC9374e) smaato).applovin() : smaato;
            }
        } else if (this.subscription) {
            AbstractC1889e.ad("A call to createNode(), emitNode() or useNode() expected");
            return c5170e;
        }
        return c5170e;
    }

    /* renamed from: throws, reason: not valid java name */
    public final void m3682throws(Object obj) {
        if (obj instanceof InterfaceC14620e) {
            C6673e c6673e = new C6673e((InterfaceC14620e) obj, this.smaato - 1);
            if (this.f27292implements) {
                C12021e c12021e = this.f27299while.vip.metrica;
                c12021e.adcel(C4968e.license);
                AbstractC0207e.adcel(c12021e, 0, c6673e);
            }
            this.license.add(obj);
            obj = c6673e;
        }
        m3663finally(obj);
    }

    /* renamed from: transient, reason: not valid java name */
    public final void m3683transient(Object obj) {
        if (!this.f27292implements && this.f27293interface.billing() == 207 && !AbstractC7890e.billing(this.f27293interface.purchase(), obj) && this.applovin < 0) {
            this.applovin = this.f27293interface.billing;
            this.isPro = true;
        }
        m3665implements(207, null, obj, 0);
    }

    public final void vip(Object obj, Function2 function2) {
        if (this.f27292implements) {
            C12021e c12021e = this.f27295protected.appmetrica;
            c12021e.adcel(C3452e.license);
            AbstractC0207e.adcel(c12021e, 0, obj);
            AbstractC9476e.purchase(2, function2);
            AbstractC0207e.adcel(c12021e, 1, function2);
            return;
        }
        C18143e c18143e = this.f27299while;
        c18143e.vip();
        C12021e c12021e2 = c18143e.vip.metrica;
        c12021e2.adcel(C3452e.license);
        AbstractC9476e.purchase(2, function2);
        AbstractC0207e.mopub(c12021e2, 0, obj, 1, function2);
    }

    /* renamed from: volatile, reason: not valid java name */
    public final void m3684volatile() {
        if (!this.subscription) {
            AbstractC1889e.ad("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.subscription = false;
        if (this.f27292implements) {
            AbstractC1889e.ad("useNode() called while inserting");
        }
        C0690e c0690e = this.f27293interface;
        Object amazon = c0690e.amazon(c0690e.startapp);
        C18143e c18143e = this.f27299while;
        c18143e.metrica();
        c18143e.yandex.add(amazon);
        if (this.isPro && (amazon instanceof InterfaceC16503e)) {
            c18143e.vip();
            c18143e.vip.metrica.adcel(C10411e.license);
        }
    }

    /* renamed from: while, reason: not valid java name */
    public final void m3685while(int i) {
        boolean advert = this.f27293interface.advert(i);
        C18143e c18143e = this.f27299while;
        if (advert) {
            c18143e.metrica();
            Object amazon = this.f27293interface.amazon(i);
            c18143e.metrica();
            c18143e.yandex.add(amazon);
        }
        m3652try(this, i, advert, 0);
        c18143e.metrica();
        if (advert) {
            c18143e.ad();
        }
    }

    public final boolean yandex(Object obj) {
        if (crashlytics() == obj) {
            return false;
        }
        m3663finally(obj);
        return true;
    }
}
