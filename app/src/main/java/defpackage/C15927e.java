package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٖؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15927e {
    public static final C10632e Companion = new Object();
    public final String ad;
    public final long metrica;
    public final int vip;

    public /* synthetic */ C15927e(int i, int i2, long j, String str) {
        this.ad = (i & 1) == 0 ? BuildConfig.FLAVOR : str;
        this.vip = (i & 2) == 0 ? 0 : i2;
        if ((i & 4) == 0) {
            this.metrica = 0L;
        } else {
            this.metrica = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15927e)) {
            return false;
        }
        C15927e c15927e = (C15927e) obj;
        return AbstractC7890e.billing(this.ad, c15927e.ad) && this.vip == c15927e.vip && this.metrica == c15927e.metrica;
    }

    public final int hashCode() {
        int hashCode = ((this.ad.hashCode() * 31) + this.vip) * 31;
        long j = this.metrica;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return AbstractC5087e.m1750native(this.metrica, ")", AbstractC10257e.smaato("AudioAddResponseNewIdDto(rawId=", this.ad, ", newAudioId=", this.vip, ", newOwnerId="));
    }
}
