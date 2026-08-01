package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1660e {
    public static final C2892e ad = new C2892e(-1587833283, false, new C11402e(21));
    public static final C2892e vip = new C2892e(-436338112, false, new C11402e(22));
    public static final C2892e metrica = new C2892e(1379149377, false, new C11402e(23));
    public static final C2892e license = new C2892e(-492380849, false, new C16627e(24));

    public static void Signature(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, i, i2);
    }

    /* renamed from: abstract, reason: not valid java name */
    public static List m662abstract(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return C13664e.f27089e;
        }
        if (length == 1) {
            return Collections.singletonList(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static final void ad(String str, String str2, String str3, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        C2892e c2892e;
        c13770e.m3671package(1438658080);
        int i2 = i | (c13770e.purchase(str) ? 4 : 2) | (c13770e.purchase(str2) ? 32 : 16) | (c13770e.purchase(str3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.purchase(interfaceC12864e) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            if (str3.length() > 0) {
                c13770e.m3676strictfp(-415403458);
                c2892e = AbstractC16653e.license(-1530915169, new C11449e(str3, 12), c13770e);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(-415332035);
                c13770e.Signature(false);
                c2892e = null;
            }
            AbstractC16429e.ad(AbstractC16653e.license(-1280103298, new C11449e(str2, 13), c13770e), interfaceC12864e, null, c2892e, AbstractC16653e.license(1613058434, new C11449e(str, 14), c13770e), null, null, 0.0f, 0.0f, c13770e, ((i2 >> 6) & 112) | 24582, 484);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6409e(str, str2, str3, interfaceC12864e, i, 13);
        }
    }

    public static void adcel(int i, int i2, int i3, long[] jArr, long[] jArr2) {
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void admob(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static Object ads(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static void advert(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void amazon(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static Object applovin(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void appmetrica(final java.lang.String r33, final kotlin.jvm.functions.Function1 r34, kotlin.jvm.functions.Function0 r35, final defpackage.InterfaceC12864e r36, defpackage.C1839e r37, final defpackage.C2892e r38, final defpackage.C2892e r39, final defpackage.C2892e r40, defpackage.InterfaceC12123e r41, defpackage.C15274e r42, defpackage.C13770e r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1660e.appmetrica(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, eّۤۧ, eٕؓۧ, eؔ۟ٓ, eؔ۟ٓ, eؔ۟ٓ, eِۦۦ, eؘٕؕ, eٓؕۥ, int, int):void");
    }

    public static InterfaceC9093e billing(Object[] objArr) {
        return objArr.length == 0 ? C7671e.ad : new C1356e(0, objArr);
    }

    /* renamed from: break, reason: not valid java name */
    public static List m663break(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return C13664e.f27089e;
        }
        if (length == 1) {
            return Collections.singletonList(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    /* renamed from: case, reason: not valid java name */
    public static Set m664case(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C3295e.f7451e;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC10064e.appmetrica(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    /* renamed from: catch, reason: not valid java name */
    public static ArrayList m665catch(Object[] objArr, Object[] objArr2) {
        int min = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new C6571e(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    /* renamed from: class, reason: not valid java name */
    public static final void m666class(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function1 function1) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC17540e.vip(sb, obj, function1);
        }
        sb.append(charSequence3);
    }

    public static Object crashlytics(int i, Object[] objArr) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    /* renamed from: default, reason: not valid java name */
    public static List m667default(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return C13664e.f27089e;
        }
        if (length == 1) {
            return Collections.singletonList(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* renamed from: extends, reason: not valid java name */
    public static int m668extends(int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public static int firebase(Object obj, Object[] objArr) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: goto, reason: not valid java name */
    public static String m669goto(Object[] objArr, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? BuildConfig.FLAVOR : str2;
        String str6 = (i & 4) != 0 ? BuildConfig.FLAVOR : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb = new StringBuilder();
        m666class(objArr, sb, str4, str5, str6, function1);
        return sb.toString();
    }

    /* renamed from: implements, reason: not valid java name */
    public static List m670implements(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C4613e(objArr, false)) : Collections.singletonList(objArr[0]) : C13664e.f27089e;
    }

    public static void inmobi(Object obj, Object[] objArr) {
        Arrays.fill(objArr, 0, objArr.length, obj);
    }

    /* renamed from: interface, reason: not valid java name */
    public static String m671interface(byte[] bArr, String str, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        int i2 = i & 2;
        String str2 = BuildConfig.FLAVOR;
        String str3 = i2 != 0 ? BuildConfig.FLAVOR : "[";
        if ((i & 4) == 0) {
            str2 = "]";
        }
        int i3 = (i & 8) != 0 ? -1 : 32;
        if ((i & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str3);
        int i4 = 0;
        for (byte b : bArr) {
            i4++;
            if (i4 > 1) {
                sb.append((CharSequence) str);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            if (function1 != null) {
                sb.append((CharSequence) function1.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        if (i3 >= 0 && i4 > i3) {
            sb.append((CharSequence) "...");
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public static ArrayList isPro(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void isVip(long j, long[] jArr) {
        Arrays.fill(jArr, 0, jArr.length, j);
    }

    public static final void license(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(684127632);
        int i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        int i3 = 1;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
            long j = c13770e.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, C0115e.f1276e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            float f = AbstractC11992e.ad;
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC16429e.ad(AbstractC12681e.ad, interfaceC12864e, null, null, AbstractC12681e.vip, AbstractC12681e.metrica, AbstractC11992e.ad(0L, ((C7019e) c13770e.adcel(c15492e)).ad.ad, ((C7019e) c13770e.adcel(c15492e)).ad.ad, 0L, c13770e, 505), 0.0f, 0.0f, c13770e, ((i2 << 3) & 112) | 221190, 396);
            AbstractC8141e.vip(null, 0.0f, 0L, c13770e, 0, 7);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11491e(interfaceC12864e, i, i3);
        }
    }

    public static void loadAd(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    public static final void metrica(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1959430837);
        if (c13770e2.m3673protected(i & 1, (i & 3) != 2)) {
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11672e, c13770e2, 6);
            long j = c13770e2.f27286case;
            int i2 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i2), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, R.string.global_search), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
            c13770e2 = c13770e;
            AbstractC8141e.vip(null, 0.0f, 0L, c13770e2, 0, 7);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C11491e(interfaceC12864e, i, 0);
        }
    }

    public static void mopub(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* renamed from: native, reason: not valid java name */
    public static int m672native(Object obj, Object[] objArr) {
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؑۡ, eُۙۨ] */
    public static C15926e premium(int[] iArr) {
        return new C11241e(0, iArr.length - 1, 1);
    }

    public static Object[] pro(int i, int i2, Object[] objArr) {
        signatures(i2, objArr.length);
        return Arrays.copyOfRange(objArr, i, i2);
    }

    /* renamed from: protected, reason: not valid java name */
    public static final C6557e m673protected(InterfaceC2460e interfaceC2460e) {
        if (interfaceC2460e.isEmpty()) {
            C6557e.f13492e.getClass();
            return C6557e.f13491e;
        }
        C10312e c10312e = C6557e.f13492e;
        List singletonList = Collections.singletonList(new C11720e(interfaceC2460e));
        c10312e.getClass();
        return C10312e.amazon(singletonList);
    }

    public static final View purchase(AbstractC13616e abstractC13616e) {
        C9820e c9820e = AbstractC5851e.mopub(abstractC13616e.f27022e).f27596e;
        View interopView = c9820e != null ? c9820e.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static byte[] remoteconfig(int i, int i2, byte[] bArr) {
        signatures(i2, bArr.length);
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public static final void signatures(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(AbstractC8647e.inmobi(i, i2, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static void smaato(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static boolean startapp(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (i == iArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public static Integer subs(int[] iArr, int i) {
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static void subscription(float[] fArr, float[] fArr2, int i) {
        System.arraycopy(fArr, 0, fArr2, 0, (i & 8) != 0 ? fArr.length : 6);
    }

    public static void tapsense(int i, int i2, int i3, int[] iArr) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        Arrays.fill(iArr, 0, i2, i);
    }

    /* renamed from: this, reason: not valid java name */
    public static Object m674this(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* renamed from: throw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C6557e m675throw(defpackage.C6557e r5, defpackage.InterfaceC2460e r6) {
        /*
            eؘؔٔ r0 = defpackage.AbstractC16662e.vip
            eٌَۧ[] r1 = defpackage.AbstractC16662e.ad
            r2 = 0
            r3 = r1[r2]
            java.lang.Object r3 = r0.ads(r5)
            eِْۚ r3 = (defpackage.C11720e) r3
            if (r3 == 0) goto L13
            eٌؔٚ r3 = r3.ad
            if (r3 != 0) goto L15
        L13:
            eُ٘ۖ r3 = defpackage.C4590e.f9885e
        L15:
            if (r3 != r6) goto L18
            return r5
        L18:
            r1 = r1[r2]
            java.lang.Object r0 = r0.ads(r5)
            eِْۚ r0 = (defpackage.C11720e) r0
            if (r0 == 0) goto L66
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L29
            goto L57
        L29:
            eؘۙۛ r1 = r5.f27639e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L34:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r1.next()
            r4 = r3
            eِْۚ r4 = (defpackage.C11720e) r4
            boolean r4 = defpackage.AbstractC7890e.billing(r4, r0)
            if (r4 != 0) goto L34
            r2.add(r3)
            goto L34
        L4b:
            int r0 = r2.size()
            eؘۙۛ r1 = r5.f27639e
            int r1 = r1.appmetrica()
            if (r0 != r1) goto L59
        L57:
            r0 = r5
            goto L62
        L59:
            eَٗٞ r0 = defpackage.C6557e.f13492e
            r0.getClass()
            eًؙٟ r0 = defpackage.C10312e.amazon(r2)
        L62:
            if (r0 != 0) goto L65
            goto L66
        L65:
            r5 = r0
        L66:
            java.util.Iterator r0 = r6.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L77
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L77
            goto L99
        L77:
            eِْۚ r0 = new eِْۚ
            r0.<init>(r6)
            eَٗٞ r6 = defpackage.C6557e.f13492e
            java.lang.Class<eِْۚ> r1 = defpackage.C11720e.class
            eؙّؔ r2 = defpackage.AbstractC3820e.ad
            eؚ٘ٚ r1 = r2.vip(r1)
            r6.getClass()
            java.lang.String r1 = r1.license()
            int r6 = r6.admob(r1)
            eؘۙۛ r1 = r5.f27639e
            java.lang.Object r6 = r1.get(r6)
            if (r6 == 0) goto L9a
        L99:
            return r5
        L9a:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto Laa
            eًؙٟ r5 = new eًؙٟ
            java.util.List r6 = java.util.Collections.singletonList(r0)
            r5.<init>(r6)
            return r5
        Laa:
            java.util.List r5 = defpackage.AbstractC13480e.m3575continue(r5)
            java.util.ArrayList r5 = defpackage.AbstractC13480e.m3572catch(r0, r5)
            eًؙٟ r5 = defpackage.C10312e.amazon(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1660e.m675throw(eًؙٟ, eٌؔٚ):eًؙٟ");
    }

    /* renamed from: try, reason: not valid java name */
    public static Object m676try(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final void vip(int i, C13770e c13770e, InterfaceC12864e interfaceC12864e, String str, String str2, String str3, Function0 function0, boolean z) {
        InterfaceC12864e interfaceC12864e2;
        c13770e.m3671package(1022292961);
        int i2 = (c13770e.purchase(str) ? 4 : 2) | i | (c13770e.purchase(str2) ? 32 : 16) | (c13770e.purchase(str3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.billing(z) ? 2048 : 1024) | (c13770e.yandex(function0) ? 16384 : 8192) | (c13770e.purchase(interfaceC12864e) ? 131072 : 65536);
        if (c13770e.m3673protected(i2 & 1, (74899 & i2) != 74898)) {
            interfaceC12864e2 = interfaceC12864e;
            AbstractC6401e.vip(AbstractC16653e.license(-1521855377, new C7542e(str, 2), c13770e), AbstractC16653e.license(-1218967986, new C11828e(str2, str3, 0), c13770e), AbstractC12220e.advert(interfaceC12864e2, 16, 6), AbstractC16653e.license(-613193204, new C11031e(z, function0), c13770e), c13770e, 3126, 0);
        } else {
            interfaceC12864e2 = interfaceC12864e;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C5576e(i, interfaceC12864e2, str, str2, str3, function0, z);
        }
    }

    /* renamed from: while, reason: not valid java name */
    public static void m677while(Object[] objArr) {
        int length = (objArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = objArr.length - 1;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            Object obj = objArr[i];
            objArr[i] = objArr[length2];
            objArr[length2] = obj;
            length2--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static boolean yandex(Object obj, Object[] objArr) {
        return firebase(obj, objArr) >= 0;
    }
}
