package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11446e {
    public final SparseArray ad;
    public C17115e vip;

    public C11446e(int i) {
        this.ad = new SparseArray(i);
    }

    public final void ad(C17115e c17115e, int i, int i2) {
        int ad = c17115e.ad(i);
        SparseArray sparseArray = this.ad;
        C11446e c11446e = sparseArray == null ? null : (C11446e) sparseArray.get(ad);
        if (c11446e == null) {
            c11446e = new C11446e(1);
            sparseArray.put(c17115e.ad(i), c11446e);
        }
        if (i2 > i) {
            c11446e.ad(c17115e, i + 1, i2);
        } else {
            c11446e.vip = c17115e;
        }
    }
}
