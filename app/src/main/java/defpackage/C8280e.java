package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۡۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8280e {
    public final LinkedHashMap ad;

    public C8280e(LinkedHashMap linkedHashMap) {
        this.ad = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8280e) {
            return this.ad.equals(((C8280e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return this.ad.toString();
    }
}
