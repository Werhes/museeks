package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15490e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0971e f30598e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30599e;

    public /* synthetic */ C15490e(C0971e c0971e, int i) {
        this.f30599e = i;
        this.f30598e = c0971e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f30599e) {
            case 0:
                AtomicLong atomicLong = this.f30598e.license;
                long andIncrement = atomicLong.getAndIncrement();
                while (andIncrement == 0) {
                    andIncrement = atomicLong.getAndIncrement();
                }
                return Long.valueOf(andIncrement);
            default:
                AtomicLong atomicLong2 = this.f30598e.license;
                long andIncrement2 = atomicLong2.getAndIncrement();
                while (andIncrement2 == 0) {
                    andIncrement2 = atomicLong2.getAndIncrement();
                }
                return Long.valueOf(andIncrement2);
        }
    }
}
