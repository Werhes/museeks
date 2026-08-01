package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6295e implements InterfaceC1848e {
    public static final C6295e ad = new Object();
    public static final C7369e vip = new C7369e("imageFormat", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(1))));
    public static final C7369e metrica = new C7369e("originalImageSize", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(2))));
    public static final C7369e license = new C7369e("compressedImageSize", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(3))));
    public static final C7369e appmetrica = new C7369e("isOdmlImage", AbstractC10257e.Signature(AbstractC1414e.adcel(InterfaceC3058e.class, new C3976e(4))));

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        C10456e c10456e = (C10456e) obj;
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        interfaceC14209e.ad(vip, c10456e.ad);
        interfaceC14209e.ad(metrica, c10456e.vip);
        interfaceC14209e.ad(license, null);
        interfaceC14209e.ad(appmetrica, null);
    }
}
