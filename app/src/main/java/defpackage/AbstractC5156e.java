package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5156e {
    public static final CopyOnWriteArrayList ad = new CopyOnWriteArrayList();

    public static C0633e ad(String str) {
        Iterator it = ad.iterator();
        while (it.hasNext()) {
            C0633e c0633e = (C0633e) it.next();
            c0633e.getClass();
            if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                return c0633e;
            }
        }
        throw new GeneralSecurityException(AbstractC17861e.Signature("No KMS client does support: ", str));
    }
}
