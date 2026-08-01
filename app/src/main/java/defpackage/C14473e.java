package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14473e extends AbstractC14681e {
    public final long appmetrica;
    public final AbstractC14681e[] billing;
    public final int license;
    public final int metrica;
    public final long purchase;
    public final String vip;

    public C14473e(String str, int i, int i2, long j, long j2, AbstractC14681e[] abstractC14681eArr) {
        super("CHAP");
        this.vip = str;
        this.metrica = i;
        this.license = i2;
        this.appmetrica = j;
        this.purchase = j2;
        this.billing = abstractC14681eArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14473e.class == obj.getClass()) {
            C14473e c14473e = (C14473e) obj;
            if (this.metrica == c14473e.metrica && this.license == c14473e.license && this.appmetrica == c14473e.appmetrica && this.purchase == c14473e.purchase && Objects.equals(this.vip, c14473e.vip) && Arrays.equals(this.billing, c14473e.billing)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((527 + this.metrica) * 31) + this.license) * 31) + ((int) this.appmetrica)) * 31) + ((int) this.purchase)) * 31;
        String str = this.vip;
        return i + (str != null ? str.hashCode() : 0);
    }
}
