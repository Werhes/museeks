package defpackage;

import java.util.Enumeration;

/* renamed from: eؖۗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4319e implements Enumeration {
    public final Enumeration ad;

    public C4319e(Enumeration enumeration) {
        this.ad = enumeration;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.ad.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return C13476e.Signature(this.ad.nextElement());
    }
}
