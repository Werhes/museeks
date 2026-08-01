package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10602e extends AbstractC10782e {
    public final int ad;
    public final long appmetrica;
    public final int billing;
    public final long license;
    public final int metrica;
    public final boolean purchase;
    public final String startapp;
    public final String vip;
    public final String yandex;

    public C10602e(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.ad = i;
        this.vip = str;
        this.metrica = i2;
        this.license = j;
        this.appmetrica = j2;
        this.purchase = z;
        this.billing = i3;
        this.yandex = str2;
        this.startapp = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10782e) {
            C10602e c10602e = (C10602e) ((AbstractC10782e) obj);
            if (this.ad == c10602e.ad && this.vip.equals(c10602e.vip) && this.metrica == c10602e.metrica && this.license == c10602e.license && this.appmetrica == c10602e.appmetrica && this.purchase == c10602e.purchase && this.billing == c10602e.billing && this.yandex.equals(c10602e.yandex) && this.startapp.equals(c10602e.startapp)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.ad ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica) * 1000003;
        long j = this.license;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.appmetrica;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.purchase ? 1231 : 1237)) * 1000003) ^ this.billing) * 1000003) ^ this.yandex.hashCode()) * 1000003) ^ this.startapp.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.ad);
        sb.append(", model=");
        sb.append(this.vip);
        sb.append(", cores=");
        sb.append(this.metrica);
        sb.append(", ram=");
        sb.append(this.license);
        sb.append(", diskSpace=");
        sb.append(this.appmetrica);
        sb.append(", simulator=");
        sb.append(this.purchase);
        sb.append(", state=");
        sb.append(this.billing);
        sb.append(", manufacturer=");
        sb.append(this.yandex);
        sb.append(", modelClass=");
        return AbstractC1786e.signatures(sb, this.startapp, "}");
    }
}
