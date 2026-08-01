package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1030e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3486e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f3487e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C15274e f3488e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f3489e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1030e(C15274e c15274e, InterfaceC3314e interfaceC3314e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f3486e = i;
        this.f3488e = c15274e;
        this.f3487e = interfaceC3314e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f3486e) {
            case 0:
                return new C1030e(this.f3488e, this.f3487e, interfaceC5083e, 0);
            case 1:
                return new C1030e(this.f3488e, this.f3487e, interfaceC5083e, 1);
            case 2:
                return new C1030e(this.f3488e, this.f3487e, interfaceC5083e, 2);
            default:
                return new C1030e(this.f3488e, this.f3487e, interfaceC5083e, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f3486e) {
            case 0:
                return ((C1030e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C1030e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C1030e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C1030e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f3486e) {
            case 0:
                int i = this.f3489e;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return Unit.INSTANCE;
                }
                AbstractC2003e.purchase(obj);
                ArrayList arrayList = new ArrayList();
                C5981e c5981e = this.f3488e.ad;
                C9356e c9356e = new C9356e(arrayList, this.f3487e, 0);
                this.f3489e = 1;
                c5981e.ad(c9356e, this);
                return EnumC2821e.f6782e;
            case 1:
                int i2 = this.f3489e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return Unit.INSTANCE;
                }
                AbstractC2003e.purchase(obj);
                ArrayList arrayList2 = new ArrayList();
                C5981e c5981e2 = this.f3488e.ad;
                C9356e c9356e2 = new C9356e(arrayList2, this.f3487e, 1);
                this.f3489e = 1;
                c5981e2.ad(c9356e2, this);
                return EnumC2821e.f6782e;
            case 2:
                int i3 = this.f3489e;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return Unit.INSTANCE;
                }
                AbstractC2003e.purchase(obj);
                ArrayList arrayList3 = new ArrayList();
                C5981e c5981e3 = this.f3488e.ad;
                C9356e c9356e3 = new C9356e(arrayList3, this.f3487e, 2);
                this.f3489e = 1;
                c5981e3.ad(c9356e3, this);
                return EnumC2821e.f6782e;
            default:
                int i4 = this.f3489e;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return Unit.INSTANCE;
                }
                AbstractC2003e.purchase(obj);
                ArrayList arrayList4 = new ArrayList();
                C5981e c5981e4 = this.f3488e.ad;
                C9356e c9356e4 = new C9356e(arrayList4, this.f3487e, 3);
                this.f3489e = 1;
                c5981e4.ad(c9356e4, this);
                return EnumC2821e.f6782e;
        }
    }
}
