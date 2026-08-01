package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17315e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f33971e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f33972e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ C15274e f33973e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f33974e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final /* synthetic */ Function0 f33975e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f33976e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f33977e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f33978e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f33979e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f33980e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17315e(boolean z, Function2 function2, Function1 function1, InterfaceC3314e interfaceC3314e, InterfaceC18435e interfaceC18435e, C15274e c15274e, InterfaceC3314e interfaceC3314e2, Function0 function0, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f33979e = z;
        this.f33976e = function2;
        this.f33978e = function1;
        this.f33974e = interfaceC3314e;
        this.f33977e = interfaceC18435e;
        this.f33973e = c15274e;
        this.f33972e = interfaceC3314e2;
        this.f33975e = function0;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C17315e c17315e = new C17315e(this.f33979e, this.f33976e, this.f33978e, this.f33974e, this.f33977e, this.f33973e, this.f33972e, this.f33975e, interfaceC5083e);
        c17315e.f33980e = obj;
        return c17315e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C17315e) advert((InterfaceC5083e) obj2, (InterfaceC13742e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f33971e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            InterfaceC13742e interfaceC13742e = (InterfaceC13742e) this.f33980e;
            if (!this.f33979e) {
                return Unit.INSTANCE;
            }
            Function1 function1 = this.f33978e;
            InterfaceC3314e interfaceC3314e = this.f33974e;
            InterfaceC18435e interfaceC18435e = this.f33977e;
            C15274e c15274e = this.f33973e;
            InterfaceC3314e interfaceC3314e2 = this.f33972e;
            C11759e c11759e = new C11759e(function1, interfaceC3314e, interfaceC18435e, c15274e, interfaceC3314e2, 2);
            Function0 function0 = this.f33975e;
            C13267e c13267e = new C13267e(function0, interfaceC3314e2, interfaceC18435e, c15274e, interfaceC3314e, 0);
            C13267e c13267e2 = new C13267e(function0, interfaceC3314e2, interfaceC18435e, c15274e, interfaceC3314e, 1);
            this.f33971e = 1;
            Object appmetrica = AbstractC11454e.appmetrica(interfaceC13742e, c11759e, c13267e, c13267e2, this.f33976e, this);
            Object obj2 = EnumC2821e.f6782e;
            if (appmetrica != obj2) {
                appmetrica = Unit.INSTANCE;
            }
            if (appmetrica == obj2) {
                return obj2;
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
