package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9254e extends AbstractC15883e {
    public final long ad;
    public final int appmetrica;
    public final long license;
    public final String metrica;
    public final String vip;

    public C9254e(long j, String str, String str2, long j2, int i) {
        this.ad = j;
        this.vip = str;
        this.metrica = str2;
        this.license = j2;
        this.appmetrica = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC15883e) {
            C9254e c9254e = (C9254e) ((AbstractC15883e) obj);
            String str2 = c9254e.metrica;
            if (this.ad == c9254e.ad && this.vip.equals(c9254e.vip) && ((str = this.metrica) != null ? str.equals(str2) : str2 == null) && this.license == c9254e.license && this.appmetrica == c9254e.appmetrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003;
        String str = this.metrica;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.license;
        return ((hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.appmetrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.ad);
        sb.append(", symbol=");
        sb.append(this.vip);
        sb.append(", file=");
        sb.append(this.metrica);
        sb.append(", offset=");
        sb.append(this.license);
        sb.append(", importance=");
        return AbstractC17861e.smaato(this.appmetrica, "}", sb);
    }
}
