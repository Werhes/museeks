package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؑٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8423e extends C1613e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f17194e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8423e(InterfaceC8850e interfaceC8850e, InterfaceC5083e interfaceC5083e, int i) {
        super(interfaceC5083e, interfaceC8850e);
        this.f17194e = i;
    }

    @Override // defpackage.C6467e
    /* renamed from: class */
    public final boolean mo2166class(Throwable th) {
        switch (this.f17194e) {
            case 0:
                if (th instanceof C8405e) {
                    return true;
                }
                return isPro(th);
            default:
                return false;
        }
    }
}
