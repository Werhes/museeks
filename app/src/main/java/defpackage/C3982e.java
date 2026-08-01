package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3982e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f8876e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f8877e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12123e f8878e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8879e = 0;

    public /* synthetic */ C3982e(Function2 function2, C2892e c2892e, InterfaceC12123e interfaceC12123e) {
        this.f8877e = function2;
        this.f8876e = c2892e;
        this.f8878e = interfaceC12123e;
    }

    public /* synthetic */ C3982e(Function2 function2, C2892e c2892e, InterfaceC12123e interfaceC12123e, int i) {
        this.f8877e = function2;
        this.f8876e = c2892e;
        this.f8878e = interfaceC12123e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13770e c13770e = (C13770e) obj;
        Integer num = (Integer) obj2;
        switch (this.f8879e) {
            case 0:
                int intValue = num.intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC7260e.vip(this.f8877e, this.f8876e, this.f8878e, c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                AbstractC7260e.vip(this.f8877e, this.f8876e, this.f8878e, c13770e, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
