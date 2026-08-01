package defpackage;

import io.realm.kotlin.internal.interop.realm_link_t;
import io.realm.kotlin.internal.interop.realm_timestamp_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۧۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15871e {
    public static final C5363e ad = new C5363e(new C11689e(20));
    public static final C5363e vip = new C5363e(new C11689e(21));

    /* JADX WARN: Type inference failed for: r0v3, types: [eۦۥ, java.lang.Object] */
    public static final C18506e ad(realm_value_t realm_value_tVar) {
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) != 10) {
            throw new IllegalStateException(("Value is not of type link: " + realm_value_tVar + ".type").toString());
        }
        long realm_value_t_link_get = realmcJNI.realm_value_t_link_get(realm_value_tVar.ad, realm_value_tVar);
        realm_link_t realm_link_tVar = realm_value_t_link_get == 0 ? null : new realm_link_t(realm_value_t_link_get, false);
        long realm_link_t_target_table_get = realmcJNI.realm_link_t_target_table_get(realm_link_tVar.ad, realm_link_tVar);
        long realm_value_t_link_get2 = realmcJNI.realm_value_t_link_get(realm_value_tVar.ad, realm_value_tVar);
        realm_link_t realm_link_tVar2 = realm_value_t_link_get2 != 0 ? new realm_link_t(realm_value_t_link_get2, false) : null;
        long realm_link_t_target_get = realmcJNI.realm_link_t_target_get(realm_link_tVar2.ad, realm_link_tVar2);
        ?? obj = new Object();
        obj.ad = realm_link_t_target_table_get;
        obj.vip = realm_link_t_target_get;
        return obj;
    }

    public static final long metrica() {
        return ((C10484e) ad.getValue()).ad;
    }

    public static final C16758e vip(realm_value_t realm_value_tVar) {
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) != 5) {
            throw new IllegalStateException(("Value is not of type Timestamp: " + realm_value_tVar + ".type").toString());
        }
        long realm_value_t_timestamp_get = realmcJNI.realm_value_t_timestamp_get(realm_value_tVar.ad, realm_value_tVar);
        realm_timestamp_t realm_timestamp_tVar = realm_value_t_timestamp_get == 0 ? null : new realm_timestamp_t(realm_value_t_timestamp_get, false);
        long realm_timestamp_t_seconds_get = realmcJNI.realm_timestamp_t_seconds_get(realm_timestamp_tVar.ad, realm_timestamp_tVar);
        long realm_value_t_timestamp_get2 = realmcJNI.realm_value_t_timestamp_get(realm_value_tVar.ad, realm_value_tVar);
        realm_timestamp_t realm_timestamp_tVar2 = realm_value_t_timestamp_get2 != 0 ? new realm_timestamp_t(realm_value_t_timestamp_get2, false) : null;
        return new C16758e(realm_timestamp_t_seconds_get, realmcJNI.realm_timestamp_t_nanoseconds_get(realm_timestamp_tVar2.ad, realm_timestamp_tVar2));
    }
}
