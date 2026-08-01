package defpackage;

import java.io.File;
import java.util.Iterator;
import java.util.Vector;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3867e implements InterfaceC17273e {
    public Vector ad;

    @Override // defpackage.InterfaceC17273e
    public final void ad(C0887e c0887e, boolean z) {
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            ((InterfaceC17273e) it.next()).ad(c0887e, z);
        }
    }

    @Override // defpackage.InterfaceC17273e
    public final void metrica(C0887e c0887e, File file) {
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            ((InterfaceC17273e) it.next()).metrica(c0887e, file);
        }
    }

    @Override // defpackage.InterfaceC17273e
    public final void vip(File file) {
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            ((InterfaceC17273e) it.next()).vip(file);
        }
    }
}
