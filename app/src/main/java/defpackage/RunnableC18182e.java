package defpackage;

import android.os.Trace;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٙ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC18182e implements Runnable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35607e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ RunnableC18182e f35605e = new RunnableC18182e(3);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ RunnableC18182e f35604e = new RunnableC18182e(5);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ RunnableC18182e f35606e = new RunnableC18182e(6);

    public /* synthetic */ RunnableC18182e(int i) {
        this.f35607e = i;
    }

    private final void ad() {
    }

    private final void appmetrica() {
    }

    private final /* synthetic */ void license() {
    }

    private final void metrica() {
    }

    private final /* synthetic */ void vip() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35607e) {
            case 0:
                try {
                    Method method = AbstractC12193e.vip;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C5188e.license()) {
                        C5188e.ad().appmetrica();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    Method method2 = AbstractC12193e.vip;
                    Trace.endSection();
                    throw th;
                }
            case 1:
                return;
            case 2:
                AbstractC15933e.vip(AbstractC17378e.ad(), new float[]{0.0f, 0.0f}, true);
                return;
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
            default:
                return;
        }
    }
}
