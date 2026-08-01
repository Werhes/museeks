package defpackage;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۨؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5310e {
    public final WeakReference ad;
    public final /* synthetic */ C17148e metrica;
    public final C2715e vip;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [eّٜؔ, java.util.function.IntConsumer] */
    public C5310e(C17148e c17148e, Context context) {
        this.metrica = c17148e;
        this.ad = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: eّٜؔ
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                C17148e c17148e2 = C5310e.this.metrica;
                if (c17148e2.f33598e) {
                    return;
                }
                c17148e2.m4254e(1, 19, Integer.valueOf(i));
            }

            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.vip = r0;
        context.registerDeviceIdChangeListener(new ExecutorC17160e(2, c17148e.f33620e.ad(c17148e.f33576e, null)), r0);
    }

    public static void ad(C5310e c5310e) {
        Context context = (Context) c5310e.ad.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(c5310e.vip);
    }
}
