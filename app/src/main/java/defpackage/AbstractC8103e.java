package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٞ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8103e extends AbstractC14048e implements Set, j$.util.Set {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient AbstractC2358e f16452e;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this && this != obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            try {
                if (size() != set.size()) {
                    return false;
                }
                if (!containsAll(set)) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
