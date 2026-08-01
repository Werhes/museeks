package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۨ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C12156e extends AbstractC0769e implements InterfaceC0716e {
    public C12156e(InterfaceC7227e interfaceC7227e, String str, String str2) {
        super(C11625e.f23330e, ((InterfaceC18155e) interfaceC7227e).subs(), str, str2, !AbstractC0869e.premium(interfaceC7227e) ? 1 : 0);
    }

    public C12156e(Class cls, String str, String str2, int i) {
        super(C11625e.f23330e, cls, str, str2, i);
    }

    @Override // defpackage.AbstractC3160e
    public final InterfaceC15954e advert() {
        return AbstractC3820e.ad.yandex(this);
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
        return ((InterfaceC0716e) admob()).metrica();
    }
}
