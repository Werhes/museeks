package defpackage;

import java.util.Arrays;

/* renamed from: eٜؔؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2712e {
    public final int[] ad;

    public C2712e(int[] iArr) {
        this.ad = AbstractC12442e.appmetrica(iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2712e) {
            return Arrays.equals(this.ad, ((C2712e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.ad;
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }
}
