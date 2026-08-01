package defpackage;

import io.realm.kotlin.internal.interop.realm_index_range_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۤٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6026e {
    public static final /* synthetic */ int ad = 0;

    static {
        if (System.getProperty("java.specification.vendor").contains("Android")) {
            return;
        }
        try {
            Class<?> cls = Class.forName("io.realm.kotlin.jvm.SoLoader");
            cls.getDeclaredMethod("load", null).invoke(cls.newInstance(), null);
        } catch (Exception e) {
            throw new RuntimeException("Couldn't load Realm native libraries", e);
        }
    }

    public static realm_index_range_t ad(realm_index_range_t realm_index_range_tVar, int i) {
        return new realm_index_range_t(realmcJNI.indexRangeArray_getitem(realm_index_range_t.ad(realm_index_range_tVar), realm_index_range_tVar, i), true);
    }

    public static realm_value_t metrica(int i) {
        long new_valueArray = realmcJNI.new_valueArray(i);
        if (new_valueArray == 0) {
            return null;
        }
        return new realm_value_t(new_valueArray, false);
    }

    public static realm_index_range_t vip(int i) {
        long new_indexRangeArray = realmcJNI.new_indexRangeArray(i);
        if (new_indexRangeArray == 0) {
            return null;
        }
        return new realm_index_range_t(new_indexRangeArray, false);
    }
}
