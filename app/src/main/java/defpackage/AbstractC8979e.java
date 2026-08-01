package defpackage;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۛۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8979e implements InterfaceC18435e, Closeable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18026e = AtomicIntegerFieldUpdater.newUpdater(AbstractC8979e.class, "closed");
    private volatile /* synthetic */ int closed = 0;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C5363e f18027e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5363e f18028e;

    public AbstractC8979e() {
        final int i = 0;
        this.f18028e = new C5363e(new Function0(this) { // from class: eؒۨ۠

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC8979e f4363e;

            {
                this.f4363e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AbstractC8979e abstractC8979e = this.f4363e;
                switch (i2) {
                    case 0:
                        ((C14947e) abstractC8979e).f29633e.getClass();
                        C15420e c15420e = AbstractC6731e.ad;
                        return ExecutorC3603e.f8134e;
                    default:
                        return AbstractC5797e.vip(new C6799e(null), new C12416e(C5170e.f11077e, 0)).mo394const((AbstractC3743e) abstractC8979e.f18028e.getValue()).mo394const(new C5621e("ktor-okhttp-context"));
                }
            }
        });
        final int i2 = 1;
        this.f18027e = new C5363e(new Function0(this) { // from class: eؒۨ۠

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC8979e f4363e;

            {
                this.f4363e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AbstractC8979e abstractC8979e = this.f4363e;
                switch (i22) {
                    case 0:
                        ((C14947e) abstractC8979e).f29633e.getClass();
                        C15420e c15420e = AbstractC6731e.ad;
                        return ExecutorC3603e.f8134e;
                    default:
                        return AbstractC5797e.vip(new C6799e(null), new C12416e(C5170e.f11077e, 0)).mo394const((AbstractC3743e) abstractC8979e.f18028e.getValue()).mo394const(new C5621e("ktor-okhttp-context"));
                }
            }
        });
    }

    @Override // defpackage.InterfaceC18435e
    public InterfaceC8850e advert() {
        return (InterfaceC8850e) this.f18027e.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f18026e.compareAndSet(this, 0, 1)) {
            InterfaceC4595e mo397public = advert().mo397public(C4524e.f9798e);
            InterfaceC18000e interfaceC18000e = mo397public instanceof InterfaceC18000e ? (InterfaceC18000e) mo397public : null;
            if (interfaceC18000e == null) {
                return;
            }
            ((C6799e) interfaceC18000e).m2245e();
        }
    }
}
