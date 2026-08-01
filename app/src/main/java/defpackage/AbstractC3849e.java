package defpackage;

import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3849e {
    public static final String ad;

    static {
        int i = AbstractC2030e.ad;
        File file = new File(".");
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        ad = file.getCanonicalFile().toString();
    }
}
