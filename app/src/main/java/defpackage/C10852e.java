package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؙْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10852e extends AbstractC14681e {
    public final byte[] metrica;
    public final String vip;

    public C10852e(String str, byte[] bArr) {
        super("PRIV");
        this.vip = str;
        this.metrica = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10852e.class == obj.getClass()) {
            C10852e c10852e = (C10852e) obj;
            if (Objects.equals(this.vip, c10852e.vip) && Arrays.equals(this.metrica, c10852e.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.vip;
        return Arrays.hashCode(this.metrica) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.AbstractC14681e
    public final String toString() {
        return this.ad + ": owner=" + this.vip;
    }
}
