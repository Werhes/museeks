package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Leٌٓؔ;", "Leُٖؓ;", "Leَۚٗ;", "<init>", "()V", "io.realm.kotlin.library"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: eٌٓؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C13861e implements InterfaceC16120e, InterfaceC10518e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C13655e f27457e;

    @Override // defpackage.InterfaceC16120e
    public InterfaceC17101e Signature(String str) {
        return ad(AbstractC3820e.ad.vip(InterfaceC16120e.class), str);
    }

    public C9889e ad(InterfaceC7227e interfaceC7227e, String str) {
        return C12575e.admob(this.f27457e, str, interfaceC7227e, false, false);
    }

    @Override // defpackage.InterfaceC16120e
    public Object admob(InterfaceC7227e interfaceC7227e, String str) {
        return C12575e.Signature(this.f27457e, str, interfaceC7227e, false, false);
    }

    @Override // defpackage.InterfaceC16120e
    public Object ads(InterfaceC7227e interfaceC7227e, String str) {
        return C12575e.Signature(this.f27457e, str, interfaceC7227e, true, false);
    }

    @Override // defpackage.InterfaceC10518e
    public final void isVip(C13655e c13655e) {
        this.f27457e = c13655e;
    }

    @Override // defpackage.InterfaceC10518e
    /* renamed from: premium, reason: from getter */
    public final C13655e getF36702e() {
        return this.f27457e;
    }

    @Override // defpackage.InterfaceC16120e
    public InterfaceC16120e startapp(String str) {
        return (InterfaceC16120e) ads(AbstractC3820e.ad.vip(InterfaceC16120e.class), str);
    }
}
