package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17615e {
    public static final C17615e vip;
    public final AbstractC12614e ad;

    static {
        C15816e c15816e = new C15816e(25, false);
        c15816e.f31190e = AbstractC12614e.Signature(2, 1, 5);
        vip = new C17615e(c15816e);
    }

    public C17615e(C15816e c15816e) {
        this.ad = (AbstractC12614e) c15816e.f31190e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C17615e) && this.ad.equals(((C17615e) obj).ad);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.ad, null, null, bool, bool, bool, bool, bool);
    }
}
