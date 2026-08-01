package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18532e extends AbstractC15286e {
    public final int ad;
    public final boolean license;
    public final String metrica;
    public final String vip;

    public C18532e(int i, String str, String str2, boolean z) {
        this.ad = i;
        this.vip = str;
        this.metrica = str2;
        this.license = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC15286e) {
            C18532e c18532e = (C18532e) ((AbstractC15286e) obj);
            if (this.ad == c18532e.ad && this.vip.equals(c18532e.vip) && this.metrica.equals(c18532e.metrica) && this.license == c18532e.license) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.ad ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ (this.license ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.ad);
        sb.append(", version=");
        sb.append(this.vip);
        sb.append(", buildVersion=");
        sb.append(this.metrica);
        sb.append(", jailbroken=");
        return AbstractC8703e.signatures(sb, this.license, "}");
    }
}
