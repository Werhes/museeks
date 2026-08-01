package defpackage;

import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import io.realm.kotlin.internal.interop.NativePointer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7222e extends AbstractC11130e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC15348e f14745e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f14746e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7222e(C14918e c14918e, NativePointer nativePointer, int i) {
        super(c14918e);
        this.f14746e = i;
        switch (i) {
            case 1:
                super(c14918e);
                this.f14745e = new C12247e(this, nativePointer, new C17900e(nativePointer, c14918e.appmetrica.values()));
                return;
            default:
                this.f14745e = new C16981e(this, nativePointer);
                return;
        }
    }

    /* renamed from: eؘِۢ, reason: contains not printable characters */
    public final C14097e m2267e(String str, String str2, Object... objArr) {
        switch (this.f14746e) {
            case 0:
                C16981e c16981e = (C16981e) this.f14745e;
                return new C14097e(c16981e, c16981e.advert().metrica(str).vip, AbstractC3820e.ad.vip(DynamicMutableRealmObject.class), ((C14918e) this.f22047e).purchase, str2, objArr);
            default:
                C12247e c12247e = (C12247e) this.f14745e;
                return new C14097e(c12247e, c12247e.f24579e.metrica(str).vip, AbstractC3820e.ad.vip(InterfaceC16120e.class), ((C14918e) this.f22047e).purchase, str2, objArr);
        }
    }

    /* renamed from: eِٜ٘, reason: contains not printable characters */
    public DynamicMutableRealmObject m2268e(InterfaceC16120e interfaceC16120e) {
        C16981e c16981e = (C16981e) this.f14745e;
        DynamicMutableRealmObject dynamicMutableRealmObject = null;
        if (!C7290e.startapp(interfaceC16120e)) {
            return null;
        }
        C13655e f36708e = ((InterfaceC10518e) interfaceC16120e).getF36708e();
        if (f36708e != null) {
            if (!AbstractC7890e.billing(f36708e.f27072e, c16981e)) {
                C13655e license = f36708e.license(c16981e, AbstractC3820e.ad.vip(DynamicMutableRealmObject.class));
                return (DynamicMutableRealmObject) (license != null ? (InterfaceC16120e) AbstractC15792e.admob(license) : null);
            }
            dynamicMutableRealmObject = (DynamicMutableRealmObject) interfaceC16120e;
        }
        if (dynamicMutableRealmObject != null) {
            return dynamicMutableRealmObject;
        }
        throw new IllegalArgumentException("Cannot lookup unmanaged object");
    }

    @Override // defpackage.AbstractC11130e, defpackage.InterfaceC0182e
    public final InterfaceC15348e yandex() {
        switch (this.f14746e) {
            case 0:
                return (C16981e) this.f14745e;
            default:
                return (C12247e) this.f14745e;
        }
    }
}
