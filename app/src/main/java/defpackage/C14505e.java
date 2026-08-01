package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14505e implements InterfaceC5116e {
    public final int ad;
    public final String vip;

    public C14505e(int i, String str) {
        this.ad = i;
        this.vip = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14505e)) {
            return false;
        }
        C14505e c14505e = (C14505e) obj;
        return this.ad == c14505e.ad && AbstractC7890e.billing(this.vip, c14505e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Installed(timeLeft=");
        sb.append(this.ad);
        sb.append(", timeLeftFormatted=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
