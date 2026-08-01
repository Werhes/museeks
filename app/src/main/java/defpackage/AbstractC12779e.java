package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ۟٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12779e {
    public static final C2271e ad = new C17519e(0);

    public static synchronized void ad() {
        synchronized (AbstractC12779e.class) {
            C2271e c2271e = ad;
            Iterator it = ((C9323e) c2271e.values()).iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            c2271e.clear();
        }
    }
}
