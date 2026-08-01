package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2075e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractActivityC15824e f5375e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5376e;

    public /* synthetic */ C2075e(AbstractActivityC15824e abstractActivityC15824e, int i) {
        this.f5376e = i;
        this.f5375e = abstractActivityC15824e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, eُؓۦ] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5376e) {
            case 0:
                this.f5375e.reportFullyDrawn();
                return Unit.INSTANCE;
            case 1:
                return new C12059e(new C2075e(this.f5375e, 0));
            case 2:
                ?? obj = new Object();
                this.f5375e.metrica().advert(obj);
                return obj;
            case 3:
                AbstractActivityC15824e abstractActivityC15824e = this.f5375e;
                return new C2741e(abstractActivityC15824e.getApplication(), abstractActivityC15824e, abstractActivityC15824e.getIntent() != null ? abstractActivityC15824e.getIntent().getExtras() : null);
            default:
                AbstractActivityC15824e abstractActivityC15824e2 = this.f5375e;
                C6194e c6194e = new C6194e(new RunnableC1413e(abstractActivityC15824e2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC7890e.billing(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC15824e2.f8255e.ad(new C5063e(c6194e, abstractActivityC15824e2, 0));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC16019e(abstractActivityC15824e2, c6194e, 22));
                    }
                }
                return c6194e;
        }
    }
}
