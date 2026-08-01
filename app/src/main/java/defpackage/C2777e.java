package defpackage;

import java.util.TimeZone;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2777e implements InterfaceC2537e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f6689e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f6691e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f6693e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C10420e f6694e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C16151e f6690e = new Object();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C16151e f6692e = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [eِٖۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [eِٖۢ, java.lang.Object] */
    public C2777e(C10420e c10420e, long j, boolean z) {
        this.f6694e = c10420e;
        this.f6693e = j;
        this.f6691e = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        C10420e c10420e = this.f6694e;
        synchronized (c10420e) {
            this.f6689e = true;
            C16151e c16151e = this.f6692e;
            j = c16151e.f31731e;
            c16151e.ad();
            c10420e.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        if (j > 0) {
            C10420e c10420e2 = this.f6694e;
            TimeZone timeZone = AbstractC16286e.ad;
            c10420e2.f20597e.Signature(j);
        }
        this.f6694e.ad();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #1 {, blocks: (B:6:0x000d, B:8:0x001a, B:13:0x0024, B:33:0x00b8, B:34:0x00bd, B:64:0x00e2, B:65:0x00e7, B:15:0x002d, B:17:0x0033, B:19:0x0037, B:21:0x003b, B:22:0x0049, B:24:0x004d, B:26:0x0057, B:28:0x0074, B:30:0x0083, B:47:0x0099, B:51:0x00a1, B:54:0x00a7, B:55:0x00b3, B:58:0x00d8, B:59:0x00df), top: B:5:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:15:0x002d, B:17:0x0033, B:19:0x0037, B:21:0x003b, B:22:0x0049, B:24:0x004d, B:26:0x0057, B:28:0x0074, B:30:0x0083, B:47:0x0099, B:51:0x00a1, B:54:0x00a7, B:55:0x00b3, B:58:0x00d8, B:59:0x00df), top: B:14:0x002d, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC2537e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long signatures(defpackage.C16151e r26, long r27) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2777e.signatures(eِٖۢ, long):long");
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        return this.f6694e.f20596e;
    }
}
