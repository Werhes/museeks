package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6645e implements InterfaceC13646e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13886e f13715e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C8014e f13717e;
    private volatile /* synthetic */ Object receiveChannel = null;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f13716e = AbstractC18039e.appmetrica(3, new C14515e(15, this));

    public AbstractC6645e(C8014e c8014e) {
        this.f13717e = c8014e;
        C13886e c13886e = new C13886e(c8014e.f16270e.f25998e, 0);
        C13886e c13886e2 = c8014e.f16270e.f25995e;
        c13886e.f9083e.clear();
        if (c13886e.f9082e != 0) {
            throw new IllegalStateException("Check failed.");
        }
        c13886e.metrica(c13886e2);
        this.f13715e = c13886e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC2861e
    public final InterfaceC18107e ad() {
        return (InterfaceC18107e) this.f13716e.getValue();
    }

    @Override // defpackage.InterfaceC2861e
    public final /* bridge */ /* synthetic */ InterfaceC6141e metrica() {
        return this.f13717e;
    }

    @Override // defpackage.InterfaceC2861e
    public final InterfaceC13033e mopub() {
        InterfaceC13033e interfaceC13033e = (InterfaceC13033e) this.receiveChannel;
        return interfaceC13033e == null ? ((C14219e) this).f28092e : interfaceC13033e;
    }

    @Override // defpackage.InterfaceC13646e
    public final C13886e subscription() {
        return this.f13715e;
    }
}
