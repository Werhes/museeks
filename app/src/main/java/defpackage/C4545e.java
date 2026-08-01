package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۨ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4545e extends AbstractC15023e implements Serializable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Comparator[] f9829e;

    public C4545e(C3426e c3426e, C3426e c3426e2) {
        this.f9829e = new Comparator[]{c3426e, c3426e2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f9829e;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4545e) {
            return Arrays.equals(this.f9829e, ((C4545e) obj).f9829e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9829e);
    }

    public final String toString() {
        return AbstractC1786e.signatures(new StringBuilder("Ordering.compound("), Arrays.toString(this.f9829e), ")");
    }
}
