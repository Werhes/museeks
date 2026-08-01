package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٝۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9616e implements InterfaceC8360e, InterfaceC10459e, InterfaceC8026e, InterfaceC10383e, InterfaceC11962e, InterfaceC17386e, InterfaceC6428e, InterfaceC11871e, InterfaceC6500e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19083e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C9616e f19071e = new C9616e(1);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C9616e f19067e = new C9616e(3);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C9616e f19078e = new C9616e(4);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C9616e f19064e = new C9616e(5);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C9616e f19081e = new C9616e(6);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C9616e f19080e = new C9616e(7);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C9616e f19075e = new C9616e(8);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C9616e f19079e = new C9616e(9);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C9616e f19068e = new C9616e(10);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C9616e f19076e = new C9616e(11);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C9616e f19066e = new C9616e(12);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C9616e f19065e = new C9616e(13);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C9616e f19069e = new C9616e(14);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C9616e f19073e = new C9616e(15);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C9616e f19074e = new C9616e(17);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C9616e f19072e = new C9616e(18);

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C9616e f19070e = new C9616e(19);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C9616e f19077e = new C9616e(20);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final C9616e f19082e = new C9616e(21);

    public /* synthetic */ C9616e(int i) {
        this.f19083e = i;
    }

    public static C11709e Signature(C12816e c12816e) {
        return new C11709e(c12816e.vip(), c12816e.ad.billing());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [eْۨٝ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static AbstractC13656e adcel(C16113e c16113e, Object obj) {
        if (obj instanceof Byte) {
            return new C10037e(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C12062e(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C2144e(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C5065e(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new AbstractC13656e((Character) obj);
        }
        if (obj instanceof Float) {
            return new C2019e(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C2019e(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C2019e((Boolean) obj);
        }
        if (obj instanceof String) {
            return new AbstractC13656e((String) obj);
        }
        if (obj instanceof byte[]) {
            return startapp(AbstractC1660e.m663break((byte[]) obj), c16113e, EnumC3702e.BYTE);
        }
        boolean z = obj instanceof short[];
        ?? r1 = C13664e.f27089e;
        int i = 0;
        if (z) {
            short[] sArr = (short[]) obj;
            int length = sArr.length;
            if (length != 0) {
                if (length != 1) {
                    r1 = new ArrayList(sArr.length);
                    int length2 = sArr.length;
                    while (i < length2) {
                        r1.add(Short.valueOf(sArr[i]));
                        i++;
                    }
                } else {
                    r1 = Collections.singletonList(Short.valueOf(sArr[0]));
                }
            }
            return startapp(r1, c16113e, EnumC3702e.SHORT);
        }
        if (obj instanceof int[]) {
            return startapp(AbstractC1660e.m667default((int[]) obj), c16113e, EnumC3702e.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    r1 = new ArrayList(jArr.length);
                    int length4 = jArr.length;
                    while (i < length4) {
                        r1.add(Long.valueOf(jArr[i]));
                        i++;
                    }
                } else {
                    r1 = Collections.singletonList(Long.valueOf(jArr[0]));
                }
            }
            return startapp(r1, c16113e, EnumC3702e.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length5 = cArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    r1 = new ArrayList(cArr.length);
                    int length6 = cArr.length;
                    while (i < length6) {
                        r1.add(Character.valueOf(cArr[i]));
                        i++;
                    }
                } else {
                    r1 = Collections.singletonList(Character.valueOf(cArr[0]));
                }
            }
            return startapp(r1, c16113e, EnumC3702e.CHAR);
        }
        if (obj instanceof float[]) {
            return startapp(AbstractC1660e.m662abstract((float[]) obj), c16113e, EnumC3702e.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length7 = dArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    r1 = new ArrayList(dArr.length);
                    int length8 = dArr.length;
                    while (i < length8) {
                        r1.add(Double.valueOf(dArr[i]));
                        i++;
                    }
                } else {
                    r1 = Collections.singletonList(Double.valueOf(dArr[0]));
                }
            }
            return startapp(r1, c16113e, EnumC3702e.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new AbstractC13656e(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        int length9 = zArr.length;
        if (length9 != 0) {
            if (length9 != 1) {
                r1 = new ArrayList(zArr.length);
                int length10 = zArr.length;
                while (i < length10) {
                    r1.add(Boolean.valueOf(zArr[i]));
                    i++;
                }
            } else {
                r1 = Collections.singletonList(Boolean.valueOf(zArr[0]));
            }
        }
        return startapp(r1, c16113e, EnumC3702e.BOOLEAN);
    }

    public static C11709e advert(String str, boolean z) {
        String subscription;
        int m1865interface = AbstractC5304e.m1865interface(str, '`', 0, 6);
        if (m1865interface == -1) {
            m1865interface = str.length();
        }
        int m1878throw = AbstractC5304e.m1878throw(m1865interface, 4, str, "/");
        String str2 = BuildConfig.FLAVOR;
        if (m1878throw == -1) {
            subscription = AbstractC6507e.subscription(str, "`", BuildConfig.FLAVOR, false);
        } else {
            String replace = str.substring(0, m1878throw).replace('/', '.');
            subscription = AbstractC6507e.subscription(str.substring(m1878throw + 1), "`", BuildConfig.FLAVOR, false);
            str2 = replace;
        }
        return new C11709e(new C12816e(str2), new C12816e(subscription), z);
    }

    public static boolean remoteconfig(int i, C11226e c11226e, Object obj) {
        AbstractC3513e abstractC3513e = (AbstractC3513e) c11226e.appmetrica;
        int i2 = c11226e.vip;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c11226e.m3089e(0);
            ((C2370e) obj).license(i3 << 3, Long.valueOf(abstractC3513e.mo621abstract()));
            return true;
        }
        if (i4 == 1) {
            c11226e.m3089e(1);
            ((C2370e) obj).license((i3 << 3) | 1, Long.valueOf(abstractC3513e.mo634implements()));
            return true;
        }
        if (i4 == 2) {
            ((C2370e) obj).license((i3 << 3) | 2, c11226e.m3096e());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new IOException("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw new C15259e();
            }
            c11226e.m3089e(5);
            ((C2370e) obj).license(5 | (i3 << 3), Integer.valueOf(abstractC3513e.mo623case()));
            return true;
        }
        C2370e ad = C2370e.ad();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c11226e.m3099e() != Integer.MAX_VALUE && remoteconfig(i6, c11226e, ad)) {
        }
        if ((i5 | 4) != c11226e.vip) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
        if (ad.appmetrica) {
            ad.appmetrica = false;
        }
        ((C2370e) obj).license(i5 | 3, ad);
        return true;
    }

    public static C16938e startapp(List list, InterfaceC5334e interfaceC5334e, EnumC3702e enumC3702e) {
        List m3575continue = AbstractC13480e.m3575continue(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = m3575continue.iterator();
        while (it.hasNext()) {
            AbstractC13656e adcel = adcel(null, it.next());
            if (adcel != null) {
                arrayList.add(adcel);
            }
        }
        return interfaceC5334e != null ? new C7270e(arrayList, interfaceC5334e.amazon().admob(enumC3702e)) : new C16938e(arrayList, new C17877e(12, enumC3702e));
    }

    public static /* bridge */ C2370e subscription(Object obj) {
        AbstractC15319e abstractC15319e = (AbstractC15319e) obj;
        C2370e c2370e = abstractC15319e.zzc;
        if (c2370e != C2370e.purchase) {
            return c2370e;
        }
        C2370e ad = C2370e.ad();
        abstractC15319e.zzc = ad;
        return ad;
    }

    @Override // defpackage.InterfaceC11871e
    public byte[] ad(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object admob(defpackage.C1343e r6, java.lang.String r7, defpackage.AbstractC10731e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.C1454e
            if (r0 == 0) goto L13
            r0 = r8
            eؒۥٜ r0 = (defpackage.C1454e) r0
            int r1 = r0.f4289e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4289e = r1
            goto L18
        L13:
            eؒۥٜ r0 = new eؒۥٜ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f4288e
            int r1 = r0.f4289e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r8)     // Catch: java.lang.Exception -> L4c
            goto L46
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            defpackage.AbstractC2003e.purchase(r8)
            eّٕٓ r8 = defpackage.AbstractC6731e.ad     // Catch: java.lang.Exception -> L4c
            eؕۙۜ r8 = defpackage.ExecutorC3603e.f8134e     // Catch: java.lang.Exception -> L4c
            eًۜۙ r1 = new eًۜۙ     // Catch: java.lang.Exception -> L4c
            r3 = 2
            r4 = 0
            r1.<init>(r6, r7, r4, r3)     // Catch: java.lang.Exception -> L4c
            r0.f4289e = r2     // Catch: java.lang.Exception -> L4c
            java.lang.Object r8 = defpackage.AbstractC5336e.advert(r8, r1, r0)     // Catch: java.lang.Exception -> L4c
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r8 != r6) goto L46
            return r6
        L46:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Exception -> L4c
            r8.getClass()     // Catch: java.lang.Exception -> L4c
            return r8
        L4c:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9616e.admob(eؒۜۖ, java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007f -> B:10:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable amazon(android.content.Context r10, defpackage.AbstractC10731e r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.C15266e
            if (r0 == 0) goto L13
            r0 = r11
            eٕؗۘ r0 = (defpackage.C15266e) r0
            int r1 = r0.f30192e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30192e = r1
            goto L18
        L13:
            eٕؗۘ r0 = new eٕؗۘ
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f30193e
            int r1 = r0.f30192e
            r2 = 10
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 != r3) goto L3b
            int r10 = r0.f30197e
            int r1 = r0.f30194e
            java.util.Collection r4 = r0.f30198e
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r0.f30199e
            java.util.Collection r6 = r0.f30191e
            java.util.Collection r6 = (java.util.Collection) r6
            android.content.Context r7 = r0.f30196e
            defpackage.AbstractC2003e.purchase(r11)
            r8 = r5
            r5 = r10
            r10 = r7
            r7 = r8
            goto L84
        L3b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L43:
            defpackage.AbstractC2003e.purchase(r11)
            java.util.List r11 = defpackage.AbstractC14196e.ad
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = defpackage.AbstractC0746e.subscription(r11, r2)
            r1.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
            r4 = 0
            r5 = r11
            r11 = r1
            r1 = r4
        L59:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r5.next()
            eٍ٘ؐ r6 = (defpackage.AbstractC17646e) r6
            r0.f30196e = r10
            r7 = r11
            java.util.Collection r7 = (java.util.Collection) r7
            r0.f30191e = r7
            r0.f30199e = r5
            r0.f30198e = r7
            r0.f30194e = r1
            r0.f30197e = r4
            r0.f30192e = r3
            java.lang.Object r6 = r6.ad(r10, r0)
            eٟؔۙ r7 = defpackage.EnumC2821e.f6782e
            if (r6 != r7) goto L7f
            return r7
        L7f:
            r7 = r5
            r5 = r4
            r4 = r11
            r11 = r6
            r6 = r4
        L84:
            eؕؗٓ r11 = (defpackage.AbstractC3151e) r11
            r4.add(r11)
            r4 = r5
            r11 = r6
            r5 = r7
            goto L59
        L8d:
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r11.iterator()
        L98:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r11.next()
            boolean r1 = r0 instanceof defpackage.C5648e
            if (r1 == 0) goto L98
            r10.add(r0)
            goto L98
        Laa:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = defpackage.AbstractC0746e.subscription(r10, r2)
            r11.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        Lb7:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lc9
            java.lang.Object r0 = r10.next()
            eؘٕ٘ r0 = (defpackage.C5648e) r0
            eؚْۡ r0 = r0.ad
            r11.add(r0)
            goto Lb7
        Lc9:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9616e.amazon(android.content.Context, eُؑ۠):java.io.Serializable");
    }

    @Override // defpackage.InterfaceC6428e
    public float appmetrica() {
        return 0;
    }

    @Override // defpackage.InterfaceC6428e
    public void billing(InterfaceC14388e interfaceC14388e, int i, int[] iArr, int[] iArr2) {
        AbstractC16497e.vip(iArr, iArr2, false);
    }

    @Override // defpackage.InterfaceC10383e
    public InterfaceC16046e license(C0317e c0317e) {
        return null;
    }

    public boolean loadAd(C16975e c16975e) {
        String str = c16975e.loadAd;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // defpackage.InterfaceC8026e
    public float metrica(float f) {
        double d = f;
        return (float) (d <= 0.04045d ? d / 12.92d : AbstractC0865e.billing((d + 0.055d) / 1.055d, 2.4d));
    }

    public AbstractC9743e mopub(C16975e c16975e) {
        String str = c16975e.loadAd;
        if (str != null) {
            int i = 1;
            int i2 = 0;
            char c = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new C14757e(i2);
                case 1:
                    return new C9818e();
                case 2:
                    return new C7931e(null);
                case 3:
                    return new C14757e(i);
                case 4:
                    return new C3137e();
            }
        }
        throw new IllegalArgumentException(AbstractC17861e.Signature("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override // defpackage.InterfaceC8026e
    public float purchase(float f) {
        double d = f;
        return (float) (d <= 0.0031308d ? d * 12.92d : (AbstractC0865e.billing(d, 0.4166666666666667d) * 1.055d) - 0.055d);
    }

    @Override // defpackage.InterfaceC10459e
    public String signatures() {
        return "expected an Int value";
    }

    @Override // defpackage.InterfaceC17386e
    public boolean smaato(MenuC8939e menuC8939e) {
        return false;
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
    @Override // defpackage.InterfaceC11962e
    /* renamed from: this */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo600this(defpackage.AbstractC16824e r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9616e.mo600this(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    public String toString() {
        switch (this.f19083e) {
            case 1:
                return "<unknown>";
            case 23:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC17386e
    public void vip(MenuC8939e menuC8939e, boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r7 == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        if (r7 == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Enum yandex(defpackage.C1343e r6, defpackage.AbstractC10731e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C6998e
            if (r0 == 0) goto L13
            r0 = r7
            eؚؚٓ r0 = (defpackage.C6998e) r0
            int r1 = r0.f14331e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14331e = r1
            goto L18
        L13:
            eؚؚٓ r0 = new eؚؚٓ
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f14329e
            int r1 = r0.f14331e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            eؒۜۖ r6 = r0.f14330e
            defpackage.AbstractC2003e.purchase(r7)
            goto L48
        L38:
            defpackage.AbstractC2003e.purchase(r7)
            r0.f14330e = r6
            r0.f14331e = r3
            java.lang.String r7 = "https://api.vk.com/ping.txt"
            java.lang.Object r7 = r5.admob(r6, r7, r0)
            if (r7 != r4) goto L48
            goto L60
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L53
            eؙۖۧ r6 = defpackage.EnumC6583e.f13586e
            return r6
        L53:
            r7 = 0
            r0.f14330e = r7
            r0.f14331e = r2
            java.lang.String r7 = "https://api.vk.ru/ping.txt"
            java.lang.Object r7 = r5.admob(r6, r7, r0)
            if (r7 != r4) goto L61
        L60:
            return r4
        L61:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L6c
            eؙۖۧ r6 = defpackage.EnumC6583e.f13584e
            return r6
        L6c:
            eؙۖۧ r6 = defpackage.EnumC6583e.f13583e
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9616e.yandex(eؒۜۖ, eُؑ۠):java.lang.Enum");
    }
}
