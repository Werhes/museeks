package defpackage;

import java.io.IOException;
import java.security.Principal;

/* renamed from: eؕۜؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3639e extends C16624e implements Principal {
    public C3639e(C15466e c15466e) {
        super(c15466e.f30555e);
    }

    public C3639e(C16624e c16624e) {
        super((Ccatch) c16624e.billing());
    }

    @Override // defpackage.Cextends, defpackage.InterfaceC3928e
    public final byte[] getEncoded() {
        try {
            return smaato();
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }
}
