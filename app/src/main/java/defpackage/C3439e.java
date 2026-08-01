package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3439e implements InterfaceC5021e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C14457e f7695e;

    public C3439e(C14457e c14457e) {
        this.f7695e = c14457e;
    }

    @Override // defpackage.InterfaceC5021e
    public final Collection ad() {
        AbstractC10226e abstractC10226e = this.f7695e.f28576e;
        if (abstractC10226e == null) {
            abstractC10226e = null;
        }
        return abstractC10226e.loadAd().ad();
    }

    @Override // defpackage.InterfaceC5021e
    public final boolean admob() {
        return true;
    }

    @Override // defpackage.InterfaceC5021e
    public final InterfaceC4077e advert() {
        return this.f7695e;
    }

    @Override // defpackage.InterfaceC5021e
    public final AbstractC13270e amazon() {
        return AbstractC2876e.appmetrica(this.f7695e);
    }

    @Override // defpackage.InterfaceC5021e
    public final List getParameters() {
        List list = this.f7695e.f28575e;
        if (list == null) {
            return null;
        }
        return list;
    }

    public final String toString() {
        return "[typealias " + this.f7695e.getName().vip() + ']';
    }
}
