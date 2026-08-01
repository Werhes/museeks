package defpackage;

import java.io.OutputStream;
import java.security.KeyStore;

/* renamed from: eؚ۟ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7486e implements KeyStore.LoadStoreParameter {
    private final boolean forDEREncoding;
    private final OutputStream out;
    private final boolean overwriteFriendlyName;
    private final KeyStore.ProtectionParameter protectionParameter;

    public C7486e(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean z, boolean z2) {
        this.out = outputStream;
        this.protectionParameter = protectionParameter;
        this.forDEREncoding = z;
        this.overwriteFriendlyName = z2;
    }

    public OutputStream getOutputStream() {
        return this.out;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.protectionParameter;
    }

    public boolean isForDEREncoding() {
        return this.forDEREncoding;
    }

    public boolean isOverwriteFriendlyName() {
        return this.overwriteFriendlyName;
    }
}
