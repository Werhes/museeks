package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10145e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f20081e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f20082e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13477e f20083e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f20084e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20085e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f20086e;

    public /* synthetic */ C10145e(C13477e c13477e, InterfaceC12864e interfaceC12864e, int i, Function1 function1, int i2, int i3) {
        this.f20085e = i3;
        this.f20083e = c13477e;
        this.f20082e = interfaceC12864e;
        this.f20084e = i;
        this.f20081e = function1;
        this.f20086e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20085e) {
            case 0:
                ((Integer) obj2).getClass();
                int advert = AbstractC5190e.advert(this.f20086e | 1);
                this.f20083e.billing(this.f20084e, advert, (C13770e) obj, this.f20082e, this.f20081e);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).intValue();
                int advert2 = AbstractC5190e.advert(this.f20086e | 1);
                this.f20083e.yandex(this.f20084e, advert2, (C13770e) obj, this.f20082e, this.f20081e);
                return Unit.INSTANCE;
        }
    }
}
