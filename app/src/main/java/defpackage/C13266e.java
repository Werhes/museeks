package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13266e implements InterfaceC5366e {
    public final int ad;
    public final int vip;

    public C13266e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        AbstractC5525e.ad("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.InterfaceC5366e
    public final void ad(C11199e c11199e) {
        int i = c11199e.f22463e;
        C9831e c9831e = (C9831e) c11199e.f22467e;
        int i2 = this.vip;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = c9831e.m2700interface();
        }
        c11199e.ad(c11199e.f22463e, Math.min(i3, c9831e.m2700interface()));
        int i4 = c11199e.f22464e;
        int i5 = this.ad;
        int i6 = i4 - i5;
        if (((i4 ^ i6) & (i5 ^ i4)) < 0) {
            i6 = 0;
        }
        c11199e.ad(Math.max(0, i6), c11199e.f22464e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13266e)) {
            return false;
        }
        C13266e c13266e = (C13266e) obj;
        return this.ad == c13266e.ad && this.vip == c13266e.vip;
    }

    public final int hashCode() {
        return (this.ad * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.ad);
        sb.append(", lengthAfterCursor=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
