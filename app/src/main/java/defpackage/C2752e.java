package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٞٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2752e implements InterfaceC14620e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C12850e f6659e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f6660e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0971e f6661e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C18540e f6662e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f6663e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC12864e f6664e;

    public C2752e(long j, C0971e c0971e, long j2) {
        C18540e c18540e = C18540e.f36378e;
        this.f6663e = j;
        this.f6661e = c0971e;
        this.f6660e = j2;
        this.f6662e = c18540e;
        C1040e c1040e = new C1040e(this, 2);
        C15102e c15102e = new C15102e(c1040e, c0971e, j);
        C18524e c18524e = new C18524e(c1040e, c0971e, j);
        C8128e c8128e = new C8128e(c18524e, c15102e, null, new C6348e(c18524e, c15102e, 1), 4);
        InterfaceC15690e.ad.getClass();
        this.f6664e = AbstractC3192e.metrica(c8128e, AbstractC16653e.vip);
    }

    @Override // defpackage.InterfaceC14620e
    public final void ad() {
        C12850e c12850e = this.f6659e;
        if (c12850e != null) {
            this.f6661e.license(c12850e);
            this.f6659e = null;
        }
    }

    public final void license(C12476e c12476e) {
        C16784e c16784e;
        C12476e c12476e2 = (C12476e) this.f6662e.f36382e;
        if (c12476e2 != null && !AbstractC7890e.billing(c12476e2.ad.ad, c12476e.ad.ad) && (c16784e = this.f6661e.startapp) != null) {
            c16784e.invoke(Long.valueOf(this.f6663e));
        }
        this.f6662e = C18540e.applovin(this.f6662e, null, c12476e, 1);
    }

    @Override // defpackage.InterfaceC14620e
    public final void metrica() {
        C1040e c1040e = new C1040e(this, 0);
        C1040e c1040e2 = new C1040e(this, 1);
        long j = this.f6663e;
        C12850e c12850e = new C12850e(j, c1040e, c1040e2);
        C0971e c0971e = this.f6661e;
        C16529e c16529e = c0971e.metrica;
        if (j == 0) {
            AbstractC8889e.ad("The selectable contains an invalid id: " + j);
        }
        if (c16529e.vip(j)) {
            AbstractC8889e.ad("Another selectable with the id: " + c12850e + ".selectableId has already subscribed.");
        }
        c16529e.yandex(j, c12850e);
        c0971e.vip.add(c12850e);
        c0971e.ad = false;
        this.f6659e = c12850e;
    }

    @Override // defpackage.InterfaceC14620e
    public final void vip() {
        C12850e c12850e = this.f6659e;
        if (c12850e != null) {
            this.f6661e.license(c12850e);
            this.f6659e = null;
        }
    }
}
