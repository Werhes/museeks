package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٟؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3539e extends C13506e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C3539e f7984e = new C13506e(CachedAlbum.class, "localizedSearchTitle", "getLocalizedSearchTitle()Ljava/lang/String;", 0);

    @Override // defpackage.C13506e, defpackage.InterfaceC0716e
    public final Object get(Object obj) {
        CachedAlbum cachedAlbum = (CachedAlbum) obj;
        C13655e c13655e = cachedAlbum.f36570e;
        if (c13655e == null) {
            return cachedAlbum.f36569e;
        }
        long j = c13655e.metrica("localizedSearchTitle").license;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            throw new C14803e(10);
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.ad, realm_value_tVar);
        }
        return null;
    }

    @Override // defpackage.C13506e, defpackage.InterfaceC0662e
    public final void remoteconfig(Object obj, Object obj2) {
        ((CachedAlbum) obj).loadAd((String) obj2);
    }
}
