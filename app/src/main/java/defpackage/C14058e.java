package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14058e extends AbstractC7197e {
    public final byte[] ad;
    public final byte[] vip;

    public C14058e(byte[] bArr, byte[] bArr2) {
        this.ad = bArr;
        this.vip = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7197e) {
            AbstractC7197e abstractC7197e = (AbstractC7197e) obj;
            boolean z = abstractC7197e instanceof C14058e;
            C14058e c14058e = (C14058e) abstractC7197e;
            if (Arrays.equals(this.ad, z ? c14058e.ad : c14058e.ad)) {
                C14058e c14058e2 = (C14058e) abstractC7197e;
                if (Arrays.equals(this.vip, z ? c14058e2.vip : c14058e2.vip)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.ad) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.vip);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.ad) + ", encryptedBlob=" + Arrays.toString(this.vip) + "}";
    }
}
