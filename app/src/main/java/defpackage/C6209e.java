package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6209e implements InterfaceC9093e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C6209e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, java.lang.Object] */
    private final Iterator vip() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC9093e
    public final Iterator iterator() {
        switch (this.ad) {
            case 0:
                return vip();
            default:
                return new C4109e(0, this.vip);
        }
    }
}
