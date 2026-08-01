package defpackage;

import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import kotlin.Unit;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrackLyrics;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٙۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14069e extends C13506e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C14069e f27818e = new C13506e(CachedTrackLyrics.class, "plainLyrics", "getPlainLyrics()Ljava/lang/String;", 0);

    @Override // defpackage.C13506e, defpackage.InterfaceC0716e
    public final Object get(Object obj) {
        return ((CachedTrackLyrics) obj).vip();
    }

    @Override // defpackage.C13506e, defpackage.InterfaceC0662e
    public final void remoteconfig(Object obj, Object obj2) {
        CachedTrackLyrics cachedTrackLyrics = (CachedTrackLyrics) obj;
        String str = (String) obj2;
        C13655e c13655e = cachedTrackLyrics.f36702e;
        if (c13655e == null) {
            cachedTrackLyrics.f36701e = str;
            return;
        }
        c13655e.ad();
        long j = c13655e.metrica("plainLyrics").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        realm_value_t m4015default = yandex.m4015default(str);
        long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, m4015default.ad, m4015default, false);
        Unit unit = Unit.INSTANCE;
        yandex.m4020interface();
    }
}
