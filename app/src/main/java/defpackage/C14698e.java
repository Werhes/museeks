package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C14698e implements InterfaceC14707e {
    public static final /* synthetic */ InterfaceC8614e[] appmetrica = {AbstractC3820e.ad.yandex(new C12156e(C14698e.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};
    public final C12816e ad;
    public final InterfaceC16083e license;
    public final C0394e metrica;
    public final InterfaceC3054e vip;

    /* JADX WARN: Type inference failed for: r3v1, types: [eٖؑٚ, eٖۥٌ] */
    public C14698e(C11980e c11980e, C2430e c2430e, C12816e c12816e) {
        C17241e c17241e = (C17241e) c11980e.f23950e;
        this.ad = c12816e;
        this.vip = c2430e != null ? c17241e.adcel.pro(c2430e) : InterfaceC3054e.f7112e;
        InterfaceC11542e interfaceC11542e = c17241e.ad;
        C12056e c12056e = new C12056e(c11980e, this, 22);
        C6272e c6272e = (C6272e) interfaceC11542e;
        c6272e.getClass();
        this.metrica = new C16622e(c6272e, c12056e);
        this.license = c2430e != null ? (InterfaceC16083e) AbstractC13480e.m3587goto(c2430e.ad()) : null;
    }

    @Override // defpackage.InterfaceC16566e
    public final AbstractC1186e ad() {
        InterfaceC8614e interfaceC8614e = appmetrica[0];
        return (AbstractC10226e) this.metrica.invoke();
    }

    @Override // defpackage.InterfaceC16566e
    public final InterfaceC3054e adcel() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC16566e
    public Map advert() {
        return C9139e.f18290e;
    }

    @Override // defpackage.InterfaceC16566e
    public final C12816e mopub() {
        return this.ad;
    }
}
