package defpackage;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؑ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5357e {
    public static final C6575e ad = new C6575e(19);
    public static boolean appmetrica;
    public static boolean billing;
    public static Class license;
    public static boolean metrica;
    public static Field purchase;
    public static boolean startapp;
    public static Field vip;
    public static Field yandex;

    public static final List license(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return C13664e.f27089e;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC8848e interfaceC8848e = (InterfaceC8848e) arrayList.get(i3);
            int index = interfaceC8848e.getIndex();
            if (i <= index && index <= i2) {
                arrayList2.add(interfaceC8848e);
            }
        }
        AbstractC5167e.signatures(ad, arrayList2);
        return arrayList2;
    }

    public static void metrica(Object obj) {
        LongSparseArray longSparseArray;
        if (!appmetrica) {
            try {
                license = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            appmetrica = true;
        }
        Class cls = license;
        if (cls == null) {
            return;
        }
        if (!billing) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                purchase = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            billing = true;
        }
        Field field = purchase;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [eؓؒؑ] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [eٍؚؒ, java.lang.Object] */
    public static C5609e vip(InterfaceC7224e interfaceC7224e, InterfaceC17818e interfaceC17818e, String str, Function0 function0, Function1 function1, Function1 function12, Function2 function2, Function2 function22, Function3 function3, Function1 function13, Function2 function23) {
        InterfaceC6937e interfaceC6937e;
        ?? r21;
        HashMap hashMap;
        Collection values;
        C7826e c1531e;
        InterfaceC10306e interfaceC10306e;
        InterfaceC10306e interfaceC10306e2;
        InterfaceC10306e interfaceC10306e3;
        List list;
        C8633e c8633e;
        C8633e c8633e2;
        C8171e c8171e = new C8171e(12);
        C6156e vip2 = AbstractC4508e.vip(interfaceC7224e.appmetrica(), 3);
        C12344e c12344e = new C12344e(8);
        C18070e billing2 = interfaceC17818e.billing(new C10739e(2, c12344e));
        C11887e c11887e = new C11887e(true, 0, null, null, null, new C10479e(5, c12344e));
        c12344e.premium(new C0638e(1, new C12733e(), C12733e.class, "process", "process(Lcom/arkivanov/decompose/router/children/NavEvent;)V", 0, 0, 23));
        C13391e license2 = interfaceC7224e.license();
        C16714e c16714e = C15476e.Companion;
        InterfaceC5372e serializer = c16714e.serializer();
        Map map = (Map) license2.f26645e;
        C15476e c15476e = (C15476e) ((map == null || (c8633e2 = (C8633e) map.remove(str)) == null) ? null : c8633e2.ad(serializer));
        InterfaceC6937e interfaceC6937e2 = (c15476e == null || (c8633e = c15476e.ad) == null) ? null : (InterfaceC6937e) function12.invoke(c8633e);
        InterfaceC10540e vip3 = interfaceC7224e.vip();
        C12439e c12439e = new C12439e(interfaceC7224e, str, 29);
        C11106e c11106e = new C11106e(interfaceC7224e.purchase(), interfaceC7224e.vip(), AbstractC4508e.vip(interfaceC7224e.appmetrica(), 1), function23);
        InterfaceC6937e interfaceC6937e3 = interfaceC6937e2 == null ? (InterfaceC6937e) function0.invoke() : interfaceC6937e2;
        List list2 = (c15476e == null || (list = c15476e.vip) == null || interfaceC6937e2 == null) ? null : list;
        ?? obj = new Object();
        obj.f3323e = c11106e;
        obj.f3322e = interfaceC6937e3;
        InterfaceC7224e interfaceC7224e2 = (InterfaceC7224e) c12439e.f24903e;
        String str2 = (String) c12439e.f24902e;
        C16722e metrica2 = interfaceC7224e2.metrica();
        InterfaceC4095e interfaceC4095e = (InterfaceC4095e) ((HashMap) metrica2.f32780e).get(str2);
        if (interfaceC4095e == null) {
            interfaceC4095e = new C0408e();
            metrica2.isVip(str2, interfaceC4095e);
        }
        C0408e c0408e = (C0408e) interfaceC4095e;
        obj.f3321e = c0408e;
        if (list2 == null) {
            c0408e.onDestroy();
            obj.m422implements(interfaceC6937e3.getChildren());
        } else {
            ArrayList arrayList = c0408e.ad;
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            if (arrayList2 != null) {
                r21 = 0;
                ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC6874e.Signature();
                        throw null;
                    }
                    arrayList3.add(new C6571e(Integer.valueOf(i), (InterfaceC10306e) next));
                    interfaceC6937e3 = interfaceC6937e3;
                    it = it;
                    i = i2;
                }
                interfaceC6937e = interfaceC6937e3;
                hashMap = new HashMap();
                AbstractC10064e.smaato(arrayList3, hashMap);
            } else {
                interfaceC6937e = interfaceC6937e3;
                r21 = 0;
                hashMap = null;
            }
            arrayList.clear();
            Iterator it2 = AbstractC13480e.m3579e(list2, interfaceC6937e.getChildren()).iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    AbstractC6874e.Signature();
                    throw r21;
                }
                C6571e c6571e = (C6571e) next2;
                Iterator it3 = it2;
                C12432e c12432e = (C12432e) c6571e.f13544e;
                C17764e c17764e = (C17764e) c6571e.f13543e;
                EnumC10854e enumC10854e = c12432e.vip;
                Object obj2 = c12432e.ad;
                int ordinal = enumC10854e.ordinal();
                if (ordinal == 0) {
                    c1531e = new C1531e(obj2, c17764e.ad, c17764e.vip);
                } else if (ordinal == 1) {
                    c1531e = c11106e.m3001case(obj2, c17764e.ad, c17764e.vip, (hashMap == null || (interfaceC10306e = (InterfaceC10306e) hashMap.remove(Integer.valueOf(i3))) == null) ? r21 : interfaceC10306e.vip());
                    AbstractC14520e.metrica(c1531e.license);
                } else if (ordinal == 2) {
                    c1531e = c11106e.m3001case(obj2, c17764e.ad, c17764e.vip, (hashMap == null || (interfaceC10306e2 = (InterfaceC10306e) hashMap.remove(Integer.valueOf(i3))) == null) ? r21 : interfaceC10306e2.vip());
                    c1531e.billing.license();
                    AbstractC14520e.billing(c1531e.license);
                } else {
                    if (ordinal != 3) {
                        throw new C14803e(10);
                    }
                    c1531e = c11106e.m3001case(obj2, c17764e.ad, c17764e.vip, (hashMap == null || (interfaceC10306e3 = (InterfaceC10306e) hashMap.remove(Integer.valueOf(i3))) == null) ? r21 : interfaceC10306e3.vip());
                    c1531e.billing.license();
                    C11898e c11898e = c1531e.license;
                    AbstractC14520e.billing(c11898e);
                    if (((EnumC10668e) c11898e.f23835e) == EnumC10668e.f21011e) {
                        c11898e.vip();
                    }
                }
                arrayList.add(c1531e);
                it2 = it3;
                i3 = i4;
            }
            if (hashMap != null && (values = hashMap.values()) != null) {
                Iterator it4 = values.iterator();
                while (it4.hasNext()) {
                    C16722e vip4 = ((InterfaceC10306e) it4.next()).vip();
                    if (vip4 != null) {
                        vip4.billing();
                    }
                }
            }
        }
        if (vip3.getState() == EnumC10668e.f21012e) {
            Iterator it5 = new C11401e(((C0408e) obj.f3321e).ad).iterator();
            while (true) {
                ListIterator listIterator = (ListIterator) ((C0053e) it5).f1190e;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                InterfaceC10306e interfaceC10306e4 = (InterfaceC10306e) listIterator.previous();
                if (interfaceC10306e4 instanceof C7826e) {
                    C7826e c7826e = (C7826e) interfaceC10306e4;
                    c7826e.billing.appmetrica();
                    AbstractC14520e.license(c7826e.license);
                } else if (!(interfaceC10306e4 instanceof C1531e)) {
                    throw new C14803e(10);
                }
            }
        } else {
            vip3.smaato(new C5934e(1, obj));
        }
        interfaceC7224e.license().Signature(str, c16714e.serializer(), new C5625e(function1, (Object) obj, 0));
        C8221e c8221e = new C8221e(obj, function22, function2, new C6599e(c11887e, c8171e), function3, function13);
        c12344e.license(new C2719e(c8221e));
        vip2.ad(c11887e);
        InterfaceC10540e vip5 = interfaceC7224e.vip();
        if (vip5.getState() == EnumC10668e.f21012e) {
            billing2.license();
        } else {
            vip5.smaato(new C5934e(0, billing2));
        }
        return (C5609e) c8221e.billing;
    }

    public abstract String ad();
}
