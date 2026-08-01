package defpackage;

import android.os.Bundle;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import org.json.JSONObject;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11047e implements InterfaceC15524e, InterfaceC11623e, InterfaceC13021e, InterfaceC0774e, InterfaceC11962e, InterfaceC16794e, InterfaceC6428e, InterfaceC2872e, InterfaceC18295e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ int f21901e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static C12024e f21920e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21923e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C11047e f21909e = new C11047e(1);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C11047e f21904e = new C11047e(2);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C11047e f21917e = new C11047e(3);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C11047e f21921e = new C11047e(6);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C11047e f21913e = new C11047e(7);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C11047e f21919e = new C11047e(8);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C11047e f21905e = new C11047e(9);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C11047e f21914e = new C11047e(10);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C11047e f21903e = new C11047e(11);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C11047e f21902e = new C11047e(12);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C11047e f21907e = new C11047e(13);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C11047e f21911e = new C11047e(14);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C11047e f21912e = new C11047e(15);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C11047e f21910e = new C11047e(16);

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C11047e f21908e = new C11047e(17);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C11047e f21916e = new C11047e(18);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final C11047e f21922e = new C11047e(19);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C11047e f21906e = new C11047e(20);

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final C11047e f21915e = new C11047e(21);

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static final /* synthetic */ C11047e f21918e = new C11047e(22);

    public /* synthetic */ C11047e(int i) {
        this.f21923e = i;
    }

    public C11047e(Set set) {
        this.f21923e = 0;
        new HashMap();
        new HashMap();
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw AbstractC5087e.m1747goto(it);
        }
    }

    public static C11078e Signature(C6571e[] c6571eArr, long j, long j2) {
        ArrayList arrayList = new ArrayList(c6571eArr.length);
        for (C6571e c6571e : c6571eArr) {
            arrayList.add(new C3618e(((C3618e) c6571e.f13543e).ad));
        }
        ArrayList arrayList2 = new ArrayList(c6571eArr.length);
        for (C6571e c6571e2 : c6571eArr) {
            arrayList2.add(Float.valueOf(((Number) c6571e2.f13544e).floatValue()));
        }
        return new C11078e(arrayList, arrayList2, j, j2, 0);
    }

    public static InterfaceC5052e admob(C12816e c12816e, AbstractC13270e abstractC13270e) {
        String str = C0696e.ad;
        C11709e c11709e = (C11709e) C0696e.yandex.get(c12816e.ad);
        if (c11709e != null) {
            return abstractC13270e.adcel(c11709e.ad());
        }
        return null;
    }

    public static C13827e advert(C9821e c9821e) {
        return new C13827e(System.currentTimeMillis() + 3600000, new C5401e(8, 16, (byte) 0), new C10233e(2, true, false, false), 10.0d, 1.2d, 60);
    }

    public static C11078e amazon(List list) {
        return new C11078e(list, null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), 0);
    }

    public static final int license(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 31) + Character.toLowerCase(str.charAt(i2));
        }
        return i;
    }

    public static C11078e loadAd(C6571e[] c6571eArr) {
        return Signature((C6571e[]) Arrays.copyOf(c6571eArr, c6571eArr.length), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (4294967295L & Float.floatToRawIntBits(0.0f)));
    }

    public static C11078e pro(C6571e[] c6571eArr) {
        return Signature((C6571e[]) Arrays.copyOf(c6571eArr, c6571eArr.length), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(Float.POSITIVE_INFINITY)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v4, types: [eٍۖۥ] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final Object startapp(String str, File file, Function2 function2, CancellationSignal cancellationSignal, C2785e c2785e) {
        Throwable th;
        Throwable th2;
        Long l;
        file.delete();
        ?? r6 = 0;
        Throwable th3 = null;
        if (!AbstractC5304e.inmobi(str, ".mp3", false)) {
            C15420e c15420e = AbstractC6731e.ad;
            Object advert = AbstractC5336e.advert(ExecutorC3603e.f8134e, new C8857e(str, file, function2, (InterfaceC5083e) r6, 23), c2785e);
            return advert == EnumC2821e.f6782e ? advert : Unit.INSTANCE;
        }
        if (AbstractC6507e.pro(str, "/data/", false)) {
            C18511e c18511e = AbstractC11062e.f21949e;
            String str2 = C10675e.f21023e;
            ?? c9674e = new C9674e(c18511e.mo1914break(C10215e.license(file.toString(), false), false));
            try {
                C13197e c13197e = new C13197e(c18511e.mo1918implements(C10215e.license(str, false)));
                try {
                    l = Long.valueOf(c9674e.mo2629class(c13197e));
                    try {
                        c13197e.close();
                        th2 = null;
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                } catch (Throwable th5) {
                    try {
                        c13197e.close();
                    } catch (Throwable th6) {
                        AbstractC13362e.license(th5, th6);
                    }
                    th2 = th5;
                    l = null;
                }
            } catch (Throwable th7) {
                th3 = th7;
                try {
                    c9674e.close();
                } catch (Throwable th8) {
                    AbstractC13362e.license(th3, th8);
                }
            }
            if (th2 != null) {
                throw th2;
            }
            l.getClass();
            try {
                c9674e.close();
            } catch (Throwable th9) {
                th3 = th9;
            }
            if (th3 != null) {
                throw th3;
            }
        } else {
            C9674e c9674e2 = new C9674e(AbstractC8636e.license(file));
            try {
                VKXApplication.Companion companion = VKXApplication.f36531e;
                C1343e ad = AbstractC12918e.ad();
                C18464e c18464e = new C18464e(23);
                c18464e.m4486e(str);
                AbstractC12834e abstractC12834e = ad.vip(new C8650e(c18464e)).purchase().f21945e;
                if (abstractC12834e != null) {
                    try {
                        float license = (float) abstractC12834e.license();
                        InterfaceC4895e mo1012e = abstractC12834e.mo1012e();
                        long j = 0;
                        while (true) {
                            if (!cancellationSignal.isCanceled()) {
                                long signatures = mo1012e.signatures(c9674e2.f19172e, 8192L);
                                if (signatures == -1) {
                                    break;
                                }
                                j += signatures;
                                c9674e2.ad();
                                if (function2 != null) {
                                    function2.invoke(Integer.valueOf((int) (((Number) AbstractC3062e.purchase(Float.valueOf(((float) j) / license), new C3721e(0.0f, 1.0f))).floatValue() * 100)), 100);
                                }
                            } else {
                                file.delete();
                                break;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        try {
                            abstractC12834e.close();
                            th = null;
                        } catch (Throwable th10) {
                            th = th10;
                        }
                    } catch (Throwable th11) {
                        try {
                            abstractC12834e.close();
                        } catch (Throwable th12) {
                            AbstractC13362e.license(th11, th12);
                        }
                        th = th11;
                    }
                    if (th != null) {
                        throw th;
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                try {
                    c9674e2.close();
                } catch (Throwable th13) {
                    r6 = th13;
                }
            } catch (Throwable th14) {
                try {
                    c9674e2.close();
                } catch (Throwable th15) {
                    AbstractC13362e.license(th14, th15);
                }
                r6 = th14;
            }
            if (r6 != 0) {
                throw r6;
            }
        }
        return Unit.INSTANCE;
    }

    public static C11078e subscription(float f, int i, List list) {
        return new C11078e(list, null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f) & 4294967295L), 0);
    }

    @Override // defpackage.InterfaceC11623e
    public Map ad(C18217e c18217e) {
        return C9139e.f18290e;
    }

    @Override // defpackage.InterfaceC15524e
    public Object adcel(C5033e c5033e, ClassLoader classLoader, ArrayList arrayList, InterfaceC5083e interfaceC5083e) {
        ArrayList arrayList2 = new ArrayList();
        Object advert = AbstractC5336e.advert(c5033e.f10724e.mo394const(new C14821e(c5033e, arrayList2)).mo394const(AbstractC6731e.ad.mo685static(1)), new C3472e(arrayList, c5033e, arrayList2, classLoader, (InterfaceC5083e) null, 2), interfaceC5083e);
        return advert == EnumC2821e.f6782e ? advert : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC6428e
    public float appmetrica() {
        return 0;
    }

    @Override // defpackage.InterfaceC6428e
    public void billing(InterfaceC14388e interfaceC14388e, int i, int[] iArr, int[] iArr2) {
        AbstractC16497e.metrica(i, iArr, iArr2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC0774e
    /* renamed from: eؒۖۗ */
    public void mo400e(C9398e c9398e, AbstractC7185e abstractC7185e) {
        switch (this.f21923e) {
            case 9:
                c9398e.f18713e.mopub(C13886e.f27535e, new C12358e((Function4) abstractC7185e, false, null, 7));
                return;
            default:
                c9398e.f18712e.mopub(C13886e.f27538e, new C1053e((Function5) abstractC7185e, (InterfaceC5083e) null, 12));
                return;
        }
    }

    @Override // defpackage.InterfaceC16794e
    public C0560e isVip(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = C5916e.yandex;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? AbstractC1749e.appmetrica(bundle) : AbstractC1749e.appmetrica(null);
    }

    @Override // defpackage.InterfaceC13021e
    public Object metrica(InputStream inputStream) {
        byte[] bArr;
        switch (this.f21923e) {
            case 8:
                try {
                    C16949e Signature = C16949e.Signature(inputStream);
                    C0044e c0044e = new C0044e(false);
                    AbstractC17986e[] abstractC17986eArr = (AbstractC17986e[]) Arrays.copyOf(new AbstractC17986e[0], 0);
                    c0044e.vip();
                    if (abstractC17986eArr.length > 0) {
                        AbstractC17986e abstractC17986e = abstractC17986eArr[0];
                        throw null;
                    }
                    for (Map.Entry entry : Signature.amazon().entrySet()) {
                        String str = (String) entry.getKey();
                        C16388e c16388e = (C16388e) entry.getValue();
                        int crashlytics = c16388e.crashlytics();
                        switch (crashlytics == 0 ? -1 : AbstractC1579e.ad[AbstractC8703e.m2467class(crashlytics)]) {
                            case -1:
                                throw new IOException("Value case is null.", null);
                            case 0:
                            default:
                                throw new C14803e(10);
                            case 1:
                                c0044e.license(new C11951e(str), Boolean.valueOf(c16388e.signatures()));
                                break;
                            case 2:
                                c0044e.license(new C11951e(str), Float.valueOf(c16388e.isPro()));
                                break;
                            case 3:
                                c0044e.license(new C11951e(str), Double.valueOf(c16388e.inmobi()));
                                break;
                            case 4:
                                c0044e.license(new C11951e(str), Integer.valueOf(c16388e.applovin()));
                                break;
                            case 5:
                                c0044e.license(new C11951e(str), Long.valueOf(c16388e.ads()));
                                break;
                            case 6:
                                c0044e.license(new C11951e(str), c16388e.premium());
                                break;
                            case 7:
                                c0044e.license(new C11951e(str), AbstractC13480e.m3582e(c16388e.subs().loadAd()));
                                break;
                            case 8:
                                C11951e c11951e = new C11951e(str);
                                C6283e tapsense = c16388e.tapsense();
                                int size = tapsense.size();
                                if (size == 0) {
                                    bArr = AbstractC2930e.vip;
                                } else {
                                    byte[] bArr2 = new byte[size];
                                    tapsense.startapp(size, bArr2);
                                    bArr = bArr2;
                                }
                                c0044e.license(c11951e, bArr);
                                break;
                            case 9:
                                throw new IOException("Value not set.", null);
                        }
                    }
                    return c0044e.purchase();
                } catch (C11690e e) {
                    throw new IOException("Unable to parse preferences proto.", e);
                }
            default:
                try {
                    return (C12761e) C12761e.f25530e.license(inputStream);
                } catch (ProtocolException unused) {
                    throw new IOException("Widget DataStore Proto was corrupted!", null);
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mopub(ua.itaysonlab.vkapi2.objects.music.AudioTrack r6, defpackage.AbstractC10731e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C6033e
            if (r0 == 0) goto L13
            r0 = r7
            eؘۤۨ r0 = (defpackage.C6033e) r0
            int r1 = r0.f12704e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12704e = r1
            goto L18
        L13:
            eؘۤۨ r0 = new eؘۤۨ
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f12703e
            int r1 = r0.f12704e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r7)
            goto L5e
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            defpackage.AbstractC2003e.purchase(r7)
            eِ۟ۢ r7 = defpackage.C11047e.f21920e
            if (r7 != 0) goto L41
            eِ۟ۢ r7 = new eِ۟ۢ
            eؚٙۙ r1 = new eؚٙۙ
            r3 = 4
            r1.<init>(r3)
            r7.<init>(r1)
            defpackage.C11047e.f21920e = r7
        L41:
            eِ۟ۢ r7 = defpackage.C11047e.f21920e
            if (r7 == 0) goto L65
            java.lang.String r6 = r6.adcel
            r0.f12704e = r2
            eّٕٓ r1 = defpackage.AbstractC6731e.ad
            eؕۙۜ r1 = defpackage.ExecutorC3603e.f8134e
            eٌٞٞ r2 = new eٌٞٞ
            r3 = 22
            r4 = 0
            r2.<init>(r7, r6, r4, r3)
            java.lang.Object r7 = defpackage.AbstractC5336e.advert(r1, r2, r0)
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r7 != r6) goto L5e
            return r6
        L5e:
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r7.intValue()
            goto L66
        L65:
            r6 = 0
        L66:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11047e.mopub(ua.itaysonlab.vkapi2.objects.music.AudioTrack, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC13021e
    public Unit purchase(OutputStream outputStream, Object obj) {
        AbstractC18270e ad;
        switch (this.f21923e) {
            case 8:
                Map ad2 = ((C0044e) obj).ad();
                C14016e loadAd = C16949e.loadAd();
                for (Map.Entry entry : ad2.entrySet()) {
                    C11951e c11951e = (C11951e) entry.getKey();
                    Object value = entry.getValue();
                    String str = c11951e.ad;
                    if (value instanceof Boolean) {
                        C8426e firebase = C16388e.firebase();
                        boolean booleanValue = ((Boolean) value).booleanValue();
                        firebase.metrica();
                        C16388e.subscription((C16388e) firebase.f25385e, booleanValue);
                        ad = firebase.ad();
                    } else if (value instanceof Float) {
                        C8426e firebase2 = C16388e.firebase();
                        float floatValue = ((Number) value).floatValue();
                        firebase2.metrica();
                        C16388e.remoteconfig((C16388e) firebase2.f25385e, floatValue);
                        ad = firebase2.ad();
                    } else if (value instanceof Double) {
                        C8426e firebase3 = C16388e.firebase();
                        double doubleValue = ((Number) value).doubleValue();
                        firebase3.metrica();
                        C16388e.Signature((C16388e) firebase3.f25385e, doubleValue);
                        ad = firebase3.ad();
                    } else if (value instanceof Integer) {
                        C8426e firebase4 = C16388e.firebase();
                        int intValue = ((Number) value).intValue();
                        firebase4.metrica();
                        C16388e.pro((C16388e) firebase4.f25385e, intValue);
                        ad = firebase4.ad();
                    } else if (value instanceof Long) {
                        C8426e firebase5 = C16388e.firebase();
                        long longValue = ((Number) value).longValue();
                        firebase5.metrica();
                        C16388e.smaato((C16388e) firebase5.f25385e, longValue);
                        ad = firebase5.ad();
                    } else if (value instanceof String) {
                        C8426e firebase6 = C16388e.firebase();
                        firebase6.metrica();
                        C16388e.amazon((C16388e) firebase6.f25385e, (String) value);
                        ad = firebase6.ad();
                    } else if (value instanceof Set) {
                        C8426e firebase7 = C16388e.firebase();
                        C16463e Signature = C6403e.Signature();
                        Signature.metrica();
                        C6403e.smaato((C6403e) Signature.f25385e, (Set) value);
                        firebase7.metrica();
                        C16388e.loadAd((C16388e) firebase7.f25385e, (C6403e) Signature.ad());
                        ad = firebase7.ad();
                    } else {
                        if (!(value instanceof byte[])) {
                            throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                        }
                        C8426e firebase8 = C16388e.firebase();
                        byte[] bArr = (byte[]) value;
                        C6283e yandex = C6283e.yandex(0, bArr.length, bArr);
                        firebase8.metrica();
                        C16388e.admob((C16388e) firebase8.f25385e, yandex);
                        ad = firebase8.ad();
                    }
                    loadAd.getClass();
                    str.getClass();
                    loadAd.metrica();
                    C16949e.smaato((C16949e) loadAd.f25385e).put(str, (C16388e) ad);
                }
                C16949e c16949e = (C16949e) loadAd.ad();
                int ad3 = c16949e.ad(null);
                Logger logger = C15997e.billing;
                if (ad3 > 4096) {
                    ad3 = 4096;
                }
                C15997e c15997e = new C15997e(outputStream, ad3);
                c16949e.advert(c15997e);
                if (c15997e.appmetrica > 0) {
                    c15997e.Signature();
                }
                return Unit.INSTANCE;
            default:
                C12761e.f25530e.yandex(outputStream, (C12761e) obj);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC18295e
    public C13827e remoteconfig(C9821e c9821e, JSONObject jSONObject) {
        return advert(c9821e);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0087 -> B:18:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object smaato(java.lang.String r7, java.io.File r8, kotlin.jvm.functions.Function2 r9, android.os.CancellationSignal r10, defpackage.AbstractC10731e r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.C2785e
            if (r0 == 0) goto L13
            r0 = r11
            eؔۖۤ r0 = (defpackage.C2785e) r0
            int r1 = r0.f6708e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6708e = r1
            goto L18
        L13:
            eؔۖۤ r0 = new eؔۖۤ
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.f6712e
            int r1 = r0.f6708e
            r2 = 1
            if (r1 == 0) goto L47
            if (r1 != r2) goto L3f
            int r7 = r0.f6710e
            int r8 = r0.f6714e
            int r9 = r0.f6711e
            android.os.CancellationSignal r10 = r0.f6715e
            kotlin.jvm.functions.Function2 r1 = r0.f6716e
            java.io.File r3 = r0.f6707e
            java.lang.String r4 = r0.f6713e
            defpackage.AbstractC2003e.purchase(r11)     // Catch: java.lang.Exception -> L33
            goto L83
        L33:
            r11 = move-exception
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r5
            r5 = r3
            r3 = r9
            r9 = r5
            r5 = r1
            r1 = r10
            r10 = r5
            goto L8d
        L3f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L47:
            defpackage.AbstractC2003e.purchase(r11)
            eِ۟ۢ r11 = defpackage.C11047e.f21920e
            if (r11 != 0) goto L5b
            eِ۟ۢ r11 = new eِ۟ۢ
            eؚٙۙ r1 = new eؚٙۙ
            r3 = 4
            r1.<init>(r3)
            r11.<init>(r1)
            defpackage.C11047e.f21920e = r11
        L5b:
            java.lang.Exception r11 = new java.lang.Exception
            java.lang.String r1 = "This should not be visible here!"
            r11.<init>(r1)
            r11 = 0
            r1 = 3
            r3 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r11
        L6a:
            r3.f6713e = r8     // Catch: java.lang.Exception -> L86
            r3.f6707e = r9     // Catch: java.lang.Exception -> L86
            r3.f6716e = r10     // Catch: java.lang.Exception -> L86
            r3.f6715e = r0     // Catch: java.lang.Exception -> L86
            r3.f6711e = r1     // Catch: java.lang.Exception -> L86
            r3.f6714e = r11     // Catch: java.lang.Exception -> L86
            r3.f6710e = r7     // Catch: java.lang.Exception -> L86
            r3.f6708e = r2     // Catch: java.lang.Exception -> L86
            java.lang.Object r7 = startapp(r8, r9, r10, r0, r3)     // Catch: java.lang.Exception -> L86
            eٟؔۙ r8 = defpackage.EnumC2821e.f6782e
            if (r7 != r8) goto L83
            return r8
        L83:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L86:
            r4 = move-exception
            r5 = r0
            r0 = r11
            r11 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L8d:
            r11.printStackTrace()
            if (r7 == r3) goto L99
            int r7 = r7 + 1
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L6a
        L99:
            r11.printStackTrace()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11047e.smaato(java.lang.String, java.io.File, kotlin.jvm.functions.Function2, android.os.CancellationSignal, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0156  */
    @Override // defpackage.InterfaceC11962e
    /* renamed from: this */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo600this(defpackage.AbstractC16824e r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11047e.mo600this(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    public String toString() {
        switch (this.f21923e) {
            case 23:
                return "Arrangement#Bottom";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC13021e
    public Object vip() {
        switch (this.f21923e) {
            case 8:
                return new C0044e(true);
            default:
                return (C12761e) AbstractC5336e.yandex(C2693e.f6576e, new C12559e(2, 12, null));
        }
    }

    @Override // defpackage.InterfaceC2872e
    public long yandex(long j, long j2) {
        float metrica = AbstractC5967e.metrica(j, j2);
        long floatToRawIntBits = (Float.floatToRawIntBits(metrica) << 32) | (4294967295L & Float.floatToRawIntBits(metrica));
        int i = AbstractC14770e.ad;
        return floatToRawIntBits;
    }
}
