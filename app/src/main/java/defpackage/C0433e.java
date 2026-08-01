package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؑۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433e implements InterfaceC13125e {
    public final C10424e ad;
    public boolean adcel;
    public final long appmetrica;
    public final long billing;
    public C5401e license;
    public C4524e metrica;
    public final long purchase;
    public final float startapp;
    public final InterfaceC15169e vip;
    public final float yandex;

    public C0433e(InterfaceC15169e interfaceC15169e, InterfaceC6440e interfaceC6440e) {
        C4524e c4524e = new C4524e(27);
        this.vip = interfaceC15169e;
        this.metrica = c4524e;
        C10424e c10424e = new C10424e(interfaceC6440e, c4524e);
        this.ad = c10424e;
        if (interfaceC15169e != c10424e.license) {
            c10424e.license = interfaceC15169e;
            c10424e.vip.clear();
            c10424e.metrica.clear();
        }
        this.appmetrica = -9223372036854775807L;
        this.purchase = -9223372036854775807L;
        this.billing = -9223372036854775807L;
        this.yandex = -3.4028235E38f;
        this.startapp = -3.4028235E38f;
        this.adcel = true;
    }

    public static InterfaceC13125e purchase(Class cls, InterfaceC15169e interfaceC15169e) {
        try {
            return (InterfaceC13125e) cls.getConstructor(InterfaceC15169e.class).newInstance(interfaceC15169e);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.InterfaceC13125e
    public final InterfaceC13125e ad(C4524e c4524e) {
        this.metrica = c4524e;
        C10424e c10424e = this.ad;
        c10424e.purchase = c4524e;
        c10424e.ad.ad(c4524e);
        Iterator it = c10424e.metrica.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC13125e) it.next()).ad(c4524e);
        }
        return this;
    }

    @Override // defpackage.InterfaceC13125e
    public final /* bridge */ /* synthetic */ InterfaceC13125e appmetrica(C5401e c5401e) {
        billing(c5401e);
        return this;
    }

    public final void billing(C5401e c5401e) {
        AbstractC2301e.amazon(c5401e, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.license = c5401e;
        C10424e c10424e = this.ad;
        c10424e.yandex = c5401e;
        Iterator it = c10424e.metrica.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC13125e) it.next()).appmetrica(c5401e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [eٍٔؓ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [eٌّؒ, eٔؐۜ] */
    /* JADX WARN: Type inference failed for: r3v30, types: [byte[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r7v12, types: [eٌّؒ, eٔؐۜ] */
    /* JADX WARN: Type inference failed for: r9v15, types: [eؕۖۨ, java.lang.Object] */
    @Override // defpackage.InterfaceC13125e
    public final AbstractC3317e license(C1962e c1962e) {
        Uri uri;
        boolean z;
        byte b;
        byte b2;
        byte b3;
        C16914e c16914e;
        long j;
        Uri uri2;
        String str;
        C10384e c10384e;
        String str2;
        Object obj;
        C16914e c16914e2;
        Object obj2;
        C3560e c3560e;
        C1962e c1962e2 = c1962e;
        c1962e2.vip.getClass();
        String scheme = c1962e2.vip.ad.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(c1962e2.vip.vip, "application/x-image-uri")) {
            long j2 = c1962e2.vip.startapp;
            String str3 = AbstractC9413e.ad;
            throw null;
        }
        C16914e c16914e3 = c1962e2.vip;
        int m2570throw = AbstractC9413e.m2570throw(c16914e3.ad, c16914e3.vip);
        if (c1962e2.vip.startapp != -9223372036854775807L) {
            InterfaceC6440e interfaceC6440e = this.ad.ad;
            if (interfaceC6440e instanceof C1969e) {
                C1969e c1969e = (C1969e) interfaceC6440e;
                synchronized (c1969e) {
                    c1969e.f5170e = 1;
                }
            }
            C10424e.ad(this.ad);
        }
        try {
            InterfaceC13125e vip = this.ad.vip(m2570throw);
            C9457e ad = c1962e2.metrica.ad();
            C15197e c15197e = c1962e2.metrica;
            if (c15197e.ad == -9223372036854775807L) {
                ad.ad = this.appmetrica;
            }
            if (c15197e.license == -3.4028235E38f) {
                ad.license = this.yandex;
            }
            if (c15197e.appmetrica == -3.4028235E38f) {
                ad.appmetrica = this.startapp;
            }
            if (c15197e.vip == -9223372036854775807L) {
                ad.vip = this.purchase;
            }
            if (c15197e.metrica == -9223372036854775807L) {
                ad.metrica = this.billing;
            }
            C15197e c15197e2 = new C15197e(ad);
            if (c15197e2.equals(c1962e2.metrica)) {
                uri = null;
                z = true;
                b = 0;
            } else {
                C3560e c3560e2 = new C3560e();
                List list = Collections.EMPTY_LIST;
                AbstractC17475e abstractC17475e = C1410e.f4222e;
                C13325e c13325e = C13325e.license;
                C8437e c8437e = c1962e2.appmetrica;
                ?? obj3 = new Object();
                obj3.ad = c8437e.vip;
                obj3.vip = c8437e.license;
                obj3.metrica = c8437e.appmetrica;
                obj3.license = c8437e.purchase;
                obj3.appmetrica = c8437e.billing;
                obj3.purchase = c8437e.yandex;
                String str4 = c1962e2.ad;
                C12053e c12053e = c1962e2.license;
                c1962e2.metrica.ad();
                C13325e c13325e2 = c1962e2.purchase;
                C16914e c16914e4 = c1962e2.vip;
                if (c16914e4 != null) {
                    String str5 = c16914e4.purchase;
                    String str6 = c16914e4.vip;
                    Uri uri3 = c16914e4.ad;
                    list = c16914e4.appmetrica;
                    abstractC17475e = c16914e4.billing;
                    uri = null;
                    Object obj4 = c16914e4.yandex;
                    z = true;
                    C8369e c8369e = c16914e4.metrica;
                    if (c8369e != null) {
                        b = 0;
                        ?? obj5 = new Object();
                        obj2 = obj4;
                        obj5.license = c8369e.ad;
                        obj5.appmetrica = c8369e.vip;
                        obj5.purchase = c8369e.metrica;
                        obj5.ad = c8369e.license;
                        obj5.vip = c8369e.appmetrica;
                        obj5.metrica = c8369e.purchase;
                        obj5.billing = c8369e.billing;
                        obj5.yandex = c8369e.yandex;
                        c3560e = obj5;
                    } else {
                        obj2 = obj4;
                        b = 0;
                        c3560e = new C3560e();
                    }
                    C10384e c10384e2 = c16914e4.license;
                    j = c16914e4.startapp;
                    c10384e = c10384e2;
                    str = str6;
                    uri2 = uri3;
                    str2 = str5;
                    obj = obj2;
                    c3560e2 = c3560e;
                } else {
                    uri = null;
                    z = true;
                    b = 0;
                    j = -9223372036854775807L;
                    uri2 = null;
                    str = null;
                    c10384e = null;
                    str2 = null;
                    obj = null;
                }
                List list2 = list;
                AbstractC17475e abstractC17475e2 = abstractC17475e;
                C9457e ad2 = c15197e2.ad();
                AbstractC2301e.subscription((((Uri) c3560e2.appmetrica) == null || ((UUID) c3560e2.license) != null) ? z : b);
                if (uri2 != null) {
                    c16914e2 = new C16914e(uri2, str, ((UUID) c3560e2.license) != null ? new C8369e(c3560e2) : uri, c10384e, list2, str2, abstractC17475e2, obj, j);
                } else {
                    c16914e2 = uri;
                }
                if (str4 == null) {
                    str4 = BuildConfig.FLAVOR;
                }
                String str7 = str4;
                ?? c14435e = new C14435e(obj3);
                C15197e c15197e3 = new C15197e(ad2);
                if (c12053e == null) {
                    c12053e = C12053e.f24142throw;
                }
                c1962e2 = new C1962e(str7, c14435e, c16914e2, c15197e3, c12053e, c13325e2);
            }
            AbstractC3317e license = vip.license(c1962e2);
            AbstractC17475e abstractC17475e3 = c1962e2.vip.billing;
            if (abstractC17475e3.isEmpty()) {
                b2 = b;
            } else {
                AbstractC3317e[] abstractC3317eArr = new AbstractC3317e[abstractC17475e3.size() + 1];
                abstractC3317eArr[b] = license;
                int i = b;
                while (i < abstractC17475e3.size()) {
                    if (this.adcel) {
                        C11445e c11445e = new C11445e();
                        c11445e.amazon = AbstractC8542e.amazon(((C15875e) abstractC17475e3.get(i)).vip);
                        c11445e.license = ((C15875e) abstractC17475e3.get(i)).metrica;
                        c11445e.appmetrica = ((C15875e) abstractC17475e3.get(i)).license;
                        c11445e.purchase = ((C15875e) abstractC17475e3.get(i)).appmetrica;
                        c11445e.vip = ((C15875e) abstractC17475e3.get(i)).purchase;
                        c11445e.ad = ((C15875e) abstractC17475e3.get(i)).billing;
                        C16975e c16975e = new C16975e(c11445e);
                        C11565e c11565e = new C11565e(this, c16975e, 17);
                        InterfaceC15169e interfaceC15169e = this.vip;
                        C2007e c2007e = new C2007e(3, c11565e);
                        C18478e c18478e = new C18478e(13);
                        C5401e c5401e = new C5401e(-1, 6, b);
                        if (this.metrica.mopub(c16975e)) {
                            C11445e ad3 = c16975e.ad();
                            ad3.amazon = AbstractC8542e.amazon("application/x-media3-cues");
                            ad3.adcel = c16975e.loadAd;
                            ad3.f23025throw = this.metrica.inmobi(c16975e);
                            c16975e = new C16975e(ad3);
                        }
                        C16975e c16975e2 = c16975e;
                        C5401e c5401e2 = this.license;
                        C5401e c5401e3 = c5401e2 != null ? c5401e2 : c5401e;
                        int i2 = i + 1;
                        String uri4 = ((C15875e) abstractC17475e3.get(i)).ad.toString();
                        C9466e c9466e = new C9466e();
                        C3560e c3560e3 = new C3560e();
                        List list3 = Collections.EMPTY_LIST;
                        C1410e c1410e = C1410e.f4222e;
                        C9457e c9457e = new C9457e();
                        C13325e c13325e3 = C13325e.license;
                        Uri parse = uri4 == null ? uri : Uri.parse(uri4);
                        AbstractC2301e.subscription((((Uri) c3560e3.appmetrica) == null || ((UUID) c3560e3.license) != null) ? z : false);
                        if (parse != null) {
                            c16914e = new C16914e(parse, null, ((UUID) c3560e3.license) != null ? new C8369e(c3560e3) : uri, null, list3, null, c1410e, null, -9223372036854775807L);
                        } else {
                            c16914e = uri;
                        }
                        C1962e c1962e3 = new C1962e(BuildConfig.FLAVOR, new C14435e(c9466e), c16914e, new C15197e(c9457e), C12053e.f24142throw, c13325e3);
                        c16914e.getClass();
                        abstractC3317eArr[i2] = new C9841e(c1962e3, interfaceC15169e, c2007e, c18478e.m4546interface(c1962e3), c5401e3, 1048576, c16975e2);
                        b3 = 0;
                    } else {
                        InterfaceC15169e interfaceC15169e2 = this.vip;
                        interfaceC15169e2.getClass();
                        b3 = 0;
                        C5401e c5401e4 = new C5401e(-1, 6, (byte) 0);
                        C5401e c5401e5 = this.license;
                        if (c5401e5 != null) {
                            c5401e4 = c5401e5;
                        }
                        abstractC3317eArr[i + 1] = new C8669e((C15875e) abstractC17475e3.get(i), interfaceC15169e2, c5401e4);
                    }
                    i++;
                    b = b3;
                }
                b2 = b;
                license = new C17916e(abstractC3317eArr);
            }
            C8437e c8437e2 = c1962e2.appmetrica;
            if (c8437e2.vip != 0 || c8437e2.license != Long.MIN_VALUE || c8437e2.purchase) {
                C9362e c9362e = new C9362e(license);
                long j3 = c8437e2.vip;
                boolean z2 = b2;
                if (j3 >= 0) {
                    z2 = z;
                }
                AbstractC2301e.billing(z2);
                AbstractC2301e.subscription(!c9362e.yandex);
                c9362e.vip = j3;
                long j4 = c8437e2.license;
                AbstractC2301e.subscription(!c9362e.yandex);
                c9362e.metrica = j4;
                boolean z3 = !c8437e2.billing;
                AbstractC2301e.subscription(!c9362e.yandex);
                c9362e.license = z3;
                boolean z4 = c8437e2.appmetrica;
                AbstractC2301e.subscription(!c9362e.yandex);
                c9362e.appmetrica = z4;
                boolean z5 = c8437e2.purchase;
                AbstractC2301e.subscription(!c9362e.yandex);
                c9362e.purchase = z5;
                boolean z6 = c8437e2.yandex;
                AbstractC2301e.subscription(!c9362e.yandex);
                c9362e.billing = z6;
                AbstractC2301e.subscription(!c9362e.yandex);
                c9362e.yandex = z;
                license = new C13600e(c9362e);
            }
            c1962e2.vip.getClass();
            if (c1962e2.vip.license == null) {
                return license;
            }
            AbstractC2803e.smaato("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return license;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.InterfaceC13125e
    public final InterfaceC13125e metrica(boolean z) {
        this.adcel = z;
        C10424e c10424e = this.ad;
        c10424e.appmetrica = z;
        c10424e.ad.startapp(z);
        Iterator it = c10424e.metrica.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC13125e) it.next()).metrica(z);
        }
        return this;
    }

    @Override // defpackage.InterfaceC13125e
    public final InterfaceC13125e vip(int i) {
        C10424e c10424e = this.ad;
        c10424e.billing = i;
        c10424e.ad.vip(i);
        return this;
    }
}
