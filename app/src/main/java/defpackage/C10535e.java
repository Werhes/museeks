package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۛۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10535e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f20794e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f20795e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ C16174e f20796e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C0909e f20797e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final /* synthetic */ Function0 f20798e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC11678e f20799e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f20800e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C11388e f20801e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ C12747e f20802e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C7102e f20803e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3542e f20804e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f20805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10535e(InterfaceC3542e interfaceC3542e, C11388e c11388e, C7102e c7102e, C0909e c0909e, C12747e c12747e, C16174e c16174e, Function1 function1, Function0 function0, InterfaceC11678e interfaceC11678e, Function1 function12, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f20804e = interfaceC3542e;
        this.f20801e = c11388e;
        this.f20803e = c7102e;
        this.f20797e = c0909e;
        this.f20802e = c12747e;
        this.f20796e = c16174e;
        this.f20795e = function1;
        this.f20798e = function0;
        this.f20799e = interfaceC11678e;
        this.f20800e = function12;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C10535e c10535e = new C10535e(this.f20804e, this.f20801e, this.f20803e, this.f20797e, this.f20802e, this.f20796e, this.f20795e, this.f20798e, this.f20799e, this.f20800e, interfaceC5083e);
        c10535e.f20805e = obj;
        return c10535e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((C10535e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        return EnumC2821e.f6782e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f20794e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
            throw new C14803e(9);
        }
        AbstractC2003e.purchase(obj);
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f20805e;
        C11388e c11388e = this.f20801e;
        C0909e c0909e = this.f20797e;
        InterfaceC5083e interfaceC5083e = null;
        AbstractC5336e.purchase(interfaceC18435e, null, 4, new C13301e(c11388e, c0909e, interfaceC5083e, 9), 1);
        InterfaceC3542e interfaceC3542e = this.f20804e;
        if (interfaceC3542e != null) {
            AbstractC5336e.purchase(interfaceC18435e, null, 0, new C13301e(interfaceC3542e, c0909e, interfaceC5083e, 10), 3);
        }
        final C13732e c13732e = new C13732e(c11388e, this.f20803e, c0909e, interfaceC18435e);
        final C11388e c11388e2 = this.f20801e;
        final C16174e c16174e = this.f20796e;
        final C0909e c0909e2 = this.f20797e;
        final Function1 function1 = this.f20795e;
        final C7102e c7102e = this.f20803e;
        final Function0 function0 = this.f20798e;
        final InterfaceC11678e interfaceC11678e = this.f20799e;
        final Function1 function12 = this.f20800e;
        InterfaceC13096e interfaceC13096e = new InterfaceC13096e() { // from class: eؙٖؑ
            @Override // defpackage.InterfaceC13096e
            public final InputConnection ad(EditorInfo editorInfo) {
                C11388e c11388e3 = C11388e.this;
                C14742e c14742e = new C14742e(new Csuper(c11388e3), c11388e3, c0909e2, function1, c13732e, c7102e, function0, interfaceC11678e, function12);
                AbstractC0173e.advert(editorInfo, c11388e3.license(), c11388e3.license().f33324e, c16174e);
                return new InputConnectionC0817e(c14742e, editorInfo);
            }
        };
        this.f20794e = 1;
        this.f20802e.ad(interfaceC13096e, this);
        return EnumC2821e.f6782e;
    }
}
