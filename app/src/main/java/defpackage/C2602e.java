package defpackage;

import j$.util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2602e {
    public final boolean ad;
    public final Set metrica;
    public final Set vip;

    public C2602e(boolean z, HashSet hashSet, HashSet hashSet2) {
        this.ad = z;
        this.vip = hashSet == null ? Collections.EMPTY_SET : new HashSet(hashSet);
        this.metrica = hashSet2 == null ? Collections.EMPTY_SET : new HashSet(hashSet2);
    }

    public final boolean ad(Class cls, boolean z) {
        if (this.vip.contains(cls)) {
            return true;
        }
        return !this.metrica.contains(cls) && this.ad && z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2602e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C2602e c2602e = (C2602e) obj;
        return this.ad == c2602e.ad && Objects.equals(this.vip, c2602e.vip) && Objects.equals(this.metrica, c2602e.metrica);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.ad), this.vip, this.metrica);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.ad + ", forceEnabledQuirks=" + this.vip + ", forceDisabledQuirks=" + this.metrica + '}';
    }
}
