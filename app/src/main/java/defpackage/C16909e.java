package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16909e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f33131e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ int f33132e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C11268e f33133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16909e(C11268e c11268e, int i, InterfaceC5083e interfaceC5083e, int i2) {
        super(2, interfaceC5083e);
        this.f33131e = i2;
        this.f33133e = c11268e;
        this.f33132e = i;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f33131e) {
            case 0:
                return new C16909e(this.f33133e, this.f33132e, interfaceC5083e, 0);
            case 1:
                return new C16909e(this.f33133e, this.f33132e, interfaceC5083e, 1);
            default:
                return new C16909e(this.f33133e, this.f33132e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f33131e) {
            case 0:
                return ((C16909e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C16909e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C16909e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f33131e) {
            case 0:
                AbstractC2003e.purchase(obj);
                C11268e c11268e = this.f33133e;
                if (c11268e.f22629e != null) {
                    c11268e.mopub(this.f33132e, C16504e.vip);
                    c11268e.f22629e = null;
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                this.f33133e.mopub(this.f33132e, C16504e.vip);
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                this.f33133e.mopub(this.f33132e, C16504e.vip);
                return Unit.INSTANCE;
        }
    }
}
