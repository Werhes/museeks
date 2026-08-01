package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5524e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f11811e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f11812e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f11813e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f11814e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f11815e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11816e = 2;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f11817e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f11818e;

    public /* synthetic */ C5524e(int i, Function2 function2, C2892e c2892e, Function2 function22, Function2 function23, C5607e c5607e, Function2 function24) {
        this.f11812e = i;
        this.f11815e = function2;
        this.f11813e = c2892e;
        this.f11811e = function22;
        this.f11818e = function23;
        this.f11817e = c5607e;
        this.f11814e = function24;
    }

    public /* synthetic */ C5524e(int i, Function2 function2, C2892e c2892e, Function2 function22, Function2 function23, InterfaceC11968e interfaceC11968e, Function2 function24, int i2) {
        this.f11812e = i;
        this.f11815e = function2;
        this.f11813e = c2892e;
        this.f11811e = function22;
        this.f11818e = function23;
        this.f11817e = interfaceC11968e;
        this.f11814e = function24;
    }

    public /* synthetic */ C5524e(C2892e c2892e, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f11813e = c2892e;
        this.f11815e = obj;
        this.f11811e = obj2;
        this.f11818e = obj3;
        this.f11817e = obj4;
        this.f11814e = obj5;
        this.f11812e = i;
    }

    public /* synthetic */ C5524e(InterfaceC16060e interfaceC16060e, C2892e c2892e, C6540e c6540e, InterfaceC12864e interfaceC12864e, Function0 function0, C2892e c2892e2, int i) {
        this.f11815e = interfaceC16060e;
        this.f11813e = c2892e;
        this.f11818e = c6540e;
        this.f11817e = interfaceC12864e;
        this.f11814e = function0;
        this.f11811e = c2892e2;
        this.f11812e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11816e) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0718e.ad((InterfaceC16060e) this.f11815e, this.f11813e, (C6540e) this.f11818e, (InterfaceC12864e) this.f11817e, (Function0) this.f11814e, (C2892e) this.f11811e, (C13770e) obj, AbstractC5190e.advert(this.f11812e | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).intValue();
                this.f11813e.startapp(this.f11815e, this.f11811e, this.f11818e, this.f11817e, this.f11814e, (C13770e) obj, AbstractC5190e.advert(this.f11812e) | 1);
                return Unit.INSTANCE;
            case 2:
                Function2 function2 = (Function2) this.f11815e;
                Function2 function22 = (Function2) this.f11811e;
                Function2 function23 = (Function2) this.f11818e;
                C5607e c5607e = (C5607e) this.f11817e;
                Function2 function24 = (Function2) this.f11814e;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC13348e.vip(this.f11812e, function2, this.f11813e, function22, function23, c5607e, function24, c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC13348e.vip(this.f11812e, (Function2) this.f11815e, this.f11813e, (Function2) this.f11811e, (Function2) this.f11818e, (InterfaceC11968e) this.f11817e, (Function2) this.f11814e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
