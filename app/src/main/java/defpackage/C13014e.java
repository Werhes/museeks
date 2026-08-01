package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13014e implements InterfaceC8287e {
    public final Throwable metrica;
    public final C13578e vip;

    public C13014e(C13578e c13578e) {
        this.vip = c13578e;
        String property = System.getProperty("io.ktor.development");
        if (property == null || !Boolean.parseBoolean(property)) {
            return;
        }
        int hashCode = c13578e.hashCode();
        AbstractC15211e.ad(16);
        Throwable th = new Throwable("WriteTask 0x".concat(Integer.toString(hashCode, 16)));
        AbstractC13362e.advert(th);
        this.metrica = th;
    }

    @Override // defpackage.InterfaceC8287e
    public final void ad(Throwable th) {
        Object obj;
        InterfaceC5083e license = license();
        if (th != null) {
            obj = new C12763e(th);
        } else {
            InterfaceC9329e.ad.getClass();
            obj = C13433e.metrica;
        }
        ((C13578e) license).billing(obj);
    }

    public final InterfaceC5083e license() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC8287e
    public final Throwable metrica() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC8287e
    public final void vip() {
        InterfaceC5083e license = license();
        InterfaceC9329e.ad.getClass();
        ((C13578e) license).billing(C13433e.metrica);
    }
}
