package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14492e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12561e f28647e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f28648e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f28649e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f28650e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28651e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f28652e;

    public /* synthetic */ C14492e(String str, Function1 function1, Function0 function0, boolean z, boolean z2, int i) {
        this.f28651e = 3;
        this.f28648e = str;
        this.f28647e = function1;
        this.f28652e = function0;
        this.f28649e = z;
        this.f28650e = z2;
    }

    public /* synthetic */ C14492e(Function0 function0, boolean z, InterfaceC12864e interfaceC12864e, InterfaceC16154e interfaceC16154e, boolean z2, int i) {
        this.f28651e = 2;
        this.f28647e = function0;
        this.f28649e = z;
        this.f28648e = interfaceC12864e;
        this.f28652e = interfaceC16154e;
        this.f28650e = z2;
    }

    public /* synthetic */ C14492e(boolean z, InterfaceC12561e interfaceC12561e, InterfaceC12864e interfaceC12864e, boolean z2, Object obj, int i, int i2) {
        this.f28651e = i2;
        this.f28649e = z;
        this.f28647e = interfaceC12561e;
        this.f28648e = interfaceC12864e;
        this.f28650e = z2;
        this.f28652e = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28651e) {
            case 0:
                ((Integer) obj2).getClass();
                int advert = AbstractC5190e.advert(1);
                AbstractC2705e.ad(this.f28649e, (Function1) this.f28647e, (InterfaceC12864e) this.f28648e, this.f28650e, (C4835e) this.f28652e, (C13770e) obj, advert);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int advert2 = AbstractC5190e.advert(1);
                AbstractC4530e.ad(this.f28649e, (Function0) this.f28647e, (InterfaceC12864e) this.f28648e, this.f28650e, (C9657e) this.f28652e, (C13770e) obj, advert2);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int advert3 = AbstractC5190e.advert(196609);
                AbstractC9164e.metrica((Function0) this.f28647e, this.f28649e, (InterfaceC12864e) this.f28648e, (InterfaceC16154e) this.f28652e, this.f28650e, (C13770e) obj, advert3);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int advert4 = AbstractC5190e.advert(1);
                C17150e.ad((String) this.f28648e, (Function1) this.f28647e, (Function0) this.f28652e, this.f28649e, this.f28650e, (C13770e) obj, advert4);
                return Unit.INSTANCE;
        }
    }
}
