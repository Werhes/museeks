package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9701e {
    public final AbstractC9410e ad;
    public C13486e appmetrica;
    public final C2362e license;
    public final boolean metrica;
    public final ArrayList vip = new ArrayList();

    public C9701e(AbstractC9410e abstractC9410e, boolean z) {
        this.ad = abstractC9410e;
        this.license = abstractC9410e.f18729e;
        this.metrica = z;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.license.f5914e).getPackageName() + " }";
    }
}
