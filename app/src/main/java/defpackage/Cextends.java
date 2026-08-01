package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: extends, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class Cextends implements subs, InterfaceC3928e {
    @Override // defpackage.subs
    public abstract Cdefault billing();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof subs) {
            return billing().isVip(((subs) obj).billing());
        }
        return false;
    }

    @Override // defpackage.InterfaceC3928e
    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Cdefault billing = billing();
        billing.getClass();
        billing.Signature(new C7850e(1, byteArrayOutputStream), true);
        return byteArrayOutputStream.toByteArray();
    }

    public String getName() {
        return toString();
    }

    public int hashCode() {
        return billing().hashCode();
    }

    public final byte[] smaato() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        billing().subscription(byteArrayOutputStream, "DER");
        return byteArrayOutputStream.toByteArray();
    }
}
