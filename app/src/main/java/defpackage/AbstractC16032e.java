package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16032e {
    public static final void ad(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            metrica(i, size);
        }
    }

    private static final void appmetrica(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    private static final void license(int i) {
        throw new IndexOutOfBoundsException(AbstractC1634e.smaato("fromIndex (", i, ") is less than 0."));
    }

    private static final void metrica(int i, int i2) {
        throw new IndexOutOfBoundsException(AbstractC8647e.inmobi(i, i2, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void purchase(int i, int i2) {
        throw new IllegalArgumentException(AbstractC8647e.inmobi(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }

    public static final void vip(int i, int i2, List list) {
        if (i > i2) {
            purchase(i, i2);
        }
        if (i < 0) {
            license(i);
        }
        if (i2 > list.size()) {
            appmetrica(i2, list.size());
        }
    }
}
