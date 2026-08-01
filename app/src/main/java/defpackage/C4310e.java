package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4310e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f9423e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15876e f9424e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4310e(AbstractC15876e abstractC15876e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f9423e = i;
        this.f9424e = abstractC15876e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f9423e) {
            case 0:
                return new C4310e(this.f9424e, interfaceC5083e, 0);
            default:
                return new C4310e(this.f9424e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9423e) {
            case 0:
                if (obj == null) {
                    return ((C4310e) advert((InterfaceC5083e) obj2, null)).loadAd(Unit.INSTANCE);
                }
                throw new ClassCastException();
            default:
                return ((C4310e) advert((InterfaceC5083e) obj2, (C11776e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f9423e;
        AbstractC15876e abstractC15876e = this.f9424e;
        switch (i) {
            case 0:
                AbstractC2003e.purchase(obj);
                C5363e c5363e = C0353e.startapp;
                if (!AbstractC15792e.billing().vip.tapsense()) {
                    abstractC15876e.mo1388instanceof();
                }
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                abstractC15876e.mo1848continue();
                return Unit.INSTANCE;
        }
    }
}
