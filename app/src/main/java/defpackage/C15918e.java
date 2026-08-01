package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15918e implements InterfaceC6347e {
    public final C13000e ad;
    public final int license;
    public final long metrica;
    public final SparseArray vip;

    public C15918e(SparseArray sparseArray, long j, int i, long j2, long j3) {
        C13000e c13000e;
        int i2;
        this.vip = sparseArray;
        this.metrica = j;
        this.license = i;
        List list = (List) sparseArray.get(i);
        if (list == null || list.isEmpty()) {
            c13000e = null;
        } else {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C17537e c17537e = (C17537e) list.get(i4);
                jArr3[i4] = c17537e.f34384e;
                jArr[i4] = c17537e.f34383e;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                jArr2[i3] = jArr3[i5] - jArr3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArr3[i6] >= j) {
                i6--;
            }
            iArr[i6] = (int) ((j2 + j3) - jArr[i6]);
            jArr2[i6] = j - jArr3[i6];
            if (i6 < i2) {
                AbstractC2803e.smaato("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArr = Arrays.copyOf(iArr, i7);
                jArr = Arrays.copyOf(jArr, i7);
                jArr2 = Arrays.copyOf(jArr2, i7);
                jArr3 = Arrays.copyOf(jArr3, i7);
            }
            c13000e = new C13000e(iArr, jArr, jArr2, jArr3);
        }
        this.ad = c13000e;
    }

    @Override // defpackage.InterfaceC6347e
    public final C13178e appmetrica(long j) {
        C13000e c13000e = this.ad;
        if (c13000e != null) {
            return c13000e.appmetrica(j);
        }
        C7278e c7278e = C7278e.metrica;
        return new C13178e(c7278e, c7278e);
    }

    @Override // defpackage.InterfaceC6347e
    public final long billing() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC6347e
    public final /* synthetic */ boolean license() {
        return false;
    }

    @Override // defpackage.InterfaceC6347e
    public final boolean vip() {
        List list = (List) this.vip.get(this.license);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
