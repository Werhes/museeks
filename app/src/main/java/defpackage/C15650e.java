package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15650e extends AbstractC9832e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f30857e = AtomicReferenceFieldUpdater.newUpdater(C15650e.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C13578e f30858e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C12544e f30859e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public InterfaceC1232e f30860e;

    public C15650e(C12544e c12544e, C13578e c13578e) {
        this.f30859e = c12544e;
        this.f30858e = c13578e;
    }

    @Override // defpackage.AbstractC9832e
    public final void mopub(Throwable th) {
        C13578e c13578e = this.f30858e;
        if (th != null) {
            c13578e.getClass();
            C2443e m3620native = c13578e.m3620native(new C1427e(th, false), null);
            if (m3620native != null) {
                c13578e.pro(m3620native);
                C16941e c16941e = (C16941e) f30857e.get(this);
                if (c16941e != null) {
                    c16941e.vip();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C12544e.vip;
        C12544e c12544e = this.f30859e;
        if (atomicIntegerFieldUpdater.decrementAndGet(c12544e) == 0) {
            InterfaceC1908e[] interfaceC1908eArr = c12544e.ad;
            ArrayList arrayList = new ArrayList(interfaceC1908eArr.length);
            for (InterfaceC1908e interfaceC1908e : interfaceC1908eArr) {
                arrayList.add(interfaceC1908e.isVip());
            }
            c13578e.billing(arrayList);
        }
    }

    @Override // defpackage.AbstractC9832e
    public final boolean startapp() {
        return false;
    }
}
