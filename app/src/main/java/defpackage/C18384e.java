package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۜۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18384e extends AbstractC10674e {
    public final InterfaceC7227e ad;
    public List vip = C13664e.f27089e;
    public final Object metrica = AbstractC18039e.appmetrica(2, new C13465e(14, this));

    public C18384e(InterfaceC7227e interfaceC7227e) {
        this.ad = interfaceC7227e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return (InterfaceC9998e) this.metrica.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.ad + ')';
    }

    @Override // defpackage.AbstractC10674e
    public final InterfaceC7227e yandex() {
        return this.ad;
    }
}
