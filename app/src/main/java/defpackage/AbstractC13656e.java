package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۧۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13656e {
    public final Object ad;

    public AbstractC13656e(Object obj) {
        this.ad = obj;
    }

    public abstract AbstractC1186e ad(InterfaceC5334e interfaceC5334e);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object vip = vip();
        AbstractC13656e abstractC13656e = obj instanceof AbstractC13656e ? (AbstractC13656e) obj : null;
        return AbstractC7890e.billing(vip, abstractC13656e != null ? abstractC13656e.vip() : null);
    }

    public final int hashCode() {
        Object vip = vip();
        if (vip != null) {
            return vip.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(vip());
    }

    public Object vip() {
        return this.ad;
    }
}
