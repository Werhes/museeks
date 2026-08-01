package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10342e extends AbstractC16858e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f20402e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C13119e f20403e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f20404e = 0;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f20405e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f20406e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Function4 f20407e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f20408e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f20409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10342e(C13119e c13119e, InterfaceC12864e interfaceC12864e, Function1 function1, InterfaceC8079e interfaceC8079e, Function1 function12, Function4 function4, int i) {
        super(2);
        this.f20403e = c13119e;
        this.f20402e = interfaceC12864e;
        this.f20406e = function1;
        this.f20405e = interfaceC8079e;
        this.f20408e = function12;
        this.f20407e = function4;
        this.f20409e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10342e(C13119e c13119e, Function1 function1, InterfaceC12864e interfaceC12864e, C18351e c18351e, C2128e c2128e, C2892e c2892e, int i) {
        super(2);
        this.f20403e = c13119e;
        this.f20406e = function1;
        this.f20402e = interfaceC12864e;
        this.f20408e = c18351e;
        this.f20405e = c2128e;
        this.f20407e = c2892e;
        this.f20409e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20404e) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC8079e interfaceC8079e = (InterfaceC8079e) this.f20405e;
                Function1 function1 = (Function1) this.f20408e;
                AbstractC7572e.ad(this.f20403e, this.f20402e, this.f20406e, interfaceC8079e, function1, this.f20407e, (C13770e) obj, AbstractC5190e.advert(this.f20409e | 1));
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                C18351e c18351e = (C18351e) this.f20408e;
                C2128e c2128e = (C2128e) this.f20405e;
                C2892e c2892e = (C2892e) this.f20407e;
                AbstractC12640e.appmetrica(this.f20403e, this.f20406e, this.f20402e, c18351e, c2128e, c2892e, (C13770e) obj, AbstractC5190e.advert(this.f20409e | 1));
                return Unit.INSTANCE;
        }
    }
}
