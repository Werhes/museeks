package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC14100e {
    public static final /* synthetic */ int ad = 0;

    static {
        C14326e c14326e = InterfaceC13842e.premium;
    }

    public static int ad(InterfaceC13842e interfaceC13842e) {
        return ((Integer) interfaceC13842e.smaato(InterfaceC13842e.crashlytics, -1)).intValue();
    }

    public static int appmetrica(InterfaceC13842e interfaceC13842e, int i) {
        return ((Integer) interfaceC13842e.smaato(InterfaceC13842e.subs, Integer.valueOf(i))).intValue();
    }

    public static int license(InterfaceC13842e interfaceC13842e) {
        return ((Integer) interfaceC13842e.subscription(InterfaceC13842e.premium)).intValue();
    }

    public static int metrica(InterfaceC13842e interfaceC13842e) {
        return ((Integer) interfaceC13842e.smaato(InterfaceC13842e.firebase, -1)).intValue();
    }

    public static void purchase(InterfaceC13842e interfaceC13842e) {
        boolean mo1766case = interfaceC13842e.mo1766case();
        boolean z = interfaceC13842e.mo1772throw() != null;
        if (mo1766case && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC13842e.ads() != null) {
            if (mo1766case || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    public static ArrayList vip(InterfaceC13842e interfaceC13842e) {
        List list = (List) interfaceC13842e.smaato(InterfaceC13842e.f27420extends, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }
}
