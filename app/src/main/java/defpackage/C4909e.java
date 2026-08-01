package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4909e {
    public final C4083e vip;
    public final Object ad = new Object();
    public final LinkedHashMap metrica = new LinkedHashMap();
    public volatile int license = -1;

    public C4909e(Context context) {
        this.vip = new C4083e(context, this);
    }

    public final void ad(ScheduledExecutorServiceC5380e scheduledExecutorServiceC5380e, C2007e c2007e) {
        synchronized (this.ad) {
            try {
                if (this.vip.canDetectOrientation()) {
                    C8635e c8635e = new C8635e(c2007e, scheduledExecutorServiceC5380e);
                    this.metrica.put(c2007e, c8635e);
                    if (this.license != -1) {
                        c8635e.ad(this.license);
                    }
                    if (this.metrica.size() == 1) {
                        this.vip.enable();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void vip(C2007e c2007e) {
        synchronized (this.ad) {
            try {
                C8635e c8635e = (C8635e) this.metrica.get(c2007e);
                if (c8635e != null) {
                    c8635e.metrica.set(false);
                    this.metrica.remove(c2007e);
                }
                if (this.metrica.isEmpty()) {
                    this.vip.disable();
                    this.license = -1;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
