package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۙۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16472e extends AbstractC16257e {
    @Override // defpackage.AbstractC16257e
    public final AbstractC16232e billing(InterfaceC5021e interfaceC5021e) {
        InterfaceC17348e interfaceC17348e = interfaceC5021e instanceof InterfaceC17348e ? (InterfaceC17348e) interfaceC5021e : null;
        if (interfaceC17348e == null) {
            return null;
        }
        return interfaceC17348e.isPro().metrica() ? new C7878e(3, interfaceC17348e.isPro().vip()) : interfaceC17348e.isPro();
    }
}
