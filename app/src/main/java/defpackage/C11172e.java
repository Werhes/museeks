package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eُٟۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11172e implements InterfaceC8399e {
    public static final C15843e Companion = new Object();
    public final String ad;
    public final String vip;

    public /* synthetic */ C11172e(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.ad = BuildConfig.FLAVOR;
        } else {
            this.ad = str;
        }
        if ((i & 2) == 0) {
            this.vip = BuildConfig.FLAVOR;
        } else {
            this.vip = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11172e)) {
            return false;
        }
        C11172e c11172e = (C11172e) obj;
        return AbstractC7890e.billing(this.ad, c11172e.ad) && AbstractC7890e.billing(this.vip, c11172e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC17861e.subscription("UnknownError(error=", this.ad, ", errorDescription=", this.vip, ")");
    }
}
