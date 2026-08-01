package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؑۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635e implements InterfaceC11152e {
    public final int ad;
    public final /* synthetic */ AbstractC15958e vip;

    public C0635e(AbstractC15958e abstractC15958e, int i) {
        this.vip = abstractC15958e;
        this.ad = i;
    }

    @Override // defpackage.InterfaceC11152e
    public final boolean ad(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC15958e abstractC15958e = this.vip;
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = abstractC15958e.applovin;
        int i = this.ad;
        if (abstractComponentCallbacksC17875e == null || i >= 0 || !abstractComponentCallbacksC17875e.purchase().m4053default(-1, 0)) {
            return abstractC15958e.m4056implements(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
