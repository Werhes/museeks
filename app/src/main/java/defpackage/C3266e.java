package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3266e {
    public static volatile C3266e metrica = new C3266e();
    public final boolean ad;
    public final Function1 vip;

    public C3266e() {
        C10698e c10698e = C10698e.f21085e;
        this.ad = true;
        this.vip = c10698e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3266e)) {
            return false;
        }
        C3266e c3266e = (C3266e) obj;
        return this.ad == c3266e.ad && AbstractC7890e.billing(this.vip, c3266e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + ((38347 + (this.ad ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "DecomposeSettings(duplicateConfigurationsEnabled=false, mainThreadCheckEnabled=" + this.ad + ", onDecomposeError=" + this.vip + ')';
    }
}
