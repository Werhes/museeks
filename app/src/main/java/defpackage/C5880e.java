package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۙ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5880e implements InterfaceC5366e {
    public final int ad;
    public final int vip;

    public C5880e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        AbstractC5525e.ad("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.InterfaceC5366e
    public final void ad(C11199e c11199e) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.ad) {
                int i4 = i3 + 1;
                int i5 = c11199e.f22464e;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(c11199e.license((i5 - i4) + (-1))) && Character.isLowSurrogate(c11199e.license(c11199e.f22464e - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.vip) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = c11199e.f22463e;
            C9831e c9831e = (C9831e) c11199e.f22467e;
            if (i8 + i7 >= c9831e.m2700interface()) {
                i6 = c9831e.m2700interface() - c11199e.f22463e;
                break;
            } else {
                i6 = (Character.isHighSurrogate(c11199e.license((c11199e.f22463e + i7) + (-1))) && Character.isLowSurrogate(c11199e.license(c11199e.f22463e + i7))) ? i6 + 2 : i7;
                i++;
            }
        }
        int i9 = c11199e.f22463e;
        c11199e.ad(i9, i6 + i9);
        int i10 = c11199e.f22464e;
        c11199e.ad(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5880e)) {
            return false;
        }
        C5880e c5880e = (C5880e) obj;
        return this.ad == c5880e.ad && this.vip == c5880e.vip;
    }

    public final int hashCode() {
        return (this.ad * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.ad);
        sb.append(", lengthAfterCursor=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
