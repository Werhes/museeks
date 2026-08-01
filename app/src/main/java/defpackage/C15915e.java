package defpackage;

import java.util.Locale;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eَٖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15915e {
    public static final C14784e Companion = new Object();
    public final String ad;

    public C15915e(int i, String str) {
        if (1 == (i & 1)) {
            this.ad = str;
        } else {
            AbstractC5756e.billing(i, 1, C11175e.vip);
            throw null;
        }
    }

    public C15915e(C2453e c2453e) {
        this.ad = AbstractC1660e.m671interface(c2453e.yandex(), BuildConfig.FLAVOR, C8082e.f16402e, 30).toLowerCase(Locale.ROOT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15915e) && AbstractC7890e.billing(this.ad, ((C15915e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("BsonValueJson(data="), this.ad, ')');
    }
}
