package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0747e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11188e f3046e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f3047e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3048e;

    public /* synthetic */ C0747e(InterfaceC8346e interfaceC8346e, C11188e c11188e, int i) {
        this.f3048e = i;
        this.f3047e = interfaceC8346e;
        this.f3046e = c11188e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.f3048e) {
            case 0:
                C18055e c18055e = (C18055e) obj;
                int intValue = ((Number) obj2).intValue();
                C13770e c13770e = (C13770e) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= c13770e.license(intValue) ? 32 : 16;
                }
                if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
                    CachedTrack cachedTrack = ((C1254e) this.f3047e.get(intValue)).ad;
                    c13770e.m3676strictfp(143880719);
                    this.f3046e.m3048finally(cachedTrack, c13770e, 0);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C18055e c18055e2 = (C18055e) obj;
                int intValue3 = ((Number) obj2).intValue();
                C13770e c13770e2 = (C13770e) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (c13770e2.purchase(c18055e2) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= c13770e2.license(intValue3) ? 32 : 16;
                }
                if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
                    CachedPlaylist cachedPlaylist = ((C13217e) this.f3047e.get(intValue3)).ad;
                    c13770e2.m3676strictfp(-714408416);
                    boolean purchase = c13770e2.purchase(cachedPlaylist);
                    C11188e c11188e = this.f3046e;
                    boolean yandex = purchase | c13770e2.yandex(c11188e);
                    Object m3681throw = c13770e2.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C11240e(cachedPlaylist, c11188e);
                        c13770e2.m3682throws(m3681throw);
                    }
                    Function0 function0 = (Function0) m3681throw;
                    boolean yandex2 = c13770e2.yandex(c11188e) | c13770e2.purchase(cachedPlaylist);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C11240e(c11188e, cachedPlaylist);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    c11188e.m3056throws(cachedPlaylist, AbstractC9546e.purchase(C0115e.f1276e, function0, (Function0) m3681throw2), c13770e2, 0);
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
