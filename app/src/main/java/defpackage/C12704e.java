package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۘۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12704e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f25451e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3229e f25452e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f25453e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25454e;

    public /* synthetic */ C12704e(C3229e c3229e, InterfaceC18435e interfaceC18435e, Function0 function0, int i) {
        this.f25454e = i;
        this.f25452e = c3229e;
        this.f25451e = interfaceC18435e;
        this.f25453e = function0;
    }

    public /* synthetic */ C12704e(C3229e c3229e, Function0 function0, InterfaceC18435e interfaceC18435e) {
        this.f25454e = 2;
        this.f25452e = c3229e;
        this.f25453e = function0;
        this.f25451e = interfaceC18435e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f25454e;
        EnumC8613e enumC8613e = EnumC8613e.f17430e;
        Function0 function0 = this.f25453e;
        InterfaceC18435e interfaceC18435e = this.f25451e;
        C3229e c3229e = this.f25452e;
        switch (i) {
            case 0:
                if (((Boolean) c3229e.license.invoke(enumC8613e)).booleanValue()) {
                    AbstractC5336e.purchase(interfaceC18435e, null, 0, new C13959e(c3229e, null, 1), 3).mo692else(new C0234e(c3229e, function0, 0));
                }
                return Unit.INSTANCE;
            case 1:
                if (c3229e.license() == EnumC8613e.f17428e && c3229e.appmetrica()) {
                    AbstractC5336e.purchase(interfaceC18435e, null, 0, new C13959e(c3229e, null, 2), 3);
                } else {
                    AbstractC5336e.purchase(interfaceC18435e, null, 0, new C13959e(c3229e, null, 3), 3).mo692else(new C17897e(5, function0));
                }
                return Unit.INSTANCE;
            case 2:
                int ordinal = c3229e.license().ordinal();
                if (ordinal == 1) {
                    function0.invoke();
                    Unit unit = Unit.INSTANCE;
                } else if (ordinal != 2) {
                    AbstractC5336e.purchase(interfaceC18435e, null, 0, new C13959e(c3229e, null, 7), 3);
                } else {
                    AbstractC5336e.purchase(interfaceC18435e, null, 0, new C13959e(c3229e, null, 6), 3);
                }
                return Unit.INSTANCE;
            default:
                if (((Boolean) c3229e.license.invoke(enumC8613e)).booleanValue()) {
                    AbstractC5336e.purchase(interfaceC18435e, null, 0, new C13959e(c3229e, null, 10), 3).mo692else(new C0234e(c3229e, function0, 1));
                }
                return Unit.INSTANCE;
        }
    }
}
