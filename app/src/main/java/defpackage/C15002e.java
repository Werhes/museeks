package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔ۟ۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15002e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C13309e f29731e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1925e f29732e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29733e;

    public /* synthetic */ C15002e(C1925e c1925e, C13309e c13309e, int i) {
        this.f29733e = i;
        this.f29732e = c1925e;
        this.f29731e = c13309e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f29733e) {
            case 0:
                C9885e c9885e = this.f29731e.vip;
                int i = c9885e.ad;
                long j = c9885e.vip;
                this.f29732e.metrica.invoke(Integer.valueOf(i), Long.valueOf(j), c9885e.isPro, c9885e.license);
                return Unit.INSTANCE;
            default:
                C9885e c9885e2 = this.f29731e.vip;
                int i2 = c9885e2.ad;
                long j2 = c9885e2.vip;
                this.f29732e.metrica.invoke(Integer.valueOf(i2), Long.valueOf(j2), c9885e2.isPro, c9885e2.license);
                return Unit.INSTANCE;
        }
    }
}
