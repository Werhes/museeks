package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1418e {
    public static final HashSet ad = new HashSet();
    public static String vip = "media3.common";

    public static synchronized void ad(String str) {
        synchronized (AbstractC1418e.class) {
            if (ad.add(str)) {
                vip += ", " + str;
            }
        }
    }

    public static synchronized String vip() {
        String str;
        synchronized (AbstractC1418e.class) {
            str = vip;
        }
        return str;
    }
}
