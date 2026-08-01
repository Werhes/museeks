package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1613e extends AbstractC18001e implements InterfaceC18430e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC5083e f4530e;

    public C1613e(InterfaceC5083e interfaceC5083e, InterfaceC8850e interfaceC8850e) {
        super(interfaceC8850e, true);
        this.f4530e = interfaceC5083e;
    }

    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public void mo654e() {
    }

    @Override // defpackage.C6467e
    public void remoteconfig(Object obj) {
        AbstractC7214e.advert(AbstractC10558e.startapp(this.f4530e), AbstractC14161e.billing(obj));
    }

    @Override // defpackage.C6467e
    public void signatures(Object obj) {
        this.f4530e.billing(AbstractC14161e.billing(obj));
    }

    @Override // defpackage.C6467e
    /* renamed from: transient, reason: not valid java name */
    public final boolean mo655transient() {
        return true;
    }

    @Override // defpackage.InterfaceC18430e
    public final InterfaceC18430e vip() {
        InterfaceC5083e interfaceC5083e = this.f4530e;
        if (interfaceC5083e instanceof InterfaceC18430e) {
            return (InterfaceC18430e) interfaceC5083e;
        }
        return null;
    }
}
