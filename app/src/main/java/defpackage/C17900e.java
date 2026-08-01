package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_class_info_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import io.realm.kotlin.internal.interop.vip;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٞؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17900e {
    public final NativePointer ad;
    public final Map metrica;
    public final Map vip;

    public C17900e(NativePointer nativePointer, Collection collection) {
        this.ad = nativePointer;
        ArrayList metrica = vip.metrica(nativePointer);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(metrica, 10));
        Iterator it = metrica.iterator();
        while (it.hasNext()) {
            long j = ((C10484e) it.next()).ad;
            NativePointer nativePointer2 = this.ad;
            realm_class_info_t realm_class_info_tVar = new realm_class_info_t();
            long ptr$cinterop_release = ((LongPointerWrapper) nativePointer2).getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_get_class(ptr$cinterop_release, j, realm_class_info_tVar.ad, realm_class_info_tVar);
            String realm_class_info_t_name_get = realmcJNI.realm_class_info_t_name_get(realm_class_info_tVar.ad, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_primary_key_get(realm_class_info_tVar.ad, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_num_properties_get(realm_class_info_tVar.ad, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_num_computed_properties_get(realm_class_info_tVar.ad, realm_class_info_tVar);
            long realm_class_info_t_key_get = realmcJNI.realm_class_info_t_key_get(realm_class_info_tVar.ad, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_flags_get(realm_class_info_tVar.ad, realm_class_info_tVar);
            Iterator it2 = collection.iterator();
            Object obj = null;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (AbstractC7890e.billing(((InterfaceC3055e) next).ad(), realm_class_info_t_name_get)) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = next;
                    }
                } else if (z) {
                    obj = obj2;
                }
            }
            arrayList.add(new C6571e(realm_class_info_t_name_get, new C18085e(this.ad, realm_class_info_t_name_get, realm_class_info_t_key_get, (InterfaceC3055e) obj)));
        }
        Map mopub = AbstractC10064e.mopub(arrayList);
        this.vip = mopub;
        ArrayList arrayList2 = new ArrayList(mopub.size());
        Iterator it3 = mopub.entrySet().iterator();
        while (it3.hasNext()) {
            C18085e c18085e = (C18085e) ((Map.Entry) it3.next()).getValue();
            arrayList2.add(new C6571e(new C10484e(c18085e.vip), c18085e));
        }
        this.metrica = AbstractC10064e.mopub(arrayList2);
    }

    public final C18085e ad(String str) {
        return (C18085e) this.vip.get(str);
    }

    public final C18085e metrica(String str) {
        C18085e ad = ad(str);
        if (ad != null) {
            return ad;
        }
        throw new IllegalArgumentException(AbstractC5087e.m1746extends("Schema does not contain a class named '", str, "'"));
    }

    public final C18085e vip(long j) {
        return (C18085e) this.metrica.get(new C10484e(j));
    }
}
