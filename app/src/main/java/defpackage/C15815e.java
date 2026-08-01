package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۣۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15815e extends AbstractC7255e {
    @Override // defpackage.AbstractC7255e
    public final int metrica(C12136e c12136e) {
        int i;
        synchronized (c12136e) {
            i = c12136e.f15448e - 1;
            c12136e.f15448e = i;
        }
        return i;
    }

    @Override // defpackage.AbstractC7255e
    public final void vip(C12136e c12136e, Set set) {
        synchronized (c12136e) {
            try {
                if (c12136e.f15447e == null) {
                    c12136e.f15447e = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
