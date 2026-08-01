package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14442e implements InterfaceC9093e, InterfaceC8108e {
    public final InterfaceC9093e ad;
    public final int metrica;
    public final int vip;

    public C14442e(InterfaceC9093e interfaceC9093e, int i, int i2) {
        this.ad = interfaceC9093e;
        this.vip = i;
        this.metrica = i2;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "startIndex should be non-negative, but is ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i2, "endIndex should be non-negative, but is ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i2, i, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // defpackage.InterfaceC8108e
    public final InterfaceC9093e ad(int i) {
        int i2 = this.metrica;
        int i3 = this.vip;
        return i >= i2 - i3 ? C7671e.ad : new C14442e(this.ad, i3 + i, i2);
    }

    @Override // defpackage.InterfaceC9093e
    public final Iterator iterator() {
        return new C5143e(this);
    }

    @Override // defpackage.InterfaceC8108e
    public final InterfaceC9093e take() {
        int i = this.metrica;
        int i2 = this.vip;
        if (40 >= i - i2) {
            return this;
        }
        return new C14442e(this.ad, i2, i2 + 40);
    }
}
