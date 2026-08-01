package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15273e implements InterfaceC14745e, InterfaceC10212e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5830e f30202e;

    public C15273e(AbstractC5830e abstractC5830e) {
        this.f30202e = abstractC5830e;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC14745e) && (obj instanceof InterfaceC10212e)) {
            return vip().equals(((InterfaceC10212e) obj).vip());
        }
        return false;
    }

    public final int hashCode() {
        return vip().hashCode();
    }

    @Override // defpackage.InterfaceC10212e
    public final InterfaceC12561e vip() {
        return new C7460e(1, this.f30202e, AbstractC5830e.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0, 0);
    }
}
