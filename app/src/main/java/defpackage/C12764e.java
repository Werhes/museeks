package defpackage;

import android.util.SparseArray;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۜۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12764e {
    public SparseArray ad;
    public Set metrica;
    public int vip;

    public final C9997e ad(int i) {
        SparseArray sparseArray = this.ad;
        C9997e c9997e = (C9997e) sparseArray.get(i);
        if (c9997e != null) {
            return c9997e;
        }
        C9997e c9997e2 = new C9997e();
        sparseArray.put(i, c9997e2);
        return c9997e2;
    }
}
