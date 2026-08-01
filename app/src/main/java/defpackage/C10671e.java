package defpackage;

import java.util.Collection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۦۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10671e extends AbstractC15529e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ int f21019e = 0;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f21020e = AbstractC18039e.appmetrica(2, new C0371e(this, 0));

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Class f21021e;

    public C10671e(Class cls) {
        this.f21021e = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10671e) {
            return AbstractC7890e.billing(this.f21021e, ((C10671e) obj).f21021e);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.AbstractC15529e
    /* renamed from: extends */
    public final Collection mo2425extends(C0520e c0520e) {
        C13475e c13475e = ((C1857e) this.f21020e.getValue()).license;
        InterfaceC8614e interfaceC8614e = C1857e.billing[1];
        return ((InterfaceC8528e) c13475e.invoke()).purchase(c0520e, EnumC2192e.f5574e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.AbstractC15529e
    /* renamed from: goto */
    public final Collection mo2427goto(C0520e c0520e) {
        C13475e c13475e = ((C1857e) this.f21020e.getValue()).license;
        InterfaceC8614e interfaceC8614e = C1857e.billing[1];
        return ((InterfaceC8528e) c13475e.invoke()).ad(c0520e, EnumC2192e.f5574e);
    }

    public final int hashCode() {
        return this.f21021e.hashCode();
    }

    @Override // defpackage.AbstractC15529e
    /* renamed from: interface */
    public final Collection mo2429interface() {
        return C13664e.f27089e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.AbstractC15529e
    /* renamed from: native, reason: not valid java name */
    public final Class mo2863native() {
        Class cls = (Class) ((C1857e) this.f21020e.getValue()).appmetrica.getValue();
        return cls == null ? this.f21021e : cls;
    }

    @Override // defpackage.InterfaceC18155e
    public final Class subs() {
        return this.f21021e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.AbstractC15529e
    /* renamed from: this */
    public final InterfaceC2188e mo2430this(int i) {
        C13475e c13475e = ((C1857e) this.f21020e.getValue()).license;
        InterfaceC8614e interfaceC8614e = C1857e.billing[1];
        InterfaceC8528e interfaceC8528e = (InterfaceC8528e) c13475e.invoke();
        C11260e c11260e = interfaceC8528e instanceof C11260e ? (C11260e) interfaceC8528e : null;
        if (c11260e != null) {
            C4956e c4956e = c11260e.vip;
            C14882e c14882e = c11260e.yandex;
            C17485e c17485e = (C17485e) AbstractC0863e.purchase(c14882e, AbstractC5745e.advert, i);
            if (c17485e != null) {
                return (InterfaceC2188e) AbstractC5965e.license(this.f21021e, c17485e, (InterfaceC11824e) c4956e.f10513e, new C17221e(c14882e.f29484e), (AbstractC8470e) c4956e.f10519e, C5983e.f12621e);
            }
        }
        return null;
    }

    public final String toString() {
        return "file class " + AbstractC2677e.ad(this.f21021e).ad();
    }
}
