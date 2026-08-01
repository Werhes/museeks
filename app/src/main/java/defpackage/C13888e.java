package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioContentCard;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13888e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f27548e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f27549e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f27550e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f27551e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27552e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f27553e;

    public /* synthetic */ C13888e(C1733e c1733e, boolean z, Function1 function1, Function1 function12, int i, int i2) {
        this.f27552e = 4;
        this.f27551e = c1733e;
        this.f27550e = z;
        this.f27548e = function1;
        this.f27553e = function12;
        this.f27549e = i2;
    }

    public /* synthetic */ C13888e(C3566e c3566e, Object obj, boolean z, InterfaceC12864e interfaceC12864e, int i, int i2) {
        this.f27552e = i2;
        this.f27551e = c3566e;
        this.f27548e = obj;
        this.f27550e = z;
        this.f27553e = interfaceC12864e;
        this.f27549e = i;
    }

    public /* synthetic */ C13888e(C13621e c13621e, boolean z, Function1 function1, C2892e c2892e, int i) {
        this.f27552e = 0;
        this.f27551e = c13621e;
        this.f27550e = z;
        this.f27548e = function1;
        this.f27553e = c2892e;
        this.f27549e = i;
    }

    public /* synthetic */ C13888e(AudioContentCard audioContentCard, Function0 function0, Function0 function02, boolean z, int i) {
        this.f27552e = 1;
        this.f27551e = audioContentCard;
        this.f27548e = function0;
        this.f27553e = function02;
        this.f27550e = z;
        this.f27549e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27552e) {
            case 0:
                ((Integer) obj2).getClass();
                ((C13621e) this.f27551e).advert(this.f27550e, (Function1) this.f27548e, (C2892e) this.f27553e, (C13770e) obj, AbstractC5190e.advert(this.f27549e | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC16279e.ad((AudioContentCard) this.f27551e, (Function0) this.f27548e, (Function0) this.f27553e, this.f27550e, (C13770e) obj, AbstractC5190e.advert(this.f27549e | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ((C3566e) this.f27551e).isVip((C1637e) this.f27548e, this.f27550e, (InterfaceC12864e) this.f27553e, (C13770e) obj, AbstractC5190e.advert(this.f27549e | 1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ((C3566e) this.f27551e).applovin((C14623e) this.f27548e, this.f27550e, (InterfaceC12864e) this.f27553e, (C13770e) obj, AbstractC5190e.advert(this.f27549e | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int advert = AbstractC5190e.advert(1);
                AbstractC17181e.yandex((C1733e) this.f27551e, this.f27550e, (Function1) this.f27548e, (Function1) this.f27553e, (C13770e) obj, advert, this.f27549e);
                return Unit.INSTANCE;
        }
    }
}
