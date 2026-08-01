package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۨۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6829e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f14060e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f14061e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f14062e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f14063e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14064e = 0;

    public /* synthetic */ C6829e(InterfaceC12864e interfaceC12864e, Function0 function0, boolean z, int i) {
        this.f14060e = interfaceC12864e;
        this.f14063e = function0;
        this.f14062e = z;
        this.f14061e = i;
    }

    public /* synthetic */ C6829e(boolean z, int i, Function0 function0, InterfaceC12864e interfaceC12864e, int i2) {
        this.f14062e = z;
        this.f14061e = i;
        this.f14063e = function0;
        this.f14060e = interfaceC12864e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14064e) {
            case 0:
                ((Integer) obj2).getClass();
                int advert = AbstractC5190e.advert(this.f14061e | 1);
                AbstractC9357e.metrica(this.f14060e, this.f14063e, this.f14062e, (C13770e) obj, advert);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int advert2 = AbstractC5190e.advert(24961);
                AbstractC12185e.yandex(this.f14062e, this.f14061e, this.f14063e, this.f14060e, (C13770e) obj, advert2);
                return Unit.INSTANCE;
        }
    }
}
