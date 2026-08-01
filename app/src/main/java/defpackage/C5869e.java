package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘؙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5869e {
    public static final C3453e Companion = new Object();
    public final int ad;
    public final String appmetrica;
    public final String license;
    public final String metrica;
    public final int purchase;
    public final long vip;

    public C5869e(int i, int i2, long j, String str, String str2, String str3) {
        this.ad = i;
        this.vip = j;
        this.metrica = str;
        this.license = str2;
        this.appmetrica = str3;
        this.purchase = i2;
    }

    public /* synthetic */ C5869e(int i, int i2, long j, String str, String str2, String str3, int i3) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C11250e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = j;
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str;
        }
        if ((i & 8) == 0) {
            this.license = BuildConfig.FLAVOR;
        } else {
            this.license = str2;
        }
        if ((i & 16) == 0) {
            this.appmetrica = BuildConfig.FLAVOR;
        } else {
            this.appmetrica = str3;
        }
        if ((i & 32) == 0) {
            this.purchase = 0;
        } else {
            this.purchase = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5869e)) {
            return false;
        }
        C5869e c5869e = (C5869e) obj;
        return this.ad == c5869e.ad && this.vip == c5869e.vip && AbstractC7890e.billing(this.metrica, c5869e.metrica) && AbstractC7890e.billing(this.license, c5869e.license) && AbstractC7890e.billing(this.appmetrica, c5869e.appmetrica) && this.purchase == c5869e.purchase;
    }

    public final int hashCode() {
        int i = this.ad * 31;
        long j = this.vip;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.metrica;
        return AbstractC1786e.advert(AbstractC1786e.advert((i2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.license), 31, this.appmetrica) + this.purchase;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistScreenArgs(id=");
        sb.append(this.ad);
        sb.append(", ownerId=");
        sb.append(this.vip);
        sb.append(", accessKey=");
        sb.append(this.metrica);
        sb.append(", artworkUrl=");
        sb.append(this.license);
        sb.append(", title=");
        sb.append(this.appmetrica);
        sb.append(", colorInt=");
        return AbstractC1786e.pro(sb, this.purchase, ')');
    }
}
