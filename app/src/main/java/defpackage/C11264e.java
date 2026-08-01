package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: eُۛٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11264e implements Enumeration {
    public Cgoto ad;
    public Cdefault vip;

    public final Cdefault ad() {
        try {
            return this.ad.Signature();
        } catch (IOException e) {
            throw new Cabstract("malformed ASN.1: " + e, e, 0);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.vip != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        Cdefault cdefault = this.vip;
        if (cdefault == null) {
            throw new NoSuchElementException();
        }
        this.vip = ad();
        return cdefault;
    }
}
