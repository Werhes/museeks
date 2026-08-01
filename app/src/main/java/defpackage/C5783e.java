package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5783e {
    public final EnumC6335e ad;
    public final InterfaceC14003e vip;

    public C5783e(EnumC6335e enumC6335e, InterfaceC14003e interfaceC14003e) {
        this.ad = enumC6335e;
        this.vip = interfaceC14003e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5783e)) {
            return false;
        }
        C5783e c5783e = (C5783e) obj;
        return this.ad == c5783e.ad && Objects.equals(this.vip, c5783e.vip);
    }

    public final int hashCode() {
        return Objects.hash(this.ad, this.vip);
    }
}
