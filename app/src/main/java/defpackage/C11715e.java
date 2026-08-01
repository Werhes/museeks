package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11715e {
    public final SparseBooleanArray ad;

    public C11715e(SparseBooleanArray sparseBooleanArray) {
        this.ad = sparseBooleanArray;
    }

    public final boolean ad(int... iArr) {
        for (int i : iArr) {
            if (this.ad.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11715e)) {
            return false;
        }
        C11715e c11715e = (C11715e) obj;
        SparseBooleanArray sparseBooleanArray = c11715e.ad;
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.ad;
        if (i >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray2.size(); i2++) {
            if (vip(i2) != c11715e.vip(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.ad;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + vip(i2);
        }
        return size;
    }

    public final int vip(int i) {
        SparseBooleanArray sparseBooleanArray = this.ad;
        AbstractC2301e.mopub(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }
}
