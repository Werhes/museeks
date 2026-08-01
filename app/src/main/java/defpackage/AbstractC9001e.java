package defpackage;

import java.io.File;
import java.util.LinkedHashMap;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ۟ؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9001e {
    public static final File ad;
    public static final LinkedHashMap vip;

    static {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        File file = new File(vKXApplication.getDir("devdb", 0), "OnDevice_Catalog.dat");
        ad = file;
        vip = new LinkedHashMap();
        if (!file.exists()) {
            file.createNewFile();
        }
        AbstractC1641e.amazon(file, new C4526e(6));
    }
}
