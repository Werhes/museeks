package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۛۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8219e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14564e f16704e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16705e;

    public /* synthetic */ C8219e(C14564e c14564e, int i) {
        this.f16705e = i;
        this.f16704e = c14564e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16705e) {
            case 0:
                this.f16704e.m2514goto(new C11522e());
                return Unit.INSTANCE;
            case 1:
                this.f16704e.m3828return(!((Boolean) r0.f28777e.getValue()).booleanValue());
                return Unit.INSTANCE;
            case 2:
                this.f16704e.m2514goto(new C14398e());
                return Unit.INSTANCE;
            case 3:
                C11908e.appmetrica = false;
                C11908e.metrica = false;
                C11908e.vip = 0;
                C11908e.license = 0;
                this.f16704e.m3830synchronized(0);
                return Unit.INSTANCE;
            case 4:
                C11908e.appmetrica = false;
                C11908e.metrica = false;
                C11908e.vip = 0;
                C11908e.license = 0;
                this.f16704e.m3830synchronized(0);
                return Unit.INSTANCE;
            default:
                C11908e.metrica = true;
                this.f16704e.m3830synchronized(-1);
                return Unit.INSTANCE;
        }
    }
}
