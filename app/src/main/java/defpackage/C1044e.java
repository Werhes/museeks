package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1044e extends AbstractC14681e {
    public final byte[] appmetrica;
    public final String license;
    public final String metrica;
    public final String vip;

    public C1044e(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.vip = str;
        this.metrica = str2;
        this.license = str3;
        this.appmetrica = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1044e.class == obj.getClass()) {
            C1044e c1044e = (C1044e) obj;
            if (Objects.equals(this.vip, c1044e.vip) && Objects.equals(this.metrica, c1044e.metrica) && Objects.equals(this.license, c1044e.license) && Arrays.equals(this.appmetrica, c1044e.appmetrica)) {
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
        return Arrays.hashCode(this.appmetrica) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // defpackage.AbstractC14681e
    public final String toString() {
        return this.ad + ": mimeType=" + this.vip + ", filename=" + this.metrica + ", description=" + this.license;
    }
}
