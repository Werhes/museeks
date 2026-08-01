package defpackage;

import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.vip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۢۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18085e {
    public final String ad;
    public final LinkedHashMap appmetrica;
    public final C16406e billing;
    public final LinkedHashMap license;
    public final ArrayList metrica;
    public final LinkedHashMap purchase;
    public final InterfaceC7227e startapp;
    public final long vip;
    public final boolean yandex;

    public C18085e(NativePointer nativePointer, String str, long j, InterfaceC3055e interfaceC3055e) {
        Map metrica;
        C6571e c6571e;
        this.ad = str;
        this.vip = j;
        Object obj = null;
        this.startapp = interfaceC3055e != null ? interfaceC3055e.vip() : null;
        C18234e vip = vip.vip(nativePointer, j);
        List<C16427e> license = vip.license(nativePointer, vip.appmetrica, vip.metrica + vip.license);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(license, 10));
        for (C16427e c16427e : license) {
            arrayList.add(new C16406e(c16427e, (interfaceC3055e == null || (metrica = interfaceC3055e.metrica()) == null || (c6571e = (C6571e) metrica.get(c16427e.ad)) == null) ? null : (InterfaceC0716e) c6571e.f13543e));
        }
        this.metrica = arrayList;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C16406e) next).yandex) {
                obj = next;
                break;
            }
        }
        this.billing = (C16406e) obj;
        this.yandex = vip.billing;
        ArrayList arrayList2 = this.metrica;
        int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(arrayList2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica < 16 ? 16 : appmetrica);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            linkedHashMap.put(((C16406e) next2).vip, next2);
        }
        ArrayList arrayList3 = this.metrica;
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            if (!((C16406e) next3).metrica.equals(BuildConfig.FLAVOR)) {
                arrayList4.add(next3);
            }
        }
        int appmetrica2 = AbstractC10064e.appmetrica(AbstractC0746e.subscription(arrayList4, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(appmetrica2 < 16 ? 16 : appmetrica2);
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Object next4 = it4.next();
            linkedHashMap2.put(((C16406e) next4).metrica, next4);
        }
        this.appmetrica = AbstractC10064e.yandex(linkedHashMap, linkedHashMap2);
        ArrayList arrayList5 = this.metrica;
        int appmetrica3 = AbstractC10064e.appmetrica(AbstractC0746e.subscription(arrayList5, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(appmetrica3 < 16 ? 16 : appmetrica3);
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            Object next5 = it5.next();
            linkedHashMap3.put(new C1235e(((C16406e) next5).license), next5);
        }
        this.purchase = linkedHashMap3;
        ArrayList arrayList6 = this.metrica;
        int appmetrica4 = AbstractC10064e.appmetrica(AbstractC0746e.subscription(arrayList6, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(appmetrica4 >= 16 ? appmetrica4 : 16);
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            Object next6 = it6.next();
            linkedHashMap4.put(((C16406e) next6).ad, next6);
        }
        this.license = linkedHashMap4;
    }

    public final C16406e ad(long j) {
        return (C16406e) this.purchase.get(new C1235e(j));
    }

    public final C16406e vip(String str) {
        C16406e c16406e = (C16406e) this.appmetrica.get(str);
        if (c16406e != null) {
            return c16406e;
        }
        throw new IllegalArgumentException(AbstractC17861e.subscription("Schema for type '", this.ad, "' doesn't contain a property named '", str, "'"));
    }
}
