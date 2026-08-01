package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؔ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2654e {
    public static final C1378e Companion = new Object();
    public static final InterfaceC3477e[] vip = {AbstractC18039e.appmetrica(2, new C1349e(19))};
    public final List ad;

    public /* synthetic */ C2654e(int i, List list) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2654e) && AbstractC7890e.billing(this.ad, ((C2654e) obj).ad);
    }

    public final int hashCode() {
        List list = this.ad;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "AuthGetExchangeTokenResponseDto(usersExchangeTokens=" + this.ad + ")";
    }
}
