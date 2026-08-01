package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10374e extends AbstractC13359e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f20498e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f20499e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f20500e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20501e;

    public C10374e(C5286e c5286e, int i) {
        this.f20501e = 0;
        this.f20500e = c5286e;
        this.f20498e = i;
        this.f20499e = false;
    }

    public C10374e(C17679e c17679e) {
        this.f20501e = 1;
        this.f20500e = c17679e;
        this.f20499e = false;
        this.f20498e = 0;
    }

    @Override // defpackage.AbstractC13359e, defpackage.InterfaceC18180e
    public void ad() {
        switch (this.f20501e) {
            case 0:
                this.f20499e = true;
                return;
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC18180e
    public final void metrica() {
        switch (this.f20501e) {
            case 0:
                if (this.f20499e) {
                    return;
                }
                ((C5286e) this.f20500e).ad.setVisibility(this.f20498e);
                return;
            default:
                int i = this.f20498e + 1;
                this.f20498e = i;
                C17679e c17679e = (C17679e) this.f20500e;
                if (i == c17679e.ad.size()) {
                    InterfaceC18180e interfaceC18180e = c17679e.license;
                    if (interfaceC18180e != null) {
                        interfaceC18180e.metrica();
                    }
                    this.f20498e = 0;
                    this.f20499e = false;
                    c17679e.appmetrica = false;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.AbstractC13359e, defpackage.InterfaceC18180e
    public final void vip() {
        switch (this.f20501e) {
            case 0:
                ((C5286e) this.f20500e).ad.setVisibility(0);
                return;
            default:
                if (this.f20499e) {
                    return;
                }
                this.f20499e = true;
                InterfaceC18180e interfaceC18180e = ((C17679e) this.f20500e).license;
                if (interfaceC18180e != null) {
                    interfaceC18180e.vip();
                    return;
                }
                return;
        }
    }
}
