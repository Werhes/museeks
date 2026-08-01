package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِِٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11759e extends AbstractC16858e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f23625e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f23626e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f23627e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f23628e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f23629e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f23630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11759e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(1);
        this.f23627e = i;
        this.f23628e = obj;
        this.f23626e = obj2;
        this.f23625e = obj3;
        this.f23630e = obj4;
        this.f23629e = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11759e(Function0 function0, InterfaceC3314e interfaceC3314e, InterfaceC3314e interfaceC3314e2, InterfaceC18435e interfaceC18435e, C15274e c15274e) {
        super(1);
        this.f23627e = 1;
        this.f23626e = function0;
        this.f23628e = interfaceC3314e;
        this.f23625e = interfaceC3314e2;
        this.f23630e = interfaceC18435e;
        this.f23629e = c15274e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, eؖؕۜ] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23627e) {
            case 0:
                C5385e c5385e = (C5385e) this.f23628e;
                c5385e.f11525e.addView(c5385e, c5385e.f11523e);
                c5385e.amazon((Function0) this.f23626e, (C15534e) this.f23625e, (String) this.f23630e, (EnumC7792e) this.f23629e);
                return new C6035e(3, c5385e);
            case 1:
                return new C10227e((Function0) this.f23626e, (InterfaceC3314e) this.f23628e, (InterfaceC3314e) this.f23625e, (InterfaceC18435e) this.f23630e, (C15274e) this.f23629e);
            case 2:
                long j = ((C2152e) obj).ad;
                ((InterfaceC3314e) this.f23626e).setValue(Boolean.TRUE);
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f23629e;
                ?? obj2 = new Object();
                AbstractC5336e.purchase((InterfaceC18435e) this.f23625e, null, 0, new C15189e((C15274e) this.f23630e, obj2, null, 1), 3);
                interfaceC3314e.setValue(obj2);
                ((Function1) this.f23628e).invoke(new C2152e(j));
                return Unit.INSTANCE;
            default:
                long j2 = ((C2152e) obj).ad;
                AbstractC5336e.purchase((InterfaceC18435e) this.f23628e, null, 0, new C2122e((C12692e) this.f23625e, (InterfaceC3314e) this.f23630e, (InterfaceC3314e) this.f23629e, (InterfaceC5083e) null), 3);
                ((Function1) this.f23626e).invoke(new C2152e(j2));
                return Unit.INSTANCE;
        }
    }
}
