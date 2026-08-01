package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔ۠ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15005e extends AbstractC14681e {
    public final byte[] appmetrica;
    public final int license;
    public final String metrica;
    public final String vip;

    public C15005e(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.vip = str;
        this.metrica = str2;
        this.license = i;
        this.appmetrica = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15005e.class == obj.getClass()) {
            C15005e c15005e = (C15005e) obj;
            if (this.license == c15005e.license && Objects.equals(this.vip, c15005e.vip) && Objects.equals(this.metrica, c15005e.metrica) && Arrays.equals(this.appmetrica, c15005e.appmetrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.license) * 31;
        String str = this.vip;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.metrica;
        return Arrays.hashCode(this.appmetrica) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.AbstractC14681e
    public final String toString() {
        return this.ad + ": mimeType=" + this.vip + ", description=" + this.metrica;
    }

    @Override // defpackage.AbstractC14681e, defpackage.InterfaceC16707e
    public final void vip(C4761e c4761e) {
        c4761e.ad(this.license, this.appmetrica);
    }
}
