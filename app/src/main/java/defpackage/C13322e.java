package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13322e {
    public static final C11498e license = AbstractC14430e.license(0);
    public final Object ad = new Object();
    public final LinkedHashMap vip = new LinkedHashMap();
    public final LinkedHashSet metrica = new LinkedHashSet();

    public final C15192e ad(Surface surface) {
        C15192e c15192e;
        List m3575continue;
        if (!surface.isValid()) {
            Log.w("CXCP", "registerSurface: Surface " + surface + " isn't valid!");
        }
        synchronized (this.ad) {
            try {
                c15192e = new C15192e(this, surface);
                Integer num = (Integer) this.vip.get(surface);
                int intValue = (num != null ? num.intValue() : 0) + 1;
                this.vip.put(surface, Integer.valueOf(intValue));
                m3575continue = intValue == 1 ? AbstractC13480e.m3575continue(this.metrica) : null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m3575continue != null) {
            Iterator it = m3575continue.iterator();
            while (it.hasNext()) {
                ((C11728e) it.next()).license(surface);
            }
        }
        return c15192e;
    }

    public final void vip(C11728e c11728e) {
        synchronized (this.ad) {
            this.metrica.remove(c11728e);
        }
    }
}
