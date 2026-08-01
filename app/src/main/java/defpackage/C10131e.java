package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10131e implements InterfaceC9093e, InterfaceC8108e {
    public final InterfaceC9093e ad;
    public final int vip;

    public C10131e(InterfaceC9093e interfaceC9093e, int i) {
        this.ad = interfaceC9093e;
        this.vip = i;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC8647e.applovin("count must be non-negative, but was ", i, '.').toString());
        }
    }

    @Override // defpackage.InterfaceC8108e
    public final InterfaceC9093e ad(int i) {
        int i2 = this.vip + i;
        return i2 < 0 ? new C10131e(this, i) : new C10131e(this.ad, i2);
    }

    @Override // defpackage.InterfaceC9093e
    public final Iterator iterator() {
        return new C2320e(this);
    }

    @Override // defpackage.InterfaceC8108e
    public final InterfaceC9093e take() {
        int i = this.vip;
        int i2 = i + 40;
        return i2 < 0 ? new C15809e(this) : new C14442e(this.ad, i, i2);
    }
}
