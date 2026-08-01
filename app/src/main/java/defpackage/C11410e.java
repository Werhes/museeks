package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۧۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11410e {
    public final C7452e ad;
    public final InterfaceC10309e vip;

    public C11410e(C7452e c7452e, InterfaceC10309e interfaceC10309e) {
        this.ad = c7452e;
        this.vip = interfaceC10309e;
    }

    public final void ad(C0398e c0398e, C0398e c0398e2) {
        if (AbstractC7890e.billing((C11410e) this.ad.vip.get(), this)) {
            this.vip.purchase(c0398e, c0398e2);
        }
    }
}
