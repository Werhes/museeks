package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۤۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12087e extends AbstractC9832e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f24224e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C13578e f24225e;

    public /* synthetic */ C12087e(C13578e c13578e, int i) {
        this.f24224e = i;
        this.f24225e = c13578e;
    }

    @Override // defpackage.AbstractC9832e
    public final void mopub(Throwable th) {
        switch (this.f24224e) {
            case 0:
                C6467e c6467e = this.f19423e;
                if (c6467e == null) {
                    c6467e = null;
                }
                C13578e c13578e = this.f24225e;
                Throwable remoteconfig = c13578e.remoteconfig(c6467e);
                if (c13578e.subs()) {
                    C3843e c3843e = (C3843e) c13578e.f26927e;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3843e.f8479e;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(c3843e);
                        C2443e c2443e = AbstractC7214e.vip;
                        if (AbstractC7890e.billing(obj, c2443e)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c3843e, c2443e, remoteconfig)) {
                                if (atomicReferenceFieldUpdater.get(c3843e) != c2443e) {
                                    break;
                                }
                            }
                            return;
                        } else {
                            if (obj instanceof Throwable) {
                                return;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(c3843e, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(c3843e) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c13578e.ad(remoteconfig);
                if (c13578e.subs()) {
                    return;
                }
                c13578e.Signature();
                return;
            default:
                this.f24225e.billing(Unit.INSTANCE);
                return;
        }
    }

    @Override // defpackage.AbstractC9832e
    public final boolean startapp() {
        switch (this.f24224e) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}
