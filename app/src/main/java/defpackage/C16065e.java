package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16065e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C12894e f31634e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4571e f31635e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31636e;

    public /* synthetic */ C16065e(C4571e c4571e, C12894e c12894e, int i) {
        this.f31636e = i;
        this.f31635e = c4571e;
        this.f31634e = c12894e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f31636e;
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                this.f31635e.metrica(this.f31634e, intValue, intValue2);
                return Unit.INSTANCE;
            default:
                this.f31635e.metrica(this.f31634e, intValue, intValue2);
                return Unit.INSTANCE;
        }
    }
}
