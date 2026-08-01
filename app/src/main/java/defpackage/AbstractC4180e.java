package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4180e {
    public static final Object[] ad = new Object[0];
    public static final C12328e vip = new C12328e(0);

    public static final void ad(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            AbstractC14783e.yandex("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void vip(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            AbstractC14783e.billing("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            AbstractC14783e.yandex("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        AbstractC14783e.yandex("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
