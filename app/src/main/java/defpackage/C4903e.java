package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4903e {
    public final EnumC10061e ad;
    public final List appmetrica;
    public final String license;
    public final List metrica;
    public final String vip;

    public C4903e(EnumC10061e enumC10061e, String str, List list, String str2, List list2) {
        this.ad = enumC10061e;
        this.vip = str;
        this.metrica = list == null ? null : DesugarCollections.unmodifiableList(list);
        this.license = str2;
        this.appmetrica = list2 != null ? DesugarCollections.unmodifiableList(list2) : null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4903e)) {
            return false;
        }
        C4903e c4903e = (C4903e) obj;
        return Objects.equals(this.metrica, c4903e.metrica) && Objects.equals(this.license, c4903e.license) && Objects.equals(this.appmetrica, c4903e.appmetrica) && Objects.equals(this.ad, c4903e.ad) && Objects.equals(this.vip, c4903e.vip);
    }

    public final int hashCode() {
        return Objects.hash(this.metrica, this.license, this.appmetrica, this.ad, this.vip);
    }
}
