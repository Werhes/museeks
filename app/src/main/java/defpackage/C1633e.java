package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1633e implements InterfaceC18435e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f4555e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11180e f4556e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AtomicReference f4557e = new AtomicReference(null);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f4558e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f4559e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReference f4560e;

    public C1633e(InterfaceC18435e interfaceC18435e, C11180e c11180e, InterfaceC18435e interfaceC18435e2, Function2 function2, AtomicReference atomicReference) {
        this.f4556e = c11180e;
        this.f4558e = interfaceC18435e2;
        this.f4555e = function2;
        this.f4560e = atomicReference;
        this.f4559e = interfaceC18435e;
    }

    public final long ad() {
        Long l = (Long) this.f4557e.get();
        if (l == null) {
            C17647e c17647e = C14157e.f27993e;
            return C14157e.f27992e;
        }
        long longValue = l.longValue();
        this.f4556e.getClass();
        long currentTimeMillis = longValue - System.currentTimeMillis();
        C17647e c17647e2 = C14157e.f27993e;
        return AbstractC0326e.admob(currentTimeMillis, EnumC15934e.MILLISECONDS);
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f4559e.advert();
    }

    public final void vip(long j) {
        if (C14157e.license(j) <= 0) {
            AbstractC9743e.license(this.f4558e, new C8716e("Timed out immediately", this.f4555e.hashCode()));
            return;
        }
        if (C14157e.metrica(ad(), j) < 0) {
            return;
        }
        this.f4556e.getClass();
        this.f4557e.set(Long.valueOf(C14157e.license(j) + System.currentTimeMillis()));
        C11180e c11180e = this.f4556e;
        InterfaceC18435e interfaceC18435e = this.f4558e;
        InterfaceC10500e interfaceC10500e = (InterfaceC10500e) this.f4560e.getAndSet(AbstractC5336e.purchase(interfaceC18435e, null, 0, new C7914e(this, c11180e, interfaceC18435e, this.f4555e, null, 7), 3));
        if (interfaceC10500e != null) {
            interfaceC10500e.Signature(null);
        }
    }
}
