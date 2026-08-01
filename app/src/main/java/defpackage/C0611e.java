package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ۠ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0611e {
    public final /* synthetic */ int ad;

    public /* synthetic */ C0611e(int i) {
        this.ad = i;
    }

    private final void vip(C9492e c9492e, Iterator it, C16212e c16212e) {
    }

    public final void ad(C9492e c9492e, Iterator it, C16212e c16212e) {
        switch (this.ad) {
            case 0:
                return;
            default:
                if (!c9492e.metrica) {
                    throw new IllegalStateException("non repeating key");
                }
                if (!c9492e.license || ((C12440e) C12440e.f24905e.get()).f24906e <= 20) {
                    c9492e.ad(it, c16212e);
                    return;
                }
                while (it.hasNext()) {
                    c16212e.ad(it.next(), c9492e.ad);
                }
                return;
        }
    }
}
