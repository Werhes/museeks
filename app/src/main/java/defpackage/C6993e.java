package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6993e implements InterfaceC9093e {
    public final /* synthetic */ int ad;
    public final InterfaceC12561e metrica;
    public final Object vip;

    public /* synthetic */ C6993e(Object obj, InterfaceC12561e interfaceC12561e, int i) {
        this.ad = i;
        this.vip = obj;
        this.metrica = interfaceC12561e;
    }

    @Override // defpackage.InterfaceC9093e
    public final Iterator iterator() {
        switch (this.ad) {
            case 0:
                return new C5143e(this);
            default:
                return new C5143e(this, (byte) 0);
        }
    }
}
