package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import kotlin.Unit;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrackLyricsSynchronizedLine;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16782e extends C13506e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C16782e f32882e = new C13506e(CachedTrackLyricsSynchronizedLine.class, "beginMs", "getBeginMs()J", 0);

    @Override // defpackage.C13506e, defpackage.InterfaceC0716e
    public final Object get(Object obj) {
        return Long.valueOf(((CachedTrackLyricsSynchronizedLine) obj).ad());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.C13506e, defpackage.InterfaceC0662e
    public final void remoteconfig(Object obj, Object obj2) {
        CachedTrackLyricsSynchronizedLine cachedTrackLyricsSynchronizedLine = (CachedTrackLyricsSynchronizedLine) obj;
        long longValue = ((Number) obj2).longValue();
        C13655e c13655e = cachedTrackLyricsSynchronizedLine.f36708e;
        if (c13655e == null) {
            cachedTrackLyricsSynchronizedLine.f36712e = longValue;
            return;
        }
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        Long valueOf = Long.valueOf(longValue);
        c13655e.ad();
        long j = c13655e.metrica("beginMs").license;
        C18085e c18085e = c13655e.f27076e;
        C16406e c16406e = c18085e.billing;
        C1235e c1235e = c16406e != null ? new C1235e(c16406e.license) : null;
        if (c1235e != null && C1235e.ad(j, c1235e)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Cannot update primary key property '", c13655e.f27075e, ".", c18085e.ad(c1235e.ad).vip, "'"));
        }
        C15816e yandex = AbstractC1414e.yandex();
        if (valueOf instanceof byte[]) {
            realm_value_t advert = yandex.advert((byte[]) valueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, advert.ad, advert, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t m4025while = yandex.m4025while(valueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, m4025while.ad, m4025while, false);
            Unit unit2 = Unit.INSTANCE;
        }
        yandex.m4020interface();
    }
}
