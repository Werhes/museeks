package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13267e extends AbstractC16858e implements Function0 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f26312e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f26313e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f26314e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f26315e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f26316e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f26317e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13267e(C5385e c5385e, Function0 function0, C15534e c15534e, String str, EnumC7792e enumC7792e) {
        super(0);
        this.f26314e = 2;
        this.f26315e = c5385e;
        this.f26313e = function0;
        this.f26316e = c15534e;
        this.f26312e = str;
        this.f26317e = enumC7792e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13267e(Function0 function0, InterfaceC3314e interfaceC3314e, InterfaceC18435e interfaceC18435e, C15274e c15274e, InterfaceC3314e interfaceC3314e2, int i) {
        super(0);
        this.f26314e = i;
        this.f26313e = function0;
        this.f26315e = interfaceC3314e;
        this.f26312e = interfaceC18435e;
        this.f26317e = c15274e;
        this.f26316e = interfaceC3314e2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26314e) {
            case 0:
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f26316e;
                C3877e c3877e = (C3877e) ((InterfaceC3314e) this.f26315e).getValue();
                if (c3877e != null) {
                    AbstractC5336e.purchase((InterfaceC18435e) this.f26312e, null, 0, new C15189e((C15274e) this.f26317e, c3877e, null, 2), 3);
                }
                if (((Boolean) interfaceC3314e.getValue()).booleanValue()) {
                    this.f26313e.invoke();
                }
                interfaceC3314e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) this.f26316e;
                C3877e c3877e2 = (C3877e) ((InterfaceC3314e) this.f26315e).getValue();
                if (c3877e2 != null) {
                    AbstractC5336e.purchase((InterfaceC18435e) this.f26312e, null, 0, new C15189e((C15274e) this.f26317e, c3877e2, null, 3), 3);
                }
                if (((Boolean) interfaceC3314e2.getValue()).booleanValue()) {
                    this.f26313e.invoke();
                }
                interfaceC3314e2.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                ((C5385e) this.f26315e).amazon(this.f26313e, (C15534e) this.f26316e, (String) this.f26312e, (EnumC7792e) this.f26317e);
                return Unit.INSTANCE;
        }
    }
}
