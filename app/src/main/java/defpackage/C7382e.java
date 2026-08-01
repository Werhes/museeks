package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7382e extends AbstractC15049e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f15131e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f15132e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f15133e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f15134e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public /* synthetic */ Object f15135e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f15136e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f15137e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C14307e f15138e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7382e(InterfaceC18435e interfaceC18435e, C14307e c14307e, Function1 function1, Function1 function12, Function3 function3, Function1 function13, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f15131e = interfaceC18435e;
        this.f15138e = c14307e;
        this.f15137e = function1;
        this.f15134e = function12;
        this.f15136e = function3;
        this.f15133e = function13;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C7382e c7382e = new C7382e(this.f15131e, this.f15138e, this.f15137e, this.f15134e, this.f15136e, this.f15133e, interfaceC5083e);
        c7382e.f15135e = obj;
        return c7382e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7382e) advert((InterfaceC5083e) obj2, (C14718e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f15132e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C14718e c14718e = (C14718e) this.f15135e;
            this.f15132e = 1;
            Object yandex = AbstractC9939e.yandex(c14718e, this.f15131e, this.f15138e, this.f15137e, this.f15134e, this.f15136e, this.f15133e, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (yandex == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        return Unit.INSTANCE;
    }
}
