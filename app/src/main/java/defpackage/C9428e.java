package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9428e extends Cpackage {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f18765e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AutoCloseable f18766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9428e(AutoCloseable autoCloseable, int i) {
        super(9, false);
        this.f18765e = i;
        this.f18766e = autoCloseable;
    }

    @Override // defpackage.Cpackage
    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean mo2574e() {
        switch (this.f18765e) {
            case 0:
                return ((InterfaceC17430e) this.f18766e).yandex();
            default:
                return ((InterfaceC4895e) this.f18766e).yandex();
        }
    }

    @Override // defpackage.Cpackage
    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final int mo2575e() {
        switch (this.f18765e) {
            case 0:
                InterfaceC17430e interfaceC17430e = (InterfaceC17430e) this.f18766e;
                if (interfaceC17430e instanceof C12402e) {
                    return AbstractC5756e.vip((C12402e) interfaceC17430e);
                }
                interfaceC17430e.admob(1L);
                byte license = interfaceC17430e.metrica().license(0L);
                if ((license & 224) == 192) {
                    interfaceC17430e.admob(2L);
                } else if ((license & 240) == 224) {
                    interfaceC17430e.admob(3L);
                } else if ((license & 248) == 240) {
                    interfaceC17430e.admob(4L);
                }
                return AbstractC5756e.vip(interfaceC17430e.metrica());
            default:
                return ((InterfaceC4895e) this.f18766e).mo1687instanceof();
        }
    }
}
