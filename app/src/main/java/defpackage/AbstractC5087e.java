package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5087e {
    public static int Signature(InterfaceC0929e interfaceC0929e, InterfaceC0732e interfaceC0732e, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new C11976e((InterfaceC16719e) list.get(i3), 1, 2, 0));
            }
            arrayList2.add(arrayList3);
        }
        return interfaceC0929e.vip(new C1202e(interfaceC0732e, interfaceC0732e.getLayoutDirection()), arrayList2, AbstractC2278e.vip(0, i, 0, 0, 13)).vip();
    }

    /* renamed from: abstract, reason: not valid java name */
    public static void m1741abstract(C17213e c17213e, C2892e c2892e, int i) {
        String str = (i & 1) != 0 ? null : "cell:ActionsStrip";
        Csuper csuper = c17213e.ad;
        C12452e c12452e = c17213e.vip;
        if (c12452e == null) {
            c12452e = new C12452e();
            c17213e.vip = c12452e;
        }
        c12452e.ad(csuper.f36470e);
        c17213e.adcel(str, null, new C2892e(-1588696110, true, new C3174e(c2892e, csuper.f36470e, 4)));
    }

    public static void ad(InterfaceC3529e interfaceC3529e) {
        interfaceC3529e.yandex().mo3328goto();
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC3529e.vip()).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_clear(ptr$cinterop_release);
        interfaceC3529e.purchase(interfaceC3529e.startapp() + 1);
    }

    public static long adcel(InterfaceC11905e interfaceC11905e, InterfaceC0043e interfaceC0043e, InterfaceC0043e interfaceC0043e2) {
        InterfaceC0043e ad = interfaceC11905e.ad(interfaceC0043e);
        InterfaceC0043e ad2 = interfaceC11905e.ad(interfaceC0043e2);
        return ad instanceof C13221e ? ((C13221e) ad).mo210native(ad2, 0L, true) : ad2 instanceof C13221e ? ((C13221e) ad2).mo210native(ad, 0L, true) ^ (-9223372034707292160L) : ad.mo210native(ad, 0L, true);
    }

    public static int admob(InterfaceC2747e interfaceC2747e, InterfaceC0732e interfaceC0732e, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = 1;
            arrayList.add(new C11976e((InterfaceC16719e) list.get(i2), i3, i3, 0));
        }
        return interfaceC2747e.vip(new C1202e(interfaceC0732e, interfaceC0732e.getLayoutDirection()), arrayList, AbstractC2278e.vip(0, 0, 0, i, 7)).getWidth();
    }

    public static int advert(InterfaceC0929e interfaceC0929e, InterfaceC0732e interfaceC0732e, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                int i4 = 2;
                arrayList3.add(new C11976e((InterfaceC16719e) list.get(i3), i4, i4, 0));
            }
            arrayList2.add(arrayList3);
        }
        return interfaceC0929e.vip(new C1202e(interfaceC0732e, interfaceC0732e.getLayoutDirection()), arrayList2, AbstractC2278e.vip(0, i, 0, 0, 13)).vip();
    }

    public static int amazon(InterfaceC0929e interfaceC0929e, InterfaceC0732e interfaceC0732e, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new C11976e((InterfaceC16719e) list.get(i3), 2, 1, 0));
            }
            arrayList2.add(arrayList3);
        }
        return interfaceC0929e.vip(new C1202e(interfaceC0732e, interfaceC0732e.getLayoutDirection()), arrayList2, AbstractC2278e.vip(0, 0, 0, i, 7)).getWidth();
    }

    public static Object appmetrica(InterfaceC3529e interfaceC3529e, NativePointer nativePointer, int i) {
        AbstractC8441e mo1372throw = interfaceC3529e.mo1372throw();
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_results_get(ptr$cinterop_release, i, realm_value_tVar.ad, realm_value_tVar);
        return mo1372throw.license(realm_value_tVar);
    }

    public static C6571e billing(InterfaceC3529e interfaceC3529e, Object obj, Object obj2, LinkedHashMap linkedHashMap) {
        interfaceC3529e.yandex().mo3328goto();
        C6571e advert = interfaceC3529e.advert(obj, obj2, 2, linkedHashMap);
        interfaceC3529e.purchase(interfaceC3529e.startapp() + 1);
        return advert;
    }

    /* renamed from: break, reason: not valid java name */
    public static InterfaceC5066e m1742break(C6325e c6325e, int i) {
        C4993e c4993e = (C4993e) c6325e.f13170e;
        AbstractC13717e adcel = AbstractC12640e.adcel();
        Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
        AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
        try {
            C13648e c13648e = (C13648e) c4993e.purchase.getValue();
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
            return c4993e.admob.ad(i, c13648e.adcel, c4993e.license, new C17187e(i, c13648e));
        } catch (Throwable th) {
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
            throw th;
        }
    }

    /* renamed from: case, reason: not valid java name */
    public static /* synthetic */ String m1743case(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "CHECK" : "X" : "ARROW" : "BURGER";
    }

    /* renamed from: class, reason: not valid java name */
    public static int m1744class(int i, long j, int i2) {
        return (C10994e.ad(j) + i) * i2;
    }

    public static int crashlytics(int i, int i2, int i3, int i4) {
        return C11357e.advert(i + i2 + i3, i4);
    }

    /* renamed from: default, reason: not valid java name */
    public static /* synthetic */ String m1745default(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "Idle" : "LookaheadLayingOut" : "LayingOut" : "LookaheadMeasuring" : "Measuring";
    }

    /* renamed from: extends, reason: not valid java name */
    public static String m1746extends(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static int firebase(int i, int i2, int i3, int i4, int i5) {
        int i6 = i + i2 + i3;
        return ((i6 >>> (32 - i4)) | (i6 << i4)) + i5;
    }

    /* renamed from: goto, reason: not valid java name */
    public static ClassCastException m1747goto(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* renamed from: implements, reason: not valid java name */
    public static /* synthetic */ String m1748implements(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "MatchParent" : "Expand" : "Fixed" : "Wrap";
    }

    public static final int inmobi(int i) {
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class != 0 && m2467class != 1) {
            if (m2467class == 2 || m2467class == 3) {
                return 2;
            }
            if (m2467class != 4) {
                return m2467class != 5 ? 0 : 3;
            }
        }
        return 1;
    }

    /* renamed from: interface, reason: not valid java name */
    public static C14803e m1749interface(String str) {
        AbstractC8889e.vip(str);
        return new C14803e(9);
    }

    public static final int isPro(int i) {
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return 2;
        }
        if (m2467class == 1 || m2467class == 2) {
            return 3;
        }
        return (m2467class == 3 || m2467class == 4 || m2467class == 5) ? 4 : 0;
    }

    public static InterfaceC12864e isVip(InterfaceC12864e interfaceC12864e, InterfaceC12864e interfaceC12864e2) {
        return interfaceC12864e2 == C0115e.f1276e ? interfaceC12864e : new C4425e(interfaceC12864e, interfaceC12864e2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [eٟؗۡ, eٜؖۡ] */
    public static Object license(InterfaceC4238e interfaceC4238e, C15816e c15816e) {
        C14742e c14742e;
        AbstractC13616e abstractC13616e = (AbstractC13616e) interfaceC4238e;
        if (!abstractC13616e.f27022e.f27016e) {
            AbstractC14070e.ad("ModifierLocal accessed from an unattached node");
        }
        if (!abstractC13616e.f27022e.f27016e) {
            AbstractC14070e.metrica("visitAncestors called on an unattached node");
        }
        AbstractC13616e abstractC13616e2 = abstractC13616e.f27022e.f27011e;
        C13915e mopub = AbstractC5851e.mopub(interfaceC4238e);
        while (mopub != null) {
            if ((((AbstractC13616e) mopub.f27592e.billing).f27020e & 32) != 0) {
                while (abstractC13616e2 != null) {
                    if ((abstractC13616e2.f27014e & 32) != 0) {
                        AbstractC6126e abstractC6126e = abstractC13616e2;
                        ?? r3 = 0;
                        while (abstractC6126e != 0) {
                            if (abstractC6126e instanceof InterfaceC4238e) {
                                InterfaceC4238e interfaceC4238e2 = (InterfaceC4238e) abstractC6126e;
                                if (interfaceC4238e2.mo344private().ad(c15816e)) {
                                    return interfaceC4238e2.mo344private().vip(c15816e);
                                }
                            } else if ((abstractC6126e.f27014e & 32) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                                AbstractC13616e abstractC13616e3 = abstractC6126e.f12873e;
                                int i = 0;
                                abstractC6126e = abstractC6126e;
                                r3 = r3;
                                while (abstractC13616e3 != null) {
                                    if ((abstractC13616e3.f27014e & 32) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            abstractC6126e = abstractC13616e3;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC6126e != 0) {
                                                r3.license(abstractC6126e);
                                                abstractC6126e = 0;
                                            }
                                            r3.license(abstractC13616e3);
                                        }
                                    }
                                    abstractC13616e3 = abstractC13616e3.f27024e;
                                    abstractC6126e = abstractC6126e;
                                    r3 = r3;
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC6126e = AbstractC5851e.vip(r3);
                        }
                    }
                    abstractC13616e2 = abstractC13616e2.f27011e;
                }
            }
            mopub = mopub.tapsense();
            abstractC13616e2 = (mopub == null || (c14742e = mopub.f27592e) == null) ? null : (C9011e) c14742e.purchase;
        }
        return ((Function0) c15816e.f31190e).invoke();
    }

    public static int loadAd(InterfaceC2747e interfaceC2747e, InterfaceC0732e interfaceC0732e, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C11976e((InterfaceC16719e) list.get(i2), 1, 2, 0));
        }
        return interfaceC2747e.vip(new C1202e(interfaceC0732e, interfaceC0732e.getLayoutDirection()), arrayList, AbstractC2278e.vip(0, i, 0, 0, 13)).vip();
    }

    public static C6571e metrica(InterfaceC3529e interfaceC3529e, Object obj) {
        interfaceC3529e.yandex().mo3328goto();
        C6571e smaato = interfaceC3529e.smaato(obj);
        interfaceC3529e.purchase(interfaceC3529e.startapp() + 1);
        return smaato;
    }

    public static int mopub(InterfaceC2747e interfaceC2747e, InterfaceC0732e interfaceC0732e, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = 2;
            arrayList.add(new C11976e((InterfaceC16719e) list.get(i2), i3, i3, 0));
        }
        return interfaceC2747e.vip(new C1202e(interfaceC0732e, interfaceC0732e.getLayoutDirection()), arrayList, AbstractC2278e.vip(0, i, 0, 0, 13)).vip();
    }

    /* renamed from: native, reason: not valid java name */
    public static String m1750native(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static /* synthetic */ void premium(C17213e c17213e, String str, Function0 function0, Function3 function3, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        c17213e.adcel(str, function0, function3);
    }

    public static void pro(InterfaceC3529e interfaceC3529e, Map map, int i, Map map2) {
        interfaceC3529e.yandex().mo3328goto();
        for (Map.Entry entry : map.entrySet()) {
            interfaceC3529e.loadAd(entry.getKey(), entry.getValue(), i, map2);
        }
    }

    /* renamed from: protected, reason: not valid java name */
    public static int m1751protected(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static int purchase(InterfaceC3529e interfaceC3529e) {
        interfaceC3529e.yandex().mo3328goto();
        long[] jArr = new long[1];
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC3529e.vip()).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_size(ptr$cinterop_release, jArr);
        return (int) jArr[0];
    }

    public static Object remoteconfig(InterfaceC3529e interfaceC3529e, Object obj, Object obj2, int i, Map map) {
        interfaceC3529e.yandex().mo3328goto();
        Object obj3 = interfaceC3529e.advert(obj, obj2, i, map).f13544e;
        interfaceC3529e.purchase(interfaceC3529e.startapp() + 1);
        return obj3;
    }

    public static Object signatures(InterfaceC3529e interfaceC3529e, Object obj) {
        interfaceC3529e.yandex().mo3328goto();
        Object obj2 = interfaceC3529e.smaato(obj).f13544e;
        interfaceC3529e.purchase(interfaceC3529e.startapp() + 1);
        return obj2;
    }

    public static int smaato(InterfaceC2747e interfaceC2747e, InterfaceC0732e interfaceC0732e, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C11976e((InterfaceC16719e) list.get(i2), 2, 1, 0));
        }
        return interfaceC2747e.vip(new C1202e(interfaceC0732e, interfaceC0732e.getLayoutDirection()), arrayList, AbstractC2278e.vip(0, 0, 0, i, 7)).getWidth();
    }

    public static boolean startapp(InterfaceC4911e interfaceC4911e, int i) {
        char c;
        if (i == 1) {
            c = '(';
        } else if (i == 2) {
            c = 30;
        } else if (i == 3) {
            c = 20;
        } else if (i == 4) {
            c = '\n';
        } else {
            if (i != 5) {
                throw null;
            }
            c = 0;
        }
        if (c == 0) {
            return interfaceC4911e.yandex();
        }
        if (c == '\n') {
            return interfaceC4911e.metrica();
        }
        if (c == 20) {
            return interfaceC4911e.purchase();
        }
        if (c == 30) {
            return interfaceC4911e.vip();
        }
        if (c == '(') {
            return interfaceC4911e.appmetrica();
        }
        StringBuilder sb = new StringBuilder("Level [");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR");
        sb.append("] not recognized.");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void subs(C7882e c7882e, C2892e c2892e) {
        C14914e c14914e = C14914e.f29572e;
        c7882e.getClass();
        c7882e.ad.appmetrica(1, new C6967e(null, new C17187e(17), new C2109e(26, c14914e), new C2892e(1062451479, true, new C8035e(7, c2892e))));
    }

    public static int subscription(InterfaceC0929e interfaceC0929e, InterfaceC0732e interfaceC0732e, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                int i4 = 1;
                arrayList3.add(new C11976e((InterfaceC16719e) list.get(i3), i4, i4, 0));
            }
            arrayList2.add(arrayList3);
        }
        return interfaceC0929e.vip(new C1202e(interfaceC0732e, interfaceC0732e.getLayoutDirection()), arrayList2, AbstractC2278e.vip(0, 0, 0, i, 7)).getWidth();
    }

    public static boolean tapsense(InterfaceC12556e interfaceC12556e, Object obj) {
        int indexOf = interfaceC12556e.indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC12556e.vip()).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_list_erase(ptr$cinterop_release, indexOf);
        return true;
    }

    /* renamed from: this, reason: not valid java name */
    public static String m1752this(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    /* renamed from: throw, reason: not valid java name */
    public static void m1753throw(int i, HashMap hashMap, Integer num, int i2, Integer num2) {
        hashMap.put(Integer.valueOf(i), num);
        hashMap.put(Integer.valueOf(i2), num2);
    }

    /* renamed from: try, reason: not valid java name */
    public static void m1754try(long j, String str, StringBuilder sb) {
        sb.append((Object) C3618e.startapp(j));
        sb.append(str);
    }

    public static boolean vip(InterfaceC3529e interfaceC3529e, Object obj) {
        interfaceC3529e.yandex().mo3328goto();
        C15816e c15816e = new C15816e(15);
        AbstractC8441e mo1372throw = interfaceC3529e.mo1372throw();
        NativePointer vip = interfaceC3529e.vip();
        realm_value_t metrica = mo1372throw.metrica(c15816e, obj);
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) vip).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_contains_key(ptr$cinterop_release, metrica.ad, metrica, zArr);
        boolean z = zArr[0];
        c15816e.m4020interface();
        return z;
    }

    /* renamed from: while, reason: not valid java name */
    public static void m1755while(long j, C0576e c0576e) {
        c0576e.setValue(new C3618e(j));
    }

    public static boolean yandex(InterfaceC12556e interfaceC12556e, int i, Collection collection, int i2, Map map) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            interfaceC12556e.isVip(i, it.next(), i2, map);
            z = true;
            i++;
        }
        return z;
    }
}
