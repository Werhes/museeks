package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7565e extends AbstractC5148e implements InterfaceC0716e {

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final Object f15387e;

    public C7565e(AbstractC15529e abstractC15529e, InterfaceC2188e interfaceC2188e) {
        super(abstractC15529e, interfaceC2188e);
        this.f15387e = AbstractC18039e.appmetrica(2, new C11651e(this, 0));
        AbstractC18039e.appmetrica(2, new C11651e(this, 1));
    }

    public C7565e(AbstractC15529e abstractC15529e, String str, String str2, Object obj) {
        super(abstractC15529e, str, str2, null, obj);
        this.f15387e = AbstractC18039e.appmetrica(2, new C11651e(this, 0));
        AbstractC18039e.appmetrica(2, new C11651e(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC0716e
    public final Object get(Object obj) {
        return ((C9199e) this.f15387e.getValue()).advert(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.AbstractC5148e
    /* renamed from: interface */
    public final AbstractC1104e mo1764interface() {
        return (C9199e) this.f15387e.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC8614e
    public final InterfaceC0022e metrica() {
        return (C9199e) this.f15387e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC8614e
    public final InterfaceC0224e metrica() {
        return (C9199e) this.f15387e.getValue();
    }
}
