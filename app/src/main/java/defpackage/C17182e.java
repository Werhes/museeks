package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17182e extends FutureTask implements Comparable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f33687e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f33688e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C6915e f33689e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f33690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17182e(C6915e c6915e, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f33689e = c6915e;
        long andIncrement = C6915e.f14161e.getAndIncrement();
        this.f33690e = andIncrement;
        this.f33687e = str;
        this.f33688e = z;
        if (andIncrement == Long.MAX_VALUE) {
            C13879e c13879e = ((C6936e) c6915e.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.ad("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17182e(C6915e c6915e, Callable callable, boolean z) {
        super(callable);
        this.f33689e = c6915e;
        long andIncrement = C6915e.f14161e.getAndIncrement();
        this.f33690e = andIncrement;
        this.f33687e = "Task exception on worker thread";
        this.f33688e = z;
        if (andIncrement == Long.MAX_VALUE) {
            C13879e c13879e = ((C6936e) c6915e.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.ad("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C17182e c17182e = (C17182e) obj;
        boolean z = c17182e.f33688e;
        boolean z2 = this.f33688e;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = c17182e.f33690e;
        long j2 = this.f33690e;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        C13879e c13879e = ((C6936e) this.f33689e.f36443e).f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27498e.vip(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        C13879e c13879e = ((C6936e) this.f33689e.f36443e).f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27502e.vip(th, this.f33687e);
        super.setException(th);
    }
}
