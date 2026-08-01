package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16950e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f33204e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Response f33205e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15876e f33206e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f33207e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16950e(AbstractC15876e abstractC15876e, Catalog2Response catalog2Response, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f33204e = i;
        this.f33206e = abstractC15876e;
        this.f33205e = catalog2Response;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f33204e) {
            case 0:
                return new C16950e(this.f33206e, this.f33205e, interfaceC5083e, 0);
            default:
                return new C16950e(this.f33206e, this.f33205e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f33204e) {
            case 0:
                return ((C16950e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C16950e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f33204e) {
            case 0:
                int i = this.f33207e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    AbstractC15876e abstractC15876e = this.f33206e;
                    abstractC15876e.mo1389new();
                    List singletonList = Collections.singletonList(this.f33205e);
                    this.f33207e = 1;
                    Object m4032public = AbstractC15876e.m4032public(abstractC15876e, singletonList, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (m4032public == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i2 = this.f33207e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    AbstractC15876e abstractC15876e2 = this.f33206e;
                    abstractC15876e2.mo1389new();
                    List singletonList2 = Collections.singletonList(this.f33205e);
                    this.f33207e = 1;
                    Object m4032public2 = AbstractC15876e.m4032public(abstractC15876e2, singletonList2, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (m4032public2 == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
