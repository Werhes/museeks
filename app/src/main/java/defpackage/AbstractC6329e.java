package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙُۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6329e implements InterfaceC17335e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11936e f13172e = new AtomicInteger(0);

    @Override // defpackage.InterfaceC17335e
    public /* synthetic */ AbstractC8618e billing(AbstractC8618e abstractC8618e, AbstractC8618e abstractC8618e2, AbstractC8618e abstractC8618e3) {
        return null;
    }

    public final void license(int i) {
        C11936e c11936e;
        int i2;
        do {
            c11936e = this.f13172e;
            i2 = c11936e.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!c11936e.compareAndSet(i2, i2 | i));
    }

    public final boolean metrica(int i) {
        return (i & this.f13172e.get()) != 0;
    }
}
