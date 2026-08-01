package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7147e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17320e f14629e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14630e;

    public /* synthetic */ C7147e(C17320e c17320e, int i) {
        this.f14630e = i;
        this.f14629e = c17320e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f14630e;
        C17320e c17320e = this.f14629e;
        switch (i) {
            case 0:
                AbstractC5851e.billing(c17320e);
                return Unit.INSTANCE;
            case 1:
                c17320e.f33995e.yandex(true);
                return Boolean.TRUE;
            case 2:
                c17320e.f33995e.license(true);
                return Boolean.TRUE;
            case 3:
                c17320e.f33995e.purchase();
                return Boolean.TRUE;
            case 4:
                AbstractC5851e.billing(c17320e);
                return Unit.INSTANCE;
            case 5:
                c17320e.f33995e.Signature();
                return Boolean.TRUE;
            case 6:
                C11840e c11840e = c17320e.f33996e.isVip;
                c11840e.f23751e.subscription.vip(c17320e.f33997e.appmetrica);
                Unit unit = Unit.INSTANCE;
                return Boolean.TRUE;
            default:
                C7911e c7911e = c17320e.f33996e;
                C6260e c6260e = c17320e.f33998e;
                if (c7911e.vip()) {
                    InterfaceC3965e interfaceC3965e = c7911e.metrica;
                    if (interfaceC3965e != null) {
                        ((C3112e) interfaceC3965e).vip();
                    }
                } else {
                    C6260e.vip(c6260e);
                }
                return Boolean.TRUE;
        }
    }
}
