package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۣؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15809e implements InterfaceC9093e, InterfaceC8108e {
    public final InterfaceC9093e ad;

    public C15809e(InterfaceC9093e interfaceC9093e) {
        this.ad = interfaceC9093e;
    }

    @Override // defpackage.InterfaceC8108e
    public final InterfaceC9093e ad(int i) {
        return i >= 40 ? C7671e.ad : new C14442e(this.ad, i, 40);
    }

    @Override // defpackage.InterfaceC9093e
    public final Iterator iterator() {
        return new C2320e(this);
    }

    @Override // defpackage.InterfaceC8108e
    public final InterfaceC9093e take() {
        return this;
    }
}
