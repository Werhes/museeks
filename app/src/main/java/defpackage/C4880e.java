package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4880e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f10355e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f10356e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f10357e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f10358e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10359e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f10360e;

    public /* synthetic */ C4880e(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        this.f10359e = i3;
        this.f10355e = obj;
        this.f10356e = i;
        this.f10360e = obj2;
        this.f10357e = obj3;
        this.f10358e = i2;
    }

    public /* synthetic */ C4880e(AbstractC11110e abstractC11110e, InterfaceC12864e interfaceC12864e, C2892e c2892e, int i, int i2) {
        this.f10359e = 2;
        this.f10355e = abstractC11110e;
        this.f10357e = interfaceC12864e;
        this.f10360e = c2892e;
        this.f10356e = i;
        this.f10358e = i2;
    }

    public /* synthetic */ C4880e(C11210e c11210e, String str, int i, InterfaceC12864e interfaceC12864e, int i2) {
        this.f10359e = 0;
        this.f10355e = c11210e;
        this.f10360e = str;
        this.f10356e = i;
        this.f10357e = interfaceC12864e;
        this.f10358e = i2;
    }

    public /* synthetic */ C4880e(InterfaceC12864e interfaceC12864e, InterfaceC8079e interfaceC8079e, C2892e c2892e, int i, int i2) {
        this.f10359e = 1;
        this.f10357e = interfaceC12864e;
        this.f10355e = interfaceC8079e;
        this.f10360e = c2892e;
        this.f10356e = i;
        this.f10358e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10359e) {
            case 0:
                ((Integer) obj2).getClass();
                ((C11210e) this.f10355e).m3063private((String) this.f10360e, this.f10356e, (InterfaceC12864e) this.f10357e, (C13770e) obj, AbstractC5190e.advert(this.f10358e | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC17957e.ad((InterfaceC12864e) this.f10357e, (InterfaceC8079e) this.f10355e, (C2892e) this.f10360e, (C13770e) obj, AbstractC5190e.advert(this.f10356e | 1), this.f10358e);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC2467e.ad((AbstractC11110e) this.f10355e, (InterfaceC12864e) this.f10357e, (C2892e) this.f10360e, (C13770e) obj, AbstractC5190e.advert(this.f10356e | 1), this.f10358e);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC5967e.vip(this.f10355e, this.f10356e, (C4695e) this.f10360e, (C2892e) this.f10357e, (C13770e) obj, AbstractC5190e.advert(this.f10358e | 1));
                return Unit.INSTANCE;
            default:
                C13817e c13817e = (C13817e) this.f10355e;
                Function1 function1 = (Function1) this.f10360e;
                InterfaceC12864e interfaceC12864e = (InterfaceC12864e) this.f10357e;
                ((Integer) obj2).getClass();
                int advert = AbstractC5190e.advert(this.f10358e | 1);
                c13817e.billing(this.f10356e, advert, (C13770e) obj, interfaceC12864e, function1);
                return Unit.INSTANCE;
        }
    }
}
