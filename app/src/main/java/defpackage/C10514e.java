package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10514e extends AbstractC14681e {
    public final String license;
    public final String metrica;
    public final String vip;

    public C10514e(String str, String str2, String str3) {
        super("COMM");
        this.vip = str;
        this.metrica = str2;
        this.license = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10514e.class == obj.getClass()) {
            C10514e c10514e = (C10514e) obj;
            if (Objects.equals(this.metrica, c10514e.metrica) && Objects.equals(this.vip, c10514e.vip) && Objects.equals(this.license, c10514e.license)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.vip;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.metrica;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.license;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // defpackage.AbstractC14681e
    public final String toString() {
        return this.ad + ": language=" + this.vip + ", description=" + this.metrica + ", text=" + this.license;
    }
}
