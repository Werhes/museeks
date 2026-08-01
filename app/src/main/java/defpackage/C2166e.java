package defpackage;

import java.util.Arrays;
import java.util.Random;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۢؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2166e {
    public final Random ad;
    public final int[] metrica;
    public final int[] vip;

    public C2166e() {
        this(new Random());
    }

    public C2166e(Random random) {
        this(new int[0], random);
    }

    public C2166e(int[] iArr, Random random) {
        this.vip = iArr;
        this.ad = random;
        this.metrica = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.metrica[iArr[i]] = i;
        }
    }

    public final C2166e ad(int i, int i2) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        int i3 = 0;
        while (true) {
            iArr = this.vip;
            random = this.ad;
            if (i3 >= i2) {
                break;
            }
            iArr2[i3] = random.nextInt(iArr.length + 1);
            int i4 = i3 + 1;
            int nextInt = random.nextInt(i4);
            iArr3[i3] = iArr3[nextInt];
            iArr3[nextInt] = i3 + i;
            i3 = i4;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i2];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr.length + i2; i7++) {
            if (i5 >= i2 || i6 != iArr2[i5]) {
                int i8 = i6 + 1;
                int i9 = iArr[i6];
                iArr4[i7] = i9;
                if (i9 >= i) {
                    iArr4[i7] = i9 + i2;
                }
                i6 = i8;
            } else {
                iArr4[i7] = iArr3[i5];
                i5++;
            }
        }
        return new C2166e(iArr4, new Random(random.nextLong()));
    }
}
