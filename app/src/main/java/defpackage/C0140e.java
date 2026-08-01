package defpackage;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؑۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0140e {
    public static final C18482e adcel = new C18482e("ClientCastAnalytics", null);
    public static boolean mopub = true;
    public final C14618e ad;
    public Long appmetrica;
    public C11547e billing;
    public final BinderC15170e metrica;
    public final C9149e vip;
    public C11909e yandex;
    public int startapp = 1;
    public final String license = UUID.randomUUID().toString();
    public final ExecutorService purchase = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public C0140e(Context context, C4480e c4480e, C14618e c14618e, C9149e c9149e, BinderC15170e binderC15170e) {
        this.ad = c14618e;
        this.vip = c9149e;
        this.metrica = binderC15170e;
    }

    public final void ad(C4469e c4469e, int i) {
        this.purchase.execute(new RunnableC10028e(this, c4469e, i, 6));
    }
}
