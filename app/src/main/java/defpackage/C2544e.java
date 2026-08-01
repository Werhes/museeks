package defpackage;

import j$.util.Objects;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2544e extends AbstractC12699e {
    public final int ad;

    public C2544e(int i) {
        this.ad = i;
    }

    public static C2544e vip(int i) {
        if (i == 16 || i == 32) {
            return new C2544e(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2544e) && ((C2544e) obj).ad == this.ad;
    }

    public final int hashCode() {
        return Objects.hash(C2544e.class, Integer.valueOf(this.ad));
    }

    public final String toString() {
        return AbstractC17861e.smaato(this.ad, "-byte key)", new StringBuilder("AesCmac PRF Parameters ("));
    }
}
