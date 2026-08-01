package defpackage;

import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17793e {
    public static final Logger ad = Logger.getLogger("okio.Okio");

    public static final boolean ad(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC5304e.inmobi(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
