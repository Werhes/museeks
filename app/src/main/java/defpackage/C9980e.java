package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9980e implements InterfaceC1148e, InterfaceC5634e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17651e f19709e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13578e f19710e;

    public C9980e(C17651e c17651e, C13578e c13578e) {
        this.f19709e = c17651e;
        this.f19710e = c13578e;
    }

    @Override // defpackage.InterfaceC1148e
    public final boolean ad(Throwable th) {
        return this.f19710e.ad(th);
    }

    @Override // defpackage.InterfaceC1148e
    public final C2443e adcel(Object obj, Function3 function3) {
        C17651e c17651e = this.f19709e;
        C17871e c17871e = new C17871e(c17651e, this);
        C2443e m3620native = this.f19710e.m3620native((Unit) obj, c17871e);
        if (m3620native != null) {
            C17651e.yandex.set(c17651e, null);
        }
        return m3620native;
    }

    @Override // defpackage.InterfaceC5083e
    public final InterfaceC8850e admob() {
        return this.f19710e.f26926e;
    }

    @Override // defpackage.InterfaceC5083e
    public final void billing(Object obj) {
        this.f19710e.billing(obj);
    }

    @Override // defpackage.InterfaceC5634e
    public final void metrica(AbstractC12466e abstractC12466e, int i) {
        this.f19710e.metrica(abstractC12466e, i);
    }

    @Override // defpackage.InterfaceC1148e
    public final void pro(Object obj) {
        this.f19710e.pro(obj);
    }

    @Override // defpackage.InterfaceC1148e
    public final void smaato(Object obj, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C17651e.yandex;
        C17651e c17651e = this.f19709e;
        atomicReferenceFieldUpdater.set(c17651e, null);
        C6846e c6846e = new C6846e(c17651e, this, 12);
        C13578e c13578e = this.f19710e;
        c13578e.m3619interface((Unit) obj, c13578e.f6325e, new C6599e(10, c6846e));
    }
}
