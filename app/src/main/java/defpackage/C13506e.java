package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۛٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C13506e extends AbstractC12943e implements InterfaceC0662e {
    public C13506e(Class cls, String str, String str2, int i) {
        super(C11625e.f23330e, cls, str, str2, i);
    }

    @Override // defpackage.AbstractC3160e
    public final InterfaceC15954e advert() {
        return AbstractC3820e.ad.purchase(this);
    }

    @Override // defpackage.InterfaceC3996e
    public final InterfaceC3872e appmetrica() {
        return ((InterfaceC0662e) admob()).appmetrica();
    }

    public Object get(Object obj) {
        return ((AbstractC12141e) metrica()).advert(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // defpackage.InterfaceC8614e
    public final InterfaceC0022e metrica() {
        return ((InterfaceC0662e) admob()).metrica();
    }

    public void remoteconfig(Object obj, Object obj2) {
        ((AbstractC12141e) appmetrica()).advert(obj, obj2);
    }
}
