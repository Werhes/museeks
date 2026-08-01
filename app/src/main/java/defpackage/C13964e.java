package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13964e implements InterfaceC10260e, InterfaceC6428e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C4403e f27680e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f27681e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final float f27682e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f27683e;

    public C13964e(float f, boolean z, C4403e c4403e) {
        this.f27683e = f;
        this.f27681e = z;
        this.f27680e = c4403e;
        this.f27682e = f;
    }

    @Override // defpackage.InterfaceC10260e
    public final float appmetrica() {
        return this.f27682e;
    }

    @Override // defpackage.InterfaceC6428e
    public final void billing(InterfaceC14388e interfaceC14388e, int i, int[] iArr, int[] iArr2) {
        tapsense(interfaceC14388e, i, iArr, EnumC7792e.f15794e, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13964e)) {
            return false;
        }
        C13964e c13964e = (C13964e) obj;
        return C15765e.vip(this.f27683e, c13964e.f27683e) && this.f27681e == c13964e.f27681e && AbstractC7890e.billing(this.f27680e, c13964e.f27680e);
    }

    public final int hashCode() {
        int floatToIntBits = ((Float.floatToIntBits(this.f27683e) * 31) + (this.f27681e ? 1231 : 1237)) * 31;
        C4403e c4403e = this.f27680e;
        return floatToIntBits + (c4403e == null ? 0 : c4403e.hashCode());
    }

    @Override // defpackage.InterfaceC10260e
    public final void tapsense(InterfaceC14388e interfaceC14388e, int i, int[] iArr, EnumC7792e enumC7792e, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int mo493e = interfaceC14388e.mo493e(this.f27683e);
        boolean z = this.f27681e && enumC7792e == EnumC7792e.f15793e;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int max = Math.max(0, i - iArr[i3]);
                iArr2[i5] = max;
                i4 = Math.min(mo493e, max);
                i = iArr2[i5] - i4;
                i3++;
                i5++;
            }
            i2 = i + i4;
        } else {
            int length2 = iArr.length;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i6 < length2) {
                int i10 = iArr[i6];
                int min = Math.min(i7, i - i10);
                iArr2[i9] = min;
                int min2 = Math.min(mo493e, (i - min) - i10);
                int i11 = iArr2[i9] + i10 + min2;
                i6++;
                i8 = min2;
                i7 = i11;
                i9++;
            }
            i2 = i - (i7 - i8);
        }
        C4403e c4403e = this.f27680e;
        if (c4403e == null || i2 <= 0) {
            return;
        }
        c4403e.getClass();
        int advert = AbstractC8703e.advert(1, enumC7792e != EnumC7792e.f15794e ? (-1.0f) * (-1) : -1.0f, i2 / 2.0f);
        if (z) {
            advert -= i2;
        }
        if (advert != 0) {
            int length3 = iArr2.length;
            for (int i12 = 0; i12 < length3; i12++) {
                iArr2[i12] = iArr2[i12] + advert;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27681e ? BuildConfig.FLAVOR : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        AbstractC10257e.admob(this.f27683e, sb, ", ");
        sb.append(this.f27680e);
        sb.append(')');
        return sb.toString();
    }
}
