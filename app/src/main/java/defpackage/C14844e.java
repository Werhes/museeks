package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14844e extends C14698e {
    public static final /* synthetic */ InterfaceC8614e[] billing = {AbstractC3820e.ad.yandex(new C12156e(C14844e.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};
    public final C0394e purchase;

    /* JADX WARN: Type inference failed for: r0v2, types: [eٖؑٚ, eٖۥٌ] */
    public C14844e(C2430e c2430e, C11980e c11980e) {
        super(c11980e, c2430e, AbstractC0206e.isVip);
        InterfaceC11542e interfaceC11542e = ((C17241e) c11980e.f23950e).ad;
        C3411e c3411e = new C3411e(25, this);
        C6272e c6272e = (C6272e) interfaceC11542e;
        c6272e.getClass();
        this.purchase = new C16622e(c6272e, c3411e);
    }

    @Override // defpackage.C14698e, defpackage.InterfaceC16566e
    public final Map advert() {
        InterfaceC8614e interfaceC8614e = billing[0];
        return (Map) this.purchase.invoke();
    }
}
