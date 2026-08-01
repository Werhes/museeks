package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14830e {
    public final HashSet ad = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14830e.class != obj.getClass()) {
            return false;
        }
        return this.ad.equals(((C14830e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
