package defpackage;

import ealvatag.tag.datatype.DataTypes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7928e {
    public static final ArrayList ad;
    public static final HashSet adcel;
    public static final Set appmetrica;
    public static final C12535e billing;
    public static final LinkedHashMap license;
    public static final Object metrica;
    public static final LinkedHashMap mopub;
    public static final Set purchase;
    public static final LinkedHashMap startapp;
    public static final ArrayList vip;
    public static final Object yandex;

    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.util.Map, java.lang.Object] */
    static {
        Set m664case = AbstractC1660e.m664case(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(m664case, 10));
        Iterator it = m664case.iterator();
        while (it.hasNext()) {
            arrayList.add(C11993e.purchase("java/util/Collection", (String) it.next(), "Ljava/util/Collection;", EnumC8790e.BOOLEAN.metrica()));
        }
        ad = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C12535e) it2.next()).appmetrica);
        }
        vip = arrayList2;
        ArrayList arrayList3 = ad;
        ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((C12535e) it3.next()).vip.vip());
        }
        String concat = "java/util/".concat("Collection");
        EnumC8790e enumC8790e = EnumC8790e.BOOLEAN;
        C12535e purchase2 = C11993e.purchase(concat, "contains", "Ljava/lang/Object;", enumC8790e.metrica());
        EnumC15732e enumC15732e = EnumC15732e.f30981e;
        C6571e c6571e = new C6571e(purchase2, enumC15732e);
        C6571e c6571e2 = new C6571e(C11993e.purchase("java/util/".concat("Collection"), "remove", "Ljava/lang/Object;", enumC8790e.metrica()), enumC15732e);
        C6571e c6571e3 = new C6571e(C11993e.purchase("java/util/".concat("Map"), "containsKey", "Ljava/lang/Object;", enumC8790e.metrica()), enumC15732e);
        C6571e c6571e4 = new C6571e(C11993e.purchase("java/util/".concat("Map"), "containsValue", "Ljava/lang/Object;", enumC8790e.metrica()), enumC15732e);
        C6571e c6571e5 = new C6571e(C11993e.purchase("java/util/".concat("Map"), "remove", "Ljava/lang/Object;Ljava/lang/Object;", enumC8790e.metrica()), enumC15732e);
        C6571e c6571e6 = new C6571e(C11993e.purchase("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), EnumC15732e.f30978e);
        C12535e purchase3 = C11993e.purchase("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        EnumC15732e enumC15732e2 = EnumC15732e.f30980e;
        C6571e c6571e7 = new C6571e(purchase3, enumC15732e2);
        C6571e c6571e8 = new C6571e(C11993e.purchase("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), enumC15732e2);
        String concat2 = "java/util/".concat("List");
        EnumC8790e enumC8790e2 = EnumC8790e.INT;
        C12535e purchase4 = C11993e.purchase(concat2, "indexOf", "Ljava/lang/Object;", enumC8790e2.metrica());
        EnumC15732e enumC15732e3 = EnumC15732e.f30979e;
        boolean z = false;
        Map purchase5 = AbstractC10064e.purchase(c6571e, c6571e2, c6571e3, c6571e4, c6571e5, c6571e6, c6571e7, c6571e8, new C6571e(purchase4, enumC15732e3), new C6571e(C11993e.purchase("java/util/".concat("List"), "lastIndexOf", "Ljava/lang/Object;", enumC8790e2.metrica()), enumC15732e3));
        metrica = purchase5;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC10064e.appmetrica(purchase5.size()));
        for (Map.Entry entry : purchase5.entrySet()) {
            linkedHashMap.put(((C12535e) entry.getKey()).appmetrica, entry.getValue());
            z = z;
        }
        boolean z2 = z;
        license = linkedHashMap;
        LinkedHashSet loadAd = AbstractC4511e.loadAd(metrica.keySet(), ad);
        ArrayList arrayList5 = new ArrayList(AbstractC0746e.subscription(loadAd, 10));
        Iterator it4 = loadAd.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((C12535e) it4.next()).vip);
        }
        appmetrica = AbstractC13480e.m3582e(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC0746e.subscription(loadAd, 10));
        Iterator it5 = loadAd.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((C12535e) it5.next()).appmetrica);
        }
        purchase = AbstractC13480e.m3582e(arrayList6);
        EnumC8790e enumC8790e3 = EnumC8790e.INT;
        C12535e purchase6 = C11993e.purchase("java/util/List", "removeAt", enumC8790e3.metrica(), "Ljava/lang/Object;");
        billing = purchase6;
        C6571e c6571e9 = new C6571e(C11993e.purchase("java/lang/".concat(DataTypes.OBJ_NUMBER), "toByte", BuildConfig.FLAVOR, EnumC8790e.BYTE.metrica()), C0520e.appmetrica("byteValue"));
        C6571e c6571e10 = new C6571e(C11993e.purchase("java/lang/".concat(DataTypes.OBJ_NUMBER), "toShort", BuildConfig.FLAVOR, EnumC8790e.SHORT.metrica()), C0520e.appmetrica("shortValue"));
        C6571e c6571e11 = new C6571e(C11993e.purchase("java/lang/".concat(DataTypes.OBJ_NUMBER), "toInt", BuildConfig.FLAVOR, enumC8790e3.metrica()), C0520e.appmetrica("intValue"));
        C6571e c6571e12 = new C6571e(C11993e.purchase("java/lang/".concat(DataTypes.OBJ_NUMBER), "toLong", BuildConfig.FLAVOR, EnumC8790e.LONG.metrica()), C0520e.appmetrica("longValue"));
        C6571e c6571e13 = new C6571e(C11993e.purchase("java/lang/".concat(DataTypes.OBJ_NUMBER), "toFloat", BuildConfig.FLAVOR, EnumC8790e.FLOAT.metrica()), C0520e.appmetrica("floatValue"));
        C6571e c6571e14 = new C6571e(C11993e.purchase("java/lang/".concat(DataTypes.OBJ_NUMBER), "toDouble", BuildConfig.FLAVOR, EnumC8790e.DOUBLE.metrica()), C0520e.appmetrica("doubleValue"));
        C6571e c6571e15 = new C6571e(purchase6, C0520e.appmetrica("remove"));
        C6571e c6571e16 = new C6571e(C11993e.purchase("java/lang/".concat("CharSequence"), "get", enumC8790e3.metrica(), EnumC8790e.CHAR.metrica()), C0520e.appmetrica("charAt"));
        C6571e c6571e17 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", BuildConfig.FLAVOR, "I"), C0520e.appmetrica("get"));
        C6571e c6571e18 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), C0520e.appmetrica("set"));
        C6571e c6571e19 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), C0520e.appmetrica("getAndSet"));
        C6571e c6571e20 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), C0520e.appmetrica("getAndAdd"));
        C6571e c6571e21 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), C0520e.appmetrica("addAndGet"));
        C6571e c6571e22 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicLong"), "load", BuildConfig.FLAVOR, "J"), C0520e.appmetrica("get"));
        C6571e c6571e23 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), C0520e.appmetrica("set"));
        C6571e c6571e24 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), C0520e.appmetrica("getAndSet"));
        C6571e c6571e25 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), C0520e.appmetrica("getAndAdd"));
        C6571e c6571e26 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), C0520e.appmetrica("addAndGet"));
        C6571e c6571e27 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", BuildConfig.FLAVOR, "Z"), C0520e.appmetrica("get"));
        C6571e c6571e28 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), C0520e.appmetrica("set"));
        C6571e c6571e29 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), C0520e.appmetrica("getAndSet"));
        C6571e c6571e30 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicReference"), "load", BuildConfig.FLAVOR, "Ljava/lang/Object;"), C0520e.appmetrica("get"));
        C6571e c6571e31 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicReference"), "store", "Ljava/lang/Object;", "V"), C0520e.appmetrica("set"));
        C6571e c6571e32 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), C0520e.appmetrica("getAndSet"));
        C6571e c6571e33 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), C0520e.appmetrica("get"));
        C6571e c6571e34 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), C0520e.appmetrica("set"));
        C6571e c6571e35 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), C0520e.appmetrica("getAndSet"));
        C6571e c6571e36 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), C0520e.appmetrica("compareAndSet"));
        C6571e c6571e37 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), C0520e.appmetrica("getAndAdd"));
        C6571e c6571e38 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), C0520e.appmetrica("addAndGet"));
        C6571e c6571e39 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), C0520e.appmetrica("get"));
        C6571e c6571e40 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), C0520e.appmetrica("set"));
        C6571e c6571e41 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), C0520e.appmetrica("getAndSet"));
        C6571e c6571e42 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), C0520e.appmetrica("compareAndSet"));
        C6571e c6571e43 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), C0520e.appmetrica("getAndAdd"));
        C6571e c6571e44 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), C0520e.appmetrica("addAndGet"));
        C6571e c6571e45 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), C0520e.appmetrica("get"));
        C6571e c6571e46 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), C0520e.appmetrica("set"));
        C6571e c6571e47 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), C0520e.appmetrica("getAndSet"));
        C6571e c6571e48 = new C6571e(C11993e.purchase("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), C0520e.appmetrica("compareAndSet"));
        C6571e[] c6571eArr = new C6571e[40];
        c6571eArr[z2 ? 1 : 0] = c6571e9;
        c6571eArr[1] = c6571e10;
        c6571eArr[2] = c6571e11;
        c6571eArr[3] = c6571e12;
        c6571eArr[4] = c6571e13;
        c6571eArr[5] = c6571e14;
        c6571eArr[6] = c6571e15;
        c6571eArr[7] = c6571e16;
        c6571eArr[8] = c6571e17;
        c6571eArr[9] = c6571e18;
        c6571eArr[10] = c6571e19;
        c6571eArr[11] = c6571e20;
        c6571eArr[12] = c6571e21;
        c6571eArr[13] = c6571e22;
        c6571eArr[14] = c6571e23;
        c6571eArr[15] = c6571e24;
        c6571eArr[16] = c6571e25;
        c6571eArr[17] = c6571e26;
        c6571eArr[18] = c6571e27;
        c6571eArr[19] = c6571e28;
        c6571eArr[20] = c6571e29;
        c6571eArr[21] = c6571e30;
        c6571eArr[22] = c6571e31;
        c6571eArr[23] = c6571e32;
        c6571eArr[24] = c6571e33;
        c6571eArr[25] = c6571e34;
        c6571eArr[26] = c6571e35;
        c6571eArr[27] = c6571e36;
        c6571eArr[28] = c6571e37;
        c6571eArr[29] = c6571e38;
        c6571eArr[30] = c6571e39;
        c6571eArr[31] = c6571e40;
        c6571eArr[32] = c6571e41;
        c6571eArr[33] = c6571e42;
        c6571eArr[34] = c6571e43;
        c6571eArr[35] = c6571e44;
        c6571eArr[36] = c6571e45;
        c6571eArr[37] = c6571e46;
        c6571eArr[38] = c6571e47;
        c6571eArr[39] = c6571e48;
        Map purchase7 = AbstractC10064e.purchase(c6571eArr);
        yandex = purchase7;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC10064e.appmetrica(purchase7.size()));
        for (Map.Entry entry2 : purchase7.entrySet()) {
            linkedHashMap2.put(((C12535e) entry2.getKey()).appmetrica, entry2.getValue());
        }
        startapp = linkedHashMap2;
        ?? r1 = yandex;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r1.entrySet()) {
            C12535e c12535e = (C12535e) entry3.getKey();
            C0520e c0520e = (C0520e) entry3.getValue();
            linkedHashSet.add(c12535e.ad + '.' + (c0520e + '(' + c12535e.metrica + ')' + c12535e.license));
        }
        Set keySet = yandex.keySet();
        HashSet hashSet = new HashSet();
        Iterator it6 = keySet.iterator();
        while (it6.hasNext()) {
            hashSet.add(((C12535e) it6.next()).vip);
        }
        adcel = hashSet;
        Set<Map.Entry> entrySet = yandex.entrySet();
        ArrayList arrayList7 = new ArrayList(AbstractC0746e.subscription(entrySet, 10));
        for (Map.Entry entry4 : entrySet) {
            arrayList7.add(new C6571e(((C12535e) entry4.getKey()).vip, entry4.getValue()));
        }
        int appmetrica2 = AbstractC10064e.appmetrica(AbstractC0746e.subscription(arrayList7, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(appmetrica2 >= 16 ? appmetrica2 : 16);
        Iterator it7 = arrayList7.iterator();
        while (it7.hasNext()) {
            C6571e c6571e49 = (C6571e) it7.next();
            linkedHashMap3.put((C0520e) c6571e49.f13543e, (C0520e) c6571e49.f13544e);
        }
        mopub = linkedHashMap3;
    }
}
