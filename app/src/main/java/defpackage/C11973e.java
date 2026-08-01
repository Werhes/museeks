package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11973e implements InterfaceC12986e {
    public final String ad;
    public final C18422e vip;

    public C11973e(String str, C18422e c18422e) {
        this.ad = str;
        this.vip = c18422e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C11973e.class.equals(obj != null ? obj.getClass() : null)) {
            return AbstractC7890e.billing(this.ad, ((C11973e) obj).ad);
        }
        return false;
    }

    @Override // defpackage.InterfaceC12986e
    public final String getId() {
        return this.ad;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
