package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۧٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6810e extends AbstractC2803e implements InterfaceC1012e {
    public final String license;
    public final String metrica;
    public final String vip;

    public C6810e(String str, String str2, String str3) {
        this.vip = str;
        this.metrica = str2;
        this.license = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6810e)) {
            return false;
        }
        C6810e c6810e = (C6810e) obj;
        return AbstractC7890e.billing(this.vip, c6810e.vip) && AbstractC7890e.billing(this.metrica, c6810e.metrica) && AbstractC7890e.billing(this.license, c6810e.license);
    }

    public final int hashCode() {
        int hashCode = this.vip.hashCode() * 31;
        String str = this.metrica;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.license;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = BuildConfig.FLAVOR;
        String str2 = this.metrica;
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        sb.append(str2);
        sb.append('{');
        sb.append(this.vip);
        sb.append("?}");
        String str3 = this.license;
        if (str3 != null) {
            str = str3;
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.AbstractC2803e
    public final AbstractC9510e yandex(C1740e c1740e, int i) {
        ?? r4 = c1740e.f4739e;
        return AbstractC15182e.metrica(i, this.vip, this.metrica, this.license, r4, true);
    }
}
