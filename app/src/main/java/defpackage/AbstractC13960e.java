package defpackage;

import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13960e {
    public final C15423e ad = new C15423e();

    public final void ad() {
        C15423e c15423e = this.ad;
        if (c15423e != null && !c15423e.license) {
            c15423e.license = true;
            synchronized (c15423e.ad) {
                try {
                    Iterator it = c15423e.vip.values().iterator();
                    while (it.hasNext()) {
                        C15423e.ad((AutoCloseable) it.next());
                    }
                    Iterator it2 = c15423e.metrica.iterator();
                    while (it2.hasNext()) {
                        C15423e.ad((AutoCloseable) it2.next());
                    }
                    c15423e.metrica.clear();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        vip();
    }

    public void vip() {
    }
}
