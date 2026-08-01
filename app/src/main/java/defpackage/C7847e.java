package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7847e implements InterfaceC14449e {
    public final InterfaceC14449e metrica;
    public final /* synthetic */ int vip;

    public C7847e(long j, int i) {
        this.vip = i;
        switch (i) {
            case 1:
                this.metrica = new C14183e(j, new C9731e(j));
                return;
            default:
                this.metrica = new C7847e(j, 1);
                return;
        }
    }

    @Override // defpackage.InterfaceC14449e
    public final long ad() {
        switch (this.vip) {
            case 0:
                return ((C14183e) ((C7847e) this.metrica).metrica).vip;
            default:
                return ((C14183e) this.metrica).vip;
        }
    }

    @Override // defpackage.InterfaceC14449e
    public final C13497e vip(C15475e c15475e) {
        switch (this.vip) {
            case 0:
                if (((C14183e) ((C7847e) this.metrica).metrica).vip(c15475e).vip) {
                    return C13497e.appmetrica;
                }
                Throwable th = (Throwable) c15475e.metrica;
                if (th instanceof C7858e) {
                    AbstractC9464e.adcel("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((C7858e) th).f15908e > 0) {
                        return C13497e.purchase;
                    }
                }
                return C13497e.license;
            default:
                return ((C14183e) this.metrica).vip(c15475e);
        }
    }
}
