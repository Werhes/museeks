package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3406e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C15435e f7617e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f7618e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f7619e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7620e;

    public /* synthetic */ C3406e(InterfaceC8346e interfaceC8346e, C15435e c15435e, InterfaceC16132e interfaceC16132e, int i) {
        this.f7620e = i;
        this.f7618e = interfaceC8346e;
        this.f7617e = c15435e;
        this.f7619e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.f7620e) {
            case 0:
                Object obj5 = (C18055e) obj;
                int intValue = ((Number) obj2).intValue();
                C13770e c13770e = (C13770e) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (c13770e.purchase(obj5) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= c13770e.license(intValue) ? 32 : 16;
                }
                if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
                    CachedTrack cachedTrack = (CachedTrack) this.f7618e.get(intValue);
                    c13770e.m3676strictfp(1539929183);
                    C15435e c15435e = this.f7617e;
                    boolean yandex = c13770e.yandex(c15435e) | c13770e.yandex(cachedTrack);
                    InterfaceC16132e interfaceC16132e = this.f7619e;
                    boolean purchase = yandex | c13770e.purchase(interfaceC16132e);
                    Object m3681throw = c13770e.m3681throw();
                    Object obj6 = C2987e.ad;
                    if (purchase || m3681throw == obj6) {
                        m3681throw = new C4171e(c15435e, cachedTrack, interfaceC16132e, 0);
                        c13770e.m3682throws(m3681throw);
                    }
                    Function0 function0 = (Function0) m3681throw;
                    boolean yandex2 = c13770e.yandex(cachedTrack) | c13770e.yandex(c15435e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == obj6) {
                        m3681throw2 = new C9383e(cachedTrack, c15435e, 0);
                        c13770e.m3682throws(m3681throw2);
                    }
                    c15435e.m3995return(cachedTrack, function0, (Function0) m3681throw2, c13770e, 0);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                Object obj7 = (C18055e) obj;
                int intValue3 = ((Number) obj2).intValue();
                C13770e c13770e2 = (C13770e) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (c13770e2.purchase(obj7) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= c13770e2.license(intValue3) ? 32 : 16;
                }
                if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
                    CachedTrack cachedTrack2 = (CachedTrack) this.f7618e.get(intValue3);
                    c13770e2.m3676strictfp(-271637987);
                    C15435e c15435e2 = this.f7617e;
                    boolean yandex3 = c13770e2.yandex(c15435e2) | c13770e2.yandex(cachedTrack2);
                    InterfaceC16132e interfaceC16132e2 = this.f7619e;
                    boolean purchase2 = yandex3 | c13770e2.purchase(interfaceC16132e2);
                    Object m3681throw3 = c13770e2.m3681throw();
                    Object obj8 = C2987e.ad;
                    if (purchase2 || m3681throw3 == obj8) {
                        m3681throw3 = new C4171e(c15435e2, cachedTrack2, interfaceC16132e2, 1);
                        c13770e2.m3682throws(m3681throw3);
                    }
                    Function0 function02 = (Function0) m3681throw3;
                    boolean yandex4 = c13770e2.yandex(cachedTrack2) | c13770e2.yandex(c15435e2);
                    Object m3681throw4 = c13770e2.m3681throw();
                    if (yandex4 || m3681throw4 == obj8) {
                        m3681throw4 = new C9383e(cachedTrack2, c15435e2, 1);
                        c13770e2.m3682throws(m3681throw4);
                    }
                    c15435e2.m3995return(cachedTrack2, function02, (Function0) m3681throw4, c13770e2, 0);
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
