package defpackage;

import io.realm.kotlin.internal.interop.realm_value_t;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؒۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8441e {
    public abstract Object ad(Object obj);

    public abstract Object appmetrica(Object obj);

    public final Object license(realm_value_t realm_value_tVar) {
        return appmetrica(vip(realm_value_tVar));
    }

    public final realm_value_t metrica(C15816e c15816e, Object obj) {
        return purchase(c15816e, ad(obj));
    }

    public abstract realm_value_t purchase(C15816e c15816e, Object obj);

    public abstract Object vip(realm_value_t realm_value_tVar);
}
